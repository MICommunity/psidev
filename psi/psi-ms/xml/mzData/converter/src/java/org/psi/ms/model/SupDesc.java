/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SupDesc.java,v 1.4 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * There is one supDesc for each supplemental data entry below. The
 * ID attribute is keyed to the supplement ID below.
 *
 * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
 */
public class SupDesc implements java.io.Serializable {
    /**
     * Field _id
     */
    private int _id;
    /**
     * keeps track of state for field: _id
     */
    private boolean _has_id;
    /**
     * Name of supplemental data set.
     */
    private String _supDataName;
    /**
     * This element holds additional data or annotation
     * information. Only controlled name values are allowed here.
     */
    private java.util.Vector _supParamList;
    /**
     * This element holds additional data or annotation
     * information. Uncontrolled, or user controlled name values
     * are allowed here.
     */
    private java.util.Vector _supUserParamList;
    /**
     * Information about the original source file used to generate
     * the instance document.
     */
    private java.util.Vector _sourceFileList;
    /**
     * Comments regarding acquisition are captured as free text.
     */
    private java.util.Vector _commentList;


    //----------------/
    //- Constructors -/
    //----------------/

    public SupDesc() {
        super();
        _supParamList = new Vector();
        _supUserParamList = new Vector();
        _sourceFileList = new Vector();
        _commentList = new Vector();
    } //-- org.psi.ms.model.SupDesc()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addComment
     *
     * @param vComment
     */
    public void addComment(String vComment)
            throws IndexOutOfBoundsException {
        _commentList.addElement(vComment);
    } //-- void addComment(java.lang.String)

    /**
     * Method addComment
     *
     * @param index
     * @param vComment
     */
    public void addComment(int index, String vComment)
            throws IndexOutOfBoundsException {
        _commentList.insertElementAt(vComment, index);
    } //-- void addComment(int, java.lang.String)

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
     * Method addSupParam
     *
     * @param vSupParam
     */
    public void addSupParam(SupParam vSupParam)
            throws IndexOutOfBoundsException {
        _supParamList.addElement(vSupParam);
    } //-- void addSupParam(org.psi.ms.model.SupParam)

    /**
     * Method addSupParam
     *
     * @param index
     * @param vSupParam
     */
    public void addSupParam(int index, SupParam vSupParam)
            throws IndexOutOfBoundsException {
        _supParamList.insertElementAt(vSupParam, index);
    } //-- void addSupParam(int, org.psi.ms.model.SupParam)

    /**
     * Method addSupUserParam
     *
     * @param vSupUserParam
     */
    public void addSupUserParam(SupUserParam vSupUserParam)
            throws IndexOutOfBoundsException {
        _supUserParamList.addElement(vSupUserParam);
    } //-- void addSupUserParam(org.psi.ms.model.SupUserParam)

    /**
     * Method addSupUserParam
     *
     * @param index
     * @param vSupUserParam
     */
    public void addSupUserParam(int index, SupUserParam vSupUserParam)
            throws IndexOutOfBoundsException {
        _supUserParamList.insertElementAt(vSupUserParam, index);
    } //-- void addSupUserParam(int, org.psi.ms.model.SupUserParam)

    /**
     * Method enumerateComment
     */
    public java.util.Enumeration enumerateComment() {
        return _commentList.elements();
    } //-- java.util.Enumeration enumerateComment()

    /**
     * Method enumerateSourceFile
     */
    public java.util.Enumeration enumerateSourceFile() {
        return _sourceFileList.elements();
    } //-- java.util.Enumeration enumerateSourceFile()

    /**
     * Method enumerateSupParam
     */
    public java.util.Enumeration enumerateSupParam() {
        return _supParamList.elements();
    } //-- java.util.Enumeration enumerateSupParam()

    /**
     * Method enumerateSupUserParam
     */
    public java.util.Enumeration enumerateSupUserParam() {
        return _supUserParamList.elements();
    } //-- java.util.Enumeration enumerateSupUserParam()

    /**
     * Method getComment
     *
     * @param index
     */
    public String getComment(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _commentList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (String) _commentList.elementAt(index);
    } //-- java.lang.String getComment(int)

    /**
     * Method getComment
     */
    public String[] getComment() {
        int size = _commentList.size();
        String[] mArray = new String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String) _commentList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getComment()

    /**
     * Method getCommentCount
     */
    public int getCommentCount() {
        return _commentList.size();
    } //-- int getCommentCount()

    /**
     * Returns the value of field 'id'.
     *
     * @return the value of field 'id'.
     */
    public int getId() {
        return this._id;
    } //-- int getId()

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
     * Returns the value of field 'supDataName'. The field
     * 'supDataName' has the following description: Name of
     * supplemental data set.
     *
     * @return the value of field 'supDataName'.
     */
    public String getSupDataName() {
        return this._supDataName;
    } //-- java.lang.String getSupDataName()

