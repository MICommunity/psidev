/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: ActivationType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
import org.psi.ms.model.types.ActivationTypeMethodType;

/**
 * Class ActivationType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class ActivationType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Activation method (controlled)
     */
    private org.psi.ms.model.types.ActivationTypeMethodType _method;

    /**
     * Activation energy. This is instrument dependent, i.e. the
     * instrument type and method must be known to interpret this
     * value.
     */
    private float _energy;

    /**
     * keeps track of state for field: _energy
     */
    private boolean _has_energy;


      //----------------/
     //- Constructors -/
    //----------------/

    public ActivationType() {
        super();
    } //-- org.psi.ms.model.ActivationType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteEnergy
     */
    public void deleteEnergy()
    {
        this._has_energy= false;
    } //-- void deleteEnergy() 

    /**
     * Returns the value of field 'energy'. The field 'energy' has
     * the following description: Activation energy. This is
     * instrument dependent, i.e. the instrument type and method
     * must be known to interpret this value.
     * 
     * @return the value of field 'energy'.
     */
    public float getEnergy()
    {
        return this._energy;
    } //-- float getEnergy() 

    /**
     * Returns the value of field 'method'. The field 'method' has
     * the following description: Activation method (controlled)
     * 
     * @return the value of field 'method'.
     */
    public org.psi.ms.model.types.ActivationTypeMethodType getMethod()
    {
        return this._method;
    } //-- org.psi.ms.model.types.ActivationTypeMethodType getMethod() 

    /**
     * Method hasEnergy
     */
    public boolean hasEnergy()
    {
        return this._has_energy;
    } //-- boolean hasEnergy() 

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
     * Sets the value of field 'energy'. The field 'energy' has the
     * following description: Activation energy. This is instrument
     * dependent, i.e. the instrument type and method must be known
     * to interpret this value.
     * 
     * @param energy the value of field 'energy'.
     */
    public void setEnergy(float energy)
    {
        this._energy = energy;
        this._has_energy = true;
    } //-- void setEnergy(float) 

    /**
     * Sets the value of field 'method'. The field 'method' has the
     * following description: Activation method (controlled)
     * 
     * @param method the value of field 'method'.
     */
    public void setMethod(org.psi.ms.model.types.ActivationTypeMethodType method)
    {
        this._method = method;
    } //-- void setMethod(org.psi.ms.model.types.ActivationTypeMethodType) 

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
