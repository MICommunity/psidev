/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Admin.java,v 1.2 2003/08/21 12:23:47 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

import java.util.Vector;

/**
 * Administrative information pertaining to the entire data set is
 * stored here.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 12:23:47 $
 */
public class Admin implements java.io.Serializable {
    /**
     * Field _sampleName
     */
    private String _sampleName;
    /**
     * Contact person for this dataset.
     */
    private Contact _contact;
    /**
     * Information about the original source file used to generate
     * the instance document.
     */
    private java.util.Vector _sourceFileList;


    //----------------/
    //- Constructors -/
    //----------------/

    public Admin() {
        super();
        _sourceFileList = new Vector();
    } //-- org.psi.ms.model.Admin()


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
    public static org.psi.ms.model.Admin unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.Admin) Unmarshaller.unmarshal(org.psi.ms.model.Admin.class, reader);
    } //-- org.psi.ms.model.Admin unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Method addSourceFile
     *
     * @param vSourceFile
     */
    public void addSourceFile(SourceFile vSourceFile)
            throws IndexOutOfBoundsException {
        _sourceFileList.addElement(vSourceFile);
    } //-- void addSourceFile(org.psi.ms.model.SourceFile)

    /**
     * Method addSourceFile
     *
     * @param index
     * @param vSourceFile
     */
    public void addSourceFile(int index, SourceFile vSourceFile)
            throws IndexOutOfBoundsException {
        _sourceFileList.insertElementAt(vSourceFile, index);
    } //-- void addSourceFile(int, org.psi.ms.model.SourceFile)

    /**
     * Method enumerateSourceFile
     */
    public java.util.Enumeration enumerateSourceFile() {
        return _sourceFileList.elements();
    } //-- java.util.Enumeration enumerateSourceFile()

    /**
     * Returns the value of field 'contact'. The field 'contact'
     * has the following description: Contact person for this
     * dataset.
     *
     * @return the value of field 'contact'.
     */
    public Contact getContact() {
        return this._contact;
    } //-- org.psi.ms.model.Contact getContact()

    /**
     * Returns the value of field 'sampleName'.
     *
     * @return the value of field 'sampleName'.
     */
    public String getSampleName() {
        return this._sampleName;
    } //-- java.lang.String getSampleName()

    /**
     * Method getSourceFile
     *
     * @param index
     */
    public SourceFile getSourceFile(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _sourceFileList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (SourceFile) _sourceFileList.elementAt(index);
    } //-- org.psi.ms.model.SourceFile getSourceFile(int)

    /**
     * Method getSourceFile
     */
    public SourceFile[] getSourceFile() {
        int size = _sourceFileList.size();
        SourceFile[] mArray = new SourceFile[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (SourceFile) _sourceFileList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.SourceFile[] getSourceFile()

    /**
     * Method getSourceFileCount
     */
    public int getSourceFileCount() {
        return _sourceFileList.size();
    } //-- int getSourceFileCount()

    /**
     * Method removeAllSourceFile
     */
    public void removeAllSourceFile() {
        _sourceFileList.removeAllElements();
    } //-- void removeAllSourceFile()

    /**
     * Method removeSourceFile
     *
     * @param index
     */
    public SourceFile removeSourceFile(int index) {
        Object obj = _sourceFileList.elementAt(index);
        _sourceFileList.removeElementAt(index);
        return (SourceFile) obj;
    } //-- org.psi.ms.model.SourceFile removeSourceFile(int)

    /**
     * Sets the value of field 'contact'. The field 'contact' has
     * the following description: Contact person for this dataset.
     *
     * @param contact the value of field 'contact'.
     */
    public void setContact(Contact contact) {
        this._contact = contact;
    } //-- void setContact(org.psi.ms.model.Contact)

    /**
     * Sets the value of field 'sampleName'.
     *
     * @param sampleName the value of field 'sampleName'.
     */
    public void setSampleName(String sampleName) {
        this._sampleName = sampleName;
    } //-- void setSampleName(java.lang.String)

    /**
     * Method setSourceFile
     *
     * @param index
     * @param vSourceFile
     */
    public void setSourceFile(int index, SourceFile vSourceFile)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _sourceFileList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _sourceFileList.setElementAt(vSourceFile, index);
    } //-- void setSourceFile(int, org.psi.ms.model.SourceFile)

    /**
     * Method setSourceFile
     *
     * @param sourceFileArray
     */
    public void setSourceFile(SourceFile[] sourceFileArray) {
        //-- copy array
        _sourceFileList.removeAllElements();
        for (int i = 0; i < sourceFileArray.length; i++) {
            _sourceFileList.addElement(sourceFileArray[i]);
        }
    } //-- void setSourceFile(org.psi.ms.model.SourceFile)

}
