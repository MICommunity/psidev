/**
 * $Id: TestDtaSetConverter.java,v 1.8 2003/11/10 10:21:13 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 6:19:32 PM
 */
package org.psi.ms.test;

import org.psi.ms.converter.DtaSetImporter;
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
        DtaSetImporter dtaSetConverter = new DtaSetImporter();
        MzData mzData = new MzData();
        dtaSetConverter = new DtaSetImporter();
        dtaSetConverter.convertDirectory(argv[0], argv[1], mzData, MzDataWriter.OutputType.XML);
    }
}
