/**
 * $Id: MzDataWriter.java,v 1.9 2004/01/14 15:57:36 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Sep 10, 2003
 * Time: 6:42:23 PM
 */
package org.psi.ms.xml;

import org.apache.commons.codec.EncoderException;
import org.psi.ms.helper.Utils;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.*;
import org.psi.ms.converter.ExporterI;
import org.xmlpull.mxp1_serializer.MXSerializer;
import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Kai Runte
 */
public class MzDataWriter implements ExporterI {

    /**
     * This class is responsible for writing
     * the XML code.
     */
    private XmlSerializer xmlSerializer;

    /**
     * The output stream used for the XML output.
     */
    private OutputStream stream;

    /**
     * Flag, whether the MzDataWriter has to close
     * the stream after writing (in the case it
     * created the stream itself) or not (in the
     * case the calling application created the
     * stream).
     */
    private boolean close = false;

    /**
     * The ouput type. Either XML elements or base 64 data block.
     * Default is base 64 block.
     */
    private OutputType outputType = OutputType.BASE64;

    /**
     * This formatter creates/parses the W3C XML type xs:dateTime
     */
    private SimpleDateFormat xsDateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public MzDataWriter() {
        xmlSerializer = new MXSerializer();
        stream = System.out;
    }

    public MzDataWriter(OutputStream stream) {
        xmlSerializer = new MXSerializer();
        this.stream = stream;
    }

    public MzDataWriter(File file) throws IOException {
        xmlSerializer = new MXSerializer();
        stream = new FileOutputStream(file);
        if (file.getName().endsWith(".gz"))
            stream = new GZIPOutputStream(stream);
        if (file.getName().endsWith(".zip"))
            stream = new ZipOutputStream(stream);
        close = true;
    }

    /**
     * Returns the output type. Either XML elements or Base 64 data block.
     * @return the output type.
     */
    public OutputType getOutputType() {
        return outputType;
    }

    /**
     * Sets the output type. Either XML elements or Base 64 data block.
     * @param outputType The output type.
     */
    public void setOutputType(OutputType outputType) {
        this.outputType = outputType;
    }

    private void startTag(String namespace, String tagName) throws IOException {
        xmlSerializer.startTag(namespace, tagName);
    }

    private void endTag(String namespace, String tagName) throws IOException {
        xmlSerializer.endTag(namespace, tagName);
    }

    private void attribute(String namespace, String name, Object value) throws IOException {
        xmlSerializer.attribute(namespace, name, value.toString());
    }

    private void text(String s) throws IOException {
        xmlSerializer.text(s);
    }

    /**
     *
     * @param mzData
     * @param acquisitionCount
     * @throws PsiMsConverterException
     */
    public void initialize(MzData mzData, int acquisitionCount) throws PsiMsConverterException {
        try {
            xmlSerializer.setOutput(stream, "UTF-8");
            xmlSerializer.setProperty("http://xmlpull.org/v1/doc/properties.html#serializer-indentation", "  ");
            xmlSerializer.setProperty("http://xmlpull.org/v1/doc/properties.html#serializer-line-separator", "\n");
            xmlSerializer.startDocument("UTF-8", null);

            text("\n");
            startTag(null, "mzData");
            attribute(null, "version", mzData.getVersion());
            marshall(mzData.getDesc());
            startTag(null, "raw");
            startTag(null, "acquisitionList");
            attribute(null, "count", Integer.toString(acquisitionCount));
        } catch (IOException e) {
            throw new PsiMsConverterException(e);
        } catch (IllegalArgumentException e) {
            throw new PsiMsConverterException(e);
        } catch (IllegalStateException e) {
            throw new PsiMsConverterException(e);
        }
    }

    /**
     *
     * @throws PsiMsConverterException
     */
    public void finish() throws PsiMsConverterException {
        try {
            endTag(null, "acquisitionList");
            endTag(null, "raw");
            endTag(null, "mzData");
            text("\n");

            xmlSerializer.endDocument();
            stream.flush();
            if (close)
                stream.close();
        } catch (IOException e) {
            throw new PsiMsConverterException(e);
        } catch (IllegalArgumentException e) {
            throw new PsiMsConverterException(e);
        } catch (IllegalStateException e) {
            throw new PsiMsConverterException(e);
        }
    }

