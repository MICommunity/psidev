/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: MzData.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
 */

package org.psi.ms.model;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * The "peak list" is really processed data from an experiment.
 * There can bemultiple acquisitions, which might be related via a
 * separation, or just in sequence from an automated run.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class MzData implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _version
     */
    private java.lang.String _version = "1.00";

    /**
     * Each data set starts with a description section. Each
     * acquisition given in the 'raw' section has an entry in the
     * description section. This allows the desc section to be read
     * and then used to find specific entries in the raw section.
     */
    private org.psi.ms.model.Desc _desc;

    /**
     * This is the actual peak list data. All that is stored here
     * is the actual data, all descriptive information is in the
     * desc section.
     */
    private org.psi.ms.model.Raw _raw;


      //----------------/
     //- Constructors -/
    //----------------/

    public MzData() {
        super();
        setVersion("1.00");
    } //-- org.psi.ms.model.MzData()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'desc'. The field 'desc' has the
     * following description: Each data set starts with a
     * description section. Each acquisition given in the 'raw'
     * section has an entry in the description section. This allows
     * the desc section to be read and then used to find specific
     * entries in the raw section.
     * 
     * @return the value of field 'desc'.
     */
    public org.psi.ms.model.Desc getDesc()
    {
        return this._desc;
    } //-- org.psi.ms.model.Desc getDesc() 

    /**
     * Returns the value of field 'raw'. The field 'raw' has the
     * following description: This is the actual peak list data.
     * All that is stored here is the actual data, all descriptive
     * information is in the desc section.
     * 
     * @return the value of field 'raw'.
     */
    public org.psi.ms.model.Raw getRaw()
    {
        return this._raw;
    } //-- org.psi.ms.model.Raw getRaw() 

    /**
     * Returns the value of field 'version'.
     * 
     * @return the value of field 'version'.
     */
    public java.lang.String getVersion()
    {
        return this._version;
    } //-- java.lang.String getVersion() 

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
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'desc'. The field 'desc' has the
     * following description: Each data set starts with a
     * description section. Each acquisition given in the 'raw'
     * section has an entry in the description section. This allows
     * the desc section to be read and then used to find specific
     * entries in the raw section.
     * 
     * @param desc the value of field 'desc'.
     */
    public void setDesc(org.psi.ms.model.Desc desc)
    {
        this._desc = desc;
    } //-- void setDesc(org.psi.ms.model.Desc) 

    /**
     * Sets the value of field 'raw'. The field 'raw' has the
     * following description: This is the actual peak list data.
     * All that is stored here is the actual data, all descriptive
     * information is in the desc section.
     * 
     * @param raw the value of field 'raw'.
     */
    public void setRaw(org.psi.ms.model.Raw raw)
    {
        this._raw = raw;
    } //-- void setRaw(org.psi.ms.model.Raw) 

    /**
     * Sets the value of field 'version'.
     * 
     * @param version the value of field 'version'.
     */
    public void setVersion(java.lang.String version)
    {
        this._version = version;
    } //-- void setVersion(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.psi.ms.model.MzData unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.psi.ms.model.MzData) Unmarshaller.unmarshal(org.psi.ms.model.MzData.class, reader);
    } //-- org.psi.ms.model.MzData unmarshal(java.io.Reader) 

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
