/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: PrecursorType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

/**
 * Class PrecursorType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public abstract class PrecursorType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _msLevel
     */
    private int _msLevel;

    /**
     * keeps track of state for field: _msLevel
     */
    private boolean _has_msLevel;

    /**
     * Field _acqID
     */
    private int _acqID;

    /**
     * keeps track of state for field: _acqID
     */
    private boolean _has_acqID;

    /**
     * Type and energy level used for activation.
     */
    private org.psi.ms.model.Activation _activation;

    /**
     * This is the trigger m/z (or m/z's) for tandem MS or data
     * dependent scans. It is optional for broad band and source
     * activation methods.
     */
    private org.psi.ms.model.Ion _ion;


      //----------------/
     //- Constructors -/
    //----------------/

    public PrecursorType() {
        super();
    } //-- org.psi.ms.model.PrecursorType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acqID'.
     * 
     * @return the value of field 'acqID'.
     */
    public int getAcqID()
    {
        return this._acqID;
    } //-- int getAcqID() 

    /**
     * Returns the value of field 'activation'. The field
     * 'activation' has the following description: Type and energy
     * level used for activation.
     * 
     * @return the value of field 'activation'.
     */
    public org.psi.ms.model.Activation getActivation()
    {
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
    public org.psi.ms.model.Ion getIon()
    {
        return this._ion;
    } //-- org.psi.ms.model.Ion getIon() 

    /**
     * Returns the value of field 'msLevel'.
     * 
     * @return the value of field 'msLevel'.
     */
    public int getMsLevel()
    {
        return this._msLevel;
    } //-- int getMsLevel() 

    /**
     * Method hasAcqID
     */
    public boolean hasAcqID()
    {
        return this._has_acqID;
    } //-- boolean hasAcqID() 

    /**
     * Method hasMsLevel
     */
    public boolean hasMsLevel()
    {
        return this._has_msLevel;
    } //-- boolean hasMsLevel() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Sets the value of field 'acqID'.
     * 
     * @param acqID the value of field 'acqID'.
     */
    public void setAcqID(int acqID)
    {
        this._acqID = acqID;
        this._has_acqID = true;
    } //-- void setAcqID(int) 

    /**
     * Sets the value of field 'activation'. The field 'activation'
     * has the following description: Type and energy level used
     * for activation.
     * 
     * @param activation the value of field 'activation'.
     */
    public void setActivation(org.psi.ms.model.Activation activation)
    {
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
    public void setIon(org.psi.ms.model.Ion ion)
    {
        this._ion = ion;
    } //-- void setIon(org.psi.ms.model.Ion) 

    /**
     * Sets the value of field 'msLevel'.
     * 
     * @param msLevel the value of field 'msLevel'.
     */
    public void setMsLevel(int msLevel)
    {
        this._msLevel = msLevel;
        this._has_msLevel = true;
    } //-- void setMsLevel(int) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
