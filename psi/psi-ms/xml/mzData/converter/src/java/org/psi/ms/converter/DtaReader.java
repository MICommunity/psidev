/**
 * $Id: DtaReader.java,v 1.3 2003/08/20 10:56:05 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 11:30:26 AM
 */
package org.psi.ms.converter;

import org.psi.ms.model.*;
import org.psi.ms.model.types.*;
import org.psi.ms.helper.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

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

    public void addAcquisitions(String filename, MzData mzData) throws IOException {
        if (filename.endsWith(".zta")) {
            fileType = ZTA;
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
        acqDesc.setId(-1);
        acqDescList.addAcqDesc(acqDesc);

        AcqSettings acqSettings = new AcqSettings();
        acqDesc.setAcqSettings(acqSettings);
        if (fileType == DTA) {
            acqSettings.setSpecType(AcqSettingsTypeSpecTypeType.DISCRETE);
        }
        if (fileType == ZTA) {
            acqSettings.setSpecType(AcqSettingsTypeSpecTypeType.CONTINUOUS);
        }

        // At this stage we don't know yet the range or list of acquisition numbers
        AcqSpecification acqSpecification = new AcqSpecification();
        Range range = new Range();
        range.setStart(1);
        range.setEnd(1);
        acqSpecification.setRange(range);
        //Todo: this is user-supplied information?
        acqSpecification.setMethod(AcqSpecificationMethodType.AVERAGE);
        acqSettings.setAcqSpecification(acqSpecification);

        Instrument2 instrument2 = new Instrument2();
        if (fileType == ZTA) {
            instrument2.setAcqType(InstrumentAcqSettingsTypeAcqTypeType.ZOOM);
        } else {
            instrument2.setAcqType(InstrumentAcqSettingsTypeAcqTypeType.FULL);
        }
        instrument2.setMsLevel(-1);
        acqSettings.setInstrument(instrument2);

        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Extracting the peptide mass and the peptide charge stored in
        // in the first line of the .dta file.
        String firstLine = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(firstLine);
        String peptideMassString = stringTokenizer.nextToken();
        String peptideChargeString = stringTokenizer.nextToken();
        Float peptideMass = new Float(peptideMassString);
        Integer peptideCharge = new Integer(peptideChargeString);

        PrecursorList precursorList = new PrecursorList();
        precursorList.setCount(1);
        acqDesc.setPrecursorList(precursorList);

        Precursor precursor = new Precursor();
        Ion ion = new Ion();
        ion.setMz(peptideMass.floatValue());
        ion.setCharge(peptideCharge.intValue());
        precursor.setIon(ion);
        Activation activation = new Activation();
        activation.setMethod(ActivationTypeMethodType.OTHER);
        precursor.setActivation(activation);
        precursor.setMsLevel(-1);
        precursor.setAcqID(-1);
        precursorList.addPrecursor(precursor);


        Acquisition acquisition = new Acquisition();
        acquisition.setId(-1);
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
        AcquisitionTypeSequence acquisitionSequence = new AcquisitionTypeSequence();
        acquisition.setAcquisitionTypeSequence(acquisitionSequence);
        MzArray mzArray = new MzArray();
        acquisitionSequence.setMzArray(mzArray);
        IntenArray intenArray = new IntenArray();
        acquisitionSequence.setIntenArray(intenArray);

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
        AcquisitionTypeSequence2 acquisitionSequence2 = new AcquisitionTypeSequence2();
        acquisition.setAcquisitionTypeSequence2(acquisitionSequence2);
        MzArrayBinary mzArrayBinary = new MzArrayBinary();
        acquisitionSequence2.setMzArrayBinary(mzArrayBinary);
        IntenArrayBinary intenArrayBinary = new IntenArrayBinary();
        acquisitionSequence2.setIntenArrayBinary(intenArrayBinary);

        Data mzData = new Data();
        mzData.setContent(mzFloatArray);
        mzData.setLength(size);
        mzData.setPrecision(DataPrecisionType.VALUE_0);
        mzArrayBinary.setData(mzData);
        Data intenData = new Data();
        intenData.setContent(intensityArray);
        intenData.setLength(size);
        intenData.setPrecision(DataPrecisionType.VALUE_0);
        intenArrayBinary.setData(intenData);

        return size;
    }
}
