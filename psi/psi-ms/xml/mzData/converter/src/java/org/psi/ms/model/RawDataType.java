/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: RawDataType.java,v 1.3 2003/08/20 17:21:53 krunte Exp $
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
 * @version $Revision: 1.3 $ $Date: 2003/08/20 17:21:53 $
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
     * Method addFloat
     *
     * @param v_float
     */
    public void addFloat(float v_float)
        throws java.lang.IndexOutOfBoundsException
    {
        _floatList.addElement(new Float(v_float));
    } //-- void addFloat(float)

    /**
     * Method addFloat
     *
     * @param index
     * @param v_float
     */
    public void addFloat(int index, float v_float)
        throws java.lang.IndexOutOfBoundsException
    {
        _floatList.insertElementAt(new Float(v_float), index);
    } //-- void addFloat(int, float)

    /**
     * Method enumerateFloat
     */
    public java.util.Enumeration enumerateFloat()
    {
        return _floatList.elements();
    } //-- java.util.Enumeration enumerateFloat()

    /**
     * Method getFloat
     *
     * @param index
     */
    public float getFloat(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _floatList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return ((Float)_floatList.elementAt(index)).floatValue();
    } //-- float getFloat(int)

    /**
     * Method getFloat
     */
    public float[] getFloat()
    {
        int size = _floatList.size();
        float[] mArray = new float[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = ((Float)_floatList.elementAt(index)).floatValue();
        }
        return mArray;
    } //-- float[] getFloat()

    /**
     * Method getFloatCount
     */
    public int getFloatCount()
    {
        return _floatList.size();
    } //-- int getFloatCount()

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
     * Method removeAllFloat
     */
    public void removeAllFloat()
    {
        _floatList.removeAllElements();
    } //-- void removeAllFloat()

    /**
     * Method removeFloat
     *
     * @param index
     */
    public float removeFloat(int index)
    {
        java.lang.Object obj = _floatList.elementAt(index);
        _floatList.removeElementAt(index);
        return ((Float)obj).floatValue();
    } //-- float removeFloat(int)

    /**
     * Method setFloat
     *
     * @param index
     * @param v_float
     */
    public void setFloat(int index, float v_float)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _floatList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _floatList.setElementAt(new Float(v_float), index);
    } //-- void setFloat(int, float)

    /**
     * Method setFloat
     *
     * @param _floatArray
     */
    public void setFloat(float[] _floatArray)
    {
        //-- copy array
        _floatList.removeAllElements();
        for (int i = 0; i < _floatArray.length; i++) {
            _floatList.addElement(new Float(_floatArray[i]));
        }
    } //-- void setFloat(float)

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