    private void marshall(Desc desc) throws IOException {
        startTag(null, "desc");
        marshall(desc.getAdmin());
        marshall(desc.getInstrument());
        marshall(desc.getTest());
        endTag(null, "desc");
    }

    private void marshall(Admin admin) throws IOException {
        startTag(null, "admin");
        startTag(null, "sampleName");
        text(admin.getSampleName());
        endTag(null, "sampleName");
        marshall(admin.getContact());
        endTag(null, "admin");
        int sourceFileCount = admin.getSourceFileCount();
        if (sourceFileCount > 0) {
            for (int iii = 0; iii < sourceFileCount; iii++) {
                marshall(admin.getSourceFile(iii));
            }
        }
    }

    private void marshall(Person person) throws IOException {
        startTag(null, "contact");
        startTag(null, "name");
        text(person.getName());
        endTag(null, "name");
        startTag(null, "institution");
        text(person.getInstitution());
        endTag(null, "institution");
        String contactInfo = person.getContactInfo();
        if (contactInfo != null && !contactInfo.equals("")) {
            startTag(null, "contactInfo");
            text(contactInfo);
            endTag(null, "contactInfo");
        }
        endTag(null, "contact");
    }

    private void marshall(SourceFile sourceFile) throws IOException {
        startTag(null, "sourceFile");
        startTag(null, "name");
        text(sourceFile.getName());
        endTag(null, "name");
        String type = sourceFile.getType();
        if (type != null && !type.equals("")) {
            startTag(null, "type");
            text(type);
            endTag(null, "type");
        }
        endTag(null, "sourceFile");
    }

    private void marshall(InstrumentCommonSettings instrument) throws IOException {
        startTag(null, "instrument");
        startTag(null, "instName");
        text(instrument.getInstName());
        endTag(null, "instName");
        marshall(instrument.getSource());
        marshall(instrument.getAnalyzer());
        marshall(instrument.getDetector());
        int instParamCount = instrument.getInstParamCount();
        for (int iii = 0; iii < instParamCount; iii++) {
            marshall(instrument.getInstParam(iii), "instParam");
        }
        int instUserParamCount = instrument.getInstUserParamCount();
        for (int iii = 0; iii < instUserParamCount; iii++) {
            marshall(instrument.getInstUserParam(iii), "instUserParam");
        }
        endTag(null, "instrument");
    }

    private void marshall(Source source) throws IOException {
        startTag(null, "source");
        attribute(null, "type", source.getType());
        int instParamCount = source.getInstParamCount();
        for (int iii = 0; iii < instParamCount; iii++) {
            marshall(source.getInstParam(iii), "instParam");
        }
        int instUserParamCount = source.getInstUserParamCount();
        for (int iii = 0; iii < instUserParamCount; iii++) {
            marshall(source.getInstUserParam(iii), "instUserParam");
        }
        endTag(null, "source");
    }

    private void marshall(Analyzer analyzer) throws IOException {
        startTag(null, "analyzer");
        attribute(null, "type", analyzer.getType());
        attribute(null, "resolution", Float.toString(analyzer.getResolution()));
        attribute(null, "accuracy", Float.toString(analyzer.getAccuracy()));
        int instParamCount = analyzer.getInstParamCount();
        for (int iii = 0; iii < instParamCount; iii++) {
            marshall(analyzer.getInstParam(iii), "instParam");
        }
        int instUserParamCount = analyzer.getInstUserParamCount();
        for (int iii = 0; iii < instUserParamCount; iii++) {
            marshall(analyzer.getInstUserParam(iii), "instUserParam");
        }
        endTag(null, "analyzer");
    }

    private void marshall(Detector detector) throws IOException {
        startTag(null, "detector");
        attribute(null, "type", detector.getType());
        int instParamCount = detector.getInstParamCount();
        for (int iii = 0; iii < instParamCount; iii++) {
            marshall(detector.getInstParam(iii), "instParam");
        }
        int instUserParamCount = detector.getInstUserParamCount();
        for (int iii = 0; iii < instUserParamCount; iii++) {
            marshall(detector.getInstUserParam(iii), "instUserParam");
        }
        endTag(null, "detector");
    }

