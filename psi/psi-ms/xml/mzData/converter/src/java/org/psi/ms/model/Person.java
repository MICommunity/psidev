/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Person.java,v 1.3 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Person person for this dataset.
 *
 * @version $Revision: 1.3 $ $Date: 2004/01/14 15:57:36 $
 */
public class Person implements java.io.Serializable {
    /**
     * Field _name
     */
    private String _name = "";
    /**
     * Field _institution
     */
    private String _institution = "";
    /**
     * Field _contactInfo
     */
    private String _contactInfo = "";


    //----------------/
    //- Constructors -/
    //----------------/

    public Person() {
        super();
    } //-- org.psi.ms.model.Person()

    /**
     * Returns the value of field 'contactInfo'.
     *
     * @return the value of field 'contactInfo'.
     */
    public String getContactInfo() {
        return this._contactInfo;
    } //-- java.lang.String getContactInfo()

    /**
     * Returns the value of field 'institution'.
     *
     * @return the value of field 'institution'.
     */
    public String getInstitution() {
        return this._institution;
    } //-- java.lang.String getInstitution()

    /**
     * Returns the value of field 'name'.
     *
     * @return the value of field 'name'.
     */
    public String getName() {
        return this._name;
    } //-- java.lang.String getName()

    /**
     * Sets the value of field 'contactInfo'.
     *
     * @param contactInfo the value of field 'contactInfo'.
     */
    public void setContactInfo(String contactInfo) {
        this._contactInfo = contactInfo;
    } //-- void setContactInfo(java.lang.String)

    /**
     * Sets the value of field 'institution'.
     *
     * @param institution the value of field 'institution'.
     */
    public void setInstitution(String institution) {
        this._institution = institution;
    } //-- void setInstitution(java.lang.String)

    /**
     * Sets the value of field 'name'.
     *
     * @param name the value of field 'name'.
     */
    public void setName(String name) {
        this._name = name;
    } //-- void setName(java.lang.String)


    //-----------/
    //- Methods -/
    //-----------/

}
