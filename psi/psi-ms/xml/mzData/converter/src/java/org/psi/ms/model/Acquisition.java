/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Acquisition.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
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
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
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
    /**
     * Here the list of m/z values (for any type of spectrum). If
     * this is a true mass spectrum, then z=1. The array is stored
     * as a base64 encoded binary. The only type allowed is
     * IEEE-754 floating point and the precision must be specified
     * as either 32 or 64.
     */
    private MzArrayBinary _mzArrayBinary;
    /**
     * Here the intensities of each element of the m/z array are
     * stored also in base64 encoded binary of type float with a
     * specified precision.
     */
    private IntenArrayBinary _intenArrayBinary;


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
     * Returns the value of field 'intenArrayBinary'. The field
     * 'intenArrayBinary' has the following description: Here the
     * intensities of each element of the m/z array are stored also
     * in base64 encoded binary of type float with a specified
     * precision.
     *
     * @return the value of field 'intenArrayBinary'.
     */
    public IntenArrayBinary getIntenArrayBinary() {
        return this._intenArrayBinary;
    } //-- org.psi.ms.model.IntenArrayBinary getIntenArrayBinary()

    /**
     * Returns the value of field 'mzArrayBinary'. The field
     * 'mzArrayBinary' has the following description: Here the list
     * of m/z values (for any type of spectrum). If this is a true
     * mass spectrum, then z=1. The array is stored as a base64
     * encoded binary. The only type allowed is IEEE-754 floating
     * point and the precision must be specified as either 32 or
     * 64.
     *
     * @return the value of field 'mzArrayBinary'.
     */
    public MzArrayBinary getMzArrayBinary() {
        return this._mzArrayBinary;
    } //-- org.psi.ms.model.MzArrayBinary getMzArrayBinary()

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
     * Sets the value of field 'intenArrayBinary'. The field
     * 'intenArrayBinary' has the following description: Here the
     * intensities of each element of the m/z array are stored also
     * in base64 encoded binary of type float with a specified
     * precision.
     *
     * @param intenArrayBinary the value of field 'intenArrayBinary'
     */
    public void setIntenArrayBinary(IntenArrayBinary intenArrayBinary) {
        this._intenArrayBinary = intenArrayBinary;
    } //-- void setIntenArrayBinary(org.psi.ms.model.IntenArrayBinary)

    /**
     * Sets the value of field 'mzArrayBinary'. The field
     * 'mzArrayBinary' has the following description: Here the list
     * of m/z values (for any type of spectrum). If this is a true
     * mass spectrum, then z=1. The array is stored as a base64
     * encoded binary. The only type allowed is IEEE-754 floating
     * point and the precision must be specified as either 32 or
     * 64.
     *
     * @param mzArrayBinary the value of field 'mzArrayBinary'.
     */
    public void setMzArrayBinary(MzArrayBinary mzArrayBinary) {
        this._mzArrayBinary = mzArrayBinary;
    } //-- void setMzArrayBinary(org.psi.ms.model.MzArrayBinary)

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
