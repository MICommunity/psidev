/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: CvCoreParamTypeChoice.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Class CvCoreParamTypeChoice.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
 */
public class CvCoreParamTypeChoice implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _string
     */
    private java.lang.String _string;

    /**
     * Field _int
     */
    private int _int;

    /**
     * keeps track of state for field: _int
     */
    private boolean _has_int;

    /**
     * Field _float
     */
    private float _float;

    /**
     * keeps track of state for field: _float
     */
    private boolean _has_float;

    /**
     * Field _time
     */
    private java.util.Date _time;

    /**
     * Field _URI
     */
    private java.lang.String _URI;


    //----------------/
    //- Constructors -/
    //----------------/

    public CvCoreParamTypeChoice() {
        super();
    } //-- org.psi.ms.model.CvCoreParamTypeChoice()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'float'.
     *
     * @return the value of field 'float'.
     */
    public float getFloat() {
        return this._float;
    } //-- float getFloat()

    /**
     * Returns the value of field 'int'.
     *
     * @return the value of field 'int'.
     */
    public int getInt() {
        return this._int;
    } //-- int getInt()

    /**
     * Returns the value of field 'string'.
     *
     * @return the value of field 'string'.
     */
    public java.lang.String getString() {
        return this._string;
    } //-- java.lang.String getString()

    /**
     * Returns the value of field 'time'.
     *
     * @return the value of field 'time'.
     */
    public java.util.Date getTime() {
        return this._time;
    } //-- java.util.Date getTime()

    /**
     * Returns the value of field 'URI'.
     *
     * @return the value of field 'URI'.
     */
    public java.lang.String getURI() {
        return this._URI;
    } //-- java.lang.String getURI()

    /**
     * Method hasFloat
     */
    public boolean hasFloat() {
        return this._has_float;
    } //-- boolean hasFloat()

    /**
     * Method hasInt
     */
    public boolean hasInt() {
        return this._has_int;
    } //-- boolean hasInt()

    /**
     * Sets the value of field 'float'.
     *
     * @param _float
     * @param _float the value of field 'float'.
     */
    public void setFloat(float _float) {
        this._float = _float;
        this._has_float = true;
    } //-- void setFloat(float)

    /**
     * Sets the value of field 'int'.
     *
     * @param _int
     * @param _int the value of field 'int'.
     */
    public void setInt(int _int) {
        this._int = _int;
        this._has_int = true;
    } //-- void setInt(int)

    /**
     * Sets the value of field 'string'.
     *
     * @param string the value of field 'string'.
     */
    public void setString(java.lang.String string) {
        this._string = string;
    } //-- void setString(java.lang.String)

    /**
     * Sets the value of field 'time'.
     *
     * @param time the value of field 'time'.
     */
    public void setTime(java.util.Date time) {
        this._time = time;
    } //-- void setTime(java.util.Date)

    /**
     * Sets the value of field 'URI'.
     *
     * @param URI the value of field 'URI'.
     */
    public void setURI(java.lang.String URI) {
        this._URI = URI;
    } //-- void setURI(java.lang.String)

}
