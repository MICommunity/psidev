/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcquisitionList.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * List of acquisitions.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class AcquisitionList implements java.io.Serializable {


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
     * This is an individual instrument acquisition. The peak list
     * is considered an array of acquisitions. there are two
     * primary ways of representing data. base64 encoded binary or
     * arrays of simple data types. All arrays used to describe a
     * single acquisition are the same length and the same indexing.
     */
    private java.util.Vector _acquisitionList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcquisitionList() {
        super();
        _acquisitionList = new Vector();
    } //-- org.psi.ms.model.AcquisitionList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAcquisition
     * 
     * @param vAcquisition
     */
    public void addAcquisition(org.psi.ms.model.Acquisition vAcquisition)
        throws java.lang.IndexOutOfBoundsException
    {
        _acquisitionList.addElement(vAcquisition);
    } //-- void addAcquisition(org.psi.ms.model.Acquisition) 

    /**
     * Method addAcquisition
     * 
     * @param index
     * @param vAcquisition
     */
    public void addAcquisition(int index, org.psi.ms.model.Acquisition vAcquisition)
        throws java.lang.IndexOutOfBoundsException
    {
        _acquisitionList.insertElementAt(vAcquisition, index);
    } //-- void addAcquisition(int, org.psi.ms.model.Acquisition) 

    /**
     * Method enumerateAcquisition
     */
    public java.util.Enumeration enumerateAcquisition()
    {
        return _acquisitionList.elements();
    } //-- java.util.Enumeration enumerateAcquisition() 

    /**
     * Method getAcquisition
     * 
     * @param index
     */
    public org.psi.ms.model.Acquisition getAcquisition(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _acquisitionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.Acquisition) _acquisitionList.elementAt(index);
    } //-- org.psi.ms.model.Acquisition getAcquisition(int) 

    /**
     * Method getAcquisition
     */
    public org.psi.ms.model.Acquisition[] getAcquisition()
    {
        int size = _acquisitionList.size();
        org.psi.ms.model.Acquisition[] mArray = new org.psi.ms.model.Acquisition[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.Acquisition) _acquisitionList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.Acquisition[] getAcquisition() 

    /**
     * Method getAcquisitionCount
     */
    public int getAcquisitionCount()
    {
        return _acquisitionList.size();
    } //-- int getAcquisitionCount() 

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
     * Method removeAcquisition
     * 
     * @param index
     */
    public org.psi.ms.model.Acquisition removeAcquisition(int index)
    {
        java.lang.Object obj = _acquisitionList.elementAt(index);
        _acquisitionList.removeElementAt(index);
        return (org.psi.ms.model.Acquisition) obj;
    } //-- org.psi.ms.model.Acquisition removeAcquisition(int) 

    /**
     * Method removeAllAcquisition
     */
    public void removeAllAcquisition()
    {
        _acquisitionList.removeAllElements();
    } //-- void removeAllAcquisition() 

    /**
     * Method setAcquisition
     * 
     * @param index
     * @param vAcquisition
     */
    public void setAcquisition(int index, org.psi.ms.model.Acquisition vAcquisition)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _acquisitionList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _acquisitionList.setElementAt(vAcquisition, index);
    } //-- void setAcquisition(int, org.psi.ms.model.Acquisition) 

    /**
     * Method setAcquisition
     * 
     * @param acquisitionArray
     */
    public void setAcquisition(org.psi.ms.model.Acquisition[] acquisitionArray)
    {
        //-- copy array
        _acquisitionList.removeAllElements();
        for (int i = 0; i < acquisitionArray.length; i++) {
            _acquisitionList.addElement(acquisitionArray[i]);
        }
    } //-- void setAcquisition(org.psi.ms.model.Acquisition) 

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
    public static org.psi.ms.model.AcquisitionList unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.AcquisitionList) Unmarshaller.unmarshal(org.psi.ms.model.AcquisitionList.class, reader);
    } //-- org.psi.ms.model.AcquisitionList unmarshal(java.io.Reader) 

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
