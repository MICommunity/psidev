/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: InstrumentCommonSettingsType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class InstrumentCommonSettingsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Descriptive name of the instrument
     */
    private java.lang.String _instName;

    /**
     * Invariant ion source information
     */
    private org.psi.ms.model.Source _source;

    /**
     * Mass analyzer information 
     */
    private org.psi.ms.model.Analyzer _analyzer;

    /**
     * Detection information
     */
    private org.psi.ms.model.Detector _detector;

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

    public InstrumentCommonSettingsType() {
        super();
        _instParamList = new Vector();
        _instUserParamList = new Vector();
    } //-- org.psi.ms.model.InstrumentCommonSettingsType()


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
     * Returns the value of field 'analyzer'. The field 'analyzer'
     * has the following description: Mass analyzer information 
     * 
     * @return the value of field 'analyzer'.
     */
    public org.psi.ms.model.Analyzer getAnalyzer()
    {
        return this._analyzer;
    } //-- org.psi.ms.model.Analyzer getAnalyzer() 

    /**
     * Returns the value of field 'detector'. The field 'detector'
     * has the following description: Detection information
     * 
     * @return the value of field 'detector'.
     */
    public org.psi.ms.model.Detector getDetector()
    {
        return this._detector;
    } //-- org.psi.ms.model.Detector getDetector() 

    /**
     * Returns the value of field 'instName'. The field 'instName'
     * has the following description: Descriptive name of the
     * instrument
     * 
     * @return the value of field 'instName'.
     */
    public java.lang.String getInstName()
    {
        return this._instName;
    } //-- java.lang.String getInstName() 

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
     * Returns the value of field 'source'. The field 'source' has
     * the following description: Invariant ion source information
     * 
     * @return the value of field 'source'.
     */
    public org.psi.ms.model.Source getSource()
    {
        return this._source;
    } //-- org.psi.ms.model.Source getSource() 

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
     * Sets the value of field 'analyzer'. The field 'analyzer' has
     * the following description: Mass analyzer information 
     * 
     * @param analyzer the value of field 'analyzer'.
     */
    public void setAnalyzer(org.psi.ms.model.Analyzer analyzer)
    {
        this._analyzer = analyzer;
    } //-- void setAnalyzer(org.psi.ms.model.Analyzer) 

    /**
     * Sets the value of field 'detector'. The field 'detector' has
     * the following description: Detection information
     * 
     * @param detector the value of field 'detector'.
     */
    public void setDetector(org.psi.ms.model.Detector detector)
    {
        this._detector = detector;
    } //-- void setDetector(org.psi.ms.model.Detector) 

    /**
     * Sets the value of field 'instName'. The field 'instName' has
     * the following description: Descriptive name of the
     * instrument
     * 
     * @param instName the value of field 'instName'.
     */
    public void setInstName(java.lang.String instName)
    {
        this._instName = instName;
    } //-- void setInstName(java.lang.String) 

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
     * Sets the value of field 'source'. The field 'source' has the
     * following description: Invariant ion source information
     * 
     * @param source the value of field 'source'.
     */
    public void setSource(org.psi.ms.model.Source source)
    {
        this._source = source;
    } //-- void setSource(org.psi.ms.model.Source) 

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
