/**
 * $Id: SashimiImporter.java,v 1.1 2004/01/27 12:12:07 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Dec 4, 2003
 * Time: 2:07:25 PM
 */
package org.psi.ms.importers;

import org.apache.log4j.Logger;
import org.psi.ms.converter.ImporterI;
import org.psi.ms.converter.ParseListener;
import org.psi.ms.converter.ProvidedDataItem;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.Acquisition;
import org.psi.ms.model.Desc;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Kai Runte
 */
public class SashimiImporter implements ImporterI {

    private File source = null;
    /**
     * The ParseListener for providing feedback to the (graphical) user interface.
     */
    private ParseListener listener = null;
    private int acquisitionsSize = 0;
    private int acquisitionCount = 0;
    private Logger logger = Logger.getLogger(SashimiImporter.class);

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
        return null;
    }

    /**
     * Returns some information about the importer implementation.
     * This can be displayed, for example, in a list of available importers.
     * @return some information about the importer implementation.
     */
    public String getImporterDescription() {
        return "This importer reads Sashimi files as defined in http://sashimi.sourceforge.net/";
    }

    /**
     * Returns the name of the importer implementation.
     * This can be displayed, for example, in a list of available importers.
     * @return some information about the importer implementation.
     */
    public String getImporterName() {
        return "Sashimi importer";
    }


}
