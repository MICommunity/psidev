/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Test.java,v 1.5 2003/11/14 16:49:30 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * Experimental information regarding the test which resulted in
 * this data set.
 *
 * @version $Revision: 1.5 $ $Date: 2003/11/14 16:49:30 $
 */
public class Test implements java.io.Serializable {
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
    private ProcessingMethod _processingMethod;
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

    public Test() {
        super();
        _dataProcessingList = new Vector();
        _testParamList = new Vector();
        _testUserParamList = new Vector();

        DataProcessing dataProcessing = new DataProcessing();
        addDataProcessing(dataProcessing);

        Software software = new Software();
        software.setName("PSI-MS .dta/.zta converter");
        software.setVersion("1.00");
        dataProcessing.setSoftware(software);
    } //-- org.psi.ms.model.Test()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addDataProcessing
     *
     * @param vDataProcessing
     */
    public void addDataProcessing(DataProcessing vDataProcessing)
            throws IndexOutOfBoundsException {
        _dataProcessingList.addElement(vDataProcessing);
    } //-- void addDataProcessing(org.psi.ms.model.DataProcessing)

    /**
     * Method addDataProcessing
     *
     * @param index
     * @param vDataProcessing
     */
    public void addDataProcessing(int index, DataProcessing vDataProcessing)
            throws IndexOutOfBoundsException {
        _dataProcessingList.insertElementAt(vDataProcessing, index);
    } //-- void addDataProcessing(int, org.psi.ms.model.DataProcessing)

    /**
     * Method addTestParam
     *
     * @param vTestParam
     */
    public void addTestParam(TestParam vTestParam)
            throws IndexOutOfBoundsException {
        _testParamList.addElement(vTestParam);
    } //-- void addTestParam(org.psi.ms.model.TestParam)

    /**
     * Method addTestParam
     *
     * @param index
     * @param vTestParam
     */
    public void addTestParam(int index, TestParam vTestParam)
            throws IndexOutOfBoundsException {
        _testParamList.insertElementAt(vTestParam, index);
    } //-- void addTestParam(int, org.psi.ms.model.TestParam)

    /**
     * Method addTestUserParam
     *
     * @param vTestUserParam
     */
    public void addTestUserParam(TestUserParam vTestUserParam)
            throws IndexOutOfBoundsException {
        _testUserParamList.addElement(vTestUserParam);
    } //-- void addTestUserParam(org.psi.ms.model.TestUserParam)

    /**
     * Method addTestUserParam
     *
     * @param index
     * @param vTestUserParam
     */
    public void addTestUserParam(int index, TestUserParam vTestUserParam)
            throws IndexOutOfBoundsException {
        _testUserParamList.insertElementAt(vTestUserParam, index);
    } //-- void addTestUserParam(int, org.psi.ms.model.TestUserParam)

    /**
     * Method enumerateDataProcessing
     */
    public java.util.Enumeration enumerateDataProcessing() {
        return _dataProcessingList.elements();
    } //-- java.util.Enumeration enumerateDataProcessing()

    /**
     * Method enumerateTestParam
     */
    public java.util.Enumeration enumerateTestParam() {
        return _testParamList.elements();
    } //-- java.util.Enumeration enumerateTestParam()

    /**
     * Method enumerateTestUserParam
     */
    public java.util.Enumeration enumerateTestUserParam() {
        return _testUserParamList.elements();
    } //-- java.util.Enumeration enumerateTestUserParam()

    /**
     * Method getDataProcessing
     *
     * @param index
     */
    public DataProcessing getDataProcessing(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _dataProcessingList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (DataProcessing) _dataProcessingList.elementAt(index);
    } //-- org.psi.ms.model.DataProcessing getDataProcessing(int)

