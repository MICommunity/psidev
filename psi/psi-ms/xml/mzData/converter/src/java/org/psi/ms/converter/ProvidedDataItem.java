/**
 * $Id: ProvidedDataItem.java,v 1.4 2004/01/14 15:57:35 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Nov 20, 2003
 * Time: 5:27:02 PM
 */
package org.psi.ms.converter;

import java.util.Hashtable;

/**
 *
 * @author Kai Runte
 */
public final class ProvidedDataItem {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    public static final int DESC_ADMIN_PERSON_CONTACTINFO_TYPE = 0;
    public static final ProvidedDataItem DESC_ADMIN_PERSON_CONTACTINFO =
        new ProvidedDataItem(DESC_ADMIN_PERSON_CONTACTINFO_TYPE, "desc/admin/person/contactInfo");

    public static final int DESC_ADMIN_PERSON_INSTITUTION_TYPE = 1;
    public static final ProvidedDataItem DESC_ADMIN_PERSON_INSTITUTION =
        new ProvidedDataItem(DESC_ADMIN_PERSON_INSTITUTION_TYPE, "desc/admin/person/institution");

    public static final int DESC_ADMIN_PERSON_NAME_TYPE = 2;
    public static final ProvidedDataItem DESC_ADMIN_PERSON_NAME =
        new ProvidedDataItem(DESC_ADMIN_PERSON_NAME_TYPE, "desc/admin/person/name");

    public static final int DESC_ADMIN_SAMPLENAME_TYPE = 3;
    public static final ProvidedDataItem DESC_ADMIN_SAMPLENAME =
        new ProvidedDataItem(DESC_ADMIN_SAMPLENAME_TYPE, "desc/admin/sampleName");

    public static final int DESC_ADMIN_SOURCEFILE_NAME_TYPE = 4;
    public static final ProvidedDataItem DESC_ADMIN_SOURCEFILE_NAME =
        new ProvidedDataItem(DESC_ADMIN_SOURCEFILE_NAME_TYPE, "desc/admin/sourceFile/name");

    public static final int DESC_ADMIN_SOURCEFILE_TYPE_TYPE = 5;
    public static final ProvidedDataItem DESC_ADMIN_SOURCEFILE_TYPE =
        new ProvidedDataItem(DESC_ADMIN_SOURCEFILE_TYPE_TYPE, "desc/admin/sourceFile/type");

    public static final int DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE_TYPE = 7;
    public static final ProvidedDataItem DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE =
        new ProvidedDataItem(DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE_TYPE, "desc/instrumentCommonSettings/analyzer/analyzer@type");

    public static final int DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY_TYPE = 8;
    public static final ProvidedDataItem DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY =
        new ProvidedDataItem(DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY_TYPE, "desc/instrumentCommonSettings/analyzer@accuracy");

    public static final int DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION_TYPE = 11;
    public static final ProvidedDataItem DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION =
        new ProvidedDataItem(DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION_TYPE, "desc/instrumentCommonSettings/analyzer@resolution");

    public static final int DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE_TYPE = 12;
    public static final ProvidedDataItem DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE =
        new ProvidedDataItem(DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE_TYPE, "desc/instrumentCommonSettings/detector/detector@type");

    public static final int DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME_TYPE = 15;
    public static final ProvidedDataItem DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME =
        new ProvidedDataItem(DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME_TYPE, "desc/instrumentCommonSettings/instName");

    public static final int DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE_TYPE = 20;
    public static final ProvidedDataItem DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE =
        new ProvidedDataItem(DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE_TYPE, "desc/instrumentCommonSettings/source/source@type");

    public static final int DESC_TEST_DATAPROCESSING_COMMENT_TYPE = 25;
    public static final ProvidedDataItem DESC_TEST_DATAPROCESSING_COMMENT =
        new ProvidedDataItem(DESC_TEST_DATAPROCESSING_COMMENT_TYPE, "desc/test/dataProcessing/comment");

    public static final int DESC_TEST_DATAPROCESSING_SOFTWARE_COMPETIONTIME_TYPE = 26;
    public static final ProvidedDataItem DESC_TEST_DATAPROCESSING_SOFTWARE_COMPETIONTIME =
        new ProvidedDataItem(DESC_TEST_DATAPROCESSING_SOFTWARE_COMPETIONTIME_TYPE, "desc/test/dataProcessing/software@completionTime");

    public static final int DESC_TEST_DATAPROCESSING_SOFTWARE_DESCRIPTION_TYPE = 35;
    public static final ProvidedDataItem DESC_TEST_DATAPROCESSING_SOFTWARE_DESCRIPTION =
        new ProvidedDataItem(DESC_TEST_DATAPROCESSING_SOFTWARE_DESCRIPTION_TYPE, "desc/test/dataProcessing/software/description");

