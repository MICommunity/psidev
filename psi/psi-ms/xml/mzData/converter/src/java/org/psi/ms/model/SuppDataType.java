/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SuppDataType.java,v 1.2 2003/08/20 10:56:05 krunte Exp $
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
import org.exolab.castor.types.Duration;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

/**
 * Data type for additional data vectors (beyond m/z and intensity)
 * 
 * @version $Revision: 1.2 $ $Date: 2003/08/20 10:56:05 $
 */
public abstract class SuppDataType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _floatList
     */
    private java.util.Vector _floatList;

    /**
     * Field _intList
     */
    private java.util.Vector _intList;

    /**
     * Field _stringList
     */
    private java.util.Vector _stringList;

    /**
     * Field _timeList
     */
    private java.util.Vector _timeList;

    /**
     * Field _URIList
     */
    private java.util.Vector _URIList;


      //----------------/
     //- Constructors -/
    //----------------/

    public SuppDataType() {
        super();
        _floatList = new Vector();
        _intList = new Vector();
        _stringList = new Vector();
        _timeList = new Vector();
        _URIList = new Vector();
    } //-- org.psi.ms.model.SuppDataType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addString
     * 
     * @param vString
     */
    public void addString(java.lang.String vString)
        throws java.lang.IndexOutOfBoundsException
    {
        _stringList.addElement(vString);
    } //-- void addString(java.lang.String) 

    /**
     * Method addString
     * 
     * @param index
     * @param vString
     */
    public void addString(int index, java.lang.String vString)
        throws java.lang.IndexOutOfBoundsException
    {
        _stringList.insertElementAt(vString, index);
    } //-- void addString(int, java.lang.String) 

    /**
     * Method addTime
     * 
     * @param vTime
     */
    public void addTime(org.exolab.castor.types.Duration vTime)
        throws java.lang.IndexOutOfBoundsException
    {
        _timeList.addElement(vTime);
    } //-- void addTime(org.exolab.castor.types.Duration) 

    /**
     * Method addTime
     * 
     * @param index
     * @param vTime
     */
    public void addTime(int index, org.exolab.castor.types.Duration vTime)
        throws java.lang.IndexOutOfBoundsException
    {
        _timeList.insertElementAt(vTime, index);
    } //-- void addTime(int, org.exolab.castor.types.Duration) 

    /**
     * Method addURI
     * 
     * @param vURI
     */
    public void addURI(java.lang.String vURI)
        throws java.lang.IndexOutOfBoundsException
    {
        _URIList.addElement(vURI);
    } //-- void addURI(java.lang.String) 

    /**
     * Method addURI
     * 
     * @param index
     * @param vURI
     */
    public void addURI(int index, java.lang.String vURI)
        throws java.lang.IndexOutOfBoundsException
    {
        _URIList.insertElementAt(vURI, index);
    } //-- void addURI(int, java.lang.String) 

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
     * Method addInt
     * 
     * @param v_int
     */
    public void addInt(int v_int)
        throws java.lang.IndexOutOfBoundsException
    {
        _intList.addElement(new Integer(v_int));
    } //-- void addInt(int)

    /**
     * Method addInt
     * 
     * @param index
     * @param v_int
     */
    public void addInt(int index, int v_int)
        throws java.lang.IndexOutOfBoundsException
    {
        _intList.insertElementAt(new Integer(v_int), index);
    } //-- void addInt(int, int)

    /**
     * Method enumerateString
     */
    public java.util.Enumeration enumerateString()
    {
        return _stringList.elements();
    } //-- java.util.Enumeration enumerateString() 

    /**
     * Method enumerateTime
     */
    public java.util.Enumeration enumerateTime()
    {
        return _timeList.elements();
    } //-- java.util.Enumeration enumerateTime() 

    /**
     * Method enumerateURI
     */
    public java.util.Enumeration enumerateURI()
    {
        return _URIList.elements();
    } //-- java.util.Enumeration enumerateURI() 

    /**
     * Method enumerateFloat
     */
    public java.util.Enumeration enumerate_float()
    {
        return _floatList.elements();
    } //-- java.util.Enumeration enumerateFloat()

    /**
     * Method enumerate_int
     */
    public java.util.Enumeration enumerate_int()
    {
        return _intList.elements();
    } //-- java.util.Enumeration enumerate_int() 

    /**
     * Method getString
     * 
     * @param index
     */
    public java.lang.String getString(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _stringList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_stringList.elementAt(index);
    } //-- java.lang.String getString(int) 

    /**
     * Method getString
     */
    public java.lang.String[] getString()
    {
        int size = _stringList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_stringList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getString() 

    /**
     * Method getStringCount
     */
    public int getStringCount()
    {
        return _stringList.size();
    } //-- int getStringCount() 

    /**
     * Method getTime
     * 
     * @param index
     */
    public org.exolab.castor.types.Duration getTime(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _timeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.exolab.castor.types.Duration) _timeList.elementAt(index);
    } //-- org.exolab.castor.types.Duration getTime(int) 

    /**
     * Method getTime
     */
    public org.exolab.castor.types.Duration[] getTime()
    {
        int size = _timeList.size();
        org.exolab.castor.types.Duration[] mArray = new org.exolab.castor.types.Duration[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.exolab.castor.types.Duration) _timeList.elementAt(index);
        }
        return mArray;
    } //-- org.exolab.castor.types.Duration[] getTime() 

    /**
     * Method getTimeCount
     */
    public int getTimeCount()
    {
        return _timeList.size();
    } //-- int getTimeCount() 

    /**
     * Method getURI
     * 
     * @param index
     */
    public java.lang.String getURI(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _URIList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_URIList.elementAt(index);
    } //-- java.lang.String getURI(int) 

    /**
     * Method getURI
     */
    public java.lang.String[] getURI()
    {
        int size = _URIList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_URIList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getURI() 

    /**
     * Method getURICount
     */
    public int getURICount()
    {
        return _URIList.size();
    } //-- int getURICount() 

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
     * Method getInt
     * 
     * @param index
     */
    public int getInt(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _intList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return ((Integer)_intList.elementAt(index)).intValue();
    } //-- int getInt(int)

    /**
     * Method getInt
     */
    public int[] getInt()
    {
        int size = _intList.size();
        int[] mArray = new int[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = ((Integer)_intList.elementAt(index)).intValue();
        }
        return mArray;
    } //-- int[] getInt()

    /**
     * Method getIntCount
     */
    public int getIntCount()
    {
        return _intList.size();
    } //-- int getIntCount()

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
     * Method removeAllString
     */
    public void removeAllString()
    {
        _stringList.removeAllElements();
    } //-- void removeAllString() 

    /**
     * Method removeAllTime
     */
    public void removeAllTime()
    {
        _timeList.removeAllElements();
    } //-- void removeAllTime() 

    /**
     * Method removeAllURI
     */
    public void removeAllURI()
    {
        _URIList.removeAllElements();
    } //-- void removeAllURI() 

    /**
     * Method removeAllFloat
     */
    public void removeAll_float()
    {
        _floatList.removeAllElements();
    } //-- void removeAllFloat()

    /**
     * Method removeAll_int
     */
    public void removeAll_int()
    {
        _intList.removeAllElements();
    } //-- void removeAll_int() 

    /**
     * Method removeString
     * 
     * @param index
     */
    public java.lang.String removeString(int index)
    {
        java.lang.Object obj = _stringList.elementAt(index);
        _stringList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeString(int) 

    /**
     * Method removeTime
     * 
     * @param index
     */
    public org.exolab.castor.types.Duration removeTime(int index)
    {
        java.lang.Object obj = _timeList.elementAt(index);
        _timeList.removeElementAt(index);
        return (org.exolab.castor.types.Duration) obj;
    } //-- org.exolab.castor.types.Duration removeTime(int) 

    /**
     * Method removeURI
     * 
     * @param index
     */
    public java.lang.String removeURI(int index)
    {
        java.lang.Object obj = _URIList.elementAt(index);
        _URIList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeURI(int) 

    /**
     * Method removeFloat
     * 
     * @param index
     */
    public float remove_float(int index)
    {
        java.lang.Object obj = _floatList.elementAt(index);
        _floatList.removeElementAt(index);
        return ((Float)obj).floatValue();
    } //-- float removeFloat(int)

    /**
     * Method remove_int
     * 
     * @param index
     */
    public int remove_int(int index)
    {
        java.lang.Object obj = _intList.elementAt(index);
        _intList.removeElementAt(index);
        return ((Integer)obj).intValue();
    } //-- int remove_int(int) 

    /**
     * Method setString
     * 
     * @param index
     * @param vString
     */
    public void setString(int index, java.lang.String vString)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _stringList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _stringList.setElementAt(vString, index);
    } //-- void setString(int, java.lang.String) 

    /**
     * Method setString
     * 
     * @param stringArray
     */
    public void setString(java.lang.String[] stringArray)
    {
        //-- copy array
        _stringList.removeAllElements();
        for (int i = 0; i < stringArray.length; i++) {
            _stringList.addElement(stringArray[i]);
        }
    } //-- void setString(java.lang.String) 

    /**
     * Method setTime
     * 
     * @param index
     * @param vTime
     */
    public void setTime(int index, org.exolab.castor.types.Duration vTime)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _timeList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _timeList.setElementAt(vTime, index);
    } //-- void setTime(int, org.exolab.castor.types.Duration) 

    /**
     * Method setTime
     * 
     * @param timeArray
     */
    public void setTime(org.exolab.castor.types.Duration[] timeArray)
    {
        //-- copy array
        _timeList.removeAllElements();
        for (int i = 0; i < timeArray.length; i++) {
            _timeList.addElement(timeArray[i]);
        }
    } //-- void setTime(org.exolab.castor.types.Duration) 

    /**
     * Method setURI
     * 
     * @param index
     * @param vURI
     */
    public void setURI(int index, java.lang.String vURI)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _URIList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _URIList.setElementAt(vURI, index);
    } //-- void setURI(int, java.lang.String) 

    /**
     * Method setURI
     * 
     * @param URIArray
     */
    public void setURI(java.lang.String[] URIArray)
    {
        //-- copy array
        _URIList.removeAllElements();
        for (int i = 0; i < URIArray.length; i++) {
            _URIList.addElement(URIArray[i]);
        }
    } //-- void setURI(java.lang.String) 

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
     * Method setInt
     * 
     * @param index
     * @param v_int
     */
    public void setInt(int index, int v_int)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _intList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _intList.setElementAt(new Integer(v_int), index);
    } //-- void setInt(int, int)

    /**
     * Method setInt
     * 
     * @param _intArray
     */
    public void setInt(int[] _intArray)
    {
        //-- copy array
        _intList.removeAllElements();
        for (int i = 0; i < _intArray.length; i++) {
            _intList.addElement(new Integer(_intArray[i]));
        }
    } //-- void setInt(int)

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
