/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Summary.java,v 1.4 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Summary information for this acquisition.
 *
 * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
 */
public class Summary implements java.io.Serializable {
    /**
     * Field _lowMZ
     */
    private float _lowMZ;
    /**
     * keeps track of state for field: _lowMZ
     */
    private boolean _has_lowMZ;
    /**
     * Field _highMZ
     */
    private float _highMZ;
    /**
     * keeps track of state for field: _highMZ
     */
    private boolean _has_highMZ;
    /**
     * Field _TIC
     */
    private float _TIC;
    /**
     * keeps track of state for field: _TIC
     */
    private boolean _has_TIC;
    /**
     * Field _baseIon
     */
    private Ion _baseIon;


    //----------------/
    //- Constructors -/
    //----------------/

    public Summary() {
        super();
    } //-- org.psi.ms.model.Summary()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method deleteHighMZ
     */
    public void deleteHighMZ() {
        this._has_highMZ = false;
    } //-- void deleteHighMZ()

    /**
     * Method deleteLowMZ
     */
    public void deleteLowMZ() {
        this._has_lowMZ = false;
    } //-- void deleteLowMZ()

    /**
     * Method deleteTIC
     */
    public void deleteTIC() {
        this._has_TIC = false;
    } //-- void deleteTIC()

    /**
     * Returns the value of field 'baseIon'.
     *
     * @return the value of field 'baseIon'.
     */
    public Ion getBaseIon() {
        return this._baseIon;
    } //-- org.psi.ms.model.BaseIon getBaseIon()

    /**
     * Returns the value of field 'highMZ'.
     *
     * @return the value of field 'highMZ'.
     */
    public float getHighMZ() {
        return this._highMZ;
    } //-- float getHighMZ()

    /**
     * Returns the value of field 'lowMZ'.
     *
     * @return the value of field 'lowMZ'.
     */
    public float getLowMZ() {
        return this._lowMZ;
    } //-- float getLowMZ()

    /**
     * Returns the value of field 'TIC'.
     *
     * @return the value of field 'TIC'.
     */
    public float getTIC() {
        return this._TIC;
    } //-- float getTIC()

    /**
     * Method hasHighMZ
     */
    public boolean hasHighMZ() {
        return this._has_highMZ;
    } //-- boolean hasHighMZ()

    /**
     * Method hasLowMZ
     */
    public boolean hasLowMZ() {
        return this._has_lowMZ;
    } //-- boolean hasLowMZ()

    /**
     * Method hasTIC
     */
    public boolean hasTIC() {
        return this._has_TIC;
    } //-- boolean hasTIC()

    /**
     * Sets the value of field 'baseIon'.
     *
     * @param baseIon the value of field 'baseIon'.
     */
    public void setBaseIon(Ion baseIon) {
        this._baseIon = baseIon;
    } //-- void setBaseIon(org.psi.ms.model.BaseIon)

    /**
     * Sets the value of field 'highMZ'.
     *
     * @param highMZ the value of field 'highMZ'.
     */
    public void setHighMZ(float highMZ) {
        this._highMZ = highMZ;
        this._has_highMZ = true;
    } //-- void setHighMZ(float)

    /**
     * Sets the value of field 'lowMZ'.
     *
     * @param lowMZ the value of field 'lowMZ'.
     */
    public void setLowMZ(float lowMZ) {
        this._lowMZ = lowMZ;
        this._has_lowMZ = true;
    } //-- void setLowMZ(float)

    /**
     * Sets the value of field 'TIC'.
     *
     * @param TIC the value of field 'TIC'.
     */
    public void setTIC(float TIC) {
        this._TIC = TIC;
        this._has_TIC = true;
    } //-- void setTIC(float)

}
