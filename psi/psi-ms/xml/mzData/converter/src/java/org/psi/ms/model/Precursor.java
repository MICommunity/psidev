/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Precursor.java,v 1.5 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * This is the precursor step. If source activation is used then
 * msLevel is 0. The acqID points to the acquisition from which the
 * precursor was selected. If source activation was used, then
 * acqID is also 0.
 *
 * @version $Revision: 1.5 $ $Date: 2004/01/14 15:57:36 $
 */
public class Precursor implements java.io.Serializable {
    /**
     * Field _msLevel
     */
    private int _msLevel;
    /**
     * keeps track of state for field: _msLevel
     */
    private boolean _has_msLevel;
    /**
     * Type and energy level used for activation.
     */
    private Activation _activation;
    /**
     * This is the trigger m/z (or m/z's) for tandem MS or data
     * dependent scans. It is optional for broad band and source
     * activation methods.
     */
    private Ion _ion;


    //----------------/
    //- Constructors -/
    //----------------/

    public Precursor() {
        super();
    } //-- org.psi.ms.model.Precursor()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'activation'. The field
     * 'activation' has the following description: Type and energy
     * level used for activation.
     *
     * @return the value of field 'activation'.
     */
    public Activation getActivation() {
        return this._activation;
    } //-- org.psi.ms.model.Activation getActivation()

    /**
     * Returns the value of field 'ion'. The field 'ion' has the
     * following description: This is the trigger m/z (or m/z's)
     * for tandem MS or data dependent scans. It is optional for
     * broad band and source activation methods.
     *
     * @return the value of field 'ion'.
     */
    public Ion getIon() {
        return this._ion;
    } //-- org.psi.ms.model.Ion getIon()

    /**
     * Returns the value of field 'msLevel'.
     *
     * @return the value of field 'msLevel'.
     */
    public int getMsLevel() {
        return this._msLevel;
    } //-- int getMsLevel()

    /**
     * Method hasMsLevel
     */
    public boolean hasMsLevel() {
        return this._has_msLevel;
    } //-- boolean hasMsLevel()

    /**
     * Sets the value of field 'activation'. The field 'activation'
     * has the following description: Type and energy level used
     * for activation.
     *
     * @param activation the value of field 'activation'.
     */
    public void setActivation(Activation activation) {
        this._activation = activation;
    } //-- void setActivation(org.psi.ms.model.Activation)

    /**
     * Sets the value of field 'ion'. The field 'ion' has the
     * following description: This is the trigger m/z (or m/z's)
     * for tandem MS or data dependent scans. It is optional for
     * broad band and source activation methods.
     *
     * @param ion the value of field 'ion'.
     */
    public void setIon(Ion ion) {
        this._ion = ion;
    } //-- void setIon(org.psi.ms.model.Ion)

    /**
     * Sets the value of field 'msLevel'.
     *
     * @param msLevel the value of field 'msLevel'.
     */
    public void setMsLevel(int msLevel) {
        this._msLevel = msLevel;
        this._has_msLevel = true;
    } //-- void setMsLevel(int)

}
