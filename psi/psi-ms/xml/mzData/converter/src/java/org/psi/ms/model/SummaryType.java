/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SummaryType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class SummaryType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public abstract class SummaryType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

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
    private org.psi.ms.model.BaseIon _baseIon;


      //----------------/
     //- Constructors -/
    //----------------/

    public SummaryType() {
        super();
    } //-- org.psi.ms.model.SummaryType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteHighMZ
     */
    public void deleteHighMZ()
    {
        this._has_highMZ= false;
    } //-- void deleteHighMZ() 

    /**
     * Method deleteLowMZ
     */
    public void deleteLowMZ()
    {
        this._has_lowMZ= false;
    } //-- void deleteLowMZ() 

    /**
     * Method deleteTIC
     */
    public void deleteTIC()
    {
        this._has_TIC= false;
    } //-- void deleteTIC() 

    /**
     * Returns the value of field 'baseIon'.
     * 
     * @return the value of field 'baseIon'.
     */
    public org.psi.ms.model.BaseIon getBaseIon()
    {
        return this._baseIon;
    } //-- org.psi.ms.model.BaseIon getBaseIon() 

    /**
     * Returns the value of field 'highMZ'.
     * 
     * @return the value of field 'highMZ'.
     */
    public float getHighMZ()
    {
        return this._highMZ;
    } //-- float getHighMZ() 

    /**
     * Returns the value of field 'lowMZ'.
     * 
     * @return the value of field 'lowMZ'.
     */
    public float getLowMZ()
    {
        return this._lowMZ;
    } //-- float getLowMZ() 

    /**
     * Returns the value of field 'TIC'.
     * 
     * @return the value of field 'TIC'.
     */
    public float getTIC()
    {
        return this._TIC;
    } //-- float getTIC() 

    /**
     * Method hasHighMZ
     */
    public boolean hasHighMZ()
    {
        return this._has_highMZ;
    } //-- boolean hasHighMZ() 

    /**
     * Method hasLowMZ
     */
    public boolean hasLowMZ()
    {
        return this._has_lowMZ;
    } //-- boolean hasLowMZ() 

    /**
     * Method hasTIC
     */
    public boolean hasTIC()
    {
        return this._has_TIC;
    } //-- boolean hasTIC() 

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
     * Sets the value of field 'baseIon'.
     * 
     * @param baseIon the value of field 'baseIon'.
     */
    public void setBaseIon(org.psi.ms.model.BaseIon baseIon)
    {
        this._baseIon = baseIon;
    } //-- void setBaseIon(org.psi.ms.model.BaseIon) 

    /**
     * Sets the value of field 'highMZ'.
     * 
     * @param highMZ the value of field 'highMZ'.
     */
    public void setHighMZ(float highMZ)
    {
        this._highMZ = highMZ;
        this._has_highMZ = true;
    } //-- void setHighMZ(float) 

    /**
     * Sets the value of field 'lowMZ'.
     * 
     * @param lowMZ the value of field 'lowMZ'.
     */
    public void setLowMZ(float lowMZ)
    {
        this._lowMZ = lowMZ;
        this._has_lowMZ = true;
    } //-- void setLowMZ(float) 

    /**
     * Sets the value of field 'TIC'.
     * 
     * @param TIC the value of field 'TIC'.
     */
    public void setTIC(float TIC)
    {
        this._TIC = TIC;
        this._has_TIC = true;
    } //-- void setTIC(float) 

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
