/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataArray.java,v 1.5 2003/09/12 15:56:44 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * If the raw data representation method was not binary or if the
 * supplemental data array was a string- or other non-binary type,
 * then it can be represented in the dataArray element.
 *
 * Todo: This class needs to be simplified so that there is only one Vector.
 * The values accepted in this Vector are defined by the first item
 * added to this Vector.
 *
 * @version $Revision: 1.5 $ $Date: 2003/09/12 15:56:44 $
 */
public class DataArray implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Number of items in the dataArray
     */
    private int _length;

    /**
     * keeps track of state for field: _length
     */
    private boolean _has_length;

    /**
     * Each dataArray can either be related to the mzArray or not.
     * If the elements are related to the mzArray then this flag is
     * set to 1.
     */
    private boolean _indexed;

    /**
     * keeps track of state for field: _indexed
     */
    private boolean _has_indexed;

    /**
     * If the indexed flag is set, then this value gives the
     * element count (starting from 1) in the mzArray which aligns
     * with the first element in this dataArray.
     */
    private int _offset = 0;

    /**
     * keeps track of state for field: _offset
     */
    private boolean _has_offset;

    /**
     * Name of the supplemental data array
     */
    private java.lang.String _arrayName;

    /**
     * Description of the supplemental data array
     */
    private java.lang.String _description;
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

    public DataArray() {
        _floatList = new Vector();
        _intList = new Vector();
        _stringList = new Vector();
        _timeList = new Vector();
        _URIList = new Vector();
    } //-- org.psi.ms.model.DataArray()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method deleteOffset
     */
    public void deleteOffset() {
        this._has_offset = false;
    } //-- void deleteOffset()

    /**
     * Returns the value of field 'arrayName'. The field
     * 'arrayName' has the following description: Name of the
     * supplemental data array
     *
     * @return the value of field 'arrayName'.
     */
    public java.lang.String getArrayName() {
        return this._arrayName;
    } //-- java.lang.String getArrayName()

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: Description of
     * the supplemental data array
     *
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription() {
        return this._description;
    } //-- java.lang.String getDescription()

    /**
     * Returns the value of field 'indexed'. The field 'indexed'
     * has the following description: Each dataArray can either be
     * related to the mzArray or not. If the elements are related
     * to the mzArray then this flag is set to 1.
     *
     * @return the value of field 'indexed'.
     */
    public boolean getIndexed() {
        return this._indexed;
    } //-- boolean getIndexed()

    /**
     * Returns the value of field 'length'. The field 'length' has
     * the following description: Number of items in the dataArray
     *
     * @return the value of field 'length'.
     */
    public int getLength() {
        return this._length;
    } //-- int getLength()

    /**
     * Returns the value of field 'offset'. The field 'offset' has
     * the following description: If the indexed flag is set, then
     * this value gives the element count (starting from 1) in the
     * mzArray which aligns with the first element in this
     * dataArray.
     *
     * @return the value of field 'offset'.
     */
    public int getOffset() {
        return this._offset;
    } //-- int getOffset()

    /**
     * Method hasIndexed
     */
    public boolean hasIndexed() {
        return this._has_indexed;
    } //-- boolean hasIndexed()

    /**
     * Method hasLength
     */
    public boolean hasLength() {
        return this._has_length;
    } //-- boolean hasLength()

    /**
     * Method hasOffset
     */
    public boolean hasOffset() {
        return this._has_offset;
    } //-- boolean hasOffset()

    /**
     * Sets the value of field 'arrayName'. The field 'arrayName'
     * has the following description: Name of the supplemental data
     * array
     *
     * @param arrayName the value of field 'arrayName'.
     */
    public void setArrayName(java.lang.String arrayName) {
        this._arrayName = arrayName;
    } //-- void setArrayName(java.lang.String)

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: Description of
     * the supplemental data array
     *
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description) {
        this._description = description;
    } //-- void setDescription(java.lang.String)

    /**
     * Sets the value of field 'indexed'. The field 'indexed' has
     * the following description: Each dataArray can either be
     * related to the mzArray or not. If the elements are related
     * to the mzArray then this flag is set to 1.
     *
     * @param indexed the value of field 'indexed'.
     */
    public void setIndexed(boolean indexed) {
        this._indexed = indexed;
        this._has_indexed = true;
    } //-- void setIndexed(boolean)

    /**
     * Sets the value of field 'length'. The field 'length' has the
     * following description: Number of items in the dataArray
     *
     * @param length the value of field 'length'.
     */
    public void setLength(int length) {
        this._length = length;
        this._has_length = true;
    } //-- void setLength(int)

    /**
     * Sets the value of field 'offset'. The field 'offset' has the
     * following description: If the indexed flag is set, then this
     * value gives the element count (starting from 1) in the
     * mzArray which aligns with the first element in this
     * dataArray.
     *
     * @param offset the value of field 'offset'.
     */
    public void setOffset(int offset) {
        this._offset = offset;
        this._has_offset = true;
    } //-- void setOffset(int)

    /**
     * Method addString
     *
     * @param vString
     */
    public void addString(String vString)
            throws IndexOutOfBoundsException {
        _stringList.addElement(vString);
    } //-- void addString(java.lang.String)

    /**
     * Method addString
     *
     * @param index
     * @param vString
     */
    public void addString(int index, String vString)
            throws IndexOutOfBoundsException {
        _stringList.insertElementAt(vString, index);
    } //-- void addString(int, java.lang.String)

    /**
     * Method addTime
     *
     * @param vTime
     */
    public void addTime(org.exolab.castor.types.Duration vTime)
            throws IndexOutOfBoundsException {
        _timeList.addElement(vTime);
    } //-- void addTime(org.exolab.castor.types.Duration)

    /**
     * Method addTime
     *
     * @param index
     * @param vTime
     */
    public void addTime(int index, org.exolab.castor.types.Duration vTime)
            throws IndexOutOfBoundsException {
        _timeList.insertElementAt(vTime, index);
    } //-- void addTime(int, org.exolab.castor.types.Duration)

    /**
     * Method addURI
     *
     * @param vURI
     */
    public void addURI(String vURI)
            throws IndexOutOfBoundsException {
        _URIList.addElement(vURI);
    } //-- void addURI(java.lang.String)

    /**
     * Method addURI
     *
     * @param index
     * @param vURI
     */
    public void addURI(int index, String vURI)
            throws IndexOutOfBoundsException {
        _URIList.insertElementAt(vURI, index);
    } //-- void addURI(int, java.lang.String)

    /**
     * Method addFloat
     *
     * @param v_float
     */
    public void addFloat(float v_float)
            throws IndexOutOfBoundsException {
        _floatList.addElement(new Float(v_float));
    } //-- void addFloat(float)

    /**
     * Method addFloat
     *
     * @param index
     * @param v_float
     */
    public void addFloat(int index, float v_float)
            throws IndexOutOfBoundsException {
        _floatList.insertElementAt(new Float(v_float), index);
    } //-- void addFloat(int, float)

    /**
     * Method addInt
     *
     * @param v_int
     */
    public void addInt(int v_int)
            throws IndexOutOfBoundsException {
        _intList.addElement(new Integer(v_int));
    } //-- void addInt(int)

    /**
     * Method addInt
     *
     * @param index
     * @param v_int
     */
    public void addInt(int index, int v_int)
            throws IndexOutOfBoundsException {
        _intList.insertElementAt(new Integer(v_int), index);
    } //-- void addInt(int, int)

    /**
     * Method enumerateString
     */
    public java.util.Enumeration enumerateString() {
        return _stringList.elements();
    } //-- java.util.Enumeration enumerateString()

    /**
     * Method enumerateTime
     */
    public java.util.Enumeration enumerateTime() {
        return _timeList.elements();
    } //-- java.util.Enumeration enumerateTime()

    /**
     * Method enumerateURI
     */
    public java.util.Enumeration enumerateURI() {
        return _URIList.elements();
    } //-- java.util.Enumeration enumerateURI()

    /**
     * Method enumerateFloat
     */
    public java.util.Enumeration enumerate_float() {
        return _floatList.elements();
    } //-- java.util.Enumeration enumerateFloat()

    /**
     * Method enumerate_int
     */
    public java.util.Enumeration enumerate_int() {
        return _intList.elements();
    } //-- java.util.Enumeration enumerate_int()

    /**
     * Method getString
     *
     * @param index
     */
    public String getString(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _stringList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (String) _stringList.elementAt(index);
    } //-- java.lang.String getString(int)

    /**
     * Method getString
     */
    public String[] getString() {
        int size = _stringList.size();
        String[] mArray = new String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String) _stringList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getString()

    /**
     * Method getStringCount
     */
    public int getStringCount() {
        return _stringList.size();
    } //-- int getStringCount()

    /**
     * Method getTime
     *
     * @param index
     */
    public org.exolab.castor.types.Duration getTime(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _timeList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (org.exolab.castor.types.Duration) _timeList.elementAt(index);
    } //-- org.exolab.castor.types.Duration getTime(int)

    /**
     * Method getTime
     */
    public org.exolab.castor.types.Duration[] getTime() {
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
    public int getTimeCount() {
        return _timeList.size();
    } //-- int getTimeCount()

    /**
     * Method getURI
     *
     * @param index
     */
    public String getURI(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _URIList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (String) _URIList.elementAt(index);
    } //-- java.lang.String getURI(int)

    /**
     * Method getURI
     */
    public String[] getURI() {
        int size = _URIList.size();
        String[] mArray = new String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String) _URIList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getURI()

    /**
     * Method getURICount
     */
    public int getURICount() {
        return _URIList.size();
    } //-- int getURICount()

    /**
     * Method getFloat
     *
     * @param index
     */
    public float getFloat(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _floatList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return ((Float) _floatList.elementAt(index)).floatValue();
    } //-- float getFloat(int)

    /**
     * Method getFloat
     */
    public float[] getFloat() {
        int size = _floatList.size();
        float[] mArray = new float[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = ((Float) _floatList.elementAt(index)).floatValue();
        }
        return mArray;
    } //-- float[] getFloat()

    /**
     * Method getFloatCount
     */
    public int getFloatCount() {
        return _floatList.size();
    } //-- int getFloatCount()

    /**
     * Method getInt
     *
     * @param index
     */
    public int getInt(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _intList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return ((Integer) _intList.elementAt(index)).intValue();
    } //-- int getInt(int)

    /**
     * Method getInt
     */
    public int[] getInt() {
        int size = _intList.size();
        int[] mArray = new int[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = ((Integer) _intList.elementAt(index)).intValue();
        }
        return mArray;
    } //-- int[] getInt()

    /**
     * Method getIntCount
     */
    public int getIntCount() {
        return _intList.size();
    } //-- int getIntCount()

    /**
     * Method removeAllString
     */
    public void removeAllString() {
        _stringList.removeAllElements();
    } //-- void removeAllString()

    /**
     * Method removeAllTime
     */
    public void removeAllTime() {
        _timeList.removeAllElements();
    } //-- void removeAllTime()

    /**
     * Method removeAllURI
     */
    public void removeAllURI() {
        _URIList.removeAllElements();
    } //-- void removeAllURI()

    /**
     * Method removeAllFloat
     */
    public void removeAll_float() {
        _floatList.removeAllElements();
    } //-- void removeAllFloat()

    /**
     * Method removeAll_int
     */
    public void removeAll_int() {
        _intList.removeAllElements();
    } //-- void removeAll_int()

    /**
     * Method removeString
     *
     * @param index
     */
    public String removeString(int index) {
        Object obj = _stringList.elementAt(index);
        _stringList.removeElementAt(index);
        return (String) obj;
    } //-- java.lang.String removeString(int)

    /**
     * Method removeTime
     *
     * @param index
     */
    public org.exolab.castor.types.Duration removeTime(int index) {
        Object obj = _timeList.elementAt(index);
        _timeList.removeElementAt(index);
        return (org.exolab.castor.types.Duration) obj;
    } //-- org.exolab.castor.types.Duration removeTime(int)

    /**
     * Method removeURI
     *
     * @param index
     */
    public String removeURI(int index) {
        Object obj = _URIList.elementAt(index);
        _URIList.removeElementAt(index);
        return (String) obj;
    } //-- java.lang.String removeURI(int)

    /**
     * Method removeFloat
     *
     * @param index
     */
    public float remove_float(int index) {
        Object obj = _floatList.elementAt(index);
        _floatList.removeElementAt(index);
        return ((Float) obj).floatValue();
    } //-- float removeFloat(int)

    /**
     * Method remove_int
     *
     * @param index
     */
    public int remove_int(int index) {
        Object obj = _intList.elementAt(index);
        _intList.removeElementAt(index);
        return ((Integer) obj).intValue();
    } //-- int remove_int(int)

    /**
     * Method setString
     *
     * @param index
     * @param vString
     */
    public void setString(int index, String vString)
            throws IndexOutOfBoundsException {
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
    public void setString(String[] stringArray) {
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
            throws IndexOutOfBoundsException {
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
    public void setTime(org.exolab.castor.types.Duration[] timeArray) {
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
    public void setURI(int index, String vURI)
            throws IndexOutOfBoundsException {
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
    public void setURI(String[] URIArray) {
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
            throws IndexOutOfBoundsException {
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
    public void setFloat(float[] _floatArray) {
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
            throws IndexOutOfBoundsException {
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
    public void setInt(int[] _intArray) {
        //-- copy array
        _intList.removeAllElements();
        for (int i = 0; i < _intArray.length; i++) {
            _intList.addElement(new Integer(_intArray[i]));
        }
    } //-- void setInt(int)

}
