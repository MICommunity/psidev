/**
 * $Id: TestUnmarshaller.java,v 1.3 2003/08/20 16:44:12 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 2:45:05 PM
 */
package org.psi.ms.test;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.psi.ms.model.*;
import org.psi.ms.helper.Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author krunte
 */
public class TestUnmarshaller {
    public static void main(String[] argv) throws IOException, ValidationException, MarshalException {
        FileReader fileReader = new FileReader(argv[0]);
        MzData mzData = MzData.unmarshal(fileReader);

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
