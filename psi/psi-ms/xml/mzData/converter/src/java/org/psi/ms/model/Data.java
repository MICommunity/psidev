/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Data.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
import org.psi.ms.model.types.DataPrecisionType;
import org.xml.sax.ContentHandler;

/**
 * Class Data.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class Data implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private byte[] _content;

    /**
     * Field _precision
     */
    private org.psi.ms.model.types.DataPrecisionType _precision;

    /**
     * Field _length
     */
    private int _length;

    /**
     * keeps track of state for field: _length
     */
    private boolean _has_length;


      //----------------/
     //- Constructors -/
    //----------------/

    public Data() {
        super();
    } //-- org.psi.ms.model.Data()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     * 
     * @return the value of field 'content'.
     */
    public byte[] getContent()
    {
        return this._content;
    } //-- byte[] getContent() 

    /**
     * Returns the value of field 'length'.
     * 
     * @return the value of field 'length'.
     */
    public int getLength()
    {
        return this._length;
    } //-- int getLength() 

    /**
     * Returns the value of field 'precision'.
     * 
     * @return the value of field 'precision'.
     */
    public org.psi.ms.model.types.DataPrecisionType getPrecision()
    {
        return this._precision;
    } //-- org.psi.ms.model.types.DataPrecisionType getPrecision() 

    /**
     * Method hasLength
     */
    public boolean hasLength()
    {
        return this._has_length;
    } //-- boolean hasLength() 

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
    public void setContent(byte[] content)
    {
        this._content = content;
    } //-- void setContent(byte) 

    /**
     * Sets the value of field 'length'.
     * 
     * @param length the value of field 'length'.
     */
    public void setLength(int length)
    {
        this._length = length;
        this._has_length = true;
    } //-- void setLength(int) 

    /**
     * Sets the value of field 'precision'.
     * 
     * @param precision the value of field 'precision'.
     */
    public void setPrecision(org.psi.ms.model.types.DataPrecisionType precision)
    {
        this._precision = precision;
    } //-- void setPrecision(org.psi.ms.model.types.DataPrecisionType) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.Data unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.Data) Unmarshaller.unmarshal(org.psi.ms.model.Data.class, reader);
    } //-- org.psi.ms.model.Data unmarshal(java.io.Reader) 

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
