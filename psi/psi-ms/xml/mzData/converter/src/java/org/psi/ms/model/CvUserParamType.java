/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: CvUserParamType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

/**
 * Data type for user parameters with or without xref numbers
 * (uncontrolled vocabulary)
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class CvUserParamType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * parameter name
     */
    private java.lang.String _name;

    /**
     * This is a user-maintaiend ID (if user desires to control the
     * vocabulary)
     */
    private int _xref;

    /**
     * keeps track of state for field: _xref
     */
    private boolean _has_xref;

    /**
     * Field _cvUserParamTypeChoice
     */
    private org.psi.ms.model.CvUserParamTypeChoice _cvUserParamTypeChoice;


      //----------------/
     //- Constructors -/
    //----------------/

    public CvUserParamType() {
        super();
    } //-- org.psi.ms.model.CvUserParamType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteXref
     */
    public void deleteXref()
    {
        this._has_xref= false;
    } //-- void deleteXref() 

    /**
     * Returns the value of field 'cvUserParamTypeChoice'.
     * 
     * @return the value of field 'cvUserParamTypeChoice'.
     */
    public org.psi.ms.model.CvUserParamTypeChoice getCvUserParamTypeChoice()
    {
        return this._cvUserParamTypeChoice;
    } //-- org.psi.ms.model.CvUserParamTypeChoice getCvUserParamTypeChoice() 

    /**
     * Returns the value of field 'name'. The field 'name' has the
     * following description: parameter name
     * 
     * @return the value of field 'name'.
     */
    public java.lang.String getName()
    {
        return this._name;
    } //-- java.lang.String getName() 

    /**
     * Returns the value of field 'xref'. The field 'xref' has the
     * following description: This is a user-maintaiend ID (if user
     * desires to control the vocabulary)
     * 
     * @return the value of field 'xref'.
     */
    public int getXref()
    {
        return this._xref;
    } //-- int getXref() 

    /**
     * Method hasXref
     */
    public boolean hasXref()
    {
        return this._has_xref;
    } //-- boolean hasXref() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Sets the value of field 'cvUserParamTypeChoice'.
     * 
     * @param cvUserParamTypeChoice the value of field
     * 'cvUserParamTypeChoice'.
     */
    public void setCvUserParamTypeChoice(org.psi.ms.model.CvUserParamTypeChoice cvUserParamTypeChoice)
    {
        this._cvUserParamTypeChoice = cvUserParamTypeChoice;
    } //-- void setCvUserParamTypeChoice(org.psi.ms.model.CvUserParamTypeChoice) 

    /**
     * Sets the value of field 'name'. The field 'name' has the
     * following description: parameter name
     * 
     * @param name the value of field 'name'.
     */
    public void setName(java.lang.String name)
    {
        this._name = name;
    } //-- void setName(java.lang.String) 

    /**
     * Sets the value of field 'xref'. The field 'xref' has the
     * following description: This is a user-maintaiend ID (if user
     * desires to control the vocabulary)
     * 
     * @param xref the value of field 'xref'.
     */
    public void setXref(int xref)
    {
        this._xref = xref;
        this._has_xref = true;
    } //-- void setXref(int) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
