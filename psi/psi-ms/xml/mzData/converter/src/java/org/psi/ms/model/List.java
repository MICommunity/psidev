/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: List.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * A list of acquisitions used to create the peak list. (May
 * contain a single entry)
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class List implements java.io.Serializable {


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
     * Scan or acquisition number from original raw file used to
     * create this peak list.
     */
    private java.util.Vector _acqList;


      //----------------/
     //- Constructors -/
    //----------------/

    public List() {
        super();
        _acqList = new Vector();
    } //-- org.psi.ms.model.List()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addAcq
     * 
     * @param vAcq
     */
    public void addAcq(int vAcq)
        throws java.lang.IndexOutOfBoundsException
    {
        _acqList.addElement(new Integer(vAcq));
    } //-- void addAcq(int) 

    /**
     * Method addAcq
     * 
     * @param index
     * @param vAcq
     */
    public void addAcq(int index, int vAcq)
        throws java.lang.IndexOutOfBoundsException
    {
        _acqList.insertElementAt(new Integer(vAcq), index);
    } //-- void addAcq(int, int) 

    /**
     * Method enumerateAcq
     */
    public java.util.Enumeration enumerateAcq()
    {
        return _acqList.elements();
    } //-- java.util.Enumeration enumerateAcq() 

    /**
     * Method getAcq
     * 
     * @param index
     */
    public int getAcq(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _acqList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return ((Integer)_acqList.elementAt(index)).intValue();
    } //-- int getAcq(int) 

    /**
     * Method getAcq
     */
    public int[] getAcq()
    {
        int size = _acqList.size();
        int[] mArray = new int[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = ((Integer)_acqList.elementAt(index)).intValue();
        }
        return mArray;
    } //-- int[] getAcq() 

    /**
     * Method getAcqCount
     */
    public int getAcqCount()
    {
        return _acqList.size();
    } //-- int getAcqCount() 

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
     * Method removeAcq
     * 
     * @param index
     */
    public int removeAcq(int index)
    {
        java.lang.Object obj = _acqList.elementAt(index);
        _acqList.removeElementAt(index);
        return ((Integer)obj).intValue();
    } //-- int removeAcq(int) 

    /**
     * Method removeAllAcq
     */
    public void removeAllAcq()
    {
        _acqList.removeAllElements();
    } //-- void removeAllAcq() 

    /**
     * Method setAcq
     * 
     * @param index
     * @param vAcq
     */
    public void setAcq(int index, int vAcq)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _acqList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _acqList.setElementAt(new Integer(vAcq), index);
    } //-- void setAcq(int, int) 

    /**
     * Method setAcq
     * 
     * @param acqArray
     */
    public void setAcq(int[] acqArray)
    {
        //-- copy array
        _acqList.removeAllElements();
        for (int i = 0; i < acqArray.length; i++) {
            _acqList.addElement(new Integer(acqArray[i]));
        }
    } //-- void setAcq(int) 

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
    public static org.psi.ms.model.List unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.List) Unmarshaller.unmarshal(org.psi.ms.model.List.class, reader);
    } //-- org.psi.ms.model.List unmarshal(java.io.Reader) 

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
