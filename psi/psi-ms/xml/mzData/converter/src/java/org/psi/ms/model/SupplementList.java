/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SupplementList.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * List of supplemental data arrays
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class SupplementList implements java.io.Serializable {


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
     * This is an individual supplemental data item. These may or
     * may not be keyed to an acqusition.
     */
    private java.util.Vector _supplementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SupplementList() {
        super();
        _supplementList = new Vector();
    } //-- org.psi.ms.model.SupplementList()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addSupplement
     * 
     * @param vSupplement
     */
    public void addSupplement(org.psi.ms.model.Supplement vSupplement)
        throws java.lang.IndexOutOfBoundsException
    {
        _supplementList.addElement(vSupplement);
    } //-- void addSupplement(org.psi.ms.model.Supplement) 

    /**
     * Method addSupplement
     * 
     * @param index
     * @param vSupplement
     */
    public void addSupplement(int index, org.psi.ms.model.Supplement vSupplement)
        throws java.lang.IndexOutOfBoundsException
    {
        _supplementList.insertElementAt(vSupplement, index);
    } //-- void addSupplement(int, org.psi.ms.model.Supplement) 

    /**
     * Method deleteCount
     */
    public void deleteCount()
    {
        this._has_count= false;
    } //-- void deleteCount() 

    /**
     * Method enumerateSupplement
     */
    public java.util.Enumeration enumerateSupplement()
    {
        return _supplementList.elements();
    } //-- java.util.Enumeration enumerateSupplement() 

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
     * Method getSupplement
     * 
     * @param index
     */
    public org.psi.ms.model.Supplement getSupplement(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _supplementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.Supplement) _supplementList.elementAt(index);
    } //-- org.psi.ms.model.Supplement getSupplement(int) 

    /**
     * Method getSupplement
     */
    public org.psi.ms.model.Supplement[] getSupplement()
    {
        int size = _supplementList.size();
        org.psi.ms.model.Supplement[] mArray = new org.psi.ms.model.Supplement[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.Supplement) _supplementList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.Supplement[] getSupplement() 

    /**
     * Method getSupplementCount
     */
    public int getSupplementCount()
    {
        return _supplementList.size();
    } //-- int getSupplementCount() 

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
     * Method removeAllSupplement
     */
    public void removeAllSupplement()
    {
        _supplementList.removeAllElements();
    } //-- void removeAllSupplement() 

    /**
     * Method removeSupplement
     * 
     * @param index
     */
    public org.psi.ms.model.Supplement removeSupplement(int index)
    {
        java.lang.Object obj = _supplementList.elementAt(index);
        _supplementList.removeElementAt(index);
        return (org.psi.ms.model.Supplement) obj;
    } //-- org.psi.ms.model.Supplement removeSupplement(int) 

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
     * Method setSupplement
     * 
     * @param index
     * @param vSupplement
     */
    public void setSupplement(int index, org.psi.ms.model.Supplement vSupplement)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _supplementList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _supplementList.setElementAt(vSupplement, index);
    } //-- void setSupplement(int, org.psi.ms.model.Supplement) 

    /**
     * Method setSupplement
     * 
     * @param supplementArray
     */
    public void setSupplement(org.psi.ms.model.Supplement[] supplementArray)
    {
        //-- copy array
        _supplementList.removeAllElements();
        for (int i = 0; i < supplementArray.length; i++) {
            _supplementList.addElement(supplementArray[i]);
        }
    } //-- void setSupplement(org.psi.ms.model.Supplement) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.SupplementList unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.SupplementList) Unmarshaller.unmarshal(org.psi.ms.model.SupplementList.class, reader);
    } //-- org.psi.ms.model.SupplementList unmarshal(java.io.Reader) 

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
