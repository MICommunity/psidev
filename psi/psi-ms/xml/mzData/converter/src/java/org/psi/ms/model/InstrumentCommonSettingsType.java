/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: InstrumentCommonSettingsType.java,v 1.2 2003/08/21 10:58:11 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

/**
 * Class InstrumentCommonSettingsType.
 * 
 * @version $Revision: 1.2 $ $Date: 2003/08/21 10:58:11 $
 */
public abstract class InstrumentCommonSettingsType {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/


    //----------------/
     //- Constructors -/
    //----------------/

    public InstrumentCommonSettingsType() {
        super();
    } //-- org.psi.ms.model.InstrumentCommonSettingsType()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
