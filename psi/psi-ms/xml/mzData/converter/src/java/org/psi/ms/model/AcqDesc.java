/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqDesc.java,v 1.2 2003/08/21 12:23:47 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

import java.util.Vector;

/**
 * There is one acqDesc for each acquisition below. The ID
 * attribute is keyed to the to acquisition ID.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 12:23:47 $
 */
public class AcqDesc implements java.io.Serializable {
    /**
     * Field _id
     */
    private int _id;
    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;
    /**
     * Settings for this specific acquisition.
     */
    private AcqSettings _acqSettings;
    /**
     * List of precursor ions for the current acquisition.
     */
    private PrecursorList _precursorList;
    /**
     * Summary information for this acquisition.
     */
    private Summary _summary;
    /**
     * Information about the original source file used to generate
     * the instance document.
     */
    private SourceFile _sourceFile;
    /**
     * This element holds additional data or annotation
     * information. Only controlled name values are allowed here.
     */
    private java.util.Vector _acqParamList;
    /**
     * This element holds additional data or annotation
     * information. Uncontrolled, or user controlled name values
     * are allowed here.
     */
    private AcqUserParam _acqUserParam;
    /**
     * Comments regarding acquisition are captured as free text.
     */
    private java.util.Vector _commentList;


    //----------------/
    //- Constructors -/
    //----------------/

