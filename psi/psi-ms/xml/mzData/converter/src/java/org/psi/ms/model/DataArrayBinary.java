/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataArrayBinary.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * In addition to the m/z and intensity arrays, an arbitrary number
 * of other arrays can be stored using the same indexing. For each
 * array stored as base64 binary a precision must be specified. The
 * only type allowed is IEEE-754 floating point.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
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