    private void marshall(Test test) throws IOException {
        startTag(null, "test");
        int dataProcessingCount = test.getDataProcessingCount();
        for (int iii = 0; iii < dataProcessingCount; iii++) {
            marshall(test.getDataProcessing(iii));
        }
        marshall(test.getProcessingMethod());
        int instParamCount = test.getTestParamCount();
        for (int iii = 0; iii < instParamCount; iii++) {
            marshall(test.getTestParam(iii), "testParam");
        }
        int instUserParamCount = test.getTestUserParamCount();
        for (int iii = 0; iii < instUserParamCount; iii++) {
            marshall(test.getTestUserParam(iii), "testUserParam");
        }
        endTag(null, "test");
    }

    private void marshall(DataProcessing dataProcessing) throws IOException {
        startTag(null, "dataProcessing");
        marshall(dataProcessing.getSoftware());
        endTag(null, "dataProcessing");
        int commentCount = dataProcessing.getCommentCount();
        for (int iii = 0; iii < commentCount; iii++) {
            startTag(null, "comment");
            text(dataProcessing.getComment(iii));
            endTag(null, "comment");
        }
    }

    private void marshall(Software software) throws IOException {
        startTag(null, "software");
        Date completionTime = software.getCompletionTime();
        if (completionTime != null) {
            attribute(null, "completionTime", xsDateTimeFormatter.format(completionTime));
        }
        startTag(null, "name");
        text(software.getName());
        endTag(null, "name");
        startTag(null, "version");
        text(software.getVersion());
        endTag(null, "version");
        String description = software.getDescription();
        if (description != null && !description.equals("")) {
            startTag(null, "description");
            text(description);
            endTag(null, "description");
        }
        endTag(null, "software");
    }

    private void marshall(ProcessingMethod processingMethod) throws IOException {
        startTag(null, "processingMethod");
        if (processingMethod.hasDeisotoped()) {
            attribute(null, "deisotoped", Boolean.toString(processingMethod.getDeisotoped()));
        }
        if (processingMethod.hasChargeDeconvolved()) {
            attribute(null, "chargeDeconvolved", Boolean.toString(processingMethod.getChargeDeconvolved()));
        }
        if (processingMethod.hasPeakThreshold()) {
            attribute(null, "peakThreshold", Float.toString(processingMethod.getPeakThreshold()));
        }
        startTag(null, "peakProcessing");
        text(processingMethod.getPeakProcessing());
        endTag(null, "peakProcessing");
        endTag(null, "processingMethod");
    }

    private void marshall(AcqDesc acqDesc) throws IOException, PsiMsConverterException {
        startTag(null, "acqDesc");
        marshall(acqDesc.getAcqSettings());
        PrecursorList precursorList = acqDesc.getPrecursorList();
        if (precursorList != null) {
            marshall(precursorList);
        }
        Summary summary = acqDesc.getSummary();
        if (summary != null) {
            marshall(summary);
        }
        SourceFile sourceFile = acqDesc.getSourceFile();
        if (sourceFile != null) {
            marshall(sourceFile);
        }
        int acqParamCount = acqDesc.getAcqParamCount();
        for (int iii = 0; iii < acqParamCount; iii++) {
            marshall(acqDesc.getAcqParam(iii), "acqParam");
        }

        AcqUserParam acqUserParam = acqDesc.getAcqUserParam();
        if (acqUserParam != null) {
            marshall(acqUserParam, "acqUserParam");
        }
        int commentCount = acqDesc.getCommentCount();
        for (int iii = 0; iii < commentCount; iii++) {
            startTag(null, "comment");
            text(acqDesc.getComment(iii));
            endTag(null, "comment");
        }
        endTag(null, "acqDesc");
    }

    private void marshall(AcqSettings acqSettings) throws IOException, PsiMsConverterException {
        startTag(null, "acqSettings");
        AcqSettings.SpecType specType = acqSettings.getSpecType();
        if (specType != null) {
            attribute(null, "specType", specType);
        } else {
            throw new PsiMsConverterException("acqSettings@specType is a required atttribute.");
        }
        marshall(acqSettings.getAcqSpecification());
        marshall(acqSettings.getInstrument());
        AcqTime acqTime = acqSettings.getAcqTime();
        if (acqTime != null) {
            marshall(acqTime);
        }
        endTag(null, "acqSettings");
    }

