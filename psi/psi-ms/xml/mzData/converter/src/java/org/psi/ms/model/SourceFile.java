/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SourceFile.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Information about the original source file used to generate the
 * instance document.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
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
