/**
 * $Id: ExporterI.java,v 1.1 2003/12/03 17:36:25 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
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
 * @author krunte
 */
public interface ExporterI {
    void initialize(MzData mzData, int acquisitionCount) throws PsiMsConverterException;

    void finish() throws PsiMsConverterException;

    void marshall(Acquisition acquisition) throws IOException, PsiMsConverterException;
}
