/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqTime.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Date;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.psi.ms.model.types.AcqTimeUnitsType;
import org.xml.sax.ContentHandler;

/**
 * Class AcqTime.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class AcqTime implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.util.Date _content;

    /**
     * Field _units
     */
    private org.psi.ms.model.types.AcqTimeUnitsType _units;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcqTime() {
        super();
    } //-- org.psi.ms.model.AcqTime()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'content'.
     */
    public java.util.Date getContent()
    {
        return this._content;
    } //-- java.util.Date getContent() 

    /**
     * Returns the value of field 'units'.
     * 
     * @return the value of field 'units'.
     */
    public org.psi.ms.model.types.AcqTimeUnitsType getUnits()
    {
        return this._units;
    } //-- org.psi.ms.model.types.AcqTimeUnitsType getUnits() 

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
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     * 
     * @param content the value of field 'content'.
     */
    public void setContent(java.util.Date content)
    {
        this._content = content;
    } //-- void setContent(java.util.Date) 

    /**
     * Sets the value of field 'units'.
     * 
     * @param units the value of field 'units'.
     */
    public void setUnits(org.psi.ms.model.types.AcqTimeUnitsType units)
    {
        this._units = units;
    } //-- void setUnits(org.psi.ms.model.types.AcqTimeUnitsType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.AcqTime unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.AcqTime) Unmarshaller.unmarshal(org.psi.ms.model.AcqTime.class, reader);
    } //-- org.psi.ms.model.AcqTime unmarshal(java.io.Reader) 

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
