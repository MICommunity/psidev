/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: RawDataType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Data type for non-binary data (m/z and intensity)
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public abstract class RawDataType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _floatList
     */
    private java.util.Vector _floatList;


      //----------------/
     //- Constructors -/
    //----------------/

    public RawDataType() {
        super();
        _floatList = new Vector();
    } //-- org.psi.ms.model.RawDataType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method add_float
     * 
     * @param v_float
     */
    public void add_float(float v_float)
        throws java.lang.IndexOutOfBoundsException
    {
        _floatList.addElement(new Float(v_float));
    } //-- void add_float(float) 

    /**
     * Method add_float
     * 
     * @param index
     * @param v_float
     */
    public void add_float(int index, float v_float)
        throws java.lang.IndexOutOfBoundsException
    {
        _floatList.insertElementAt(new Float(v_float), index);
    } //-- void add_float(int, float) 

    /**
     * Method enumerate_float
     */
    public java.util.Enumeration enumerate_float()
    {
        return _floatList.elements();
    } //-- java.util.Enumeration enumerate_float() 

    /**
     * Method get_float
     * 
     * @param index
     */
    public float get_float(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _floatList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return ((Float)_floatList.elementAt(index)).floatValue();
    } //-- float get_float(int) 

    /**
     * Method get_float
     */
    public float[] get_float()
    {
        int size = _floatList.size();
        float[] mArray = new float[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = ((Float)_floatList.elementAt(index)).floatValue();
        }
        return mArray;
    } //-- float[] get_float() 

    /**
     * Method get_floatCount
     */
    public int get_floatCount()
    {
        return _floatList.size();
    } //-- int get_floatCount() 

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
     * Method removeAll_float
     */
    public void removeAll_float()
    {
        _floatList.removeAllElements();
    } //-- void removeAll_float() 

    /**
     * Method remove_float
     * 
     * @param index
     */
    public float remove_float(int index)
    {
        java.lang.Object obj = _floatList.elementAt(index);
        _floatList.removeElementAt(index);
        return ((Float)obj).floatValue();
    } //-- float remove_float(int) 

    /**
     * Method set_float
     * 
     * @param index
     * @param v_float
     */
    public void set_float(int index, float v_float)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _floatList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _floatList.setElementAt(new Float(v_float), index);
    } //-- void set_float(int, float) 

    /**
     * Method set_float
     * 
     * @param _floatArray
     */
    public void set_float(float[] _floatArray)
    {
        //-- copy array
        _floatList.removeAllElements();
        for (int i = 0; i < _floatArray.length; i++) {
            _floatList.addElement(new Float(_floatArray[i]));
        }
    } //-- void set_float(float) 

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
