/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqSettingsType.java,v 1.2 2003/08/11 17:59:00 krunte Exp $
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
import org.psi.ms.model.types.AcqSettingsTypeSpecTypeType;

/**
 * Class AcqSettingsType.
 * 
 * @version $Revision: 1.2 $ $Date: 2003/08/11 17:59:00 $
 */
public abstract class AcqSettingsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Type of spectrum 
     */
    private org.psi.ms.model.types.AcqSettingsTypeSpecTypeType _specType;

    /**
     * Specification for combining raw scans/acquisitions into a
     * single peak list. Either a list of acquisitions, or a range
     * of acquisitions can be specified.
     */
    private org.psi.ms.model.AcqSpecification _acqSpecification;

    /**
     * Field _instrument
     */
    private org.psi.ms.model.Instrument2 _instrument;

    /**
     * Field _acqTime
     */
    private org.psi.ms.model.AcqTime _acqTime;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcqSettingsType() {
        super();
    } //-- org.psi.ms.model.AcqSettingsType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acqSpecification'. The field
     * 'acqSpecification' has the following description:
     * Specification for combining raw scans/acquisitions into a
     * single peak list. Either a list of acquisitions, or a range
     * of acquisitions can be specified.
     * 
     * @return the value of field 'acqSpecification'.
     */
    public org.psi.ms.model.AcqSpecification getAcqSpecification()
    {
        return this._acqSpecification;
    } //-- org.psi.ms.model.AcqSpecification getAcqSpecification() 

    /**
     * Returns the value of field 'acqTime'.
     * 
     * @return the value of field 'acqTime'.
     */
    public org.psi.ms.model.AcqTime getAcqTime()
    {
        return this._acqTime;
    } //-- org.psi.ms.model.AcqTime getAcqTime() 

    /**
     * Returns the value of field 'instrument'.
     * 
     * @return the value of field 'instrument'.
     */
    public org.psi.ms.model.Instrument2 getInstrument()
    {
        return this._instrument;
    } //-- org.psi.ms.model.Instrument2 getInstrument2()

    /**
     * Returns the value of field 'specType'. The field 'specType'
     * has the following description: Type of spectrum 
     * 
     * @return the value of field 'specType'.
     */
    public org.psi.ms.model.types.AcqSettingsTypeSpecTypeType getSpecType()
    {
        return this._specType;
    } //-- org.psi.ms.model.types.AcqSettingsTypeSpecTypeType getSpecType() 

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
     * Sets the value of field 'acqSpecification'. The field
     * 'acqSpecification' has the following description:
     * Specification for combining raw scans/acquisitions into a
     * single peak list. Either a list of acquisitions, or a range
     * of acquisitions can be specified.
     * 
     * @param acqSpecification the value of field 'acqSpecification'
     */
    public void setAcqSpecification(org.psi.ms.model.AcqSpecification acqSpecification)
    {
        this._acqSpecification = acqSpecification;
    } //-- void setAcqSpecification(org.psi.ms.model.AcqSpecification) 

    /**
     * Sets the value of field 'acqTime'.
     * 
     * @param acqTime the value of field 'acqTime'.
     */
    public void setAcqTime(org.psi.ms.model.AcqTime acqTime)
    {
        this._acqTime = acqTime;
    } //-- void setAcqTime(org.psi.ms.model.AcqTime) 

    /**
     * Sets the value of field 'instrument'.
     * 
     * @param instrument the value of field 'instrument'.
     */
    public void setInstrument(org.psi.ms.model.Instrument2 instrument)
    {
        this._instrument = instrument;
    } //-- void setInstrument(org.psi.ms.model.Instrument2)

    /**
     * Sets the value of field 'specType'. The field 'specType' has
     * the following description: Type of spectrum 
     * 
     * @param specType the value of field 'specType'.
     */
    public void setSpecType(org.psi.ms.model.types.AcqSettingsTypeSpecTypeType specType)
    {
        this._specType = specType;
    } //-- void setSpecType(org.psi.ms.model.types.AcqSettingsTypeSpecTypeType) 

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
