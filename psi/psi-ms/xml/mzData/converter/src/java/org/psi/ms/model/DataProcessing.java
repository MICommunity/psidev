/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataProcessing.java,v 1.2 2003/08/21 14:28:01 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

import java.util.Vector;

/**
 * This element stores information about how the instance XML
 * document was generated.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 14:28:01 $
 */
public class DataProcessing implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Specific information on the conversion or processing software
     */
    private org.psi.ms.model.Software _software;

    /**
     * Comments regarding data processing are captured as free text.
     */
    private java.util.Vector _commentList;


    //----------------/
    //- Constructors -/
    //----------------/

    public DataProcessing() {
        super();
        _commentList = new Vector();
    } //-- org.psi.ms.model.DataProcessing()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addComment
     *
     * @param vComment
     */
    public void addComment(java.lang.String vComment)
            throws java.lang.IndexOutOfBoundsException {
        _commentList.addElement(vComment);
    } //-- void addComment(java.lang.String)

    /**
     * Method addComment
     *
     * @param index
     * @param vComment
     */
    public void addComment(int index, java.lang.String vComment)
            throws java.lang.IndexOutOfBoundsException {
        _commentList.insertElementAt(vComment, index);
    } //-- void addComment(int, java.lang.String)

    /**
     * Method enumerateComment
     */
    public java.util.Enumeration enumerateComment() {
        return _commentList.elements();
    } //-- java.util.Enumeration enumerateComment()

    /**
     * Method getComment
     *
     * @param index
     */
    public java.lang.String getComment(int index)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _commentList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (String) _commentList.elementAt(index);
    } //-- java.lang.String getComment(int)

    /**
     * Method getComment
     */
    public java.lang.String[] getComment() {
        int size = _commentList.size();
        java.lang.String[] mArray = new java.lang.String[size];
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
     * Returns the value of field 'software'. The field 'software'
     * has the following description: Specific information on the
     * conversion or processing software.
     *
     * @return the value of field 'software'.
     */
    public org.psi.ms.model.Software getSoftware() {
        return this._software;
    } //-- org.psi.ms.model.Software getSoftware()

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
    public java.lang.String removeComment(int index) {
        java.lang.Object obj = _commentList.elementAt(index);
        _commentList.removeElementAt(index);
        return (String) obj;
    } //-- java.lang.String removeComment(int)

    /**
     * Method setComment
     *
     * @param index
     * @param vComment
     */
    public void setComment(int index, java.lang.String vComment)
            throws java.lang.IndexOutOfBoundsException {
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
    public void setComment(java.lang.String[] commentArray) {
        //-- copy array
        _commentList.removeAllElements();
        for (int i = 0; i < commentArray.length; i++) {
            _commentList.addElement(commentArray[i]);
        }
    } //-- void setComment(java.lang.String)

    /**
     * Sets the value of field 'software'. The field 'software' has
     * the following description: Specific information on the
     * conversion or processing software.
     *
     * @param software the value of field 'software'.
     */
    public void setSoftware(org.psi.ms.model.Software software) {
        this._software = software;
    } //-- void setSoftware(org.psi.ms.model.Software)

    /**
     * Method unmarshal
     *
     * @param reader
     */
    public static org.psi.ms.model.DataProcessing unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.DataProcessing) Unmarshaller.unmarshal(org.psi.ms.model.DataProcessing.class, reader);
    } //-- org.psi.ms.model.DataProcessing unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

}
