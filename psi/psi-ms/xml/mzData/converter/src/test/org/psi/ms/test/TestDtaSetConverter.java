/**
 * $Id: TestDtaSetConverter.java,v 1.6 2003/09/17 13:25:24 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 6:19:32 PM
 */
package org.psi.ms.test;

import org.psi.ms.converter.DtaSetConverter;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.MzData;
import org.psi.ms.xml.MzDataWriter;

import java.io.IOException;

/**
 *
 * @author krunte
 */
public class TestDtaSetConverter {

    public static void main(String[] argv) throws IOException, PsiMsConverterException {
        DtaSetConverter dtaSetConverter = new DtaSetConverter();
        MzData mzData = new MzData();
        dtaSetConverter = new DtaSetConverter();
        dtaSetConverter.convertDirectory(argv[0], argv[1], mzData, MzDataWriter.OutputType.BASE64);
    }
}
