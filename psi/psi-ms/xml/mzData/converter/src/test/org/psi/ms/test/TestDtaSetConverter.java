/**
 * $Id: TestDtaSetConverter.java,v 1.4 2003/09/10 12:45:52 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 6:19:32 PM
 */
package org.psi.ms.test;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.psi.ms.converter.DtaReader;
import org.psi.ms.converter.DtaSetConverter;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.MzData;

import java.io.IOException;

/**
 *
 * @author krunte
 */
public class TestDtaSetConverter {

    public static void main(String[] argv) throws IOException, PsiMsConverterException, ValidationException, MarshalException {
        DtaSetConverter dtaSetConverter = new DtaSetConverter();
        MzData mzData = new MzData();
        dtaSetConverter = new DtaSetConverter(DtaReader.XML_ELEMENTS);
        dtaSetConverter.convertDirectory(argv[0], argv[1], mzData);
        mzData = new MzData();
        dtaSetConverter = new DtaSetConverter(DtaReader.BASE64);
        dtaSetConverter.convertDirectory(argv[0], argv[1] + "_base64", mzData);
    }
}
