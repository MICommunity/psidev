/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: ProcessingMethodType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Data type for processing methods
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public abstract class ProcessingMethodType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _deisotoped
     */
    private boolean _deisotoped = false;

    /**
     * keeps track of state for field: _deisotoped
     */
    private boolean _has_deisotoped;

    /**
     * Field _chargeDeconvolved
     */
    private boolean _chargeDeconvolved = false;

    /**
     * keeps track of state for field: _chargeDeconvolved
     */
    private boolean _has_chargeDeconvolved;

    /**
     * Field _peakThreshold
     */
    private float _peakThreshold;

    /**
     * keeps track of state for field: _peakThreshold
     */
    private boolean _has_peakThreshold;

    /**
     * The type of peak processing performed.
     */
    private java.lang.String _peakProcessing;


      //----------------/
     //- Constructors -/
    //----------------/

    public ProcessingMethodType() {
        super();
    } //-- org.psi.ms.model.ProcessingMethodType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteChargeDeconvolved
     */
    public void deleteChargeDeconvolved()
    {
        this._has_chargeDeconvolved= false;
    } //-- void deleteChargeDeconvolved() 

    /**
     * Method deleteDeisotoped
     */
    public void deleteDeisotoped()
    {
        this._has_deisotoped= false;
    } //-- void deleteDeisotoped() 

    /**
     * Method deletePeakThreshold
     */
    public void deletePeakThreshold()
    {
        this._has_peakThreshold= false;
    } //-- void deletePeakThreshold() 

    /**
     * Returns the value of field 'chargeDeconvolved'.
     * 
     * @return the value of field 'chargeDeconvolved'.
     */
    public boolean getChargeDeconvolved()
    {
        return this._chargeDeconvolved;
    } //-- boolean getChargeDeconvolved() 

    /**
     * Returns the value of field 'deisotoped'.
     * 
     * @return the value of field 'deisotoped'.
     */
    public boolean getDeisotoped()
    {
        return this._deisotoped;
    } //-- boolean getDeisotoped() 

    /**
     * Returns the value of field 'peakProcessing'. The field
     * 'peakProcessing' has the following description: The type of
     * peak processing performed.
     * 
     * @return the value of field 'peakProcessing'.
     */
    public java.lang.String getPeakProcessing()
    {
        return this._peakProcessing;
    } //-- java.lang.String getPeakProcessing() 

    /**
     * Returns the value of field 'peakThreshold'.
     * 
     * @return the value of field 'peakThreshold'.
     */
    public float getPeakThreshold()
    {
        return this._peakThreshold;
    } //-- float getPeakThreshold() 

    /**
     * Method hasChargeDeconvolved
     */
    public boolean hasChargeDeconvolved()
    {
        return this._has_chargeDeconvolved;
    } //-- boolean hasChargeDeconvolved() 

    /**
     * Method hasDeisotoped
     */
    public boolean hasDeisotoped()
    {
        return this._has_deisotoped;
    } //-- boolean hasDeisotoped() 

    /**
     * Method hasPeakThreshold
     */
    public boolean hasPeakThreshold()
    {
        return this._has_peakThreshold;
    } //-- boolean hasPeakThreshold() 

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
     * Sets the value of field 'chargeDeconvolved'.
     * 
     * @param chargeDeconvolved the value of field
     * 'chargeDeconvolved'.
     */
    public void setChargeDeconvolved(boolean chargeDeconvolved)
    {
        this._chargeDeconvolved = chargeDeconvolved;
        this._has_chargeDeconvolved = true;
    } //-- void setChargeDeconvolved(boolean) 

    /**
     * Sets the value of field 'deisotoped'.
     * 
     * @param deisotoped the value of field 'deisotoped'.
     */
    public void setDeisotoped(boolean deisotoped)
    {
        this._deisotoped = deisotoped;
        this._has_deisotoped = true;
    } //-- void setDeisotoped(boolean) 

    /**
     * Sets the value of field 'peakProcessing'. The field
     * 'peakProcessing' has the following description: The type of
     * peak processing performed.
     * 
     * @param peakProcessing the value of field 'peakProcessing'.
     */
    public void setPeakProcessing(java.lang.String peakProcessing)
    {
        this._peakProcessing = peakProcessing;
    } //-- void setPeakProcessing(java.lang.String) 

    /**
     * Sets the value of field 'peakThreshold'.
     * 
     * @param peakThreshold the value of field 'peakThreshold'.
     */
    public void setPeakThreshold(float peakThreshold)
    {
        this._peakThreshold = peakThreshold;
        this._has_peakThreshold = true;
    } //-- void setPeakThreshold(float) 

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
