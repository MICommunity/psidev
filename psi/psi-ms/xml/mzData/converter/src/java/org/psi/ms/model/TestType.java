/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: TestType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class TestType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public abstract class TestType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * This element stores information about how the instance XML
     * document was generated.
     */
    private java.util.Vector _dataProcessingList;

    /**
     * Description of the peak processing method. This element
     * describes the base method used if a variable method is used
     * or not otherwise specified in the acquisition section.
     */
    private org.psi.ms.model.ProcessingMethod _processingMethod;

    /**
     * This element holds additional data or annotation
     * information. Only controlled name values are allowed here.
     */
    private java.util.Vector _testParamList;

    /**
     * This element holds additional data or annotation
     * information. Uncontrolled, or user controlled name values
     * are allowed here.
     */
    private java.util.Vector _testUserParamList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TestType() {
        super();
        _dataProcessingList = new Vector();
        _testParamList = new Vector();
        _testUserParamList = new Vector();
    } //-- org.psi.ms.model.TestType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addDataProcessing
     * 
     * @param vDataProcessing
     */
    public void addDataProcessing(org.psi.ms.model.DataProcessing vDataProcessing)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataProcessingList.addElement(vDataProcessing);
    } //-- void addDataProcessing(org.psi.ms.model.DataProcessing) 

    /**
     * Method addDataProcessing
     * 
     * @param index
     * @param vDataProcessing
     */
    public void addDataProcessing(int index, org.psi.ms.model.DataProcessing vDataProcessing)
        throws java.lang.IndexOutOfBoundsException
    {
        _dataProcessingList.insertElementAt(vDataProcessing, index);
    } //-- void addDataProcessing(int, org.psi.ms.model.DataProcessing) 

    /**
     * Method addTestParam
     * 
     * @param vTestParam
     */
    public void addTestParam(org.psi.ms.model.TestParam vTestParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _testParamList.addElement(vTestParam);
    } //-- void addTestParam(org.psi.ms.model.TestParam) 

    /**
     * Method addTestParam
     * 
     * @param index
     * @param vTestParam
     */
    public void addTestParam(int index, org.psi.ms.model.TestParam vTestParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _testParamList.insertElementAt(vTestParam, index);
    } //-- void addTestParam(int, org.psi.ms.model.TestParam) 

    /**
     * Method addTestUserParam
     * 
     * @param vTestUserParam
     */
    public void addTestUserParam(org.psi.ms.model.TestUserParam vTestUserParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _testUserParamList.addElement(vTestUserParam);
    } //-- void addTestUserParam(org.psi.ms.model.TestUserParam) 

    /**
     * Method addTestUserParam
     * 
     * @param index
     * @param vTestUserParam
     */
    public void addTestUserParam(int index, org.psi.ms.model.TestUserParam vTestUserParam)
        throws java.lang.IndexOutOfBoundsException
    {
        _testUserParamList.insertElementAt(vTestUserParam, index);
    } //-- void addTestUserParam(int, org.psi.ms.model.TestUserParam) 

    /**
     * Method enumerateDataProcessing
     */
    public java.util.Enumeration enumerateDataProcessing()
    {
        return _dataProcessingList.elements();
    } //-- java.util.Enumeration enumerateDataProcessing() 

    /**
     * Method enumerateTestParam
     */
    public java.util.Enumeration enumerateTestParam()
    {
        return _testParamList.elements();
    } //-- java.util.Enumeration enumerateTestParam() 

    /**
     * Method enumerateTestUserParam
     */
    public java.util.Enumeration enumerateTestUserParam()
    {
        return _testUserParamList.elements();
    } //-- java.util.Enumeration enumerateTestUserParam() 

    /**
     * Method getDataProcessing
     * 
     * @param index
     */
    public org.psi.ms.model.DataProcessing getDataProcessing(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataProcessingList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.DataProcessing) _dataProcessingList.elementAt(index);
    } //-- org.psi.ms.model.DataProcessing getDataProcessing(int) 

    /**
     * Method getDataProcessing
     */
    public org.psi.ms.model.DataProcessing[] getDataProcessing()
    {
        int size = _dataProcessingList.size();
        org.psi.ms.model.DataProcessing[] mArray = new org.psi.ms.model.DataProcessing[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.DataProcessing) _dataProcessingList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.DataProcessing[] getDataProcessing() 

    /**
     * Method getDataProcessingCount
     */
    public int getDataProcessingCount()
    {
        return _dataProcessingList.size();
    } //-- int getDataProcessingCount() 

    /**
     * Returns the value of field 'processingMethod'. The field
     * 'processingMethod' has the following description:
     * Description of the peak processing method. This element
     * describes the base method used if a variable method is used
     * or not otherwise specified in the acquisition section.
     * 
     * @return the value of field 'processingMethod'.
     */
    public org.psi.ms.model.ProcessingMethod getProcessingMethod()
    {
        return this._processingMethod;
    } //-- org.psi.ms.model.ProcessingMethod getProcessingMethod() 

    /**
     * Method getTestParam
     * 
     * @param index
     */
    public org.psi.ms.model.TestParam getTestParam(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _testParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.TestParam) _testParamList.elementAt(index);
    } //-- org.psi.ms.model.TestParam getTestParam(int) 

    /**
     * Method getTestParam
     */
    public org.psi.ms.model.TestParam[] getTestParam()
    {
        int size = _testParamList.size();
        org.psi.ms.model.TestParam[] mArray = new org.psi.ms.model.TestParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.TestParam) _testParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.TestParam[] getTestParam() 

    /**
     * Method getTestParamCount
     */
    public int getTestParamCount()
    {
        return _testParamList.size();
    } //-- int getTestParamCount() 

    /**
     * Method getTestUserParam
     * 
     * @param index
     */
    public org.psi.ms.model.TestUserParam getTestUserParam(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _testUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (org.psi.ms.model.TestUserParam) _testUserParamList.elementAt(index);
    } //-- org.psi.ms.model.TestUserParam getTestUserParam(int) 

    /**
     * Method getTestUserParam
     */
    public org.psi.ms.model.TestUserParam[] getTestUserParam()
    {
        int size = _testUserParamList.size();
        org.psi.ms.model.TestUserParam[] mArray = new org.psi.ms.model.TestUserParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (org.psi.ms.model.TestUserParam) _testUserParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.TestUserParam[] getTestUserParam() 

    /**
     * Method getTestUserParamCount
     */
    public int getTestUserParamCount()
    {
        return _testUserParamList.size();
    } //-- int getTestUserParamCount() 

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
     * Method removeAllDataProcessing
     */
    public void removeAllDataProcessing()
    {
        _dataProcessingList.removeAllElements();
    } //-- void removeAllDataProcessing() 

    /**
     * Method removeAllTestParam
     */
    public void removeAllTestParam()
    {
        _testParamList.removeAllElements();
    } //-- void removeAllTestParam() 

    /**
     * Method removeAllTestUserParam
     */
    public void removeAllTestUserParam()
    {
        _testUserParamList.removeAllElements();
    } //-- void removeAllTestUserParam() 

    /**
     * Method removeDataProcessing
     * 
     * @param index
     */
    public org.psi.ms.model.DataProcessing removeDataProcessing(int index)
    {
        java.lang.Object obj = _dataProcessingList.elementAt(index);
        _dataProcessingList.removeElementAt(index);
        return (org.psi.ms.model.DataProcessing) obj;
    } //-- org.psi.ms.model.DataProcessing removeDataProcessing(int) 

    /**
     * Method removeTestParam
     * 
     * @param index
     */
    public org.psi.ms.model.TestParam removeTestParam(int index)
    {
        java.lang.Object obj = _testParamList.elementAt(index);
        _testParamList.removeElementAt(index);
        return (org.psi.ms.model.TestParam) obj;
    } //-- org.psi.ms.model.TestParam removeTestParam(int) 

    /**
     * Method removeTestUserParam
     * 
     * @param index
     */
    public org.psi.ms.model.TestUserParam removeTestUserParam(int index)
    {
        java.lang.Object obj = _testUserParamList.elementAt(index);
        _testUserParamList.removeElementAt(index);
        return (org.psi.ms.model.TestUserParam) obj;
    } //-- org.psi.ms.model.TestUserParam removeTestUserParam(int) 

    /**
     * Method setDataProcessing
     * 
     * @param index
     * @param vDataProcessing
     */
    public void setDataProcessing(int index, org.psi.ms.model.DataProcessing vDataProcessing)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _dataProcessingList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _dataProcessingList.setElementAt(vDataProcessing, index);
    } //-- void setDataProcessing(int, org.psi.ms.model.DataProcessing) 

    /**
     * Method setDataProcessing
     * 
     * @param dataProcessingArray
     */
    public void setDataProcessing(org.psi.ms.model.DataProcessing[] dataProcessingArray)
    {
        //-- copy array
        _dataProcessingList.removeAllElements();
        for (int i = 0; i < dataProcessingArray.length; i++) {
            _dataProcessingList.addElement(dataProcessingArray[i]);
        }
    } //-- void setDataProcessing(org.psi.ms.model.DataProcessing) 

    /**
     * Sets the value of field 'processingMethod'. The field
     * 'processingMethod' has the following description:
     * Description of the peak processing method. This element
     * describes the base method used if a variable method is used
     * or not otherwise specified in the acquisition section.
     * 
     * @param processingMethod the value of field 'processingMethod'
     */
    public void setProcessingMethod(org.psi.ms.model.ProcessingMethod processingMethod)
    {
        this._processingMethod = processingMethod;
    } //-- void setProcessingMethod(org.psi.ms.model.ProcessingMethod) 

    /**
     * Method setTestParam
     * 
     * @param index
     * @param vTestParam
     */
    public void setTestParam(int index, org.psi.ms.model.TestParam vTestParam)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _testParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _testParamList.setElementAt(vTestParam, index);
    } //-- void setTestParam(int, org.psi.ms.model.TestParam) 

    /**
     * Method setTestParam
     * 
     * @param testParamArray
     */
    public void setTestParam(org.psi.ms.model.TestParam[] testParamArray)
    {
        //-- copy array
        _testParamList.removeAllElements();
        for (int i = 0; i < testParamArray.length; i++) {
            _testParamList.addElement(testParamArray[i]);
        }
    } //-- void setTestParam(org.psi.ms.model.TestParam) 

    /**
     * Method setTestUserParam
     * 
     * @param index
     * @param vTestUserParam
     */
    public void setTestUserParam(int index, org.psi.ms.model.TestUserParam vTestUserParam)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _testUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _testUserParamList.setElementAt(vTestUserParam, index);
    } //-- void setTestUserParam(int, org.psi.ms.model.TestUserParam) 

    /**
     * Method setTestUserParam
     * 
     * @param testUserParamArray
     */
    public void setTestUserParam(org.psi.ms.model.TestUserParam[] testUserParamArray)
    {
        //-- copy array
        _testUserParamList.removeAllElements();
        for (int i = 0; i < testUserParamArray.length; i++) {
            _testUserParamList.addElement(testUserParamArray[i]);
        }
    } //-- void setTestUserParam(org.psi.ms.model.TestUserParam) 

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
