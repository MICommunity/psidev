/**
 * $Id: DtaSetImporter.java,v 1.3 2004/01/14 15:57:35 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jul 23, 2003
 * Time: 5:24:22 PM
 */
package org.psi.ms.importers;

import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.helper.SuffixFileFilter;
import org.psi.ms.helper.Utils;
import org.psi.ms.model.Desc;
import org.psi.ms.model.Acquisition;
import org.psi.ms.model.Admin;
import org.psi.ms.importers.DtaReader;
import org.psi.ms.converter.ImporterI;
import org.psi.ms.converter.ParseListener;
import org.psi.ms.converter.ProvidedDataItem;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Reads in all .dta/.zta from a given directory and converts them
 * into a single peaklist XML document. Per default the arrays are
 * stored in the space-saving base64 format.
 *
 * @author Kai Runte
 */
public class DtaSetImporter implements ImporterI {

    private DtaReader dtaReader;

    private SortedSet dtaFileSet = null;
    private Iterator dtaIterator = null;
    private SortedSet ztaFileSet = null;
    private Iterator ztaIterator = null;

    /**
     * This defines which file type (.dta or .zta) should be returned
     * with the next call of {@link #getNextAcquisition() getNextAcquisition}.
     */
    private int currentFileType = -1;

    /**
     * The ParseListener for providing feedback to the (graphical) user interface.
     */
    private ParseListener parseListener = null;

    private Vector providedData = null;

    public DtaSetImporter() {
        dtaReader = new DtaReader();
    }

    /**
     * Initializes a Desc(ription) object from the provide source file or directory.
     * @param source The source file or directory.
     * @param listener The ParseListener for providing feedback to the (graphical) user interface.
     * @throws org.psi.ms.helper.PsiMsConverterException in case of a conversion error.
     * @throws java.io.IOException in case of an file/directory access error.
     * @return A Desc object filled with meta-information harvested from the source.
     */
    public Desc initialize(File source,
                           ParseListener listener) throws PsiMsConverterException, IOException {
        parseListener = listener;
        Desc desc = new Desc();
        if (source.isDirectory()) {
            File[] dtaFiles = source.listFiles(new SuffixFileFilter(".dta"));
            File[] ztaFiles = source.listFiles(new SuffixFileFilter(".zta"));
            dtaFileSet = Utils.fileArrayToTreeSet(dtaFiles);
            ztaFileSet = Utils.fileArrayToTreeSet(ztaFiles);

            currentFileType = DtaReader.DTA;
            if (dtaFileSet.size() == 0) {
                if (ztaFileSet.size() > 0) {
                    currentFileType = DtaReader.ZTA;
                } else {
                    throw new PsiMsConverterException("No .dta/.zta files found!");
                }
            }
            dtaIterator = dtaFileSet.iterator();
            ztaIterator = ztaFileSet.iterator();

            String filename = dtaFiles[0].getName();
            Pattern pattern = Pattern.compile("(.+)_(\\d+).(\\d+)_(\\d+).(zta|dta)");
            Matcher matcher = pattern.matcher(filename);
            if (matcher.matches()) {
                Admin admin = desc.getAdmin();
                String sampleName = admin.getSampleName();
                if (sampleName == null || sampleName.equals("")) {
                    sampleName = matcher.group(1);
                    admin.setSampleName(sampleName);
                }
            }
        } else if (source.isFile()) {
            dtaFileSet = new TreeSet();
            ztaFileSet = new TreeSet();
            String filename = source.getName();
            Pattern pattern = Pattern.compile("(.+)_(\\d+).(\\d+)_(\\d+).(zta|dta)");
            Matcher matcher = pattern.matcher(filename);
            if (matcher.matches()) {
                Admin admin = desc.getAdmin();
                String sampleName = admin.getSampleName();
                if (sampleName == null || sampleName.equals("")) {
                    sampleName = matcher.group(1);
                    admin.setSampleName(sampleName);
                }
                String suffix = matcher.group(5);
                if (suffix.equals("dta")) {
                    dtaFileSet.add(filename);
                    currentFileType = DtaReader.DTA;
                } else if (suffix.equals("zta")) {
                    ztaFileSet.add(filename);
                    currentFileType = DtaReader.ZTA;
                }
            }
        }
        return desc;
    }

    /**
     * Returns a list of {@link org.psi.ms.converter.ProvidedDataItem ProvidedDataItem} objects.
     * Tells the (graphical) user interface which pieces of information it does not
     * need to request from the user.
     * @return a list of class objects (must be classes of the package org.psi.ms.model).
     * @see org.psi.ms.converter.ProvidedDataItem
     */
    public List getProvidedData() {
        if (providedData == null) {
            providedData = new Vector();
            providedData.add(ProvidedDataItem.DESC_ADMIN_SAMPLENAME);
        }
        return providedData;
    }

