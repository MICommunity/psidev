/**
 * $Id: TestDtaSetConverter.java,v 1.1 2003/08/11 17:22:16 krunte Exp $
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

import java.io.IOException;

/**
 * 
 * @author krunte
 */
public class TestDtaSetConverter {

    public static void main(String[] argv) throws IOException, PsiMsConverterException, ValidationException, MarshalException {
        DtaSetConverter dtaSetConverter = new DtaSetConverter();
        dtaSetConverter.convertDirectory(argv[0], argv[1] + "_base64");
        dtaSetConverter = new DtaSetConverter(DtaReader.XML_ELEMENTS);
        dtaSetConverter.convertDirectory(argv[0], argv[1]);
    }
}
