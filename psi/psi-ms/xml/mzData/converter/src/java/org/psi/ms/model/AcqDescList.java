/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqDescList.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * List of descriptive information for each acquisition in the raw
 * section
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class AcqDescList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _count
     */
    private int _count;

    /**
     * keeps track of state for field: _count
     */
    private boolean _has_count;

    /**
     * There is one acqDesc for each acquisition below. The ID
     * attribute is keyed to the to acquisition ID.
     */
    private java.util.Vector _acqDescList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcqDescList() {
        super();
        _acqDescList = new Vector();
    } //-- org.psi.ms.model.AcqDescList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAcqDesc
     * 
     * @param vAcqDesc
     */
    public void addAcqDesc(org.psi.ms.model.AcqDesc vAcqDesc)
        throws java.lang.IndexOutOfBoundsException
    {
        _acqDescList.addElement(vAcqDesc);
    } //-- void addAcqDesc(org.psi.ms.model.AcqDesc) 

    /**
     * Method addAcqDesc
     * 
     * @param index
     * @param vAcqDesc
     */
    public void addAcqDesc(int index, org.psi.ms.model.AcqDesc vAcqDesc)
        throws java.lang.IndexOutOfBoundsException
    {
        _acqDescList.insertElementAt(vAcqDesc, index);
    } //-- void addAcqDesc(int, org.psi.ms.model.AcqDesc) 

    /**
     * Method enumerateAcqDesc
     */
    public java.util.Enumeration enumerateAcqDesc()
    {
        return _acqDescList.elements();
    } //-- java.util.Enumeration enumerateAcqDesc() 

    /**
     * Method getAcqDesc
     * 
     * @param index
     */
    public org.psi.ms.model.AcqDesc getAcqDesc(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _acqDescList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.AcqDesc) _acqDescList.elementAt(index);
    } //-- org.psi.ms.model.AcqDesc getAcqDesc(int) 

    /**
     * Method getAcqDesc
     */
    public org.psi.ms.model.AcqDesc[] getAcqDesc()
    {
        int size = _acqDescList.size();
        org.psi.ms.model.AcqDesc[] mArray = new org.psi.ms.model.AcqDesc[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.AcqDesc) _acqDescList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.AcqDesc[] getAcqDesc() 

    /**
     * Method getAcqDescCount
     */
    public int getAcqDescCount()
    {
        return _acqDescList.size();
    } //-- int getAcqDescCount() 

    /**
     * Returns the value of field 'count'.
     * 
     * @return the value of field 'count'.
     */
    public int getCount()
    {
        return this._count;
    } //-- int getCount() 

    /**
     * Method hasCount
     */
    public boolean hasCount()
    {
        return this._has_count;
    } //-- boolean hasCount() 

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
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAcqDesc
     * 
     * @param index
     */
    public org.psi.ms.model.AcqDesc removeAcqDesc(int index)
    {
        java.lang.Object obj = _acqDescList.elementAt(index);
        _acqDescList.removeElementAt(index);
        return (org.psi.ms.model.AcqDesc) obj;
    } //-- org.psi.ms.model.AcqDesc removeAcqDesc(int) 

    /**
     * Method removeAllAcqDesc
     */
    public void removeAllAcqDesc()
    {
        _acqDescList.removeAllElements();
    } //-- void removeAllAcqDesc() 

    /**
     * Method setAcqDesc
     * 
     * @param index
     * @param vAcqDesc
     */
    public void setAcqDesc(int index, org.psi.ms.model.AcqDesc vAcqDesc)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _acqDescList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _acqDescList.setElementAt(vAcqDesc, index);
    } //-- void setAcqDesc(int, org.psi.ms.model.AcqDesc) 

    /**
     * Method setAcqDesc
     * 
     * @param acqDescArray
     */
    public void setAcqDesc(org.psi.ms.model.AcqDesc[] acqDescArray)
    {
        //-- copy array
        _acqDescList.removeAllElements();
        for (int i = 0; i < acqDescArray.length; i++) {
            _acqDescList.addElement(acqDescArray[i]);
        }
    } //-- void setAcqDesc(org.psi.ms.model.AcqDesc) 

    /**
     * Sets the value of field 'count'.
     * 
     * @param count the value of field 'count'.
     */
    public void setCount(int count)
    {
        this._count = count;
        this._has_count = true;
    } //-- void setCount(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.AcqDescList unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.AcqDescList) Unmarshaller.unmarshal(org.psi.ms.model.AcqDescList.class, reader);
    } //-- org.psi.ms.model.AcqDescList unmarshal(java.io.Reader) 

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
