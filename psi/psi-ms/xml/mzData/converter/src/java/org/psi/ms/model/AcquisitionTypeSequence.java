/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcquisitionTypeSequence.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * Class AcquisitionTypeSequence.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class AcquisitionTypeSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Here the mass array can be specified as individual numbers,
     * however, the type must be selected as either float or int
     * for the entire array. This allows for human readability and
     * editing.
     */
    private org.psi.ms.model.MzArray _mzArray;

    /**
     * The intensity array can be specified as an array of ints or
     * an array of floats also. 
     */
    private org.psi.ms.model.IntenArray _intenArray;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcquisitionTypeSequence() {
        super();
    } //-- org.psi.ms.model.AcquisitionTypeSequence()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'intenArray'. The field
     * 'intenArray' has the following description: The intensity
     * array can be specified as an array of ints or an array of
     * floats also. 
     * 
     * @return the value of field 'intenArray'.
     */
    public org.psi.ms.model.IntenArray getIntenArray()
    {
        return this._intenArray;
    } //-- org.psi.ms.model.IntenArray getIntenArray() 

    /**
     * Returns the value of field 'mzArray'. The field 'mzArray'
     * has the following description: Here the mass array can be
     * specified as individual numbers, however, the type must be
     * selected as either float or int for the entire array. This
     * allows for human readability and editing.
     * 
     * @return the value of field 'mzArray'.
     */
    public org.psi.ms.model.MzArray getMzArray()
    {
        return this._mzArray;
    } //-- org.psi.ms.model.MzArray getMzArray() 

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
     * Sets the value of field 'intenArray'. The field 'intenArray'
     * has the following description: The intensity array can be
     * specified as an array of ints or an array of floats also. 
     * 
     * @param intenArray the value of field 'intenArray'.
     */
    public void setIntenArray(org.psi.ms.model.IntenArray intenArray)
    {
        this._intenArray = intenArray;
    } //-- void setIntenArray(org.psi.ms.model.IntenArray) 

    /**
     * Sets the value of field 'mzArray'. The field 'mzArray' has
     * the following description: Here the mass array can be
     * specified as individual numbers, however, the type must be
     * selected as either float or int for the entire array. This
     * allows for human readability and editing.
     * 
     * @param mzArray the value of field 'mzArray'.
     */
    public void setMzArray(org.psi.ms.model.MzArray mzArray)
    {
        this._mzArray = mzArray;
    } //-- void setMzArray(org.psi.ms.model.MzArray) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.AcquisitionTypeSequence unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.AcquisitionTypeSequence) Unmarshaller.unmarshal(org.psi.ms.model.AcquisitionTypeSequence.class, reader);
    } //-- org.psi.ms.model.AcquisitionTypeSequence unmarshal(java.io.Reader) 

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
