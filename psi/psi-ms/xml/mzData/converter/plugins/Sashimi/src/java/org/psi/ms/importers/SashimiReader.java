/**
 * $Id: SashimiReader.java,v 1.1 2004/01/27 12:12:07 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jan 14, 2004
 * Time: 11:01:23 AM
 */
package org.psi.ms.importers;

import org.expasy.tools.xml.PullReader;
import org.psi.ms.model.*;
import org.systemsbiology.jrap.Base64;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Kai Runte
 */
public class SashimiReader extends PullReader {
    private Desc desc;
    private Acquisition next;
    private int acquisitionCount = 0;

    public SashimiReader(Desc desc, File source) throws IOException {
        super(source);
        this.desc = desc;
        init();
    }

    private void init()
            throws IOException {
        try {
            setNamespace("http://sashimi.sourceforge.net/schema/");
            setElement("http://sashimi.sourceforge.net/schema/", "scan");

            register("/msRun", new MsRunAction(desc, this));
            register("/msRun/parentFile", new ParentFileAction(desc));
            register("/msRun/instrument", new InstrumentAction(desc));
            register("/msRun/instrument/software", new InstrumentSoftwareAction(desc));
            register("/msRun/dataProcessing", new DataProcessingAction(desc));
            register("/msRun/dataProcessing/software", new DataProcessingSoftwareAction(desc));
            register("/msRun/scan", new ScanAction(desc));
            register("/msRun/scan/peaks", new ScanPeaksAction(desc));
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Couldn't load configuration: " +
                    e.getMessage());
        }
    }

    public boolean hasNext() throws IOException {
        if (next == null) {
            next = new Acquisition();
            next = process(next) ? next : null;
        }

        return next != null;
    }

    public Acquisition next() throws IOException {
        Acquisition acquisition = hasNext() ? next : null;
        next = null;
        return acquisition;
    }


    // Todo: create actions for optional elements/attributes.

    private static class MsRunAction extends DefaultAction {

        private Desc desc;
        private SashimiReader sashimiReader;

        public MsRunAction(Desc desc, SashimiReader sashimiReader) {
            super();
            this.desc = desc;
            this.sashimiReader = sashimiReader;
        }

        public void execute() throws Exception {
            String scanCount = getAttribute("scanCount");
            System.out.println(scanCount);
            sashimiReader.acquisitionCount = Integer.parseInt(scanCount);
            String startTime = getAttribute("startTime");
            System.out.println(startTime);
            String endTime = getAttribute("endTime");
            System.out.println(endTime);
        }

    }

    private static class ParentFileAction extends DefaultAction {

        private Desc desc;

        public ParentFileAction(Desc desc) {
            super();
            this.desc = desc;
        }

        public void execute() throws Exception {
            String fileName = getAttribute("fileName");
            System.out.println(fileName);
            String fileType = getAttribute("fileType");
            System.out.println(fileType);

            SourceFile sourceFile = new SourceFile();
            sourceFile.setName(fileName);
            sourceFile.setType(fileType);
            desc.getAdmin().addSourceFile(sourceFile);
        }
    }

    private static class InstrumentAction extends DefaultAction {

        private Desc desc;
        private Map analyzerTypeMap = new HashMap();

        public InstrumentAction(Desc desc) {
            super();
            this.desc = desc;
            // Todo: find a better mapping
            analyzerTypeMap.put("FT", "other");
            analyzerTypeMap.put("TOF", "TOF");
            analyzerTypeMap.put("TOF-TOF", "other");
            analyzerTypeMap.put("Q-TOF", "other");
            analyzerTypeMap.put("Q1", "other");
            analyzerTypeMap.put("Q3", "other");
            analyzerTypeMap.put("Magnetic Sector", "other");
            analyzerTypeMap.put("Ion Trap", "other");
        }

        public void execute()
                throws Exception {
            String manufacturer = getAttribute("manufacturer");
            System.out.println(manufacturer);
            String model = getAttribute("model");
            System.out.println(model);
            String ionisation = getAttribute("ionisation");
            System.out.println(ionisation);
            String msType = getAttribute("msType");
            System.out.println(msType);

            InstrumentCommonSettings instrument = desc.getInstrument();
            instrument.setInstName(model);
            Source source = new Source();
            Source.Type type = null;
            try {
                type = Source.Type.valueOf(ionisation);
            } catch (IllegalArgumentException e) {
                // igored
            }
            if (type != null) {
                source.setType(type);
            } else {
                source.setType(Source.Type.OTHER);
            }
            Analyzer analyzer = new Analyzer();
            String analyzerTypeString = (String) analyzerTypeMap.get(msType);
            if (analyzerTypeString != null) {
                analyzer.setType(Analyzer.Type.valueOf(analyzerTypeString));
            } else {
                analyzer.setType(Analyzer.Type.OTHER);
            }
        }
    }

    private static class InstrumentSoftwareAction extends DefaultAction {

        private Desc desc;

        public InstrumentSoftwareAction(Desc desc) {
            super();
            this.desc = desc;
        }

        public void execute()
                throws Exception {
            String type = getAttribute("type");
            System.out.println(type);
            String name = getAttribute("name");
            System.out.println(name);
            String version = getAttribute("version");
            System.out.println(version);
            Test test = desc.getTest();
            DataProcessing dataProcessing = new DataProcessing();
            Software software = new Software();
            software.setName(name);
            software.setVersion(version);
            software.setDescription(type);
            dataProcessing.setSoftware(software);
            test.addDataProcessing(dataProcessing);
        }
    }

    private static class DataProcessingAction extends DefaultAction {

        private Desc desc;

        public DataProcessingAction(Desc desc) {
            super();
            this.desc = desc;
        }

        public void execute()
                throws Exception {
            // No mandatory fields
        }
    }

    private static class DataProcessingSoftwareAction extends DefaultAction {

        private Desc desc;

        public DataProcessingSoftwareAction(Desc desc) {
            super();
            this.desc = desc;
        }

        public void execute()
                throws Exception {
            String type = getAttribute("type");
            System.out.println(type);
            String name = getAttribute("name");
            System.out.println(name);
            String version = getAttribute("version");
            System.out.println(version);
            Test test = desc.getTest();
            DataProcessing dataProcessing = new DataProcessing();
            Software software = new Software();
            software.setName(name);
            software.setVersion(version);
            software.setDescription(type);
            dataProcessing.setSoftware(software);
            test.addDataProcessing(dataProcessing);
        }
    }

    private static class ScanAction extends DefaultAction {

        private Desc desc;

        public ScanAction(Desc desc) {
            super();
            this.desc = desc;
        }

        public void execute()
                throws Exception {
            String num = getAttribute("num");
            System.out.println(num);
            String msLevel = getAttribute("msLevel");
            System.out.println(msLevel);
            String peaksCount = getAttribute("peaksCount");
            System.out.println(peaksCount);
            String polarity = getAttribute("polarity");
            System.out.println(polarity);
            String scanType = getAttribute("scanType");
            System.out.println(scanType);
            String centroided = getAttribute("centroided");
            System.out.println(centroided);
            String retentionTime = getAttribute("retentionTime");
            System.out.println(retentionTime);
            String startMz = getAttribute("startMz");
            System.out.println(startMz);
            String endMz = getAttribute("endMz");
            System.out.println(endMz);
            String lowMz = getAttribute("lowMz");
            System.out.println(lowMz);
            String highMz = getAttribute("highMz");
            System.out.println(highMz);
            String basePeakMz = getAttribute("basePeakMz");
            System.out.println(basePeakMz);
            String basePeakIntensity = getAttribute("basePeakIntensity");
            System.out.println(basePeakIntensity);
            String totIonCurrent = getAttribute("totIonCurrent");
            System.out.println(totIonCurrent);

            Acquisition acquisition = (Acquisition) stack.peek();
            AcqDesc acqDesc = acquisition.getAcqDesc();
            AcqSettings acqSettings = acqDesc.getAcqSettings();
            AcqSpecification acqSpecification = acqSettings.getAcqSpecification();

            // Todo: when is Method set to AVERAGE, when to SUM?
            acqSpecification.setMethod(AcqSpecification.Method.AVERAGE);
            if (scanType.equals("zoom")) {
                acqSettings.setSpecType(AcqSettings.SpecType.CONTINUOUS);
            } else {
                acqSettings.setSpecType(AcqSettings.SpecType.DISCRETE);
            }
            // Todo: again, is this a valid mapping?
            Range range = new Range();
            range.setStart(new Float(startMz).intValue());
            range.setEnd(new Float(endMz).intValue());
            acqSpecification.setRange(range);

            InstrumentAcqSettings instrument = acqSettings.getInstrument();
            instrument.setAcqType(InstrumentAcqSettings.AcqType.valueOf(scanType));
            instrument.setMsLevel(new Integer(msLevel).intValue());
            if (polarity != null) {
                instrument.setPolarity(InstrumentAcqSettings.Polarity.valueOf(polarity));
            }
        }
    }

    private static class ScanPeaksAction extends DefaultAction {

        private Desc desc;

        public ScanPeaksAction(Desc desc) {
            super();
            this.desc = desc;
        }

        public void execute() throws Exception {
            String precisionString = getAttribute("precision");
            int precision = Integer.parseInt(precisionString);
            System.out.println(precisionString);
            String data = getText();
            //System.out.println(data);

            Acquisition acquisition = (Acquisition) stack.peek();

            // This part I copied straight from jrar source code
            byte[] tmpArr = Base64.decode(data);
            int floatBytes = precision / 8;
            float[][] tmpPeakList =
                    new float[tmpArr.length / floatBytes / 2][2];
            int peakIndex = 0;
            int fieldIndex = 0;

            if (floatBytes <= 0)
                System.err.println("FLOATBYTES <= 0!!!");

            for (int i = 0; i <= tmpArr.length - floatBytes; i += floatBytes) {
                int intBits = 0;
                intBits |= (((int) tmpArr[i]) & 0xff);
                intBits <<= 8;
                intBits |= (((int) tmpArr[i + 1]) & 0xff);
                intBits <<= 8;
                intBits |= (((int) tmpArr[i + 2]) & 0xff);
                intBits <<= 8;
                intBits |= (((int) tmpArr[i + 3]) & 0xff);
                // Must be in IEEE 754 encoding!
                tmpPeakList[peakIndex][fieldIndex++] =
                        Float.intBitsToFloat(intBits);
                if (fieldIndex == 2) {
                    fieldIndex = 0;
                    peakIndex++;
                }
            }
            // jrar part ends
            RawDataType mzArray = acquisition.getMzArray();
            RawDataType intenArray = acquisition.getIntenArray();
            for (int iii = 0; iii < tmpPeakList.length; iii++) {
                float[] floats = tmpPeakList[iii];
                mzArray.addFloat(floats[0]);
                intenArray.addFloat(floats[1]);
            }
        }
    }
}