    /**
     * Method getDataProcessing
     */
    public DataProcessing[] getDataProcessing() {
        int size = _dataProcessingList.size();
        DataProcessing[] mArray = new DataProcessing[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (DataProcessing) _dataProcessingList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.DataProcessing[] getDataProcessing()

    /**
     * Method getDataProcessingCount
     */
    public int getDataProcessingCount() {
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
    public ProcessingMethod getProcessingMethod() {
        if (_processingMethod == null)
            _processingMethod = new ProcessingMethod();
        return this._processingMethod;
    } //-- org.psi.ms.model.ProcessingMethod getProcessingMethod()

    /**
     * Method getTestParam
     *
     * @param index
     */
    public TestParam getTestParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _testParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (TestParam) _testParamList.elementAt(index);
    } //-- org.psi.ms.model.TestParam getTestParam(int)

    /**
     * Method getTestParam
     */
    public TestParam[] getTestParam() {
        int size = _testParamList.size();
        TestParam[] mArray = new TestParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (TestParam) _testParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.TestParam[] getTestParam()

    /**
     * Method getTestParamCount
     */
    public int getTestParamCount() {
        return _testParamList.size();
    } //-- int getTestParamCount()

    /**
     * Method getTestUserParam
     *
     * @param index
     */
    public TestUserParam getTestUserParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _testUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (TestUserParam) _testUserParamList.elementAt(index);
    } //-- org.psi.ms.model.TestUserParam getTestUserParam(int)

    /**
     * Method getTestUserParam
     */
    public TestUserParam[] getTestUserParam() {
        int size = _testUserParamList.size();
        TestUserParam[] mArray = new TestUserParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (TestUserParam) _testUserParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.TestUserParam[] getTestUserParam()

    /**
     * Method getTestUserParamCount
     */
    public int getTestUserParamCount() {
        return _testUserParamList.size();
    } //-- int getTestUserParamCount()

    /**
     * Method removeAllDataProcessing
     */
    public void removeAllDataProcessing() {
        _dataProcessingList.removeAllElements();
    } //-- void removeAllDataProcessing()

    /**
     * Method removeAllTestParam
     */
    public void removeAllTestParam() {
        _testParamList.removeAllElements();
    } //-- void removeAllTestParam()

    /**
     * Method removeAllTestUserParam
     */
    public void removeAllTestUserParam() {
        _testUserParamList.removeAllElements();
    } //-- void removeAllTestUserParam()

    /**
     * Method removeDataProcessing
     *
     * @param index
     */
    public DataProcessing removeDataProcessing(int index) {
        Object obj = _dataProcessingList.elementAt(index);
        _dataProcessingList.removeElementAt(index);
        return (DataProcessing) obj;
    } //-- org.psi.ms.model.DataProcessing removeDataProcessing(int)

    /**
     * Method removeTestParam
     *
     * @param index
     */
    public TestParam removeTestParam(int index) {
        Object obj = _testParamList.elementAt(index);
        _testParamList.removeElementAt(index);
        return (TestParam) obj;
    } //-- org.psi.ms.model.TestParam removeTestParam(int)

    /**
     * Method removeTestUserParam
     *
     * @param index
     */
    public TestUserParam removeTestUserParam(int index) {
        Object obj = _testUserParamList.elementAt(index);
        _testUserParamList.removeElementAt(index);
        return (TestUserParam) obj;
    } //-- org.psi.ms.model.TestUserParam removeTestUserParam(int)

    /**
     * Method setDataProcessing
     *
     * @param index
     * @param vDataProcessing
     */
    public void setDataProcessing(int index, DataProcessing vDataProcessing)
            throws IndexOutOfBoundsException {
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
    public void setDataProcessing(DataProcessing[] dataProcessingArray) {
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
    public void setProcessingMethod(ProcessingMethod processingMethod) {
        this._processingMethod = processingMethod;
    } //-- void setProcessingMethod(org.psi.ms.model.ProcessingMethod)

    /**
     * Method setTestParam
     *
     * @param index
     * @param vTestParam
     */
    public void setTestParam(int index, TestParam vTestParam)
            throws IndexOutOfBoundsException {
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
    public void setTestParam(TestParam[] testParamArray) {
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
    public void setTestUserParam(int index, TestUserParam vTestUserParam)
            throws IndexOutOfBoundsException {
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
    public void setTestUserParam(TestUserParam[] testUserParamArray) {
        //-- copy array
        _testUserParamList.removeAllElements();
        for (int i = 0; i < testUserParamArray.length; i++) {
            _testUserParamList.addElement(testUserParamArray[i]);
        }
    } //-- void setTestUserParam(org.psi.ms.model.TestUserParam)

}