    public AcqDesc() {
        super();
        _acqParamList = new Vector();
        _commentList = new Vector();
    } //-- org.psi.ms.model.AcqDesc()


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
    public static org.psi.ms.model.AcqDesc unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.AcqDesc) Unmarshaller.unmarshal(org.psi.ms.model.AcqDesc.class, reader);
    } //-- org.psi.ms.model.AcqDesc unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Method addAcqParam
     *
     * @param vAcqParam
     */
    public void addAcqParam(AcqParam vAcqParam)
            throws IndexOutOfBoundsException {
        _acqParamList.addElement(vAcqParam);
    } //-- void addAcqParam(org.psi.ms.model.AcqParam)

    /**
     * Method addAcqParam
     *
     * @param index
     * @param vAcqParam
     */
    public void addAcqParam(int index, AcqParam vAcqParam)
            throws IndexOutOfBoundsException {
        _acqParamList.insertElementAt(vAcqParam, index);
    } //-- void addAcqParam(int, org.psi.ms.model.AcqParam)

    /**
     * Method addComment
     *
     * @param vComment
     */
    public void addComment(String vComment)
            throws IndexOutOfBoundsException {
        _commentList.addElement(vComment);
    } //-- void addComment(java.lang.String)

    /**
     * Method addComment
     *
     * @param index
     * @param vComment
     */
    public void addComment(int index, String vComment)
            throws IndexOutOfBoundsException {
        _commentList.insertElementAt(vComment, index);
    } //-- void addComment(int, java.lang.String)

    /**
     * Method enumerateAcqParam
     */
    public java.util.Enumeration enumerateAcqParam() {
        return _acqParamList.elements();
    } //-- java.util.Enumeration enumerateAcqParam()

    /**
     * Method enumerateComment
     */
    public java.util.Enumeration enumerateComment() {
        return _commentList.elements();
    } //-- java.util.Enumeration enumerateComment()

    /**
     * Method getAcqParam
     *
     * @param index
     */
    public AcqParam getAcqParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _acqParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (AcqParam) _acqParamList.elementAt(index);
    } //-- org.psi.ms.model.AcqParam getAcqParam(int)

    /**
     * Method getAcqParam
     */
    public AcqParam[] getAcqParam() {
        int size = _acqParamList.size();
        AcqParam[] mArray = new AcqParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (AcqParam) _acqParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.AcqParam[] getAcqParam()

    /**
     * Method getAcqParamCount
     */
    public int getAcqParamCount() {
        return _acqParamList.size();
    } //-- int getAcqParamCount()

    /**
     * Returns the value of field 'acqSettings'. The field
     * 'acqSettings' has the following description: Settings for
     * this specific acquisition.
     *
     * @return the value of field 'acqSettings'.
     */
    public AcqSettings getAcqSettings() {
        return this._acqSettings;
    } //-- org.psi.ms.model.AcqSettings getAcqSettings()

    /**
     * Returns the value of field 'acqUserParam'. The field
     * 'acqUserParam' has the following description: This element
     * holds additional data or annotation information.
     * Uncontrolled, or user controlled name values are allowed
     * here.
     *
     * @return the value of field 'acqUserParam'.
     */
    public AcqUserParam getAcqUserParam() {
        return this._acqUserParam;
    } //-- org.psi.ms.model.AcqUserParam getAcqUserParam()

    /**
     * Method getComment
     *
     * @param index
     */
    public String getComment(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _commentList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (String) _commentList.elementAt(index);
    } //-- java.lang.String getComment(int)

    /**
     * Method getComment
     */
    public String[] getComment() {
        int size = _commentList.size();
        String[] mArray = new String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String) _commentList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getComment()

    /**
     * Method getCommentCount
     */
    public int getCommentCount() {
        return _commentList.size();
    } //-- int getCommentCount()

    /**
     * Returns the value of field 'id'.
     *
     * @return the value of field 'id'.
     */
    public int getId() {
        return this._id;
    } //-- int getId()

    /**
     * Returns the value of field 'precursorList'. The field
     * 'precursorList' has the following description: List of
     * precursor ions for the current acquisition.
     *
     * @return the value of field 'precursorList'.
     */
    public PrecursorList getPrecursorList() {
        return this._precursorList;
    } //-- org.psi.ms.model.PrecursorList getPrecursorList()

    /**
     * Returns the value of field 'sourceFile'. The field
     * 'sourceFile' has the following description: Information
     * about the original source file used to generate the instance
     * document.
     *
     * @return the value of field 'sourceFile'.
     */
    public SourceFile getSourceFile() {
        return this._sourceFile;
    } //-- org.psi.ms.model.SourceFile getSourceFile()

    /**
     * Returns the value of field 'summary'. The field 'summary'
     * has the following description: Summary information for this
     * acquisition.
     *
     * @return the value of field 'summary'.
     */
    public Summary getSummary() {
        return this._summary;
    } //-- org.psi.ms.model.Summary getSummary()

    /**
     * Method hasId
     */
    public boolean hasId() {
        return this._has_id;
    } //-- boolean hasId()

    /**
     * Method removeAcqParam
     *
     * @param index
     */
    public AcqParam removeAcqParam(int index) {
        Object obj = _acqParamList.elementAt(index);
        _acqParamList.removeElementAt(index);
        return (AcqParam) obj;
    } //-- org.psi.ms.model.AcqParam removeAcqParam(int)

    /**
     * Method removeAllAcqParam
     */
    public void removeAllAcqParam() {
        _acqParamList.removeAllElements();
    } //-- void removeAllAcqParam()

    /**
     * Method removeAllComment
     */
    public void removeAllComment() {
        _commentList.removeAllElements();
    } //-- void removeAllComment()

    /**
     * Method removeComment
     *
     * @param index
     */
    public String removeComment(int index) {
        Object obj = _commentList.elementAt(index);
        _commentList.removeElementAt(index);
        return (String) obj;
    } //-- java.lang.String removeComment(int)

    /**
     * Method setAcqParam
     *
     * @param index
     * @param vAcqParam
     */
    public void setAcqParam(int index, AcqParam vAcqParam)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _acqParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _acqParamList.setElementAt(vAcqParam, index);
    } //-- void setAcqParam(int, org.psi.ms.model.AcqParam)

    /**
     * Method setAcqParam
     *
     * @param acqParamArray
     */
    public void setAcqParam(AcqParam[] acqParamArray) {
        //-- copy array
        _acqParamList.removeAllElements();
        for (int i = 0; i < acqParamArray.length; i++) {
            _acqParamList.addElement(acqParamArray[i]);
        }
    } //-- void setAcqParam(org.psi.ms.model.AcqParam)

    /**
     * Sets the value of field 'acqSettings'. The field
     * 'acqSettings' has the following description: Settings for
     * this specific acquisition.
     *
     * @param acqSettings the value of field 'acqSettings'.
     */
    public void setAcqSettings(AcqSettings acqSettings) {
        this._acqSettings = acqSettings;
    } //-- void setAcqSettings(org.psi.ms.model.AcqSettings)

    /**
     * Sets the value of field 'acqUserParam'. The field
     * 'acqUserParam' has the following description: This element
     * holds additional data or annotation information.
     * Uncontrolled, or user controlled name values are allowed
     * here.
     *
     * @param acqUserParam the value of field 'acqUserParam'.
     */
    public void setAcqUserParam(AcqUserParam acqUserParam) {
        this._acqUserParam = acqUserParam;
    } //-- void setAcqUserParam(org.psi.ms.model.AcqUserParam)

    /**
     * Method setComment
     *
     * @param index
     * @param vComment
     */
    public void setComment(int index, String vComment)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _commentList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _commentList.setElementAt(vComment, index);
    } //-- void setComment(int, java.lang.String)

    /**
     * Method setComment
     *
     * @param commentArray
     */
    public void setComment(String[] commentArray) {
        //-- copy array
        _commentList.removeAllElements();
        for (int i = 0; i < commentArray.length; i++) {
            _commentList.addElement(commentArray[i]);
        }
    } //-- void setComment(java.lang.String)

    /**
     * Sets the value of field 'id'.
     *
     * @param id the value of field 'id'.
     */
    public void setId(int id) {
        this._id = id;
        this._has_id = true;
    } //-- void setId(int)

    /**
     * Sets the value of field 'precursorList'. The field
     * 'precursorList' has the following description: List of
     * precursor ions for the current acquisition.
     *
     * @param precursorList the value of field 'precursorList'.
     */
    public void setPrecursorList(PrecursorList precursorList) {
        this._precursorList = precursorList;
    } //-- void setPrecursorList(org.psi.ms.model.PrecursorList)

    /**
     * Sets the value of field 'sourceFile'. The field 'sourceFile'
     * has the following description: Information about the
     * original source file used to generate the instance document.
     *
     * @param sourceFile the value of field 'sourceFile'.
     */
    public void setSourceFile(SourceFile sourceFile) {
        this._sourceFile = sourceFile;
    } //-- void setSourceFile(org.psi.ms.model.SourceFile)

    /**
     * Sets the value of field 'summary'. The field 'summary' has
     * the following description: Summary information for this
     * acquisition.
     *
     * @param summary the value of field 'summary'.
     */
    public void setSummary(Summary summary) {
        this._summary = summary;
    } //-- void setSummary(org.psi.ms.model.Summary)

}
