/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: MzArrayBinaryType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * Class MzArrayBinaryType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class MzArrayBinaryType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _data
     */
    private org.psi.ms.model.Data _data;


      //----------------/
     //- Constructors -/
    //----------------/

    public MzArrayBinaryType() {
        super();
    } //-- org.psi.ms.model.MzArrayBinaryType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'data'.
     * 
     * @return the value of field 'data'.
     */
    public org.psi.ms.model.Data getData()
    {
        return this._data;
    } //-- org.psi.ms.model.Data getData() 

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
     * Sets the value of field 'data'.
     * 
     * @param data the value of field 'data'.
     */
    public void setData(org.psi.ms.model.Data data)
    {
        this._data = data;
    } //-- void setData(org.psi.ms.model.Data) 

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
