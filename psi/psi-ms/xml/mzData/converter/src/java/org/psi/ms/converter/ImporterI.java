/**
 * $Id: ImporterI.java,v 1.2 2003/11/21 15:32:14 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Oct 21, 2003
 * Time: 5:11:45 PM
 */
package org.psi.ms.converter;

import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.Desc;
import org.psi.ms.model.Acquisition;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * In order to be accepted as a importer module each converter must implement
 * this interface.
 * Each converter class must be able to do the following things:
 * <ul>
 * <li>initialize the conversion process by filling the Desc(ription) object.</li>
 * <li>a method "getProvidedData" returning which data the source format can
 *  provide (e.g. to pre-fill fields in the GUI or to make certain other
 *  field mandatory, for example the precursor for Sciex API III format)</li>
 * <li>the plugin should give feedback to the GUI in some way or another
 *  (e.g. conversion process)</li>
 * <li>a method for stating whether this import module can handle files or
 *  directories</li>
 * <li>a detector method simply returning true/false stating whether the
 *  plugin recognises the selected data file(s)</li>
 * </ul>
 * After initializing the application can fetch each acquisition by calling
 * the method {@link #getNextAcquisition getNextAcquisition()}. If there are
 * no further acquisitions, this method returns null. To check for additional
 * acquisitions the method {@link #hasMoreAcquisitions hasMoreAcquisitions()}
 * can be called.
 *
 * @author Kai Runte
 */
public interface ImporterI {

    /**
     * Initializes a Desc(ription) object from the provide source file or directory.
     * @param source The source file or directory.
     * @param listener The ParseListener for providing feedback to the (graphical) user interface.
     * @throws PsiMsConverterException in case of a conversion error.
     * @throws IOException in case of an file/directory access error.
     * @return A Desc object filled with meta-information harvested from the source.
     */
    public Desc initialize(File source,
                           ParseListener listener) throws PsiMsConverterException, IOException;

    /**
     * Returns a list of {@link ProvidedDataItem ProvidedDataItem} objects.
     * Tells the (graphical) user interface which pieces of information it does not
     * need to request from the user.
     * @return a list of class objects (must be classes of the package org.psi.ms.model).
     * @see ProvidedDataItem
     */
    public List getProvidedData();

    /**
     * Returns whether single file input is supported or not.
     * @return whether single file input is supported or not.
     */
    public boolean supportsFile();

    /**
     * Returns whether directory input is supported or not.
     * @return whether directory input is supported or not.
     */
    public boolean supportsDirectory();

    /**
     * Returns whether the File object points to a valid input source for this plugin or not.
     * @param file File object pointing to an input source. Can be a single file or directory.
     * @return whether the File object points to a valid input source for this plugin or not.
     */
    public boolean isSupportedInputFormat(File file);

    /**
     * Returns the number of acquisitions found in the source file/directory
     * provided by {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize}.
     * N.B.: Depending on the input format, it might necessary that Converter
     * implementation needs to scan through the file/directory.
     * @return the number of acquisitions found in the source file/directory
     * provided by {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize}.
     * @throws PsiMsConverterException if {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize} was not called.
     * @throws IOException in case of an file/directory access error.
     */
    public int getAcquisitionCount() throws PsiMsConverterException, IOException;

    /**
     * Returns whether the source file/directory provided by
     * {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize}
     * contains any more Acquisitions.
     * @throws PsiMsConverterException if {@link #initialize(java.io.File, org.psi.ms.converter.ParseListener) initialize} was not called.
     * @return whether the source file/directory contains any more Acquistions.
     * @see #initialize
     */
    public boolean hasMoreAcquisitions() throws PsiMsConverterException;

    /**
     * Returns the next available Acquisition or null.
     * @throws IOException in case of an file/directory access error.
     * @return the next available Acquisition or null.
     */
    public Acquisition getNextAcquisition() throws IOException;

    /**
     * Returns some information about the importer implementation.
     * This can be displayed, for example, in a list of available importers.
     * @return some information about the importer implementation.
     */
    public String getAboutImporter();
}
