/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: CvCoreParamType.java,v 1.5 2003/10/20 10:03:02 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/


/**
 * Data type for single valued properties from the core controlled
 * vocabulary
 *
 * @version $Revision: 1.5 $ $Date: 2003/10/20 10:03:02 $
 */
public abstract class CvCoreParamType extends MultiTypeValue implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * parameter name (controlled)
     */
    protected java.lang.String _name;

    /**
     * named parameter ID
     */
    protected int _xref = -1;


    //----------------/
    //- Constructors -/
    //----------------/

    public CvCoreParamType() {
        super();
    } //-- org.psi.ms.model.CvCoreParamType()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: parameter name (controlled)
     *
     * @return the value of field 'name'.
     */
    public java.lang.String getName() {
        return this._name;
    } //-- java.lang.String getName()

    /**
     * Returns the value of field 'xref'. The field 'xref' has the
     * following description: named parameter ID
     *
     * @return the value of field 'xref'.
     */
    public int getXref() {
        return this._xref;
    } //-- int getXref()

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: parameter name (controlled)
     *
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name) {
        this._name = name;
    } //-- void setName(java.lang.String)

    /**
     * Sets the value of field 'xref'. The field 'xref' has the
     * following description: named parameter ID
     *
     * @param xref the value of field 'xref'.
     */
    public void setXref(int xref) {
        this._xref = xref;
    } //-- void setXref(int)

}
