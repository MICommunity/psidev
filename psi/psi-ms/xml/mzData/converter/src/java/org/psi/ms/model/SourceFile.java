/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SourceFile.java,v 1.2 2003/08/21 12:23:47 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Information about the original source file used to generate the
 * instance document.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 12:23:47 $
 */
public class SourceFile implements java.io.Serializable {
    /**
     * Source file name for ms run.
     */
    private String _name;
    /**
     * File type (typically named by vendor data system)
     */
    private String _type;


    //----------------/
    //- Constructors -/
    //----------------/

    public SourceFile() {
        super();
    } //-- org.psi.ms.model.SourceFile()


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
    public static org.psi.ms.model.SourceFile unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.SourceFile) Unmarshaller.unmarshal(org.psi.ms.model.SourceFile.class, reader);
    } //-- org.psi.ms.model.SourceFile unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: Source file name for ms run.
     *
     * @return the value of field 'name'.
     */
    public String getName() {
        return this._name;
    } //-- java.lang.String getName()

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: File type (typically named by vendor
     * data system)
     *
     * @return the value of field 'type'.
     */
    public String getType() {
        return this._type;
    } //-- java.lang.String getType()

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: Source file name for ms run.
     *
     * @param name the value of field 'name'.
     */
    public void setName(String name) {
        this._name = name;
    } //-- void setName(java.lang.String)

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: File type (typically named by vendor
     * data system)
     *
     * @param type the value of field 'type'.
     */
    public void setType(String type) {
        this._type = type;
    } //-- void setType(java.lang.String)

}
