/**
 * $Id: DtaReader.java,v 1.2 2004/01/14 15:57:35 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jul 23, 2003
 * Time: 11:30:26 AM
 */
package org.psi.ms.importers;

import org.psi.ms.model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reads in a given .dta file and adds it to a given MzData.
 *
 * @author Kai Runte
 */
public class DtaReader {
    public final static int BASE64 = 1;
    public final static int XML_ELEMENTS = 2;
    public final static int DTA = 1;
    public final static int ZTA = 2;
    private int fileType = -1;

    public DtaReader() {
    }

    public Acquisition addAcquisitions(String filepath) throws IOException {
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
        // Todo: What is this scan-number supposed to do?
        int scanNumber = -1;
        int acquisitionTime = -1;
        if (matcher.matches()) {
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

        AcqDesc acqDesc = new AcqDesc();

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
        precursorList.addPrecursor(precursor);

        Acquisition acquisition = new Acquisition();
        // Now create the mass and intensity arrays
        addXMLArrays(acquisition, bufferedReader);

        // Set the description of the acquisition
        acquisition.setAcqDesc(acqDesc);

        return acquisition;
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
}
