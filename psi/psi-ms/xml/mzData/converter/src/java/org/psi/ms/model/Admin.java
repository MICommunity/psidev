/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Admin.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * Administrative information pertaining to the entire data set is
 * stored here.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
 */
public class Admin implements java.io.Serializable {
    /**
     * Field _sampleName
     */
    private String _sampleName;
    /**
     * Person person for this dataset.
     */
    private Person _contact;
    /**
     * Information about the original source file used to generate
     * the instance document.
     */
    private java.util.Vector _sourceFileList;


    //----------------/
    //- Constructors -/
    //----------------/

    public Admin() {
        super();
        _sourceFileList = new Vector();
    } //-- org.psi.ms.model.Admin()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addSourceFile
     *
     * @param vSourceFile
     */
    public void addSourceFile(SourceFile vSourceFile)
            throws IndexOutOfBoundsException {
        _sourceFileList.addElement(vSourceFile);
    } //-- void addSourceFile(org.psi.ms.model.SourceFile)

    /**
     * Method addSourceFile
     *
     * @param index
     * @param vSourceFile
     */
    public void addSourceFile(int index, SourceFile vSourceFile)
            throws IndexOutOfBoundsException {
        _sourceFileList.insertElementAt(vSourceFile, index);
    } //-- void addSourceFile(int, org.psi.ms.model.SourceFile)

    /**
     * Method enumerateSourceFile
     */
    public java.util.Enumeration enumerateSourceFile() {
        return _sourceFileList.elements();
    } //-- java.util.Enumeration enumerateSourceFile()

    /**
     * Returns the value of field 'contact'. The field 'contact'
     * has the following description: Person person for this
     * dataset.
     *
     * @return the value of field 'contact'.
     */
    public Person getContact() {
        return this._contact;
    } //-- org.psi.ms.model.Person getContact()

    /**
     * Returns the value of field 'sampleName'.
     *
     * @return the value of field 'sampleName'.
     */
    public String getSampleName() {
        return this._sampleName;
    } //-- java.lang.String getSampleName()

    /**
     * Method getSourceFile
     *
     * @param index
     */
    public SourceFile getSourceFile(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _sourceFileList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (SourceFile) _sourceFileList.elementAt(index);
    } //-- org.psi.ms.model.SourceFile getSourceFile(int)

    /**
     * Method getSourceFile
     */
    public SourceFile[] getSourceFile() {
        int size = _sourceFileList.size();
        SourceFile[] mArray = new SourceFile[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (SourceFile) _sourceFileList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.SourceFile[] getSourceFile()

    /**
     * Method getSourceFileCount
     */
    public int getSourceFileCount() {
        return _sourceFileList.size();
    } //-- int getSourceFileCount()

    /**
     * Method removeAllSourceFile
     */
    public void removeAllSourceFile() {
        _sourceFileList.removeAllElements();
    } //-- void removeAllSourceFile()

    /**
     * Method removeSourceFile
     *
     * @param index
     */
    public SourceFile removeSourceFile(int index) {
        Object obj = _sourceFileList.elementAt(index);
        _sourceFileList.removeElementAt(index);
        return (SourceFile) obj;
    } //-- org.psi.ms.model.SourceFile removeSourceFile(int)

    /**
     * Sets the value of field 'contact'. The field 'contact' has
     * the following description: Person person for this dataset.
     *
     * @param contact the value of field 'contact'.
     */
    public void setContact(Person contact) {
        this._contact = contact;
    } //-- void setContact(org.psi.ms.model.Person)

    /**
     * Sets the value of field 'sampleName'.
     *
     * @param sampleName the value of field 'sampleName'.
     */
    public void setSampleName(String sampleName) {
        this._sampleName = sampleName;
    } //-- void setSampleName(java.lang.String)

    /**
     * Method setSourceFile
     *
     * @param index
     * @param vSourceFile
     */
    public void setSourceFile(int index, SourceFile vSourceFile)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _sourceFileList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _sourceFileList.setElementAt(vSourceFile, index);
    } //-- void setSourceFile(int, org.psi.ms.model.SourceFile)

    /**
     * Method setSourceFile
     *
     * @param sourceFileArray
     */
    public void setSourceFile(SourceFile[] sourceFileArray) {
        //-- copy array
        _sourceFileList.removeAllElements();
        for (int i = 0; i < sourceFileArray.length; i++) {
            _sourceFileList.addElement(sourceFileArray[i]);
        }
    } //-- void setSourceFile(org.psi.ms.model.SourceFile)

}
