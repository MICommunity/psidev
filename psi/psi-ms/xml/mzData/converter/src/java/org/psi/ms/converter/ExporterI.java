/**
 * $Id: ExporterI.java,v 1.2 2004/01/14 15:57:35 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Dec 1, 2003
 * Time: 10:52:47 AM
 */
package org.psi.ms.converter;

import org.psi.ms.model.MzData;
import org.psi.ms.model.Acquisition;
import org.psi.ms.helper.PsiMsConverterException;

import java.io.IOException;

/**
 * 
 * @author Kai Runte
 */
public interface ExporterI {
    void initialize(MzData mzData, int acquisitionCount) throws PsiMsConverterException;

    void finish() throws PsiMsConverterException;

    void marshall(Acquisition acquisition) throws IOException, PsiMsConverterException;
}
