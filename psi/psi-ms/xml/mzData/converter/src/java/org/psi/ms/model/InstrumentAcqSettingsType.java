/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: InstrumentAcqSettingsType.java,v 1.1 2003/08/11 17:29:59 krunte Exp $
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
import org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType;
import org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType;

/**
 * Class InstrumentAcqSettingsType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:29:59 $
 */
public abstract class InstrumentAcqSettingsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Type of acquisition represented by the peak list (controlled)
     */
    private org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType _acqType;

    /**
     * Number of stages of mass spectrometry performed to generate
     * the peak list (MS^n).
     */
    private int _msLevel;

    /**
     * keeps track of state for field: _msLevel
     */
    private boolean _has_msLevel;

    /**
     * Polarity of the ionization/mass analyzer (controlled).
     */
    private org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType _polarity;

    /**
     * Range in m/z units of the mass analysis.
     */
    private org.psi.ms.model.MzRange _mzRange;

    /**
     * This element holds additional data or annotation
     * information. It is named, has a value and optionally a
     * description.
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

    public InstrumentAcqSettingsType() {
        super();
        _instParamList = new Vector();
        _instUserParamList = new Vector();
    } //-- org.psi.ms.model.InstrumentAcqSettingsType()


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
     * Returns the value of field 'acqType'. The field 'acqType'
     * has the following description: Type of acquisition
     * represented by the peak list (controlled).
     * 
     * @return the value of field 'acqType'.
     */
    public org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType getAcqType()
    {
        return this._acqType;
    } //-- org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType getAcqType() 

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
     * Returns the value of field 'msLevel'. The field 'msLevel'
     * has the following description: Number of stages of mass
     * spectrometry performed to generate the peak list (MS^n).
     * 
     * @return the value of field 'msLevel'.
     */
    public int getMsLevel()
    {
        return this._msLevel;
    } //-- int getMsLevel() 

    /**
     * Returns the value of field 'mzRange'. The field 'mzRange'
     * has the following description: Range in m/z units of the
     * mass analysis.
     * 
     * @return the value of field 'mzRange'.
     */
    public org.psi.ms.model.MzRange getMzRange()
    {
        return this._mzRange;
    } //-- org.psi.ms.model.MzRange getMzRange() 

    /**
     * Returns the value of field 'polarity'. The field 'polarity'
     * has the following description: Polarity of the
     * ionization/mass analyzer (controlled).
     * 
     * @return the value of field 'polarity'.
     */
    public org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType getPolarity()
    {
        return this._polarity;
    } //-- org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType getPolarity() 

    /**
     * Method hasMsLevel
     */
    public boolean hasMsLevel()
    {
        return this._has_msLevel;
    } //-- boolean hasMsLevel() 

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
     * Sets the value of field 'acqType'. The field 'acqType' has
     * the following description: Type of acquisition represented
     * by the peak list (controlled).
     * 
     * @param acqType the value of field 'acqType'.
     */
    public void setAcqType(org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType acqType)
    {
        this._acqType = acqType;
    } //-- void setAcqType(org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType) 

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
     * Sets the value of field 'msLevel'. The field 'msLevel' has
     * the following description: Number of stages of mass
     * spectrometry performed to generate the peak list (MS^n).
     * 
     * @param msLevel the value of field 'msLevel'.
     */
    public void setMsLevel(int msLevel)
    {
        this._msLevel = msLevel;
        this._has_msLevel = true;
    } //-- void setMsLevel(int) 

    /**
     * Sets the value of field 'mzRange'. The field 'mzRange' has
     * the following description: Range in m/z units of the mass
     * analysis.
     * 
     * @param mzRange the value of field 'mzRange'.
     */
    public void setMzRange(org.psi.ms.model.MzRange mzRange)
    {
        this._mzRange = mzRange;
    } //-- void setMzRange(org.psi.ms.model.MzRange) 

    /**
     * Sets the value of field 'polarity'. The field 'polarity' has
     * the following description: Polarity of the ionization/mass
     * analyzer (controlled).
     * 
     * @param polarity the value of field 'polarity'.
     */
    public void setPolarity(org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType polarity)
    {
        this._polarity = polarity;
    } //-- void setPolarity(org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType) 

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
