/**
 * $Id: DtaReader.java,v 1.11 2003/09/10 14:51:33 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 11:30:26 AM
 */
package org.psi.ms.converter;

import org.psi.ms.helper.Utils;
import org.psi.ms.model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Reads in a given .dta file and adds it to a given MzData.
 *
 * @author krunte
 */
public class DtaReader {
    private int arrayOutputType = BASE64;
    public final static int BASE64 = 1;
    public final static int XML_ELEMENTS = 2;
    public final static int DTA = 1;
    public final static int ZTA = 2;
    private int fileType = -1;

    public DtaReader() {
    }

    public DtaReader(int arrayOutputType) {
        if (arrayOutputType == BASE64 || arrayOutputType == XML_ELEMENTS) {
            this.arrayOutputType = arrayOutputType;
        }
    }

    public void addAcquisitions(String filepath, MzData mzData, int acqId) throws IOException {
        /*
         * ..zta files and .dta files are ordered (.zta are first then .dta) and
         * for triple-play experiments there is one each with identical file
         * names except for the extension (as you implemented in your code).
         *
         * The scan id should be incremented from 1 to n.
         *
         * The file name can be read backward from the file extension:
         * The last number before the file extension (before the last '.') is
         *  the charge state - this can be obtained from the first line of the
         *  file.
         * Then there is an '_'
         * Then there is a decimal number representing acquisition time.ÊThis
         *  number can be repeated in our 'range' as both start and stop.
         * Then there is an '_'
         * Then there is the scan number of the precursor ion (this is messy
         *  since the actual scan number of the .dta is not available from the
         *  .dta...)
         * Then there is an '_' and everything else is the sample name
         *  (including any "_" or ".")
         *
         * Also, the MS level is always 2 for .dta and 1 for .zta.
         *
         * The pattern of the filepath is:
         * (sample name)_(sample name)_(sample name)_(scan number).(acquisition time)_(charge state).(zta|dta)
         */
        File path = new File(filepath);
        String filename = path.getName();
        Pattern pattern = Pattern.compile("(.+)_(\\d+).(\\d+)_(\\d+).(zta|dta)");
        Matcher matcher = pattern.matcher(filename);
        int scanNumber = -1;
        int acquisitionTime = -1;
        if (matcher.matches()) {
            Admin admin = mzData.getDesc().getAdmin();
            String sampleName = admin.getSampleName();
            if (sampleName == null || sampleName.equals("")) {
                sampleName = matcher.group(1);
                admin.setSampleName(sampleName);
            }
            String scanNumberString = matcher.group(2);
            scanNumber = new Integer(scanNumberString).intValue();
            String acquisitionTimeString = matcher.group(3);
            acquisitionTime = new Integer(acquisitionTimeString).intValue();
        }

        int msLevel = 2;
        if (filepath.endsWith(".zta")) {
            fileType = ZTA;
            msLevel = 1;
        } else {
            fileType = DTA;
        }

        Desc desc = mzData.getDesc();
        if (desc == null) {
            desc = new Desc();
            mzData.setDesc(desc);
        }
        Raw raw = mzData.getRaw();
        if (raw == null) {
            raw = new Raw();
            mzData.setRaw(raw);
        }

        AcqDescList acqDescList = desc.getAcqDescList();
        if (acqDescList == null) {
            acqDescList = new AcqDescList();
            desc.setAcqDescList(acqDescList);
        }

        AcquisitionList acquisitionList = raw.getAcquisitionList();
        if (acquisitionList == null) {
            acquisitionList = new AcquisitionList();
            raw.setAcquisitionList(acquisitionList);
        }

        AcqDesc acqDesc = new AcqDesc();
        acqDesc.setId(acqId);
        acqDescList.addAcqDesc(acqDesc);

        AcqSettings acqSettings = new AcqSettings();
        acqDesc.setAcqSettings(acqSettings);
        if (fileType == DTA) {
            acqSettings.setSpecType(AcqSettings.SpecType.DISCRETE);
        }
        if (fileType == ZTA) {
            acqSettings.setSpecType(AcqSettings.SpecType.CONTINUOUS);
        }

        // At this stage we don't know yet the range or list of acquisition numbers
        AcqSpecification acqSpecification = new AcqSpecification();
        Range range = new Range();
        range.setStart(acquisitionTime);
        range.setEnd(acquisitionTime);
        acqSpecification.setRange(range);
        //Todo: this is user-supplied information?
        acqSpecification.setMethod(AcqSpecification.Method.AVERAGE);
        acqSettings.setAcqSpecification(acqSpecification);

        InstrumentAcqSettings instrument2 = new InstrumentAcqSettings();
        if (fileType == ZTA) {
            instrument2.setAcqType(InstrumentAcqSettings.AcqType.ZOOM);
            instrument2.setMsLevel(msLevel);
        } else {
            instrument2.setAcqType(InstrumentAcqSettings.AcqType.FULL);
            instrument2.setMsLevel(msLevel);
        }
        acqSettings.setInstrument(instrument2);

        FileReader fileReader = new FileReader(filepath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Extracting the peptide mass and the peptide charge stored in
        // in the first line of the .dta file.
        String firstLine = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(firstLine);
        String peptideMassString = stringTokenizer.nextToken();
        String peptideChargeString = stringTokenizer.nextToken();
        Float peptideMass = new Float(peptideMassString);
        Integer peptideCharge = new Integer(peptideChargeString);

        PrecursorList precursorList = acqDesc.getPrecursorList();
        if (precursorList == null) {
            precursorList = new PrecursorList();
            acqDesc.setPrecursorList(precursorList);
        }

        Precursor precursor = new Precursor();
        Ion ion = new Ion();
        ion.setMz(peptideMass.floatValue());
        ion.setCharge(peptideCharge.intValue());
        precursor.setIon(ion);
        Activation activation = new Activation();
        activation.setMethod(Activation.Method.OTHER);
        precursor.setActivation(activation);
        precursor.setMsLevel(msLevel);
        precursor.setAcqID(scanNumber);
        precursorList.addPrecursor(precursor);

        Acquisition acquisition = new Acquisition();
        acquisition.setId(acqId);
        acquisitionList.addAcquisition(acquisition);
        // Now create the mass and intensity arrays
        if (arrayOutputType == XML_ELEMENTS) {
            addXMLArrays(acquisition, bufferedReader);
        } else if (arrayOutputType == BASE64) {
            addBinaryArrays(acquisition, bufferedReader);
        }
    }


    private int addXMLArrays(Acquisition acquisition, BufferedReader bufferedReader) {
        StringTokenizer stringTokenizer;
        RawDataType mzArray = new RawDataType();
        acquisition.setMzArray(mzArray);
        RawDataType intenArray = new RawDataType();
        acquisition.setIntenArray(intenArray);

        String line;
        int size = 0;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                size++;
                stringTokenizer = new StringTokenizer(line);
                String mzString = stringTokenizer.nextToken();
                String intensityString = stringTokenizer.nextToken();
                Float mz = new Float(mzString);
                Float intensity = new Float(intensityString);
                mzArray.addFloat(mz.floatValue());
                intenArray.addFloat(intensity.floatValue());
            }
        } catch (IOException e) {
            // EOF
        }