    /**
     * Returns whether single file input is supported or not.
     * @return whether single file input is supported or not.
     */
    public boolean supportsFile() {
        return true;
    }

    /**
     * Returns whether directory input is supported or not.
     * @return whether directory input is supported or not.
     */
    public boolean supportsDirectory() {
        return true;
    }

    /**
     * Returns whether the File object points to a valid input source for this plugin or not.
     * @param file File object pointing to an input source. Can be a single file or directory.
     * @return whether the File object points to a valid input source for this plugin or not.
     */
    public boolean isSupportedInputFormat(File file) {
        Pattern pattern = Pattern.compile("(.+)_(\\d+).(\\d+)_(\\d+).(zta|dta)");
        if (file.isDirectory()) {
            File[] files = file.listFiles(new SuffixFileFilter(".dta"));
            if (files != null && files.length > 0) {
                Matcher matcher = pattern.matcher(files[0].getName());
                return matcher.matches();
            } else {
                return false;
            }
        } else if (file.isFile()) {
            Matcher matcher = pattern.matcher(file.getName());
            return matcher.matches();
        }
        return false;
    }

    /**
     * Returns the number of acquisitions found in the source file/directory
     * provided by {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize}.
     * N.B.: Depending on the input format, it might necessary that Converter
     * implementation needs to scan through the file/directory.
     * @return the number of acquisitions found in the source file/directory
     * provided by {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize}.
     * @throws org.psi.ms.helper.PsiMsConverterException if {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize} was not called.
     * @throws java.io.IOException in case of an file/directory access error.
     */
    public int getAcquisitionCount() throws PsiMsConverterException, IOException {
        if (dtaFileSet == null || ztaFileSet == null)
            throw new PsiMsConverterException("Importer was not initialized!");
        return dtaFileSet.size() + ztaFileSet.size();
    }

    /**
     * Returns whether the source file/directory provided by
     * {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize}
     * contains any more Acquisitions.
     * @throws org.psi.ms.helper.PsiMsConverterException if {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize} was not called.
     * @return whether the source file/directory contains any more Acquistions.
     * @see #initialize
     */
    public boolean hasMoreAcquisitions() throws PsiMsConverterException {
        if (dtaIterator == null || ztaIterator == null)
            throw new PsiMsConverterException("Importer was not initialized!");
        // This is bit trickier to implement as if there are .zta files,
        // we have to alternate between returning .dta and .zta
        // acquisitions.
        switch (currentFileType) {
            case DtaReader.DTA:
                return dtaIterator.hasNext();
            case DtaReader.ZTA:
                return ztaIterator.hasNext();
            default:
                throw new PsiMsConverterException("Importer was not initialized!");
        }
    }

    /**
     * Returns the next available Acquisition or null.
     * @throws java.io.IOException in case of an file/directory access error.
     * @return the next available Acquisition or null.
     */
    public Acquisition getNextAcquisition() throws IOException {
        // This is bit trickier to implement as if there are .zta files,
        // we have to alternate between returning .dta and .zta
        // acquisitions.
        Acquisition acquisition = null;
        String filepath = null;
        switch (currentFileType) {
            case DtaReader.DTA:
                filepath = (String) dtaIterator.next();
                if (parseListener != null) {
                    parseListener.setMessage("Converting file: " + filepath);
                } else {
                    System.out.println("Converting file: " + filepath);
                }
                acquisition = dtaReader.addAcquisitions(filepath);
                if (ztaFileSet.size() != 0)
                    currentFileType = DtaReader.ZTA;
                break;
            case DtaReader.ZTA:
                filepath = (String) ztaIterator.next();
                if (parseListener != null) {
                    parseListener.setMessage("Converting file: " + filepath);
                } else {
                    System.out.println("Converting file: " + filepath);
                }
                acquisition = dtaReader.addAcquisitions(filepath);
                if (dtaFileSet.size() != 0)
                    currentFileType = DtaReader.DTA;
                break;
        }
        return acquisition;
    }

    /**
     * Returns some information about the importer implementation.
     * This can be displayed, for example, in a list of available importers.
     * @return some information about the importer implementation.
     * Todo: should this text appear in desc/test/dataProcessing/software?
     */
    public String getImporterDescription() {
        return "This importer reads sets of or single .dta or .zta files.";
    }

    /**
     * Returns the name of the importer implementation.
     * This can be displayed, for example, in a list of available importers.
     * @return some information about the importer implementation.
     * Todo: should this text appear in desc/test/dataProcessing/software?
     */
    public String getImporterName() {
        return ".dta/.zta importer";
    }
}
