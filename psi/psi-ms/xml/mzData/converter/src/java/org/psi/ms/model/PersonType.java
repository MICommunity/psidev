/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: PersonType.java,v 1.2 2003/08/21 14:28:02 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/


/**
 * Data type for operator identification information
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 14:28:02 $
 */
public abstract class PersonType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _name
     */
    private java.lang.String _name;

    /**
     * Field _institution
     */
    private java.lang.String _institution;

    /**
     * Field _contactInfo
     */
    private java.lang.String _contactInfo;


    //----------------/
    //- Constructors -/
    //----------------/

    public PersonType() {
        super();
    } //-- org.psi.ms.model.PersonType()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'contactInfo'.
     *
     * @return the value of field 'contactInfo'.
     */
    public java.lang.String getContactInfo() {
        return this._contactInfo;
    } //-- java.lang.String getContactInfo()

    /**
     * Returns the value of field 'institution'.
     *
     * @return the value of field 'institution'.
     */
    public java.lang.String getInstitution() {
        return this._institution;
    } //-- java.lang.String getInstitution()

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'name'.
     */
    public java.lang.String getName() {
        return this._name;
    } //-- java.lang.String getName()

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
     * Sets the value of field 'contactInfo'.
     *
     * @param contactInfo the value of field 'contactInfo'.
     */
    public void setContactInfo(java.lang.String contactInfo) {
        this._contactInfo = contactInfo;
    } //-- void setContactInfo(java.lang.String)

    /**
     * Sets the value of field 'institution'.
     *
     * @param institution the value of field 'institution'.
     */
    public void setInstitution(java.lang.String institution) {
        this._institution = institution;
    } //-- void setInstitution(java.lang.String)

    /**
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name) {
        this._name = name;
    } //-- void setName(java.lang.String)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

}
