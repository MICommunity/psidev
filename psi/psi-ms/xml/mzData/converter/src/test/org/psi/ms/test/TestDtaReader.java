/**
 * $Id: TestDtaReader.java,v 1.9 2003/09/15 12:56:30 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 2:04:59 PM
 */
package org.psi.ms.test;

import org.psi.ms.converter.DtaReader;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.MzData;
import org.psi.ms.xml.MzDataWriter;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author krunte
 */
public class TestDtaReader {

    public static void main(String[] argv) throws IOException, PsiMsConverterException {
        MzData mzData = new MzData();
        DtaReader dtaReader = new DtaReader();

        dtaReader.addAcquisitions(argv[0], mzData, 0);

        MzDataWriter mzDataWriter = new MzDataWriter(new File(argv[0] + ".xml"));
        mzDataWriter.marshall(mzData);
    }

}
