/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcquisitionType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * Class AcquisitionType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class AcquisitionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _id
     */
    private int _id;

    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;

    /**
     * Field _acquisitionTypeSequence
     */
    private org.psi.ms.model.AcquisitionTypeSequence _acquisitionTypeSequence;

    /**
     * Field _acquisitionTypeSequence2
     */
    private org.psi.ms.model.AcquisitionTypeSequence2 _acquisitionTypeSequence2;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcquisitionType() {
        super();
    } //-- org.psi.ms.model.AcquisitionType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acquisitionTypeSequence'.
     * 
     * @return the value of field 'acquisitionTypeSequence'.
     */
    public org.psi.ms.model.AcquisitionTypeSequence getAcquisitionTypeSequence()
    {
        return this._acquisitionTypeSequence;
    } //-- org.psi.ms.model.AcquisitionTypeSequence getAcquisitionTypeSequence() 

    /**
     * Returns the value of field 'acquisitionTypeSequence2'.
     * 
     * @return the value of field 'acquisitionTypeSequence2'.
     */
    public org.psi.ms.model.AcquisitionTypeSequence2 getAcquisitionTypeSequence2()
    {
        return this._acquisitionTypeSequence2;
    } //-- org.psi.ms.model.AcquisitionTypeSequence2 getAcquisitionTypeSequence2() 

    /**
     * Returns the value of field 'id'.
     * 
     * @return the value of field 'id'.
     */
    public int getId()
    {
        return this._id;
    } //-- int getId() 

    /**
     * Method hasId
     */
    public boolean hasId()
    {
        return this._has_id;
    } //-- boolean hasId() 

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
     * Sets the value of field 'acquisitionTypeSequence'.
     * 
     * @param acquisitionTypeSequence the value of field
     * 'acquisitionTypeSequence'.
     */
    public void setAcquisitionTypeSequence(org.psi.ms.model.AcquisitionTypeSequence acquisitionTypeSequence)
    {
        this._acquisitionTypeSequence = acquisitionTypeSequence;
    } //-- void setAcquisitionTypeSequence(org.psi.ms.model.AcquisitionTypeSequence) 

    /**
     * Sets the value of field 'acquisitionTypeSequence2'.
     * 
     * @param acquisitionTypeSequence2 the value of field
     * 'acquisitionTypeSequence2'.
     */
    public void setAcquisitionTypeSequence2(org.psi.ms.model.AcquisitionTypeSequence2 acquisitionTypeSequence2)
    {
        this._acquisitionTypeSequence2 = acquisitionTypeSequence2;
    } //-- void setAcquisitionTypeSequence2(org.psi.ms.model.AcquisitionTypeSequence2) 

    /**
     * Sets the value of field 'id'.
     * 
     * @param id the value of field 'id'.
     */
    public void setId(int id)
    {
        this._id = id;
        this._has_id = true;
    } //-- void setId(int) 

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
