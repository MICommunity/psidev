/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SupDescList.java,v 1.5 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * List of descriptive information for each supplemental data entry
 * in the raw section
 *
 * @version $Revision: 1.5 $ $Date: 2004/01/14 15:57:36 $
 */
public class SupDescList implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * There is one supDesc for each supplemental data entry below.
     * The ID attribute is keyed to the supplement ID below.
     */
    private java.util.Vector _supDescList;


    //----------------/
    //- Constructors -/
    //----------------/

    public SupDescList() {
        super();
        _supDescList = new Vector();
    } //-- org.psi.ms.model.SupDescList()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addSupDesc
     *
     * @param vSupDesc
     */
    public void addSupDesc(org.psi.ms.model.SupDesc vSupDesc)
            throws java.lang.IndexOutOfBoundsException {
        _supDescList.addElement(vSupDesc);
    } //-- void addSupDesc(org.psi.ms.model.SupDesc)

    /**
     * Method addSupDesc
     *
     * @param index
     * @param vSupDesc
     */
    public void addSupDesc(int index, org.psi.ms.model.SupDesc vSupDesc)
            throws java.lang.IndexOutOfBoundsException {
        _supDescList.insertElementAt(vSupDesc, index);
    } //-- void addSupDesc(int, org.psi.ms.model.SupDesc)

    /**
     * Method enumerateSupDesc
     */
    public java.util.Enumeration enumerateSupDesc() {
        return _supDescList.elements();
    } //-- java.util.Enumeration enumerateSupDesc()

    /**
     * Returns the value of field 'count'.
     *
     * @return the value of field 'count'.
     */
    public int getCount() {
        return this._supDescList.size();
    } //-- int getCount()

    /**
     * Method getSupDesc
     *
     * @param index
     */
    public org.psi.ms.model.SupDesc getSupDesc(int index)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _supDescList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (org.psi.ms.model.SupDesc) _supDescList.elementAt(index);
    } //-- org.psi.ms.model.SupDesc getSupDesc(int)

    /**
     * Method getSupDesc
     */
    public org.psi.ms.model.SupDesc[] getSupDesc() {
        int size = _supDescList.size();
        org.psi.ms.model.SupDesc[] mArray = new org.psi.ms.model.SupDesc[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.SupDesc) _supDescList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.SupDesc[] getSupDesc()

    /**
     * Method getSupDescCount
     */
    public int getSupDescCount() {
        return _supDescList.size();
    } //-- int getSupDescCount()

    /**
     * Method hasCount
     */
    public boolean hasCount() {
        return true;
    } //-- boolean hasCount()

    /**
     * Method removeAllSupDesc
     */
    public void removeAllSupDesc() {
        _supDescList.removeAllElements();
    } //-- void removeAllSupDesc()

    /**
     * Method removeSupDesc
     *
     * @param index
     */
    public org.psi.ms.model.SupDesc removeSupDesc(int index) {
        java.lang.Object obj = _supDescList.elementAt(index);
        _supDescList.removeElementAt(index);
        return (org.psi.ms.model.SupDesc) obj;
    } //-- org.psi.ms.model.SupDesc removeSupDesc(int)

    /**
     * Sets the value of field 'count'.
     *
     * @param count the value of field 'count'.
     */
    public void setCount(int count) {
    } //-- void setCount(int)

    /**
     * Method setSupDesc
     *
     * @param index
     * @param vSupDesc
     */
    public void setSupDesc(int index, org.psi.ms.model.SupDesc vSupDesc)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _supDescList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _supDescList.setElementAt(vSupDesc, index);
    } //-- void setSupDesc(int, org.psi.ms.model.SupDesc)

    /**
     * Method setSupDesc
     *
     * @param supDescArray
     */
    public void setSupDesc(org.psi.ms.model.SupDesc[] supDescArray) {
        //-- copy array
        _supDescList.removeAllElements();
        for (int i = 0; i < supDescArray.length; i++) {
            _supDescList.addElement(supDescArray[i]);
        }
    } //-- void setSupDesc(org.psi.ms.model.SupDesc)

}
