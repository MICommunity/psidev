/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: IntenArray.java,v 1.2 2003/08/21 14:28:01 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * The intensity array can be specified as an array of ints or an
 * array of floats also.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 14:28:01 $
 */
public class IntenArray extends org.psi.ms.model.RawDataType
        implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

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

    public IntenArray() {
        super();
    } //-- org.psi.ms.model.IntenArray()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'length'.
     *
     * @return the value of field 'length'.
     */
    public int getLength() {
        return this._length;
    } //-- int getLength()

    /**
     * Method hasLength
     */
    public boolean hasLength() {
        return this._has_length;
    } //-- boolean hasLength()

    /**
     * Method isValid
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
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
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer)

    /**
     * Method marshal
     *
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
            throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler)

    /**
     * Sets the value of field 'length'.
     *
     * @param length the value of field 'length'.
     */
    public void setLength(int length) {
        this._length = length;
        this._has_length = true;
    } //-- void setLength(int)

    /**
     * Method unmarshal
     *
     * @param reader
     */
    public static org.psi.ms.model.IntenArray unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.IntenArray) Unmarshaller.unmarshal(org.psi.ms.model.IntenArray.class, reader);
    } //-- org.psi.ms.model.IntenArray unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

}
