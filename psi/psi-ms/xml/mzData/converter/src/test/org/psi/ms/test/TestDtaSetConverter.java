/**
 * $Id: TestDtaSetConverter.java,v 1.9 2003/11/14 16:49:30 krunte Exp $
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
import org.psi.ms.model.Desc;
import org.psi.ms.model.Acquisition;
import org.psi.ms.xml.MzDataWriter;

import java.io.IOException;
import java.io.File;

/**
 *
 * @author krunte
 */
public class TestDtaSetConverter {

    /**
     * Main method for quick tests on this converter.
     * @param argv The program parameters
     * @throws IOException in case of an file/directory access error.
     * @throws PsiMsConverterException in case of a conversion error.
     */
    public static void main(String[] argv) throws IOException, PsiMsConverterException {
        DtaSetImporter dtaSetImporter = new DtaSetImporter();

        Desc desc = dtaSetImporter.initialize(new File(argv[0]), null);
        MzData mzData = new MzData();
        mzData.setDesc(desc);
        org.psi.ms.model.AcquisitionList acquisitionList = mzData.getAcquisitionList();

        while (dtaSetImporter.hasMoreAcquisitions()) {
            Acquisition acquisition = dtaSetImporter.getNextAcquisition();
            acquisitionList.addAcquisition(acquisition);
        }

        MzDataWriter mzDataWriter = new MzDataWriter(new File(argv[1]));
        mzDataWriter.setOutputType(MzDataWriter.OutputType.BASE64);
        mzDataWriter.marshall(mzData);
    }

}
