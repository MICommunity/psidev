/**
 * $Id: TestUnmarshaller.java,v 1.5 2003/08/28 15:17:12 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 2:45:05 PM
 */
package org.psi.ms.test;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.psi.ms.helper.Utils;
import org.psi.ms.model.Acquisition;
import org.psi.ms.model.AcquisitionList;
import org.psi.ms.model.MzArrayBinary;
import org.psi.ms.model.MzData;
import org.psi.ms.converter.DtaReader;
import org.xml.sax.InputSource;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author krunte
 */
public class TestUnmarshaller {
    public static void main(String[] argv) throws IOException, ValidationException, MarshalException, MappingException {
        FileReader fileReader = new FileReader(argv[0]);

        Mapping mapping = new Mapping();
        mapping.loadMapping(new InputSource(DtaReader.class.getResourceAsStream("mzDataXMLMapping.xml")));
        Unmarshaller unmarshaller = new Unmarshaller();
        unmarshaller.setMapping(mapping);
        MzData mzData = (MzData) unmarshaller.unmarshal(fileReader);

        AcquisitionList acquisionList = mzData.getRaw().getAcquisitionList();
        int acquisitionCount = acquisionList.getAcquisitionCount();

        for (int iii = 0; iii < acquisitionCount; iii++) {
            System.out.println("This is acquisition number " + (iii + 1));
            Acquisition acquisition = acquisionList.getAcquisition(iii);
            MzArrayBinary mzArrayBinary = acquisition.getMzArrayBinary();
            if (mzArrayBinary != null) {
                byte[] raw = mzArrayBinary.getData().getContent();
                List mzFloatList = Utils.byteArrayToFloatList(raw);
                for (int jjj = 0; jjj < mzFloatList.size(); jjj++) {
                    System.out.print(mzFloatList.get(jjj).toString());
                    System.out.print(", ");
                }
            }
        }
    }
}
