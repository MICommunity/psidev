/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Ion.java,v 1.4 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * This is the trigger m/z (or m/z's) for tandem MS or data
 * dependent scans. It is optional for broad band and source
 * activation methods.
 *
 * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
 */
public class Ion implements java.io.Serializable {
    /**
     * Field _mz
     */
    private float _mz;
    /**
     * keeps track of state for field: _mz
     */
    private boolean _has_mz;
    /**
     * Field _charge
     */
    private int _charge;
    /**
     * keeps track of state for field: _charge
     */
    private boolean _has_charge;
    /**
     * Field _acqID
     */
    private int _acqID;
    /**
     * keeps track of state for field: _acqID
     */
    private boolean _has_acqID;
    /**
     * Field _intensity
     */
    private float _intensity;
    /**
     * keeps track of state for field: _intensity
     */
    private boolean _has_intensity;


    //----------------/
    //- Constructors -/
    //----------------/

    public Ion() {
        super();
    } //-- org.psi.ms.model.Ion()

    /**
     * Method deleteAcqID
     */
    public void deleteAcqID() {
        this._has_acqID = false;
    } //-- void deleteAcqID()

    /**
     * Method deleteCharge
     */
    public void deleteCharge() {
        this._has_charge = false;
    } //-- void deleteCharge()

    /**
     * Method deleteIntensity
     */
    public void deleteIntensity() {
        this._has_intensity = false;
    } //-- void deleteIntensity()

    /**
     * Method deleteMz
     */
    public void deleteMz() {
        this._has_mz = false;
    } //-- void deleteMz()

    /**
     * Returns the value of field 'acqID'.
     *
     * @return the value of field 'acqID'.
     */
    public int getAcqID() {
        return this._acqID;
    } //-- int getAcqID()

    /**
     * Returns the value of field 'charge'.
     *
     * @return the value of field 'charge'.
     */
    public int getCharge() {
        return this._charge;
    } //-- int getCharge()

    /**
     * Returns the value of field 'intensity'.
     *
     * @return the value of field 'intensity'.
     */
    public float getIntensity() {
        return this._intensity;
    } //-- float getIntensity()

    /**
     * Returns the value of field 'mz'.
     *
     * @return the value of field 'mz'.
     */
    public float getMz() {
        return this._mz;
    } //-- float getMz()

    /**
     * Method hasAcqID
     */
    public boolean hasAcqID() {
        return this._has_acqID;
    } //-- boolean hasAcqID()

    /**
     * Method hasCharge
     */
    public boolean hasCharge() {
        return this._has_charge;
    } //-- boolean hasCharge()

    /**
     * Method hasIntensity
     */
    public boolean hasIntensity() {
        return this._has_intensity;
    } //-- boolean hasIntensity()

    /**
     * Method hasMz
     */
    public boolean hasMz() {
        return this._has_mz;
    } //-- boolean hasMz()

    /**
     * Sets the value of field 'acqID'.
     *
     * @param acqID the value of field 'acqID'.
     */
    public void setAcqID(int acqID) {
        this._acqID = acqID;
        this._has_acqID = true;
    } //-- void setAcqID(int)

    /**
     * Sets the value of field 'charge'.
     *
     * @param charge the value of field 'charge'.
     */
    public void setCharge(int charge) {
        this._charge = charge;
        this._has_charge = true;
    } //-- void setCharge(int)

    /**
     * Sets the value of field 'intensity'.
     *
     * @param intensity the value of field 'intensity'.
     */
    public void setIntensity(float intensity) {
        this._intensity = intensity;
        this._has_intensity = true;
    } //-- void setIntensity(float)

    /**
     * Sets the value of field 'mz'.
     *
     * @param mz the value of field 'mz'.
     */
    public void setMz(float mz) {
        this._mz = mz;
        this._has_mz = true;
    } //-- void setMz(float)


    //-----------/
    //- Methods -/
    //-----------/

}
