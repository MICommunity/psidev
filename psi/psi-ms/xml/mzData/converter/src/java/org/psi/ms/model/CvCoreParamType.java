/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: CvCoreParamType.java,v 1.2 2003/08/21 14:28:01 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/


/**
 * Data type for single valued properties from the core controlled
 * vocabulary
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 14:28:01 $
 */
public abstract class CvCoreParamType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * parameter name (controlled)
     */
    private java.lang.String _name;

    /**
     * named parameter ID
     */
    private int _xref;

    /**
     * keeps track of state for field: _xref
     */
    private boolean _has_xref;

    /**
     * Field _cvCoreParamTypeChoice
     */
    private org.psi.ms.model.CvCoreParamTypeChoice _cvCoreParamTypeChoice;


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
     * Returns the value of field 'cvCoreParamTypeChoice'.
     *
     * @return the value of field 'cvCoreParamTypeChoice'.
     */
    public org.psi.ms.model.CvCoreParamTypeChoice getCvCoreParamTypeChoice() {
        return this._cvCoreParamTypeChoice;
    } //-- org.psi.ms.model.CvCoreParamTypeChoice getCvCoreParamTypeChoice()

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
     * Method hasXref
     */
    public boolean hasXref() {
        return this._has_xref;
    } //-- boolean hasXref()

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
     * Sets the value of field 'cvCoreParamTypeChoice'.
     *
     * @param cvCoreParamTypeChoice the value of field
     * 'cvCoreParamTypeChoice'.
     */
    public void setCvCoreParamTypeChoice(org.psi.ms.model.CvCoreParamTypeChoice cvCoreParamTypeChoice) {
        this._cvCoreParamTypeChoice = cvCoreParamTypeChoice;
    } //-- void setCvCoreParamTypeChoice(org.psi.ms.model.CvCoreParamTypeChoice)

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
        this._has_xref = true;
    } //-- void setXref(int)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

}
