/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: RawDataType.java,v 1.8 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * Data type for non-binary data (m/z and intensity)
 *
 * @version $Revision: 1.8 $ $Date: 2004/01/14 15:57:36 $
 */
public class RawDataType implements java.io.Serializable {


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
            throws java.lang.IndexOutOfBoundsException {
        _floatList.addElement(new Float(v_float));
    } //-- void addFloat(float)

    /**
     * Method addFloat
     *
     * @param index
     * @param v_float
     */
    public void addFloat(int index, float v_float)
            throws java.lang.IndexOutOfBoundsException {
        _floatList.insertElementAt(new Float(v_float), index);
    } //-- void addFloat(int, float)

    /**
     * Method enumerateFloat
     */
    public java.util.Enumeration enumerateFloat() {
        return _floatList.elements();
    } //-- java.util.Enumeration enumerateFloat()

    /**
     * Method getFloat
     *
     * @param index
     */
    public float getFloat(int index)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _floatList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return ((Float) _floatList.elementAt(index)).floatValue();
    } //-- float getFloat(int)

    /**
     * Method getFloat
     */
    public java.util.List getFloat() {
        return _floatList;
    } //-- float[] getFloat()

    /**
     * Method getFloatCount
     */
    public int getFloatCount() {
        return _floatList.size();
    } //-- int getFloatCount()

    /**
     * Method removeAllFloat
     */
    public void removeAllFloat() {
        _floatList.removeAllElements();
    } //-- void removeAllFloat()

    /**
     * Method removeFloat
     *
     * @param index
     */
    public float removeFloat(int index) {
        java.lang.Object obj = _floatList.elementAt(index);
        _floatList.removeElementAt(index);
        return ((Float) obj).floatValue();
    } //-- float removeFloat(int)

    /**
     * Method setFloat
     *
     * @param index
     * @param v_float
     */
    public void setFloat(int index, float v_float)
            throws java.lang.IndexOutOfBoundsException {
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
     * Returns the value of field 'length'.
     *
     * @return the value of field 'length'.
     */
    public int getLength() {
        return _floatList.size();
    } //-- int getLength()

    /**
     * Sets the value of field 'length'.
     *
     * @param length the value of field 'length'.
     */
    public void setLength(int length) {
    } //-- void setLength(int)

}
