/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataArray.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * If the raw data representation method was not binary or if the
 * supplemental data array was a string- or other non-binary type,
 * then it can be represented in the dataArray element.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class DataArray extends org.psi.ms.model.SuppDataType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Number of items in the dataArray
     */
    private int _length;

    /**
     * keeps track of state for field: _length
     */
    private boolean _has_length;

    /**
     * Each dataArray can either be related to the mzArray or not.
     * If the elements are related to the mzArray then this flag is
     * set to 1.
     */
    private boolean _indexed;

    /**
     * keeps track of state for field: _indexed
     */
    private boolean _has_indexed;

    /**
     * If the indexed flag is set, then this value gives the
     * element count (starting from 1) in the mzArray which aligns
     * with the first element in this dataArray.
     */
    private int _offset = 0;

    /**
     * keeps track of state for field: _offset
     */
    private boolean _has_offset;

    /**
     * Name of the supplemental data array
     */
    private java.lang.String _arrayName;

    /**
     * Description of the supplemental data array
     */
    private java.lang.String _description;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataArray() {
        super();
    } //-- org.psi.ms.model.DataArray()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteOffset
     */
    public void deleteOffset()
    {
        this._has_offset= false;
    } //-- void deleteOffset() 

    /**
     * Returns the value of field 'arrayName'. The field
     * 'arrayName' has the following description: Name of the
     * supplemental data array
     * 
     * @return the value of field 'arrayName'.
     */
    public java.lang.String getArrayName()
    {
        return this._arrayName;
    } //-- java.lang.String getArrayName() 

    /**
     * Returns the value of field 'description'. The field
     * 'description' has the following description: Description of
     * the supplemental data array
     * 
     * @return the value of field 'description'.
     */
    public java.lang.String getDescription()
    {
        return this._description;
    } //-- java.lang.String getDescription() 

    /**
     * Returns the value of field 'indexed'. The field 'indexed'
     * has the following description: Each dataArray can either be
     * related to the mzArray or not. If the elements are related
     * to the mzArray then this flag is set to 1.
     * 
     * @return the value of field 'indexed'.
     */
    public boolean getIndexed()
    {
        return this._indexed;
    } //-- boolean getIndexed() 

    /**
     * Returns the value of field 'length'. The field 'length' has
     * the following description: Number of items in the dataArray
     * 
     * @return the value of field 'length'.
     */
    public int getLength()
    {
        return this._length;
    } //-- int getLength() 

    /**
     * Returns the value of field 'offset'. The field 'offset' has
     * the following description: If the indexed flag is set, then
     * this value gives the element count (starting from 1) in the
     * mzArray which aligns with the first element in this
     * dataArray.
     * 
     * @return the value of field 'offset'.
     */
    public int getOffset()
    {
        return this._offset;
    } //-- int getOffset() 

    /**
     * Method hasIndexed
     */
    public boolean hasIndexed()
    {
        return this._has_indexed;
    } //-- boolean hasIndexed() 

    /**
     * Method hasLength
     */
    public boolean hasLength()
    {
        return this._has_length;
    } //-- boolean hasLength() 

    /**
     * Method hasOffset
     */
    public boolean hasOffset()
    {
        return this._has_offset;
    } //-- boolean hasOffset() 

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
     * Sets the value of field 'arrayName'. The field 'arrayName'
     * has the following description: Name of the supplemental data
     * array
     * 
     * @param arrayName the value of field 'arrayName'.
     */
    public void setArrayName(java.lang.String arrayName)
    {
        this._arrayName = arrayName;
    } //-- void setArrayName(java.lang.String) 

    /**
     * Sets the value of field 'description'. The field
     * 'description' has the following description: Description of
     * the supplemental data array
     * 
     * @param description the value of field 'description'.
     */
    public void setDescription(java.lang.String description)
    {
        this._description = description;
    } //-- void setDescription(java.lang.String) 

    /**
     * Sets the value of field 'indexed'. The field 'indexed' has
     * the following description: Each dataArray can either be
     * related to the mzArray or not. If the elements are related
     * to the mzArray then this flag is set to 1.
     * 
     * @param indexed the value of field 'indexed'.
     */
    public void setIndexed(boolean indexed)
    {
        this._indexed = indexed;
        this._has_indexed = true;
    } //-- void setIndexed(boolean) 

    /**
     * Sets the value of field 'length'. The field 'length' has the
     * following description: Number of items in the dataArray
     * 
     * @param length the value of field 'length'.
     */
    public void setLength(int length)
    {
        this._length = length;
        this._has_length = true;
    } //-- void setLength(int) 

    /**
     * Sets the value of field 'offset'. The field 'offset' has the
     * following description: If the indexed flag is set, then this
     * value gives the element count (starting from 1) in the
     * mzArray which aligns with the first element in this
     * dataArray.
     * 
     * @param offset the value of field 'offset'.
     */
    public void setOffset(int offset)
    {
        this._offset = offset;
        this._has_offset = true;
    } //-- void setOffset(int) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.DataArray unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.DataArray) Unmarshaller.unmarshal(org.psi.ms.model.DataArray.class, reader);
    } //-- org.psi.ms.model.DataArray unmarshal(java.io.Reader) 

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