    private void marshall(AcqSpecification acqSpecification) throws IOException, PsiMsConverterException {
        startTag(null, "acqSpecification");
        AcqSpecification.Method method = acqSpecification.getMethod();
        if (method != null) {
            attribute(null, "method", method);
        } else {
            throw new PsiMsConverterException("acqSpecification@method is a required attribute.");
        }
        Range range = acqSpecification.getRange();
        List list = acqSpecification.getList();
        if (range == null && list == null) {
            throw new PsiMsConverterException("Either acqSpecification/range or acqSpecification/list must be available.");
        }
        if (range != null && list == null) {
            marshall(range);
        }
        if (range == null && list != null) {
            marshall(list);
        }
        endTag(null, "acqSpecification");
    }

    private void marshall(Range range) throws IOException {
        startTag(null, "range");
        attribute(null, "start", Integer.toString(range.getStart()));
        attribute(null, "end", Integer.toString(range.getEnd()));
        endTag(null, "range");
    }

    private void marshall(List list) throws IOException {
        startTag(null, "list");
        int count = list.getCount();
        text(Integer.toString(count));
        for (int iii = 0; iii < count; iii++) {
            startTag(null, "acq");
            text(Integer.toString(list.getAcq(iii)));
            endTag(null, "acq");
        }
        endTag(null, "list");
    }

    private void marshall(InstrumentAcqSettings instrumentAcqSettings) throws IOException, PsiMsConverterException {
        startTag(null, "acqInst");
        InstrumentAcqSettings.AcqType acqType = instrumentAcqSettings.getAcqType();
        if (acqType != null) {
            attribute(null, "acqType", acqType);
        } else {
            throw new PsiMsConverterException("acqInst@acqType is a required attribute.");
        }
        if (instrumentAcqSettings.hasMsLevel()) {
            attribute(null, "msLevel", Integer.toString(instrumentAcqSettings.getMsLevel()));
        } else {
            throw new PsiMsConverterException("acqInst@msLevel is a required attribute.");
        }
        InstrumentAcqSettings.Polarity polarity = instrumentAcqSettings.getPolarity();
        if (polarity != null) {
            attribute(null, "polarity", polarity);
        }
        MzRange mzRange = instrumentAcqSettings.getMzRange();
        if (mzRange != null) {
            marshall(mzRange);
        }
        int instParamCount = instrumentAcqSettings.getInstParamCount();
        for (int iii = 0; iii < instParamCount; iii++) {
            marshall(instrumentAcqSettings.getInstParam(iii), "instParams");
        }
        int instUserParamCount = instrumentAcqSettings.getInstUserParamCount();
        for (int iii = 0; iii < instUserParamCount; iii++) {
            marshall(instrumentAcqSettings.getInstUserParam(iii), "instUserParam");
        }
        endTag(null, "acqInst");
    }

    private void marshall(MzRange mzRange) throws IOException {
        startTag(null, "mzRange");
        attribute(null, "start", Float.toString(mzRange.getStart()));
        attribute(null, "stop", Float.toString(mzRange.getStop()));
        endTag(null, "mzRange");
    }

    private void marshall(AcqTime acqTime) throws IOException {
        startTag(null, "acqTime");
        attribute(null, "units", acqTime.getUnits());
        text(Float.toString(acqTime.getContent()));
        endTag(null, "acqTime");
    }

    private void marshall(PrecursorList precursorList) throws IOException {
        startTag(null, "precursorList");
        int count = precursorList.getCount();
        attribute(null, "count", Integer.toString(count));
        for (int iii = 0; iii < count; iii++) {
            marshall(precursorList.getPrecursor(iii));
        }
        endTag(null, "precursorList");
    }

    private void marshall(Precursor precursor) throws IOException {
        startTag(null, "precursor");
        attribute(null, "msLevel", Integer.toString(precursor.getMsLevel()));
        marshall(precursor.getActivation());
        Ion ion = precursor.getIon();
        if (ion != null) {
            marshall(ion, "ion");
        }
        endTag(null, "precursor");
    }

