/**
 * $Id: TestDtaReader.java,v 1.8 2003/09/10 14:51:33 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 2:04:59 PM
 */
package org.psi.ms.test;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;
import org.psi.ms.converter.DtaReader;
import org.psi.ms.model.*;
import org.xml.sax.InputSource;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author krunte
 */
public class TestDtaReader {

    public static void main(String[] argv) throws IOException, ValidationException, MarshalException {
        MzData mzData = new MzData();
        DtaReader dtaReader = new DtaReader();

        dtaReader.addAcquisitions(argv[0], mzData, 0);

        FileWriter fileWriter = new FileWriter(argv[0] + ".xml");
/*
        mzData.marshal(fileWriter);
*/
        Mapping mapping = new Mapping();
        try {
            mapping.loadMapping(new InputSource(DtaReader.class.getResourceAsStream("mzDataXMLMapping.xml")));
            Marshaller marshaller = new Marshaller(fileWriter);
            marshaller.setMapping(mapping);
            marshaller.marshal(mzData);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MappingException e) {
            e.printStackTrace();
        }
    }

}
