/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcquisitionTypeSequence2.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * Class AcquisitionTypeSequence2.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public class AcquisitionTypeSequence2 implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Here the list of m/z values (for any type of spectrum). If
     * this is a true mass spectrum, then z=1. The array is stored
     * as a base64 encoded binary. The only type allowed is
     * IEEE-754 floating point and the precision must be specified
     * as either 32 or 64.
     */
    private org.psi.ms.model.MzArrayBinary _mzArrayBinary;

    /**
     * Here the intensities of each element of the m/z array are
     * stored also in base64 encoded binary of type float with a
     * specified precision.
     */
    private org.psi.ms.model.IntenArrayBinary _intenArrayBinary;


      //----------------/
     //- Constructors -/
    //----------------/

    public AcquisitionTypeSequence2() {
        super();
    } //-- org.psi.ms.model.AcquisitionTypeSequence2()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'intenArrayBinary'. The field
     * 'intenArrayBinary' has the following description: Here the
     * intensities of each element of the m/z array are stored also
     * in base64 encoded binary of type float with a specified
     * precision.
     * 
     * @return the value of field 'intenArrayBinary'.
     */
    public org.psi.ms.model.IntenArrayBinary getIntenArrayBinary()
    {
        return this._intenArrayBinary;
    } //-- org.psi.ms.model.IntenArrayBinary getIntenArrayBinary() 

    /**
     * Returns the value of field 'mzArrayBinary'. The field
     * 'mzArrayBinary' has the following description: Here the list
     * of m/z values (for any type of spectrum). If this is a true
     * mass spectrum, then z=1. The array is stored as a base64
     * encoded binary. The only type allowed is IEEE-754 floating
     * point and the precision must be specified as either 32 or
     * 64.
     * 
     * @return the value of field 'mzArrayBinary'.
     */
    public org.psi.ms.model.MzArrayBinary getMzArrayBinary()
    {
        return this._mzArrayBinary;
    } //-- org.psi.ms.model.MzArrayBinary getMzArrayBinary() 

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
     * Sets the value of field 'intenArrayBinary'. The field
     * 'intenArrayBinary' has the following description: Here the
     * intensities of each element of the m/z array are stored also
     * in base64 encoded binary of type float with a specified
     * precision.
     * 
     * @param intenArrayBinary the value of field 'intenArrayBinary'
     */
    public void setIntenArrayBinary(org.psi.ms.model.IntenArrayBinary intenArrayBinary)
    {
        this._intenArrayBinary = intenArrayBinary;
    } //-- void setIntenArrayBinary(org.psi.ms.model.IntenArrayBinary) 

    /**
     * Sets the value of field 'mzArrayBinary'. The field
     * 'mzArrayBinary' has the following description: Here the list
     * of m/z values (for any type of spectrum). If this is a true
     * mass spectrum, then z=1. The array is stored as a base64
     * encoded binary. The only type allowed is IEEE-754 floating
     * point and the precision must be specified as either 32 or
     * 64.
     * 
     * @param mzArrayBinary the value of field 'mzArrayBinary'.
     */
    public void setMzArrayBinary(org.psi.ms.model.MzArrayBinary mzArrayBinary)
    {
        this._mzArrayBinary = mzArrayBinary;
    } //-- void setMzArrayBinary(org.psi.ms.model.MzArrayBinary) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.AcquisitionTypeSequence2 unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.AcquisitionTypeSequence2) Unmarshaller.unmarshal(org.psi.ms.model.AcquisitionTypeSequence2.class, reader);
    } //-- org.psi.ms.model.AcquisitionTypeSequence2 unmarshal(java.io.Reader) 

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
