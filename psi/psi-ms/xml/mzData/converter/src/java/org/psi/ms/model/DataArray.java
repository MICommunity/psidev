/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataArray.java,v 1.7 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.net.URI;
import java.util.Date;
import java.util.Vector;

/**
 * If the raw data representation method was not binary or if the
 * supplemental data array was a string- or other non-binary type,
 * then it can be represented in the dataArray element.
 *
 * The values accepted in this Vector are defined by the first item
 * added to this Vector.
 *
 * @version $Revision: 1.7 $ $Date: 2004/01/14 15:57:36 $
 */
public class DataArray implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Each dataArray can either be related to the mzArray or not.
     * If the elements are related to the mzArray then this flag is
     * set to 1.
     */
    private boolean indexed;

    /**
     * keeps track of state for field: _indexed
     */
    private boolean hasIndexed;

    /**
     * If the indexed flag is set, then this value gives the
     * element count (starting from 1) in the mzArray which aligns
     * with the first element in this dataArray.
     */
    private int offset = 0;

    /**
     * keeps track of state for field: _offset
     */
    private boolean hasOffset;

    /**
     * Name of the supplemental data array
     */
    private java.lang.String arrayName;

    /**
     * Description of the supplemental data array
     */
    private java.lang.String description;

    /**
     * The list contains all the objects of the supplement data
     */
    private Vector objectList;


    /**
     * The current class type of the object list.
     */
    private Class objectClass = null;

    //----------------/
    //- Constructors -/
    //----------------/

    public DataArray() {
        objectList = new Vector();
    } //-- org.psi.ms.model.DataArray()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method deleteOffset
     */
    public void deleteOffset() {
        this.hasOffset = false;
    } //-- void deleteOffset()

    /**
     * Returns the value of field 'arrayName'. The field
     * 'arrayName' has the following description: Name of the
     * supplemental data array
     *
     * @return the value of field 'arrayName'.
     */
    public java.lang.String getArrayName() {
        return this.arrayName;
    } //-- java.lang.String getArrayName()

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: Description of
     * the supplemental data array
     *
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription() {
        return this.description;
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
        return this.indexed;
    } //-- boolean getIndexed()

    /**
     * Returns the value of field 'length'. The field 'length' has
     * the following description: Number of items in the dataArray
     *
     * @return the value of field 'length'.
     */
    public int getLength() {
        return objectList.size();
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
        return this.offset;
    } //-- int getOffset()

    /**
     * Method hasIndexed
     */
    public boolean hasIndexed() {
        return this.hasIndexed;
    } //-- boolean hasIndexed()

    /**
     * Method hasLength
     */
    public boolean hasLength() {
        return true;
    } //-- boolean hasLength()

    /**
     * Method hasOffset
     */
    public boolean hasOffset() {
        return this.hasOffset;
    } //-- boolean hasOffset()

    /**
     * Sets the value of field 'arrayName'. The field 'arrayName'
     * has the following description: Name of the supplemental data
     * array
     *
     * @param arrayName the value of field 'arrayName'.
     */
    public void setArrayName(java.lang.String arrayName) {
        this.arrayName = arrayName;
    } //-- void setArrayName(java.lang.String)

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: Description of
     * the supplemental data array
     *
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
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
        this.indexed = indexed;
        this.hasIndexed = true;
    } //-- void setIndexed(boolean)

    /**
     * Sets the value of field 'length'. The field 'length' has the
     * following description: Number of items in the dataArray
     *
     * @param length the value of field 'length'.
     */
    public void setLength(int length) {
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
        this.offset = offset;
        this.hasOffset = true;
    } //-- void setOffset(int)

    /**
     * Adds a value to the data array. All values must be of the same class,
     * otherwise a ClassCastException is thrown.
     * @param o value to add
     * @throws ClassCastException if the value to add is of a different class than
     * the values in the list.
     */
    private void addObject(Object o) {
        if (objectClass == null) {
            objectClass = o.getClass();
            objectList.add(o);
        } else {
            if (objectClass.equals(o.getClass())) {
                objectList.add(o);
            } else {
                throw new ClassCastException("Value must be of class: " + objectClass.toString());
            }
        }

    }

    /**
     * Adds a value to the data array. All values must be of the same class,
     * otherwise a ClassCastException is thrown.
     * @param string value to add
     * @throws ClassCastException if the value to add is of a different class than
     * the values in the list.
     */
    public void addValue(String string) {
        addObject(string);
    }

    /**
     * Adds a value to the data array. All values must be of the same class,
     * otherwise a ClassCastException is thrown.
     * @param integer value to add
     * @throws ClassCastException if the value to add is of a different class than
     * the values in the list.
     */
    public void addValue(Integer integer) {
        addObject(integer);
    }

    /**
     * Adds a value to the data array. All values must be of the same class,
     * otherwise a ClassCastException is thrown.
     * @param aFloat value to add
     * @throws ClassCastException if the value to add is of a different class than
     * the values in the list.
     */
    public void addValue(Float aFloat) {
        addObject(aFloat);
    }

    /**
     * Adds a value to the data array. All values must be of the same class,
     * otherwise a ClassCastException is thrown.
     * @param date value to add
     * @throws ClassCastException if the value to add is of a different class than
     * the values in the list.
     */
    public void addValue(Date date) {
        addObject(date);
    }

    /**
     * Adds a value to the data array. All values must be of the same class,
     * otherwise a ClassCastException is thrown.
     * @param uri value to add
     * @throws ClassCastException if the value to add is of a different class than
     * the values in the list.
     */
    public void addValue(URI uri) {
        addObject(uri);
    }

    /**
     * Removes an object at the given index.
     * @param index The index of the object to be removed.
     */
    public void removeValue(int index) {
        objectList.remove(index);
    }

    public java.util.List getValue() {
        return objectList;
    }

    public Object getValue(int index) {
        return objectList.get(index);
    }

    /**
     * Clears the array and resets the accepted object class.
     */
    public void clear() {
        objectList.clear();
        objectClass = null;
    }

}
