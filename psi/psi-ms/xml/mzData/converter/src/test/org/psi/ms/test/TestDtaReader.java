/**
 * $Id: TestDtaReader.java,v 1.1 2003/08/11 17:22:16 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 2:04:59 PM
 */
package org.psi.ms.test;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.psi.ms.model.*;
import org.psi.ms.model.types.SourceTypeTypeType;
import org.psi.ms.model.types.AnalyzerTypeTypeType;
import org.psi.ms.model.types.DetectorTypeTypeType;
import org.psi.ms.converter.DtaReader;

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
        mzData.marshal(fileWriter);
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
        Contact contact = new Contact();
        contact.setName("Kai Runte");
        contact.setInstitution("EMBL Outstation - EBI");
        admin.setContact(contact);

        // Todo: this information must be provided by the user
        Instrument instrument = new Instrument();
        instrument.setInstName("unknown");
        Source source = new Source();
        source.setType(SourceTypeTypeType.OTHER);
        instrument.setSource(source);
        Analyzer analyzer = new Analyzer();
        analyzer.setType(AnalyzerTypeTypeType.OTHER);
        float unknown = -1;
        analyzer.setResolution(unknown);
        analyzer.setAccuracy(unknown);
        instrument.setAnalyzer(analyzer);
        Detector detector = new Detector();
        detector.setType(DetectorTypeTypeType.OTHER);
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

        PeakProcessing peakProcessing = new PeakProcessing();
        peakProcessing.setDesc("?");
        processingMethod.setPeakProcessing(peakProcessing);

        return mzData;
    }

}
