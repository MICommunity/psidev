/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Raw.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * This is the actual peak list data. All that is stored here is
 * the actual data, all descriptive information is in the desc
 * section.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class Raw implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * List of acquisitions.
     */
    private org.psi.ms.model.AcquisitionList _acquisitionList;

    /**
     * List of supplemental data arrays
     */
    private org.psi.ms.model.SupplementList _supplementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Raw() {
        super();
    } //-- org.psi.ms.model.Raw()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     * 
     * @return the value of field 'acquisitionList'.
     */
    public org.psi.ms.model.AcquisitionList getAcquisitionList()
    {
        return this._acquisitionList;
    } //-- org.psi.ms.model.AcquisitionList getAcquisitionList() 

    /**
     * Returns the value of field 'supplementList'. The field
     * 'supplementList' has the following description: List of
     * supplemental data arrays
     * 
     * @return the value of field 'supplementList'.
     */
    public org.psi.ms.model.SupplementList getSupplementList()
    {
        return this._supplementList;
    } //-- org.psi.ms.model.SupplementList getSupplementList() 

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
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     * 
     * @param acquisitionList the value of field 'acquisitionList'.
     */
    public void setAcquisitionList(org.psi.ms.model.AcquisitionList acquisitionList)
    {
        this._acquisitionList = acquisitionList;
    } //-- void setAcquisitionList(org.psi.ms.model.AcquisitionList) 

    /**
     * Sets the value of field 'supplementList'. The field
     * 'supplementList' has the following description: List of
     * supplemental data arrays
     * 
     * @param supplementList the value of field 'supplementList'.
     */
    public void setSupplementList(org.psi.ms.model.SupplementList supplementList)
    {
        this._supplementList = supplementList;
    } //-- void setSupplementList(org.psi.ms.model.SupplementList) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.Raw unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.Raw) Unmarshaller.unmarshal(org.psi.ms.model.Raw.class, reader);
    } //-- org.psi.ms.model.Raw unmarshal(java.io.Reader) 

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
