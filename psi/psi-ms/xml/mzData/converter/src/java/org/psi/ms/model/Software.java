/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Software.java,v 1.2 2003/08/21 12:23:47 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Specific information on the conversion or processing software.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 12:23:47 $
 */
public class Software implements java.io.Serializable {
    /**
     * Field _completionTime
     */
    private java.util.Date _completionTime;
    /**
     * Field _name
     */
    private String _name;
    /**
     * Field _version
     */
    private String _version;
    /**
     * Field _description
     */
    private String _description;


    //----------------/
    //- Constructors -/
    //----------------/

    public Software() {
        super();
    } //-- org.psi.ms.model.Software()


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
    public static org.psi.ms.model.Software unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.Software) Unmarshaller.unmarshal(org.psi.ms.model.Software.class, reader);
    } //-- org.psi.ms.model.Software unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Returns the value of field 'completionTime'.
     *
     * @return the value of field 'completionTime'.
     */
    public java.util.Date getCompletionTime() {
        return this._completionTime;
    } //-- java.util.Date getCompletionTime()

    /**
     * Returns the value of field 'description'.
     *
     * @return the value of field 'description'.
     */
    public String getDescription() {
        return this._description;
    } //-- java.lang.String getDescription()

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'name'.
     */
    public String getName() {
        return this._name;
    } //-- java.lang.String getName()

    /**
     * Returns the value of field 'version'.
     *
     * @return the value of field 'version'.
     */
    public String getVersion() {
        return this._version;
    } //-- java.lang.String getVersion()

    /**
     * Sets the value of field 'completionTime'.
     *
     * @param completionTime the value of field 'completionTime'.
     */
    public void setCompletionTime(java.util.Date completionTime) {
        this._completionTime = completionTime;
    } //-- void setCompletionTime(java.util.Date)

    /**
     * Sets the value of field 'description'.
     *
     * @param description the value of field 'description'.
     */
    public void setDescription(String description) {
        this._description = description;
    } //-- void setDescription(java.lang.String)

    /**
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(String name) {
        this._name = name;
    } //-- void setName(java.lang.String)

    /**
     * Sets the value of field 'version'.
     *
     * @param version the value of field 'version'.
     */
    public void setVersion(String version) {
        this._version = version;
    } //-- void setVersion(java.lang.String)

}
