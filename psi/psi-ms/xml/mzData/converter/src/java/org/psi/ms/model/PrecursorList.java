/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: PrecursorList.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * List of precursor ions for the current acquisition.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
 */
public class PrecursorList implements java.io.Serializable {


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
     * This is the precursor step. If source activation is used
     * then msLevel is 0. The acqID points to the acquisition from
     * which the precursor was selected. If source activation was
     * used, then acqID is also 0.
     */
    private java.util.Vector _precursorList;


    //----------------/
    //- Constructors -/
    //----------------/

    public PrecursorList() {
        super();
        _precursorList = new Vector();
    } //-- org.psi.ms.model.PrecursorList()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addPrecursor
     *
     * @param vPrecursor
     */
    public void addPrecursor(org.psi.ms.model.Precursor vPrecursor)
            throws java.lang.IndexOutOfBoundsException {
        _precursorList.addElement(vPrecursor);
    } //-- void addPrecursor(org.psi.ms.model.Precursor)

    /**
     * Method addPrecursor
     *
     * @param index
     * @param vPrecursor
     */
    public void addPrecursor(int index, org.psi.ms.model.Precursor vPrecursor)
            throws java.lang.IndexOutOfBoundsException {
        _precursorList.insertElementAt(vPrecursor, index);
    } //-- void addPrecursor(int, org.psi.ms.model.Precursor)

    /**
     * Method enumeratePrecursor
     */
    public java.util.Enumeration enumeratePrecursor() {
        return _precursorList.elements();
    } //-- java.util.Enumeration enumeratePrecursor()

    /**
     * Returns the value of field 'count'.
     *
     * @return the value of field 'count'.
     */
    public int getCount() {
        return this._count;
    } //-- int getCount()

    /**
     * Method getPrecursor
     *
     * @param index
     */
    public org.psi.ms.model.Precursor getPrecursor(int index)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _precursorList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (org.psi.ms.model.Precursor) _precursorList.elementAt(index);
    } //-- org.psi.ms.model.Precursor getPrecursor(int)

    /**
     * Method getPrecursor
     */
    public org.psi.ms.model.Precursor[] getPrecursor() {
        int size = _precursorList.size();
        org.psi.ms.model.Precursor[] mArray = new org.psi.ms.model.Precursor[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.Precursor) _precursorList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.Precursor[] getPrecursor()

    /**
     * Method getPrecursorCount
     */
    public int getPrecursorCount() {
        return _precursorList.size();
    } //-- int getPrecursorCount()

    /**
     * Method hasCount
     */
    public boolean hasCount() {
        return this._has_count;
    } //-- boolean hasCount()

    /**
     * Method removeAllPrecursor
     */
    public void removeAllPrecursor() {
        _precursorList.removeAllElements();
    } //-- void removeAllPrecursor()

    /**
     * Method removePrecursor
     *
     * @param index
     */
    public org.psi.ms.model.Precursor removePrecursor(int index) {
        java.lang.Object obj = _precursorList.elementAt(index);
        _precursorList.removeElementAt(index);
        return (org.psi.ms.model.Precursor) obj;
    } //-- org.psi.ms.model.Precursor removePrecursor(int)

    /**
     * Sets the value of field 'count'.
     *
     * @param count the value of field 'count'.
     */
    public void setCount(int count) {
        this._count = count;
        this._has_count = true;
    } //-- void setCount(int)

    /**
     * Method setPrecursor
     *
     * @param index
     * @param vPrecursor
     */
    public void setPrecursor(int index, org.psi.ms.model.Precursor vPrecursor)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _precursorList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _precursorList.setElementAt(vPrecursor, index);
    } //-- void setPrecursor(int, org.psi.ms.model.Precursor)

    /**
     * Method setPrecursor
     *
     * @param precursorArray
     */
    public void setPrecursor(org.psi.ms.model.Precursor[] precursorArray) {
        //-- copy array
        _precursorList.removeAllElements();
        for (int i = 0; i < precursorArray.length; i++) {
            _precursorList.addElement(precursorArray[i]);
        }
    } //-- void setPrecursor(org.psi.ms.model.Precursor)

}
