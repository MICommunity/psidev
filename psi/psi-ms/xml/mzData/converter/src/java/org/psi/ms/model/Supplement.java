/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Supplement.java,v 1.5 2003/11/14 16:49:30 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/


/**
 * This is an individual supplemental data item. These may or may
 * not be keyed to an acqusition.
 *
 * @version $Revision: 1.5 $ $Date: 2003/11/14 16:49:30 $
 */
public class Supplement implements java.io.Serializable {
    /**
     * Field _id
     */
    private int _id;
    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;
    /**
     * If the raw data representation method was not binary or if
     * the supplemental data array was a string- or other
     * non-binary type, then it can be represented in the dataArray
     * element.
     */
    private DataArray _dataArray;
    /**
     * The descriptive information for this supplemental data entry.
     */
    private SupDesc supDesc;

    //----------------/
    //- Constructors -/
    //----------------/

    public Supplement() {
        super();
    } //-- org.psi.ms.model.Supplement()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataArray'. The field
     * 'dataArray' has the following description: If the raw data
     * representation method was not binary or if the supplemental
     * data array was a string- or other non-binary type, then it
     * can be represented in the dataArray element.
     *
     * @return the value of field 'dataArray'.
     */
    public DataArray getDataArray() {
        return this._dataArray;
    } //-- org.psi.ms.model.DataArray getDataArray()

    /**
     * Returns the descriptive information for this supplemental data entry.
     * @return the descriptive information for this supplemental data entry.
     */
    public SupDesc getSupDesc() {
        return supDesc;
    }

    /**
     * Returns the value of field 'id'.
     *
     * @return the value of field 'id'.
     */
    public int getId() {
        return this._id;
    } //-- int getId()

    /**
     * Method hasId
     */
    public boolean hasId() {
        return this._has_id;
    } //-- boolean hasId()

    /**
     * Sets the value of field 'dataArray'. The field 'dataArray'
     * has the following description: If the raw data
     * representation method was not binary or if the supplemental
     * data array was a string- or other non-binary type, then it
     * can be represented in the dataArray element.
     *
     * @param dataArray the value of field 'dataArray'.
     */
    public void setDataArray(DataArray dataArray) {
        this._dataArray = dataArray;
    } //-- void setDataArray(org.psi.ms.model.DataArray)

    /**
     * Sets the descriptive information for this supplemental data entry.
     * @param supDesc the descriptive information for this supplemental data entry.
     */
    public void setSupDesc(SupDesc supDesc) {
        this.supDesc = supDesc;
    }

    /**
     * Sets the value of field 'id'.
     *
     * @param id the value of field 'id'.
     */
    public void setId(int id) {
        this._id = id;
        this._has_id = true;
    } //-- void setId(int)

}
