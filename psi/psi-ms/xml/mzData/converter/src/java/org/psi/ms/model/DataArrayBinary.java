/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataArrayBinary.java,v 1.2 2003/08/21 12:23:47 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * In addition to the m/z and intensity arrays, an arbitrary number
 * of other arrays can be stored using the same indexing. For each
 * array stored as base64 binary a precision must be specified. The
 * only type allowed is IEEE-754 floating point.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 12:23:47 $
 */
public class DataArrayBinary extends MzArrayBinaryType
        implements java.io.Serializable {
    /**
     * Field _arrayName
     */
    private String _arrayName;
    /**
     * Field _description
     */
    private String _description;


    //----------------/
    //- Constructors -/
    //----------------/

    public DataArrayBinary() {
        super();
    } //-- org.psi.ms.model.DataArrayBinary()


    //-----------/
    //- Methods -/
    //-----------/

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
     * Method unmarshal
     *
     * @param reader
     */
    public static org.psi.ms.model.DataArrayBinary unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.DataArrayBinary) Unmarshaller.unmarshal(org.psi.ms.model.DataArrayBinary.class, reader);
    } //-- org.psi.ms.model.DataArrayBinary unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Returns the value of field 'arrayName'.
     *
     * @return the value of field 'arrayName'.
     */
    public String getArrayName() {
        return this._arrayName;
    } //-- java.lang.String getArrayName()

    /**
     * Returns the value of field 'description'.
     *
     * @return the value of field 'description'.
     */
    public String getDescription() {
        return this._description;
    } //-- java.lang.String getDescription()

    /**
     * Sets the value of field 'arrayName'.
     *
     * @param arrayName the value of field 'arrayName'.
     */
    public void setArrayName(String arrayName) {
        this._arrayName = arrayName;
    } //-- void setArrayName(java.lang.String)

    /**
     * Sets the value of field 'description'.
     *
     * @param description the value of field 'description'.
     */
    public void setDescription(String description) {
        this._description = description;
    } //-- void setDescription(java.lang.String)

}
