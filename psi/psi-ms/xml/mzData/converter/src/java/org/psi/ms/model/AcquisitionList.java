/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcquisitionList.java,v 1.4 2003/09/10 14:11:41 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * List of acquisitions.
 *
 * @version $Revision: 1.4 $ $Date: 2003/09/10 14:11:41 $
 */
public class AcquisitionList implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

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
            throws java.lang.IndexOutOfBoundsException {
        _acquisitionList.addElement(vAcquisition);
    } //-- void addAcquisition(org.psi.ms.model.Acquisition)

    /**
     * Method addAcquisition
     *
     * @param index
     * @param vAcquisition
     */
    public void addAcquisition(int index, org.psi.ms.model.Acquisition vAcquisition)
            throws java.lang.IndexOutOfBoundsException {
        _acquisitionList.insertElementAt(vAcquisition, index);
    } //-- void addAcquisition(int, org.psi.ms.model.Acquisition)

    /**
     * Method enumerateAcquisition
     */
    public java.util.Enumeration enumerateAcquisition() {
        return _acquisitionList.elements();
    } //-- java.util.Enumeration enumerateAcquisition()

    /**
     * Method getAcquisition
     *
     * @param index
     */
    public org.psi.ms.model.Acquisition getAcquisition(int index)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _acquisitionList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (org.psi.ms.model.Acquisition) _acquisitionList.elementAt(index);
    } //-- org.psi.ms.model.Acquisition getAcquisition(int)

    /**
     * Method getAcquisition
     */
    public org.psi.ms.model.Acquisition[] getAcquisition() {
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
    public int getAcquisitionCount() {
        return _acquisitionList.size();
    } //-- int getAcquisitionCount()

    /**
     * Returns the value of field 'count'.
     *
     * @return the value of field 'count'.
     */
    public int getCount() {
        return this._acquisitionList.size();
    } //-- int getCount()

    /**
     * Method hasCount
     */
    public boolean hasCount() {
        return true;
    } //-- boolean hasCount()

    /**
     * Method removeAcquisition
     *
     * @param index
     */
    public org.psi.ms.model.Acquisition removeAcquisition(int index) {
        java.lang.Object obj = _acquisitionList.elementAt(index);
        _acquisitionList.removeElementAt(index);
        return (org.psi.ms.model.Acquisition) obj;
    } //-- org.psi.ms.model.Acquisition removeAcquisition(int)

    /**
     * Method removeAllAcquisition
     */
    public void removeAllAcquisition() {
        _acquisitionList.removeAllElements();
    } //-- void removeAllAcquisition()

    /**
     * Method setAcquisition
     *
     * @param index
     * @param vAcquisition
     */
    public void setAcquisition(int index, org.psi.ms.model.Acquisition vAcquisition)
            throws java.lang.IndexOutOfBoundsException {
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
    public void setAcquisition(org.psi.ms.model.Acquisition[] acquisitionArray) {
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
    public void setCount(int count) {
    } //-- void setCount(int)

}