    public static final int DESC_TEST_DATAPROCESSING_SOFTWARE_NAME_TYPE = 36;
    public static final ProvidedDataItem DESC_TEST_DATAPROCESSING_SOFTWARE_NAME =
        new ProvidedDataItem(DESC_TEST_DATAPROCESSING_SOFTWARE_NAME_TYPE, "desc/test/dataProcessing/software/name");

    public static final int DESC_TEST_DATAPROCESSING_SOFTWARE_VERSION_TYPE = 37;
    public static final ProvidedDataItem DESC_TEST_DATAPROCESSING_SOFTWARE_VERSION =
        new ProvidedDataItem(DESC_TEST_DATAPROCESSING_SOFTWARE_VERSION_TYPE, "desc/test/dataProcessing/software/version");

    public static final int DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING_TYPE = 39;
    public static final ProvidedDataItem DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING =
        new ProvidedDataItem(DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING_TYPE, "desc/test/processingMethod/peakProcessing");

    public static final int DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED_TYPE = 40;
    public static final ProvidedDataItem DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED =
        new ProvidedDataItem(DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED_TYPE, "desc/test/processingMethod@chargeDeconvolved");

    public static final int DESC_TEST_PROCESSINGMETHOD_DEISOTOPED_TYPE = 41;
    public static final ProvidedDataItem DESC_TEST_PROCESSINGMETHOD_DEISOTOPED =
        new ProvidedDataItem(DESC_TEST_PROCESSINGMETHOD_DEISOTOPED_TYPE, "desc/test/processingMethod@deisotoped");

    public static final int DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD_TYPE = 42;
    public static final ProvidedDataItem DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD =
        new ProvidedDataItem(DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD_TYPE, "desc/test/processingMethod@peakThreshold");


/*
    public static final int ADMIN__TYPE = 3;
    public static final ProvidedData ADMIN_ = new ProvidedData(ADMIN__TYPE, "");
*/


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

    private ProvidedDataItem(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.Method(int, java.lang.String)


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of Method
     */
    public static java.util.Enumeration enumerate() {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate()

    /**
     * Method getTypeReturns the type of this
     * Method
     */
    public int getType() {
        return this.type;
    } //-- int getType()

    /**
     * Method init
     */
    private static java.util.Hashtable init() {
        Hashtable members = new Hashtable();
        members.put("desc/admin/person/contactInfo", DESC_ADMIN_PERSON_CONTACTINFO);
        members.put("desc/admin/person/institution", DESC_ADMIN_PERSON_INSTITUTION);
        members.put("desc/admin/person/name", DESC_ADMIN_PERSON_NAME);
        members.put("desc/admin/sampleName", DESC_ADMIN_SAMPLENAME);
        members.put("desc/admin/sourceFile/name", DESC_ADMIN_SOURCEFILE_NAME);
        members.put("desc/admin/sourceFile/type", DESC_ADMIN_SOURCEFILE_TYPE);
        members.put("desc/instrumentCommonSettings/analyzer/analyzer@type", DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE);
        members.put("desc/instrumentCommonSettings/analyzer@accuracy", DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY);
        members.put("desc/instrumentCommonSettings/analyzer@resolution", DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION);
        members.put("desc/instrumentCommonSettings/detector/detector@type", DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE);
        members.put("desc/instrumentCommonSettings/instName", DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME);
        members.put("desc/instrumentCommonSettings/source/source@type", DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE);
        members.put("desc/test/dataProcessing/comment", DESC_TEST_DATAPROCESSING_COMMENT);
        members.put("desc/test/dataProcessing/software@completionTime", DESC_TEST_DATAPROCESSING_SOFTWARE_COMPETIONTIME);
        members.put("desc/test/dataProcessing/software/description", DESC_TEST_DATAPROCESSING_SOFTWARE_DESCRIPTION);
        members.put("desc/test/dataProcessing/software/name", DESC_TEST_DATAPROCESSING_SOFTWARE_NAME);
        members.put("desc/test/dataProcessing/software/version", DESC_TEST_DATAPROCESSING_SOFTWARE_VERSION);
        members.put("desc/test/processingMethod/peakProcessing", DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING);
        members.put("desc/test/processingMethod@chargeDeconvolved", DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED);
        members.put("desc/test/processingMethod@deisotoped", DESC_TEST_PROCESSINGMETHOD_DEISOTOPED);
        members.put("desc/test/processingMethod@peakThreshold", DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD);
        return members;
    } //-- java.util.Hashtable init()

    /**
     * Method toStringReturns the String representation of this
     * Method
     */
    public java.lang.String toString() {
        return this.stringValue;
    } //-- java.lang.String toString()

    /**
     * Method valueOfReturns a new Method based
     * on the given String value.
     *
     * @param string
     */
    public static ProvidedDataItem valueOf(java.lang.String string) {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ProvidedData";
            throw new IllegalArgumentException(err);
        }
        return (ProvidedDataItem) obj;
    } //-- org.psi.ms.model.types.Method valueOf(java.lang.String)

}