    private void marshall(Activation activation) throws IOException {
        startTag(null, "activation");
        attribute(null, "method", activation.getMethod());
        if (activation.hasEnergy()) {
            attribute(null, "energy", Float.toString(activation.getEnergy()));
        }
        endTag(null, "activation");
    }

    private void marshall(Ion ion, String tagName) throws IOException {
        startTag(null, tagName);
        if (ion.hasAcqID()) {
            attribute(null, "acqID", Integer.toString(ion.getAcqID()));
        }
        if (ion.hasCharge()) {
            attribute(null, "charge", Integer.toString(ion.getCharge()));
        }
        if (ion.hasIntensity()) {
            attribute(null, "intensity", Float.toString(ion.getIntensity()));
        }
        if (ion.hasMz()) {
            attribute(null, "mz", Float.toString(ion.getMz()));
        }
        endTag(null, tagName);
    }

    private void marshall(Summary summary) throws IOException {
        startTag(null, "summary");
        if (summary.hasHighMZ()) {
            attribute(null, "highMZ", Float.toString(summary.getHighMZ()));
        }
        if (summary.hasLowMZ()) {
            attribute(null, "lowMZ", Float.toString(summary.getLowMZ()));
        }
        if (summary.hasTIC()) {
            attribute(null, "TIC", Float.toString(summary.getTIC()));
        }
        Ion baseIon = summary.getBaseIon();
        if (baseIon != null) {
            marshall(baseIon, "baseIon");
        }
        endTag(null, "summary");
    }

    private void marshall(SupDesc supDesc) throws IOException {
        startTag(null, "supDesc");
        attribute(null, "id", Integer.toString(supDesc.getId()));
        startTag(null, "supDataName");
        text(supDesc.getSupDataName());
        endTag(null, "supDataName");
        int supParamCount = supDesc.getSupParamCount();
        for (int iii = 0; iii < supParamCount; iii++) {
            marshall(supDesc.getSupParam(iii), "supParam");
        }
        int supUserParamCount = supDesc.getSupUserParamCount();
        for (int iii = 0; iii < supUserParamCount; iii++) {
            marshall(supDesc.getSupUserParam(iii), "supUserParam");
        }
        int sourceFileCount = supDesc.getSourceFileCount();
        for (int iii = 0; iii < sourceFileCount; iii++) {
            marshall(supDesc.getSourceFile(iii));
        }
        int commentCount = supDesc.getCommentCount();
        for (int iii = 0; iii < commentCount; iii++) {
            startTag(null, "comment");
            text(supDesc.getComment(iii));
            endTag(null, "comment");
        }
        endTag(null, "supDesc");
    }

    public void marshall(Acquisition acquisition) throws IOException, PsiMsConverterException {
        startTag(null, "acquisition");
        marshall(acquisition.getAcqDesc());
        boolean hasSupplements = acquisition.hasSupplementList();
        SupplementList supplementList = null;
        int count = -1;
        if (hasSupplements) {
            supplementList = acquisition.getSupplementList();
            count = supplementList.getCount();
            for (int iii = 0; iii < count; iii++) {
                Supplement supplement = supplementList.getSupplement(iii);
                marshall(supplement.getSupDesc());
            }
        }
        marshall(acquisition.getMzArray(), "mzArray");
        marshall(acquisition.getIntenArray(), "intenArray");
        if (hasSupplements) {
            for (int iii = 0; iii < count; iii++) {
                Supplement supplement = supplementList.getSupplement(iii);
                marshall(supplement);
            }
        }
        endTag(null, "acquisition");
    }

