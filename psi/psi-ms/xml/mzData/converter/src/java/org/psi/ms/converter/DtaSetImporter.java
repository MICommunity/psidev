/**
 * $Id: DtaSetImporter.java,v 1.1 2003/11/10 10:21:12 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 5:24:22 PM
 */
package org.psi.ms.converter;

import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.helper.SuffixFileFilter;
import org.psi.ms.helper.Utils;
import org.psi.ms.model.MzData;
import org.psi.ms.model.Desc;
import org.psi.ms.model.Acquisition;
import org.psi.ms.model.Admin;
import org.psi.ms.xml.MzDataWriter;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Reads in all .dta/.zta from a given directory and converts them
 * into a single peaklist XML document. Per default the arrays are
 * stored in the space-saving base64 format.
 *
 * @author krunte
 */
public class DtaSetImporter implements ImporterI{

    private DtaReader dtaReader;

    private SortedSet dtaFileSet = null;
    private SortedSet ztaFileSet = null;

    private int scanNumber = -1;
    private int acquisitionTime = -1;

    public DtaSetImporter() {
        dtaReader = new DtaReader();
    }

    public void convertDirectory(String sourceDirname, String outputFilename, MzData mzData, MzDataWriter.OutputType outputType) throws PsiMsConverterException, IOException {
        this.convertDirectory(sourceDirname, outputFilename, mzData, outputType, null);
    }

    public void convertDirectory(String sourceDirname, String outputFilename, MzData mzData, MzDataWriter.OutputType outputType, ParseListener listener) throws PsiMsConverterException, IOException {
        File sourceDir = new File(sourceDirname);
        File[] dtaFiles = sourceDir.listFiles(new SuffixFileFilter(".dta"));
        File[] ztaFiles = sourceDir.listFiles(new SuffixFileFilter(".zta"));
        if (dtaFiles.length != ztaFiles.length) {
            throw new PsiMsConverterException("Number of .dta and .zta files differs!");
        }
        dtaFileSet = Utils.fileArrayToTreeSet(dtaFiles);
        ztaFileSet = Utils.fileArrayToTreeSet(ztaFiles);
        Iterator dtaIterator = dtaFileSet.iterator();
        Iterator ztaIterator = ztaFileSet.iterator();
        int acqId = 0;
        //Tell the GUI that we're busy...
        if (listener != null) {
            listener.setMessage("Parsing...");
        }

        while (dtaIterator.hasNext() && ztaIterator.hasNext()) {
            String dtaFile = (String) dtaIterator.next();
            String ztaFile = (String) ztaIterator.next();
            //Tell the GUI that we're busy...
            if (listener != null) {
                listener.setMessage("Converting file: " + dtaFile);
            } else {
                System.out.println("Converting file: " + dtaFile);
            }
            dtaReader.addAcquisitions(dtaFile, mzData, acqId);
            acqId++;
            //Parsing the .dta file...
            if (listener != null) {
                listener.fileParsed();
            }
            //Tell the GUI that we're busy...
            if (listener != null) {
                listener.setMessage("Converting file: " + ztaFile);
            } else {
                System.out.println("Converting file: " + ztaFile);
            }
            dtaReader.addAcquisitions(ztaFile, mzData, acqId);
            acqId++;
            //Parsing the .zta file...
            if (listener != null) {
                listener.fileParsed();
            }
        }

        //Writing the XML
        if (listener != null) {
            listener.indeterminiteProcess();
            listener.setMessage("Writing XML...");
        }

        MzDataWriter mzDataWriter = new MzDataWriter(new File(outputFilename));
        mzDataWriter.setOutputType(outputType);
        mzDataWriter.marshall(mzData);
    }

    public static void main(String[] argv) throws IOException, PsiMsConverterException {
        DtaSetImporter dtaSetConverter = new DtaSetImporter();
        MzData mzData = new MzData();
        dtaSetConverter = new DtaSetImporter();
        dtaSetConverter.convertDirectory(argv[0], argv[1], mzData, MzDataWriter.OutputType.BASE64);
    }

    /**
     * Initializes a Desc(ription) object from the provide source file or directory.
     * @param source The source file or directory.
     * @param listener The ParseListener for providing feedback to the (graphical) user interface.
     * @throws PsiMsConverterException in case of a conversion error.
     * @throws IOException in case of an file/directory access error.
     * @return A Desc object filled with meta-information harvested from the source.
     */
    public Desc initialize(File source,
                           ParseListener listener) throws PsiMsConverterException, IOException {
        Desc desc = new Desc();
        if(source.isDirectory()) {
            File[] dtaFiles = source.listFiles(new SuffixFileFilter(".dta"));
            File[] ztaFiles = source.listFiles(new SuffixFileFilter(".zta"));
            if (ztaFiles.length != 0 && dtaFiles.length != ztaFiles.length) {
                throw new PsiMsConverterException("Number of .dta and .zta files differs!");
            }
            dtaFileSet = Utils.fileArrayToTreeSet(dtaFiles);
            ztaFileSet = Utils.fileArrayToTreeSet(ztaFiles);

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
                String scanNumberString = matcher.group(2);
                scanNumber = new Integer(scanNumberString).intValue();
                String acquisitionTimeString = matcher.group(3);
                acquisitionTime = new Integer(acquisitionTimeString).intValue();
            }
        } else if (source.isFile()) {
        }
        return desc;
    }

    /**
     * Returns a list of class objects (must be classes of the package org.psi.ms.model).
     * Tells the (graphical) user interface which pieces of information it does not
     * need to request from the user.
     * @return a list of class objects (must be classes of the package org.psi.ms.model).
     */
    public List getProvidedData() {
        return null;
    }

    /**
     * Returns whether single file input is supported or not.
     * @return whether single file input is supported or not.
     */
    public boolean supportsFile() {
        return false;
    }

    /**
     * Returns whether directory input is supported or not.
     * @return whether directory input is supported or not.
     */
    public boolean supportsDirectory() {
        return false;
    }

    /**
     * Returns whether the File object points to a valid input source for this plugin or not.
     * @param file File object pointing to an input source. Can be a single file or directory.
     * @return whether the File object points to a valid input source for this plugin or not.
     */
    public boolean isSupportedInputFormat(File file) {
        return false;
    }

    /**
     * Returns the number of acquisitions found in the source file/directory
     * provided by {@link #initialize(File, ParseListener) initialize}.
     * N.B.: Depending on the input format, it might necessary that Converter
     * implementation needs to scan through the file/directory.
     * @return the number of acquisitions found in the source file/directory
     * provided by {@link #initialize(File, ParseListener) initialize}.
     * @throws PsiMsConverterException if {@link #initialize(File, ParseListener) initialize} was not called.
     * @throws IOException in case of an file/directory access error.
     */
    public int getAcquisitionCount() throws PsiMsConverterException, IOException {
        return 0;
    }

    /**
     * Returns whether the source file/directory provided by
     * {@link #initialize(File, ParseListener) initialize}
     * contains any more Acquisitions.
     * @throws PsiMsConverterException if {@link #initialize(File, ParseListener) initialize} was not called.
     * @return whether the source file/directory contains any more Acquistions.
     * @see #initialize
     */
    public boolean hasMoreAcquisitions() throws PsiMsConverterException {
        return false;
    }

    /**
     * Returns the next available Acquisition or null.
     * @throws IOException in case of an file/directory access error.
     * @return the next available Acquisition or null.
     */
    public Acquisition getNextAcquisition() throws IOException {
        return null;
    }
}
