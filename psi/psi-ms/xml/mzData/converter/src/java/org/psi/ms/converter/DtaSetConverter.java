/**
 * $Id: DtaSetConverter.java,v 1.1 2003/08/11 17:22:16 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 5:24:22 PM
 */
package org.psi.ms.converter;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.psi.ms.model.*;
import org.psi.ms.model.types.*;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.helper.SuffixFileFilter;
import org.psi.ms.helper.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.SortedSet;

/**
 * Reads in all .dta/.zta from a given directory and converts them
 * into a single peaklist XML document. Per default the arrays are
 * stored in the space-saving base64 format.
 *
 * @author krunte
 */
public class DtaSetConverter {
    private int arrayOutputType;
    private DtaReader dtaReader;

    public DtaSetConverter() {
        arrayOutputType = DtaReader.BASE64;
        dtaReader = new DtaReader(arrayOutputType);
    }

    public DtaSetConverter(int arrayOutputType) {
        this.arrayOutputType = arrayOutputType;
        dtaReader = new DtaReader(arrayOutputType);
    }

    public void convertDirectory(String sourceDirname, String outputFilename) throws PsiMsConverterException, IOException, ValidationException, MarshalException {
        MzData mzData = initConversion();

        File sourceDir = new File(sourceDirname);
        File[] dtaFiles = sourceDir.listFiles(new SuffixFileFilter(".dta"));
        File[] ztaFiles = sourceDir.listFiles(new SuffixFileFilter(".zta"));
        if (dtaFiles.length != ztaFiles.length) {
            throw new PsiMsConverterException("Number of .dta and .zta files differs!");
        }
        SortedSet dtaFileSet = Utils.fileArrayToTreeSet(dtaFiles);
        SortedSet ztaFileSet = Utils.fileArrayToTreeSet(ztaFiles);
        Iterator dtaIterator = dtaFileSet.iterator();
        Iterator ztaIterator = ztaFileSet.iterator();
        while (dtaIterator.hasNext() && ztaIterator.hasNext()) {
            String dtaFile = (String) dtaIterator.next();
            String ztaFile = (String) ztaIterator.next();
            System.out.println("Converting file: " + dtaFile);
            dtaReader.addAcquisitions(dtaFile, mzData);
            System.out.println("Converting file: " + ztaFile);
            dtaReader.addAcquisitions(ztaFile, mzData);
        }

        AcqDescList acqDescList = mzData.getDesc().getAcqDescList();
        acqDescList.setCount(acqDescList.getAcqDescCount());
        AcquisitionList acquisitionList = mzData.getRaw().getAcquisitionList();
        acquisitionList.setCount(acquisitionList.getAcquisitionCount());

        FileWriter fileWriter = new FileWriter(outputFilename);
        mzData.marshal(fileWriter);
    }

    private MzData initConversion() {
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