    /**
     * Method getSupParam
     *
     * @param index
     */
    public SupParam getSupParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _supParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (SupParam) _supParamList.elementAt(index);
    } //-- org.psi.ms.model.SupParam getSupParam(int)

    /**
     * Method getSupParam
     */
    public SupParam[] getSupParam() {
        int size = _supParamList.size();
        SupParam[] mArray = new SupParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (SupParam) _supParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.SupParam[] getSupParam()

    /**
     * Method getSupParamCount
     */
    public int getSupParamCount() {
        return _supParamList.size();
    } //-- int getSupParamCount()

    /**
     * Method getSupUserParam
     *
     * @param index
     */
    public SupUserParam getSupUserParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _supUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (SupUserParam) _supUserParamList.elementAt(index);
    } //-- org.psi.ms.model.SupUserParam getSupUserParam(int)

    /**
     * Method getSupUserParam
     */
    public SupUserParam[] getSupUserParam() {
        int size = _supUserParamList.size();
        SupUserParam[] mArray = new SupUserParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (SupUserParam) _supUserParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.SupUserParam[] getSupUserParam()

    /**
     * Method getSupUserParamCount
     */
    public int getSupUserParamCount() {
        return _supUserParamList.size();
    } //-- int getSupUserParamCount()

    /**
     * Method hasId
     */
    public boolean hasId() {
        return this._has_id;
    } //-- boolean hasId()

    /**
     * Method removeAllComment
     */
    public void removeAllComment() {
        _commentList.removeAllElements();
    } //-- void removeAllComment()

    /**
     * Method removeAllSourceFile
     */
    public void removeAllSourceFile() {
        _sourceFileList.removeAllElements();
    } //-- void removeAllSourceFile()

    /**
     * Method removeAllSupParam
     */
    public void removeAllSupParam() {
        _supParamList.removeAllElements();
    } //-- void removeAllSupParam()

    /**
     * Method removeAllSupUserParam
     */
    public void removeAllSupUserParam() {
        _supUserParamList.removeAllElements();
    } //-- void removeAllSupUserParam()

    /**
     * Method removeComment
     *
     * @param index
     */
    public String removeComment(int index) {
        Object obj = _commentList.elementAt(index);
        _commentList.removeElementAt(index);
        return (String) obj;
    } //-- java.lang.String removeComment(int)

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
     * Method removeSupParam
     *
     * @param index
     */
    public SupParam removeSupParam(int index) {
        Object obj = _supParamList.elementAt(index);
        _supParamList.removeElementAt(index);
        return (SupParam) obj;
    } //-- org.psi.ms.model.SupParam removeSupParam(int)

    /**
     * Method removeSupUserParam
     *
     * @param index
     */
    public SupUserParam removeSupUserParam(int index) {
        Object obj = _supUserParamList.elementAt(index);
        _supUserParamList.removeElementAt(index);
        return (SupUserParam) obj;
    } //-- org.psi.ms.model.SupUserParam removeSupUserParam(int)

    /**
     * Method setComment
     *
     * @param index
     * @param vComment
     */
    public void setComment(int index, String vComment)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _commentList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _commentList.setElementAt(vComment, index);
    } //-- void setComment(int, java.lang.String)

    /**
     * Method setComment
     *
     * @param commentArray
     */
    public void setComment(String[] commentArray) {
        //-- copy array
        _commentList.removeAllElements();
        for (int i = 0; i < commentArray.length; i++) {
            _commentList.addElement(commentArray[i]);
        }
    } //-- void setComment(java.lang.String)

    /**
     * Sets the value of field 'id'.
     *
     * @param id the value of field 'id'.
     */
    public void setId(int id) {
        this._id = id;
        this._has_id = true;
    } //-- void setId(int)

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

    /**
     * Sets the value of field 'supDataName'. The field
     * 'supDataName' has the following description: Name of
     * supplemental data set.
     *
     * @param supDataName the value of field 'supDataName'.
     */
    public void setSupDataName(String supDataName) {
        this._supDataName = supDataName;
    } //-- void setSupDataName(java.lang.String)

    /**
     * Method setSupParam
     *
     * @param index
     * @param vSupParam
     */
    public void setSupParam(int index, SupParam vSupParam)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _supParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _supParamList.setElementAt(vSupParam, index);
    } //-- void setSupParam(int, org.psi.ms.model.SupParam)

    /**
     * Method setSupParam
     *
     * @param supParamArray
     */
    public void setSupParam(SupParam[] supParamArray) {
        //-- copy array
        _supParamList.removeAllElements();
        for (int i = 0; i < supParamArray.length; i++) {
            _supParamList.addElement(supParamArray[i]);
        }
    } //-- void setSupParam(org.psi.ms.model.SupParam)

    /**
     * Method setSupUserParam
     *
     * @param index
     * @param vSupUserParam
     */
    public void setSupUserParam(int index, SupUserParam vSupUserParam)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _supUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _supUserParamList.setElementAt(vSupUserParam, index);
    } //-- void setSupUserParam(int, org.psi.ms.model.SupUserParam)

    /**
     * Method setSupUserParam
     *
     * @param supUserParamArray
     */
    public void setSupUserParam(SupUserParam[] supUserParamArray) {
        //-- copy array
        _supUserParamList.removeAllElements();
        for (int i = 0; i < supUserParamArray.length; i++) {
            _supUserParamList.addElement(supUserParamArray[i]);
        }
    } //-- void setSupUserParam(org.psi.ms.model.SupUserParam)

}
