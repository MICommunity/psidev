/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AnalyzerType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
import org.psi.ms.model.types.AnalyzerTypeTypeType;

/**
 * Class AnalyzerType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class AnalyzerType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Mass analyzer type (controlled)
     */
    private org.psi.ms.model.types.AnalyzerTypeTypeType _type;

    /**
     * Base mass analyzer resolution. This is defined as full peak
     * width at half maximum intensity divided by mass. This
     * paramter should hold the full scan resolution if variable
     * resolution is used, or if not otherwise specified in the
     * acquisition section.
     */
    private float _resolution;

    /**
     * keeps track of state for field: _resolution
     */
    private boolean _has_resolution;

    /**
     * Base mass accuracy. This is defined in m/z units. This
     * element hold the full scan accuracy if variable accuracy is
     * used or not otherwise specified in the acquisition section.
     */
    private float _accuracy;

    /**
     * keeps track of state for field: _accuracy
     */
    private boolean _has_accuracy;

    /**
     * This element holds additional data or annotation
     * information. Only controlled name values are allowed here.
     */
    private java.util.Vector _instParamList;

    /**
     * This element holds additional data or annotation
     * information. Uncontrolled, or user controlled name values
     * are allowed here.
     */
    private java.util.Vector _instUserParamList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AnalyzerType() {
        super();
        _instParamList = new Vector();
        _instUserParamList = new Vector();
    } //-- org.psi.ms.model.AnalyzerType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addInstParam
     * 
     * @param vInstParam
     */
    public void addInstParam(org.psi.ms.model.InstParam vInstParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _instParamList.addElement(vInstParam);
    } //-- void addInstParam(org.psi.ms.model.InstParam) 

    /**
     * Method addInstParam
     * 
     * @param index
     * @param vInstParam
     */
    public void addInstParam(int index, org.psi.ms.model.InstParam vInstParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _instParamList.insertElementAt(vInstParam, index);
    } //-- void addInstParam(int, org.psi.ms.model.InstParam) 

    /**
     * Method addInstUserParam
     * 
     * @param vInstUserParam
     */
    public void addInstUserParam(org.psi.ms.model.InstUserParam vInstUserParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _instUserParamList.addElement(vInstUserParam);
    } //-- void addInstUserParam(org.psi.ms.model.InstUserParam) 

    /**
     * Method addInstUserParam
     * 
     * @param index
     * @param vInstUserParam
     */
    public void addInstUserParam(int index, org.psi.ms.model.InstUserParam vInstUserParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _instUserParamList.insertElementAt(vInstUserParam, index);
    } //-- void addInstUserParam(int, org.psi.ms.model.InstUserParam) 

    /**
     * Method enumerateInstParam
     */
    public java.util.Enumeration enumerateInstParam()
    {
        return _instParamList.elements();
    } //-- java.util.Enumeration enumerateInstParam() 

    /**
     * Method enumerateInstUserParam
     */
    public java.util.Enumeration enumerateInstUserParam()
    {
        return _instUserParamList.elements();
    } //-- java.util.Enumeration enumerateInstUserParam() 

    /**
     * Returns the value of field 'accuracy'. The field 'accuracy'
     * has the following description: Base mass accuracy. This is
     * defined in m/z units. This element hold the full scan
     * accuracy if variable accuracy is used or not otherwise
     * specified in the acquisition section.
     * 
     * @return the value of field 'accuracy'.
     */
    public float getAccuracy()
    {
        return this._accuracy;
    } //-- float getAccuracy() 

    /**
     * Method getInstParam
     * 
     * @param index
     */
    public org.psi.ms.model.InstParam getInstParam(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _instParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.InstParam) _instParamList.elementAt(index);
    } //-- org.psi.ms.model.InstParam getInstParam(int) 

    /**
     * Method getInstParam
     */
    public org.psi.ms.model.InstParam[] getInstParam()
    {
        int size = _instParamList.size();
        org.psi.ms.model.InstParam[] mArray = new org.psi.ms.model.InstParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.InstParam) _instParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.InstParam[] getInstParam() 

    /**
     * Method getInstParamCount
     */
    public int getInstParamCount()
    {
        return _instParamList.size();
    } //-- int getInstParamCount() 

    /**
     * Method getInstUserParam
     * 
     * @param index
     */
    public org.psi.ms.model.InstUserParam getInstUserParam(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _instUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.InstUserParam) _instUserParamList.elementAt(index);
    } //-- org.psi.ms.model.InstUserParam getInstUserParam(int) 

    /**
     * Method getInstUserParam
     */
    public org.psi.ms.model.InstUserParam[] getInstUserParam()
    {
        int size = _instUserParamList.size();
        org.psi.ms.model.InstUserParam[] mArray = new org.psi.ms.model.InstUserParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.InstUserParam) _instUserParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.InstUserParam[] getInstUserParam() 

    /**
     * Method getInstUserParamCount
     */
    public int getInstUserParamCount()
    {
        return _instUserParamList.size();
    } //-- int getInstUserParamCount() 

    /**
     * Returns the value of field 'resolution'. The field
     * 'resolution' has the following description: Base mass
     * analyzer resolution. This is defined as full peak width at
     * half maximum intensity divided by mass. This paramter should
     * hold the full scan resolution if variable resolution is
     * used, or if not otherwise specified in the acquisition
     * section.
     * 
     * @return the value of field 'resolution'.
     */
    public float getResolution()
    {
        return this._resolution;
    } //-- float getResolution() 

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Mass analyzer type (controlled)
     * 
     * @return the value of field 'type'.
     */
    public org.psi.ms.model.types.AnalyzerTypeTypeType getType()
    {
        return this._type;
    } //-- org.psi.ms.model.types.AnalyzerTypeTypeType getType() 

    /**
     * Method hasAccuracy
     */
    public boolean hasAccuracy()
    {
        return this._has_accuracy;
    } //-- boolean hasAccuracy() 

    /**
     * Method hasResolution
     */
    public boolean hasResolution()
    {
        return this._has_resolution;
    } //-- boolean hasResolution() 

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
     * Method removeAllInstParam
     */
    public void removeAllInstParam()
    {
        _instParamList.removeAllElements();
    } //-- void removeAllInstParam() 

    /**
     * Method removeAllInstUserParam
     */
    public void removeAllInstUserParam()
    {
        _instUserParamList.removeAllElements();
    } //-- void removeAllInstUserParam() 

    /**
     * Method removeInstParam
     * 
     * @param index
     */
    public org.psi.ms.model.InstParam removeInstParam(int index)
    {
        java.lang.Object obj = _instParamList.elementAt(index);
        _instParamList.removeElementAt(index);
        return (org.psi.ms.model.InstParam) obj;
    } //-- org.psi.ms.model.InstParam removeInstParam(int) 

    /**
     * Method removeInstUserParam
     * 
     * @param index
     */
    public org.psi.ms.model.InstUserParam removeInstUserParam(int index)
    {
        java.lang.Object obj = _instUserParamList.elementAt(index);
        _instUserParamList.removeElementAt(index);
        return (org.psi.ms.model.InstUserParam) obj;
    } //-- org.psi.ms.model.InstUserParam removeInstUserParam(int) 

    /**
     * Sets the value of field 'accuracy'. The field 'accuracy' has
     * the following description: Base mass accuracy. This is
     * defined in m/z units. This element hold the full scan
     * accuracy if variable accuracy is used or not otherwise
     * specified in the acquisition section.
     * 
     * @param accuracy the value of field 'accuracy'.
     */
    public void setAccuracy(float accuracy)
    {
        this._accuracy = accuracy;
        this._has_accuracy = true;
    } //-- void setAccuracy(float) 

    /**
     * Method setInstParam
     * 
     * @param index
     * @param vInstParam
     */
    public void setInstParam(int index, org.psi.ms.model.InstParam vInstParam)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _instParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _instParamList.setElementAt(vInstParam, index);
    } //-- void setInstParam(int, org.psi.ms.model.InstParam) 

    /**
     * Method setInstParam
     * 
     * @param instParamArray
     */
    public void setInstParam(org.psi.ms.model.InstParam[] instParamArray)
    {
        //-- copy array
        _instParamList.removeAllElements();
        for (int i = 0; i < instParamArray.length; i++) {
            _instParamList.addElement(instParamArray[i]);
        }
    } //-- void setInstParam(org.psi.ms.model.InstParam) 

    /**
     * Method setInstUserParam
     * 
     * @param index
     * @param vInstUserParam
     */
    public void setInstUserParam(int index, org.psi.ms.model.InstUserParam vInstUserParam)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _instUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _instUserParamList.setElementAt(vInstUserParam, index);
    } //-- void setInstUserParam(int, org.psi.ms.model.InstUserParam) 

    /**
     * Method setInstUserParam
     * 
     * @param instUserParamArray
     */
    public void setInstUserParam(org.psi.ms.model.InstUserParam[] instUserParamArray)
    {
        //-- copy array
        _instUserParamList.removeAllElements();
        for (int i = 0; i < instUserParamArray.length; i++) {
            _instUserParamList.addElement(instUserParamArray[i]);
        }
    } //-- void setInstUserParam(org.psi.ms.model.InstUserParam) 

    /**
     * Sets the value of field 'resolution'. The field 'resolution'
     * has the following description: Base mass analyzer
     * resolution. This is defined as full peak width at half
     * maximum intensity divided by mass. This paramter should hold
     * the full scan resolution if variable resolution is used, or
     * if not otherwise specified in the acquisition section.
     * 
     * @param resolution the value of field 'resolution'.
     */
    public void setResolution(float resolution)
    {
        this._resolution = resolution;
        this._has_resolution = true;
    } //-- void setResolution(float) 

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Mass analyzer type (controlled)
     * 
     * @param type the value of field 'type'.
     */
    public void setType(org.psi.ms.model.types.AnalyzerTypeTypeType type)
    {
        this._type = type;
    } //-- void setType(org.psi.ms.model.types.AnalyzerTypeTypeType) 

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