        mzArray.setLength(size);
        intenArray.setLength(size);
        return size;
    }

    private int addBinaryArrays(Acquisition acquisition, BufferedReader bufferedReader) throws IOException {
        StringTokenizer stringTokenizer;
        List mzFloatList = new Vector();
        List intensityFloatList = new Vector();
        String line;
        int size = 0;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                size++;
                stringTokenizer = new StringTokenizer(line);
                String mzString = stringTokenizer.nextToken();
                String intensityString = stringTokenizer.nextToken();
                Float mz = new Float(mzString);
                Float intensity = new Float(intensityString);
                mzFloatList.add(mz);
                intensityFloatList.add(intensity);
            }
        } catch (IOException e) {
            // EOF
        }
        byte[] mzFloatArray = Utils.floatListToByteArray(mzFloatList);
        byte[] intensityArray = Utils.floatListToByteArray(intensityFloatList);

/*
        System.out.println("Length of mzFloatArray: " + mzFloatArray.length);
        System.out.println("Length of mzFloatList: " + mzFloatList.size());
        System.out.println("Length of intensityArray: " + intensityArray.length);
        System.out.println("Length of intensityFloatList: " + intensityFloatList.size());
*/
        MzArrayBinary mzArrayBinary = new MzArrayBinary();
        acquisition.setMzArrayBinary(mzArrayBinary);
        IntenArrayBinary intenArrayBinary = new IntenArrayBinary();
        acquisition.setIntenArrayBinary(intenArrayBinary);

        Data mzData = new Data();
        mzData.setContent(mzFloatArray);
        mzData.setLength(size);
        mzData.setPrecision(Data.Precision.THIRTYTWO);
        mzArrayBinary.setData(mzData);
        Data intenData = new Data();
        intenData.setContent(intensityArray);
        intenData.setLength(size);
        intenData.setPrecision(Data.Precision.THIRTYTWO);
        intenArrayBinary.setData(intenData);

        return size;
    }
}