    private void marshall(RawDataType rawDataType, String tagName) throws IOException, PsiMsConverterException {
        if (this.outputType.equals(OutputType.BASE64)) {
            startTag(null, tagName + "Binary");
            startTag(null, "data");
            attribute(null, "precision", "32");
            int length = rawDataType.getLength();
            attribute(null, "length", Integer.toString(length));
            String base64String = "";
            try {
                base64String = Utils.floatListToBase64String(rawDataType.getFloat());
            } catch (EncoderException e) {
                throw new PsiMsConverterException("Could not create base 64 encoded string!");
            }
            text(base64String);
            endTag(null, "data");
            endTag(null, tagName + "Binary");
        } else if (outputType.equals(OutputType.XML)) {
            startTag(null, tagName);
            int length = rawDataType.getLength();
            attribute(null, "length", Integer.toString(length));
            for (int iii = 0; iii < length; iii++) {
                startTag(null, "float");
                text(Float.toString(rawDataType.getFloat(iii)));
                endTag(null, "float");
            }
            endTag(null, tagName);
        }
    }

    private void marshall(Supplement supplement) throws IOException {
        startTag(null, "supplement");
        attribute(null, "id", Integer.toString(supplement.getId()));
        marshall(supplement.getDataArray());
        endTag(null, "supplement");
    }

    private void marshall(DataArray dataArray) throws IOException {
        startTag(null, "dataArray");
        attribute(null, "length", Integer.toString(dataArray.getLength()));
        attribute(null, "indexed", Boolean.toString(dataArray.getIndexed()));
        attribute(null, "offset", Integer.toString(dataArray.getOffset()));
    }

    private void marshall(CvCoreParamType cvCoreParamType, String tagName) throws IOException {
        startTag(null, tagName);
        startTag(null, "name");
        text(cvCoreParamType.getName());
        endTag(null, "name");
        startTag(null, "xref");
        text(Integer.toString(cvCoreParamType.getXref()));
        endTag(null, "xref");
        endTag(null, tagName);
        Object value = cvCoreParamType.getValue();
        marshallMultiTypeValue(value);
    }

    private void marshall(CvUserParamType cvUserParamType, String tagName) throws IOException {
        startTag(null, tagName);
        startTag(null, "name");
        text(cvUserParamType.getName());
        endTag(null, "name");
        if (cvUserParamType.hasXref()) {
            startTag(null, "xref");
            text(Integer.toString(cvUserParamType.getXref()));
            endTag(null, "xref");
        }
        endTag(null, tagName);
    }

    private void marshallMultiTypeValue(Object value) throws IOException {
        if (value instanceof String) {
            startTag(null, "string");
            text(value.toString());
            endTag(null, "string");
        } else if (value instanceof Integer) {
            startTag(null, "int");
            text(value.toString());
            endTag(null, "int");
        } else if (value instanceof Float) {
            startTag(null, "float");
            text(value.toString());
            endTag(null, "float");
        } else if (value instanceof Date) {
            startTag(null, "time");
            text(xsDateTimeFormatter.format(value));
            endTag(null, "time");
        } else if (value instanceof URI) {
            startTag(null, "URI");
            text(value.toString());
            endTag(null, "URI");
        }
    }

    /**
     * Class OutputType.
     *
     * @version $Revision: 1.9 $ $Date: 2004/01/14 15:57:36 $
     */
    public static class OutputType implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The XML type
         */
        public static final int XML_TYPE = 0;

        /**
         * The instance of the XML output type
         */
        public static final OutputType XML = new OutputType(XML_TYPE, "XML");

        /**
         * The BASE64 output type
         */
        public static final int BASE64_TYPE = 1;

        /**
         * The instance of the BASE64 output type
         */
        public static final OutputType BASE64 = new OutputType(BASE64_TYPE, "BASE64");

        /**
         * Field _memberTable
         */
        private static java.util.Hashtable _memberTable = init();

        /**
         * Field type
         */
        private int type = -1;

        /**
         * Field stringValue
         */
        private java.lang.String stringValue = null;


        //----------------/
        //- Constructors -/
        //----------------/

        private OutputType(int type, java.lang.String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- Type(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of OutputType
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this OutputType
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("XML", XML);
            members.put("BASE64", BASE64);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * OutputType
         */
        public java.lang.String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new OutputType based on
         * the given String value.
         *
         * @param string
         */
        public static OutputType valueOf(java.lang.String string) {
            java.lang.Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid Type";
                throw new IllegalArgumentException(err);
            }
            return (OutputType) obj;
        } //-- Type valueOf(java.lang.String)

    }

}
