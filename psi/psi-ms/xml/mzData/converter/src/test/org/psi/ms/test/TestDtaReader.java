/**
 * $Id: TestDtaReader.java,v 1.5 2003/08/21 14:28:02 krunte Exp $
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
        MzData mzData = initConversion();
        DtaReader dtaReader = new DtaReader();

        dtaReader.addAcquisitions(argv[0], mzData);

        AcqDescList acqDescList = mzData.getDesc().getAcqDescList();
        acqDescList.setCount(acqDescList.getAcqDescCount());
        AcquisitionList acquisionList = mzData.getRaw().getAcquisitionList();
        acquisionList.setCount(acquisionList.getAcquisitionCount());

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

    private static MzData initConversion() {
        MzData mzData = new MzData();
        mzData.setVersion("1.00");
        //mzData.setSampleName("DtaSetConverter");

        Desc desc = new Desc();
        mzData.setDesc(desc);
        Admin admin = new Admin();
        desc.setAdmin(admin);

        // Todo: this information must be provided by the user
        admin.setSampleName("?");
        Contact contact = new Contact();
        contact.setName("Kai Runte");
        contact.setInstitution("EMBL Outstation - EBI");
        admin.setContact(contact);

        // Todo: this information must be provided by the user
        InstrumentCommonSettings instrument = new InstrumentCommonSettings();
        instrument.setInstName("unknown");
        Source source = new Source();
        source.setType(Source.Type.OTHER);
        instrument.setSource(source);
        Analyzer analyzer = new Analyzer();
        analyzer.setType(Analyzer.Type.OTHER);
        float unknown = -1;
        analyzer.setResolution(unknown);
        analyzer.setAccuracy(unknown);
        instrument.setAnalyzer(analyzer);
        Detector detector = new Detector();
        detector.setType(Detector.Type.OTHER);
        instrument.setDetector(detector);
        desc.setInstrument(instrument);

        Test test = new Test();
        desc.setTest(test);

        DataProcessing dataProcessing = new DataProcessing();
        test.addDataProcessing(dataProcessing);

        Software software = new Software();
        software.setName("PSI-MS .dta/.zta converter");
        software.setVersion("1.00");
        dataProcessing.setSoftware(software);

        ProcessingMethod processingMethod = new ProcessingMethod();
        test.setProcessingMethod(processingMethod);

        processingMethod.setPeakProcessing("?");

        return mzData;
    }

}
