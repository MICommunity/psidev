/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcquisitionType.java,v 1.2 2003/08/20 16:44:11 krunte Exp $
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
 * @version $Revision: 1.2 $ $Date: 2003/08/20 16:44:11 $
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

    public AcquisitionType() {
        super();
    } //-- org.psi.ms.model.AcquisitionType()


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
