/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Acquisition.java,v 1.4 2003/09/15 13:44:57 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * This is an individual instrument acquisition. The peak list is
 * considered an array of acquisitions. there are two primary ways
 * of representing data. base64 encoded binary or arrays of simple
 * data types. All arrays used to describe a single acquisition are
 * the same length and the same indexing.
 *
 * @version $Revision: 1.4 $ $Date: 2003/09/15 13:44:57 $
 */
public class Acquisition implements java.io.Serializable {
    /**
     * Field _id
     */
    private int _id;
    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;
    /**
     * Here the mass array can be specified as individual numbers,
     * however, the type must be selected as either float or int
     * for the entire array. This allows for human readability and
     * editing.
     */
    private RawDataType _mzArray;
    /**
     * The intensity array can be specified as an array of ints or
     * an array of floats also.
     */
    private RawDataType _intenArray;

    //----------------/
    //- Constructors -/
    //----------------/

    public Acquisition() {
        super();
    } //-- org.psi.ms.model.Acquisition()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'intenArray'. The field
     * 'intenArray' has the following description: The intensity
     * array can be specified as an array of ints or an array of
     * floats also.
     *
     * @return the value of field 'intenArray'.
     */
    public RawDataType getIntenArray() {
        return this._intenArray;
    } //-- org.psi.ms.model.RawDataType getIntenArray()

    /**
     * Returns the value of field 'mzArray'. The field 'mzArray'
     * has the following description: Here the mass array can be
     * specified as individual numbers, however, the type must be
     * selected as either float or int for the entire array. This
     * allows for human readability and editing.
     *
     * @return the value of field 'mzArray'.
     */
    public RawDataType getMzArray() {
        return this._mzArray;
    } //-- org.psi.ms.model.RawDataType getMzArray()

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
     * Sets the value of field 'intenArray'. The field 'intenArray'
     * has the following description: The intensity array can be
     * specified as an array of ints or an array of floats also.
     *
     * @param intenArray the value of field 'intenArray'.
     */
    public void setIntenArray(RawDataType intenArray) {
        this._intenArray = intenArray;
    } //-- void setIntenArray(org.psi.ms.model.IntenArray)

    /**
     * Sets the value of field 'mzArray'. The field 'mzArray' has
     * the following description: Here the mass array can be
     * specified as individual numbers, however, the type must be
     * selected as either float or int for the entire array. This
     * allows for human readability and editing.
     *
     * @param mzArray the value of field 'mzArray'.
     */
    public void setMzArray(RawDataType mzArray) {
        this._mzArray = mzArray;
    } //-- void setMzArray(org.psi.ms.model.MzArray)

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
