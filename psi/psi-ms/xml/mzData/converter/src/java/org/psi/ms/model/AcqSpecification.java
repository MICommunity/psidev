/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqSpecification.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
import org.psi.ms.model.types.AcqSpecificationMethodType;
import org.xml.sax.ContentHandler;

/**
 * Specification for combining raw scans/acquisitions into a single
 * peak list. Either a list of acquisitions, or a range of
 * acquisitions can be specified.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class AcqSpecification implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _method
     */
    private org.psi.ms.model.types.AcqSpecificationMethodType _method;

    /**
     * A list of acquisitions used to create the peak list. (May
     * contain a single entry)
     */
    private org.psi.ms.model.List _list;

    /**
     * If a range of scans or acquistions was used to create the
     * peak list then a start and end value can be specified.
     */
    private org.psi.ms.model.Range _range;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcqSpecification() {
        super();
    } //-- org.psi.ms.model.AcqSpecification()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'list'. The field 'list' has the
     * following description: A list of acquisitions used to create
     * the peak list. (May contain a single entry)
     * 
     * @return the value of field 'list'.
     */
    public org.psi.ms.model.List getList()
    {
        return this._list;
    } //-- org.psi.ms.model.List getList() 

    /**
     * Returns the value of field 'method'.
     * 
     * @return the value of field 'method'.
     */
    public org.psi.ms.model.types.AcqSpecificationMethodType getMethod()
    {
        return this._method;
    } //-- org.psi.ms.model.types.AcqSpecificationMethodType getMethod() 

    /**
     * Returns the value of field 'range'. The field 'range' has
     * the following description: If a range of scans or
     * acquistions was used to create the peak list then a start
     * and end value can be specified.
     * 
     * @return the value of field 'range'.
     */
    public org.psi.ms.model.Range getRange()
    {
        return this._range;
    } //-- org.psi.ms.model.Range getRange() 

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
     * Sets the value of field 'list'. The field 'list' has the
     * following description: A list of acquisitions used to create
     * the peak list. (May contain a single entry)
     * 
     * @param list the value of field 'list'.
     */
    public void setList(org.psi.ms.model.List list)
    {
        this._list = list;
    } //-- void setList(org.psi.ms.model.List) 

    /**
     * Sets the value of field 'method'.
     * 
     * @param method the value of field 'method'.
     */
    public void setMethod(org.psi.ms.model.types.AcqSpecificationMethodType method)
    {
        this._method = method;
    } //-- void setMethod(org.psi.ms.model.types.AcqSpecificationMethodType) 

    /**
     * Sets the value of field 'range'. The field 'range' has the
     * following description: If a range of scans or acquistions
     * was used to create the peak list then a start and end value
     * can be specified.
     * 
     * @param range the value of field 'range'.
     */
    public void setRange(org.psi.ms.model.Range range)
    {
        this._range = range;
    } //-- void setRange(org.psi.ms.model.Range) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.AcqSpecification unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.AcqSpecification) Unmarshaller.unmarshal(org.psi.ms.model.AcqSpecification.class, reader);
    } //-- org.psi.ms.model.AcqSpecification unmarshal(java.io.Reader) 

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
