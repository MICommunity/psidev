/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: InstrumentCommonSettings.java,v 1.1 2003/08/21 10:58:11 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

import java.util.Vector;

/**
 * InstrumentCommonSettings information common to all acquisitions is stored in
 * this section.
 *
 * @version $Revision: 1.1 $ $Date: 2003/08/21 10:58:11 $
 */
public class InstrumentCommonSettings implements java.io.Serializable {
    /**
     * Descriptive name of the instrument
     */
    private String _instName;
    /**
     * Invariant ion source information
     */
    private Source _source;
    /**
     * Mass analyzer information
     */
    private Analyzer _analyzer;
    /**
     * Detection information
     */
    private Detector _detector;
    /**
     * This element holds additional data or annotation
     * information. Only controlled name values are allowed here.
     */
    private java.util.Vector _instParamList;
    /**
     * This element holds additional data or annotation
     * information. Uncontrolled, or user controlled name values
     * are allowed here.
     */
    private java.util.Vector _instUserParamList;


    //----------------/
    //- Constructors -/
    //----------------/

    public InstrumentCommonSettings() {
        super();
        _instParamList = new Vector();
        _instUserParamList = new Vector();
    } //-- org.psi.ms.model.InstrumentCommonSettings()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method isValid
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid()

    /**
     * Method marshal
     *
     * @param out
     */
    public void marshal(java.io.Writer out)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer)

    /**
     * Method marshal
     *
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
            throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler)

    /**
     * Method unmarshal
     *
     * @param reader
     */
    public static org.psi.ms.model.InstrumentCommonSettings unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.InstrumentCommonSettings) Unmarshaller.unmarshal(org.psi.ms.model.InstrumentCommonSettings.class, reader);
    } //-- org.psi.ms.model.InstrumentCommonSettings unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Method addInstParam
     *
     * @param vInstParam
     */
    public void addInstParam(InstParam vInstParam)
            throws IndexOutOfBoundsException {
        _instParamList.addElement(vInstParam);
    } //-- void addInstParam(org.psi.ms.model.InstParam)

    /**
     * Method addInstParam
     *
     * @param index
     * @param vInstParam
     */
    public void addInstParam(int index, InstParam vInstParam)
            throws IndexOutOfBoundsException {
        _instParamList.insertElementAt(vInstParam, index);
    } //-- void addInstParam(int, org.psi.ms.model.InstParam)

    /**
     * Method addInstUserParam
     *
     * @param vInstUserParam
     */
    public void addInstUserParam(InstUserParam vInstUserParam)
            throws IndexOutOfBoundsException {
        _instUserParamList.addElement(vInstUserParam);
    } //-- void addInstUserParam(org.psi.ms.model.InstUserParam)

    /**
     * Method addInstUserParam
     *
     * @param index
     * @param vInstUserParam
     */
    public void addInstUserParam(int index, InstUserParam vInstUserParam)
            throws IndexOutOfBoundsException {
        _instUserParamList.insertElementAt(vInstUserParam, index);
    } //-- void addInstUserParam(int, org.psi.ms.model.InstUserParam)

    /**
     * Method enumerateInstParam
     */
    public java.util.Enumeration enumerateInstParam() {
        return _instParamList.elements();
    } //-- java.util.Enumeration enumerateInstParam()

    /**
     * Method enumerateInstUserParam
     */
    public java.util.Enumeration enumerateInstUserParam() {
        return _instUserParamList.elements();
    } //-- java.util.Enumeration enumerateInstUserParam()

    /**
     * Returns the value of field 'analyzer'. The field 'analyzer'
     * has the following description: Mass analyzer information
     *
     * @return the value of field 'analyzer'.
     */
    public Analyzer getAnalyzer() {
        return this._analyzer;
    } //-- org.psi.ms.model.Analyzer getAnalyzer()

    /**
     * Returns the value of field 'detector'. The field 'detector'
     * has the following description: Detection information
     *
     * @return the value of field 'detector'.
     */
    public Detector getDetector() {
        return this._detector;
    } //-- org.psi.ms.model.Detector getDetector()

    /**
     * Returns the value of field 'instName'. The field 'instName'
     * has the following description: Descriptive name of the
     * instrument
     *
     * @return the value of field 'instName'.
     */
    public String getInstName() {
        return this._instName;
    } //-- java.lang.String getInstName()

    /**
     * Method getInstParam
     *
     * @param index
     */
    public InstParam getInstParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (InstParam) _instParamList.elementAt(index);
    } //-- org.psi.ms.model.InstParam getInstParam(int)

    /**
     * Method getInstParam
     */
    public InstParam[] getInstParam() {
        int size = _instParamList.size();
        InstParam[] mArray = new InstParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (InstParam) _instParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.InstParam[] getInstParam()

    /**
     * Method getInstParamCount
     */
    public int getInstParamCount() {
        return _instParamList.size();
    } //-- int getInstParamCount()

    /**
     * Method getInstUserParam
     *
     * @param index
     */
    public InstUserParam getInstUserParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (InstUserParam) _instUserParamList.elementAt(index);
    } //-- org.psi.ms.model.InstUserParam getInstUserParam(int)

    /**
     * Method getInstUserParam
     */
    public InstUserParam[] getInstUserParam() {
        int size = _instUserParamList.size();
        InstUserParam[] mArray = new InstUserParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (InstUserParam) _instUserParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.InstUserParam[] getInstUserParam()

    /**
     * Method getInstUserParamCount
     */
    public int getInstUserParamCount() {
        return _instUserParamList.size();
    } //-- int getInstUserParamCount()

    /**
     * Returns the value of field 'source'. The field 'source' has
     * the following description: Invariant ion source information
     *
     * @return the value of field 'source'.
     */
    public Source getSource() {
        return this._source;
    } //-- org.psi.ms.model.Source getSource()

    /**
     * Method removeAllInstParam
     */
    public void removeAllInstParam() {
        _instParamList.removeAllElements();
    } //-- void removeAllInstParam()

    /**
     * Method removeAllInstUserParam
     */
    public void removeAllInstUserParam() {
        _instUserParamList.removeAllElements();
    } //-- void removeAllInstUserParam()

    /**
     * Method removeInstParam
     *
     * @param index
     */
    public InstParam removeInstParam(int index) {
        Object obj = _instParamList.elementAt(index);
        _instParamList.removeElementAt(index);
        return (InstParam) obj;
    } //-- org.psi.ms.model.InstParam removeInstParam(int)

    /**
     * Method removeInstUserParam
     *
     * @param index
     */
    public InstUserParam removeInstUserParam(int index) {
        Object obj = _instUserParamList.elementAt(index);
        _instUserParamList.removeElementAt(index);
        return (InstUserParam) obj;
    } //-- org.psi.ms.model.InstUserParam removeInstUserParam(int)

    /**
     * Sets the value of field 'analyzer'. The field 'analyzer' has
     * the following description: Mass analyzer information
     *
     * @param analyzer the value of field 'analyzer'.
     */
    public void setAnalyzer(Analyzer analyzer) {
        this._analyzer = analyzer;
    } //-- void setAnalyzer(org.psi.ms.model.Analyzer)

    /**
     * Sets the value of field 'detector'. The field 'detector' has
     * the following description: Detection information
     *
     * @param detector the value of field 'detector'.
     */
    public void setDetector(Detector detector) {
        this._detector = detector;
    } //-- void setDetector(org.psi.ms.model.Detector)

    /**
     * Sets the value of field 'instName'. The field 'instName' has
     * the following description: Descriptive name of the
     * instrument
     *
     * @param instName the value of field 'instName'.
     */
    public void setInstName(String instName) {
        this._instName = instName;
    } //-- void setInstName(java.lang.String)

    /**
     * Method setInstParam
     *
     * @param index
     * @param vInstParam
     */
    public void setInstParam(int index, InstParam vInstParam)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _instParamList.setElementAt(vInstParam, index);
    } //-- void setInstParam(int, org.psi.ms.model.InstParam)

    /**
     * Method setInstParam
     *
     * @param instParamArray
     */
    public void setInstParam(InstParam[] instParamArray) {
        //-- copy array
        _instParamList.removeAllElements();
        for (int i = 0; i < instParamArray.length; i++) {
            _instParamList.addElement(instParamArray[i]);
        }
    } //-- void setInstParam(org.psi.ms.model.InstParam)

    /**
     * Method setInstUserParam
     *
     * @param index
     * @param vInstUserParam
     */
    public void setInstUserParam(int index, InstUserParam vInstUserParam)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _instUserParamList.setElementAt(vInstUserParam, index);
    } //-- void setInstUserParam(int, org.psi.ms.model.InstUserParam)

    /**
     * Method setInstUserParam
     *
     * @param instUserParamArray
     */
    public void setInstUserParam(InstUserParam[] instUserParamArray) {
        //-- copy array
        _instUserParamList.removeAllElements();
        for (int i = 0; i < instUserParamArray.length; i++) {
            _instUserParamList.addElement(instUserParamArray[i]);
        }
    } //-- void setInstUserParam(org.psi.ms.model.InstUserParam)

    /**
     * Sets the value of field 'source'. The field 'source' has the
     * following description: Invariant ion source information
     *
     * @param source the value of field 'source'.
     */
    public void setSource(Source source) {
        this._source = source;
    } //-- void setSource(org.psi.ms.model.Source)

}
