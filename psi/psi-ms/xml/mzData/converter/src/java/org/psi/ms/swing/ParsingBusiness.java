package org.psi.ms.swing;

import org.psi.ms.model.MzData;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.converter.DtaSetImporter;
import org.psi.ms.converter.ParseListener;
import org.psi.ms.xml.MzDataWriter;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 10, 2003
 * Time: 4:13:04 PM
 * To change this template use Options | File Templates.
 */
public class ParsingBusiness {

    public static final String PARSE = "org.psi.ms.swing.parsingbusiness.parse";

    private DtaSetImporter oConverter = new DtaSetImporter();

    public ParsingBusiness() {

    }

    void parseData(String poSource,
                   String poDest,
                   MzData poData,
                   MzDataWriter.OutputType poType,
                   ParseListener poListener) {

        try {
            oConverter.convertDirectory(poSource, poDest, poData, poType, poListener);
        } catch (PsiMsConverterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
