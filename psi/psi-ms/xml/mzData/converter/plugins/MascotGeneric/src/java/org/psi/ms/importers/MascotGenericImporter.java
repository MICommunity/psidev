/**
 * $Id: MascotGenericImporter.java,v 1.1 2003/12/05 18:01:51 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Dec 4, 2003
 * Time: 2:07:25 PM
 */
package org.psi.ms.importers;

import org.psi.ms.converter.ImporterI;
import org.psi.ms.converter.ParseListener;
import org.psi.ms.converter.ProvidedDataItem;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.*;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 
 * @author krunte
 */
public class MascotGenericImporter implements ImporterI {

    private File source = null;
    /**
     * The ParseListener for providing feedback to the (graphical) user interface.
     */
    private ParseListener listener = null;
    private int acquisitionsSize = 0;
    private int acquisitionCount = 0;
    private Logger logger = Logger.getLogger(MascotGenericImporter.class);
    private MascotGenericReader mascotGenericReader = null;

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
        this.source = source;
        this.listener = listener;

        // Get the acquisition count
        acquisitionsSize = 0;
        acquisitionCount = 0;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(source);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if(line.startsWith("BEGIN IONS")) {
                    acquisitionsSize++;
                }
            }
            fileReader.close();
        } catch (IOException e) {
            acquisitionsSize = 0;
            throw new PsiMsConverterException("Error during counting acquisitions.", e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }

        // Fetch header information if any
        mascotGenericReader = new MascotGenericReader(source);
        mascotGenericReader.readHeader(desc);

        return desc;
    }

    /**
     * Returns a list of {@link ProvidedDataItem ProvidedDataItem} objects.
     * Tells the (graphical) user interface which pieces of information it does not
     * need to request from the user.
     * @return a list of class objects (must be classes of the package org.psi.ms.model).
     * @see ProvidedDataItem
     */
    public List getProvidedData() {
        return null;
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
        return false;
    }

    /**
     * Returns whether the File object points to a valid input source for this plugin or not.
     * @param file File object pointing to an input source. Can be a single file or directory.
     * @return whether the File object points to a valid input source for this plugin or not.
     */
    public boolean isSupportedInputFormat(File file) {
        boolean supported = false;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            if (line.startsWith("FORMAT=")) {
                // If the first line is the FORMAT= line, it's the easy way out
                supported = true;
            } else {
                // Otherwise we need to go through the file until we find a line
                // starting with END IONS. In the worst case, if the file size
                // cannot be determined, the importer has
                // to read through the complete file to confirm it's not a
                // Mascot Generic file. :-(
                long fileSize = file.length();
                if (fileSize > 1050L) {
                    bufferedReader.skip(fileSize - 1000);
                } else {
                    logger.warn("File size could not be determined. Searching the complete file.");
                }
                while ((line = bufferedReader.readLine()) != null && !supported) {
                    supported = line.startsWith("END IONS");
                }
            }
            fileReader.close();
        } catch (IOException e) {
            return false;
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }

        return supported;
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
        if (source == null) {
            throw new PsiMsConverterException("Importer was not initialized!");
        }
        return acquisitionsSize;
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
        if (source == null) {
            throw new PsiMsConverterException("Importer was not initialized!");
        }
        logger.debug("Acquisition count: " + acquisitionCount);
        logger.debug("Acquisitions size: " + acquisitionsSize);
        return acquisitionCount < acquisitionsSize;
    }

    /**
     * Returns the next available Acquisition or null.
     * @throws IOException in case of an file/directory access error.
     * @return the next available Acquisition or null.
     */
    public Acquisition getNextAcquisition() throws IOException {
        if (source == null) {
            throw new IOException("Importer was not initialized!");
        }
        return mascotGenericReader.nextAcquisition();
    }

    /**
     * Returns some information about the importer implementation.
     * This can be displayed, for example, in a list of available importers.
     * @return some information about the importer implementation.
     */
    public String getImporterDescription() {
        return "This importer read Mascot Generic files as defined in http://www.matrixscience.com/help/data_file_help.html";
    }

    /**
     * Returns the name of the importer implementation.
     * This can be displayed, for example, in a list of available importers.
     * @return some information about the importer implementation.
     */
    public String getImporterName() {
        return "Mascot Generic importer";
    }

    private class MascotGenericReader {
        File source;
        BufferedReader reader;
        String line;
        // Todo: This may be refined later to restrict the pattern names?
        Pattern parameterPattern = Pattern.compile("(.+)=(.+)");

        public MascotGenericReader(File source) throws FileNotFoundException {
            this.source = source;
            reader = new BufferedReader(new FileReader(source));
        }

        public void readHeader(Desc desc) throws IOException {
            listener.setMessage("Reading header");
            while ((line = reader.readLine()) != null && !line.startsWith("BEGIN IONS")) {
                // skip empty lines
                if (line.length() > 0) {
                    char firstChar = line.charAt(0);
                    switch(firstChar) {
                        case '#':
                            // comment, ignore
                            break;
                        case ';':
                            // comment, ignore
                            break;
                        case '!':
                            // comment, ignore
                            break;
                        case '/':
                            // comment, ignore
                            break;
                        default:
                            Matcher matcher = parameterPattern.matcher(line);
                            if (matcher.matches()) {
                                String parameterName = matcher.group(1);
                                String parameterValue = matcher.group(2);
                                logger.debug("Parameter name: " + parameterName);
                                logger.debug("Parameter value: " + parameterValue);
                            }
                            break;
                    }
                }
            }
        }

        public Acquisition nextAcquisition() throws IOException {
            Acquisition acquisition = null;
            if (acquisitionCount < acquisitionsSize) {
                acquisitionCount++;
                acquisition = new Acquisition();
                AcqSettings acqSettings = acquisition.getAcqDesc().getAcqSettings();
                acqSettings.setSpecType(AcqSettings.SpecType.DISCRETE);
                AcqSpecification acqSpecification = acqSettings.getAcqSpecification();
                acqSpecification.setMethod(AcqSpecification.Method.AVERAGE);
                org.psi.ms.model.Range range = acqSpecification.getRange();
                // Todo: where do I get these from?
                range.setStart(-1);
                range.setEnd(-1);
                InstrumentAcqSettings instrument = acqSettings.getInstrument();
                // Todo: is this correct?
                instrument.setAcqType(InstrumentAcqSettings.AcqType.FULL);
                // Todo: where do I get this from?
                instrument.setMsLevel(-1);
                RawDataType mzArray = acquisition.getMzArray();
                RawDataType intenArray = acquisition.getIntenArray();
                listener.setMessage("Reading acquisition number: " + acquisitionCount);
                if (!line.equals("BEGIN IONS")) {
                    // skip all line until BEGIN IONS
                }
                while ((line = reader.readLine()) != null && !line.startsWith("END IONS")) {
                    // skip empty lines
                    if (line.length() > 0) {
                        char firstChar = line.charAt(0);
                        switch(firstChar) {
                            case '#':
                                // comment, ignore
                                break;
                            case ';':
                                // comment, ignore
                                break;
                            case '!':
                                // comment, ignore
                                break;
                            case '/':
                                // comment, ignore
                                break;
                            default:
                                Matcher matcher = parameterPattern.matcher(line);
                                if (matcher.matches()) {
                                    String parameterName = matcher.group(1);
                                    String parameterValue = matcher.group(2);
                                    logger.debug("Parameter name: " + parameterName);
                                    logger.debug("Parameter value: " + parameterValue);
                                } else {
                                    // should be a peak value
                                    StringTokenizer tokenizer = new StringTokenizer(line);
                                    if (tokenizer.hasMoreTokens()) {
                                        String massString = tokenizer.nextToken();
                                        mzArray.addFloat(Float.parseFloat(massString));
                                    }
                                    if (tokenizer.hasMoreTokens()) {
                                        String intensityString = tokenizer.nextToken();
                                        intenArray.addFloat(Float.parseFloat(intensityString));
                                    } else {
                                        intenArray.addFloat(0);
                                    }
                                }
                                break;
                        }
                    }
                }
            }
            return acquisition;
        }
    }
}
