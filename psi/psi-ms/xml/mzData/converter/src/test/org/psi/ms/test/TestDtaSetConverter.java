/**
 * $Id: TestDtaSetConverter.java,v 1.11 2003/12/03 17:52:31 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 6:19:32 PM
 */
package org.psi.ms.test;

import org.psi.ms.importers.DtaSetImporter;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.MzData;
import org.psi.ms.model.Desc;
import org.psi.ms.model.Acquisition;
import org.psi.ms.xml.MzDataWriter;
import org.apache.log4j.BasicConfigurator;

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
        BasicConfigurator.configure();
        DtaSetImporter dtaSetImporter = new DtaSetImporter();

        Desc desc = dtaSetImporter.initialize(new File(argv[0]), null);
        MzData mzData = new MzData();
        mzData.setDesc(desc);
        MzDataWriter mzDataWriter = new MzDataWriter(new File(argv[1]));
        mzDataWriter.setOutputType(MzDataWriter.OutputType.BASE64);

        mzDataWriter.initialize(mzData, dtaSetImporter.getAcquisitionCount());
        while (dtaSetImporter.hasMoreAcquisitions()) {
            Acquisition acquisition = dtaSetImporter.getNextAcquisition();
            mzDataWriter.marshall(acquisition);
        }
        mzDataWriter.finish();
    }

}
