/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AdminType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

/**
 * Class AdminType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class AdminType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sampleName
     */
    private java.lang.String _sampleName;

    /**
     * Contact person for this dataset.
     */
    private org.psi.ms.model.Contact _contact;

    /**
     * Information about the original source file used to generate
     * the instance document.
     */
    private java.util.Vector _sourceFileList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AdminType() {
        super();
        _sourceFileList = new Vector();
    } //-- org.psi.ms.model.AdminType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSourceFile
     * 
     * @param vSourceFile
     */
    public void addSourceFile(org.psi.ms.model.SourceFile vSourceFile)
        throws java.lang.IndexOutOfBoundsException
    {
        _sourceFileList.addElement(vSourceFile);
    } //-- void addSourceFile(org.psi.ms.model.SourceFile) 

    /**
     * Method addSourceFile
     * 
     * @param index
     * @param vSourceFile
     */
    public void addSourceFile(int index, org.psi.ms.model.SourceFile vSourceFile)
        throws java.lang.IndexOutOfBoundsException
    {
        _sourceFileList.insertElementAt(vSourceFile, index);
    } //-- void addSourceFile(int, org.psi.ms.model.SourceFile) 

    /**
     * Method enumerateSourceFile
     */
    public java.util.Enumeration enumerateSourceFile()
    {
        return _sourceFileList.elements();
    } //-- java.util.Enumeration enumerateSourceFile() 

    /**
     * Returns the value of field 'contact'. The field 'contact'
     * has the following description: Contact person for this
     * dataset.
     * 
     * @return the value of field 'contact'.
     */
    public org.psi.ms.model.Contact getContact()
    {
        return this._contact;
    } //-- org.psi.ms.model.Contact getContact() 

    /**
     * Returns the value of field 'sampleName'.
     * 
     * @return the value of field 'sampleName'.
     */
    public java.lang.String getSampleName()
    {
        return this._sampleName;
    } //-- java.lang.String getSampleName() 

    /**
     * Method getSourceFile
     * 
     * @param index
     */
    public org.psi.ms.model.SourceFile getSourceFile(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _sourceFileList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.SourceFile) _sourceFileList.elementAt(index);
    } //-- org.psi.ms.model.SourceFile getSourceFile(int) 

    /**
     * Method getSourceFile
     */
    public org.psi.ms.model.SourceFile[] getSourceFile()
    {
        int size = _sourceFileList.size();
        org.psi.ms.model.SourceFile[] mArray = new org.psi.ms.model.SourceFile[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.SourceFile) _sourceFileList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.SourceFile[] getSourceFile() 

    /**
     * Method getSourceFileCount
     */
    public int getSourceFileCount()
    {
        return _sourceFileList.size();
    } //-- int getSourceFileCount() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method removeAllSourceFile
     */
    public void removeAllSourceFile()
    {
        _sourceFileList.removeAllElements();
    } //-- void removeAllSourceFile() 

    /**
     * Method removeSourceFile
     * 
     * @param index
     */
    public org.psi.ms.model.SourceFile removeSourceFile(int index)
    {
        java.lang.Object obj = _sourceFileList.elementAt(index);
        _sourceFileList.removeElementAt(index);
        return (org.psi.ms.model.SourceFile) obj;
    } //-- org.psi.ms.model.SourceFile removeSourceFile(int) 

    /**
     * Sets the value of field 'contact'. The field 'contact' has
     * the following description: Contact person for this dataset.
     * 
     * @param contact the value of field 'contact'.
     */
    public void setContact(org.psi.ms.model.Contact contact)
    {
        this._contact = contact;
    } //-- void setContact(org.psi.ms.model.Contact) 

    /**
     * Sets the value of field 'sampleName'.
     * 
     * @param sampleName the value of field 'sampleName'.
     */
    public void setSampleName(java.lang.String sampleName)
    {
        this._sampleName = sampleName;
    } //-- void setSampleName(java.lang.String) 

    /**
     * Method setSourceFile
     * 
     * @param index
     * @param vSourceFile
     */
    public void setSourceFile(int index, org.psi.ms.model.SourceFile vSourceFile)
        throws java.lang.IndexOutOfBoundsException
    {
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
    public void setSourceFile(org.psi.ms.model.SourceFile[] sourceFileArray)
    {
        //-- copy array
        _sourceFileList.removeAllElements();
        for (int i = 0; i < sourceFileArray.length; i++) {
            _sourceFileList.addElement(sourceFileArray[i]);
        }
    } //-- void setSourceFile(org.psi.ms.model.SourceFile) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
