/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Software.java,v 1.4 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Specific information on the conversion or processing software.
 *
 * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
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
