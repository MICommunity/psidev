package org.psi.ms.swing;

import org.psi.ms.model.MzData;
import org.psi.ms.model.Acquisition;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.converter.ParseListener;
import org.psi.ms.converter.ImporterI;
import org.psi.ms.xml.MzDataWriter;

import java.io.IOException;
import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 10, 2003
 * Time: 4:13:04 PM
 * To change this template use Options | File Templates.
 */
public class ParsingBusiness {

    public static final String PARSE = "org.psi.ms.swing.parsingbusiness.parse";

    public ParsingBusiness() {

    }

    void parseData(ImporterI oConverter,
                   String poDest,
                   MzData poData,
                   MzDataWriter.OutputType poType,
                   ParseListener poListener) {

        try {
            MzDataWriter mzDataWriter = new MzDataWriter(new File(poDest));
            mzDataWriter.setOutputType(poType);

            int acquisitionCount = oConverter.getAcquisitionCount();
            mzDataWriter.initialize(poData, acquisitionCount);
            poListener.setMax(acquisitionCount);
            while (oConverter.hasMoreAcquisitions()) {
                Acquisition acquisition = oConverter.getNextAcquisition();
                poListener.increment();
                mzDataWriter.marshall(acquisition);
            }
            mzDataWriter.finish();



        } catch (PsiMsConverterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
