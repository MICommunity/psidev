/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataProcessing.java,v 1.5 2004/10/11 07:05:40 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Vector;

/**
 * This element stores information about how the instance XML
 * document was generated.
 *
 * @version $Revision: 1.5 $ $Date: 2004/10/11 07:05:40 $
 */
public class DataProcessing implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Specific information on the conversion or processing software
     */
    private org.psi.ms.model.Software software;

    /**
     * Comments regarding data processing are captured as free text.
     */
    private java.util.Vector commentList;


    //----------------/
    //- Constructors -/
    //----------------/

    public DataProcessing() {
        super();
        commentList = new Vector();
    } //-- org.psi.ms.model.DataProcessing()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addComment
     *
     * @param vComment
     */
    public void addComment(java.lang.String vComment)
            throws java.lang.IndexOutOfBoundsException {
        commentList.addElement(vComment);
    } //-- void addComment(java.lang.String)

    /**
     * Method addComment
     *
     * @param index
     * @param vComment
     */
    public void addComment(int index, java.lang.String vComment)
            throws java.lang.IndexOutOfBoundsException {
        commentList.insertElementAt(vComment, index);
    } //-- void addComment(int, java.lang.String)

    /**
     * Method enumerateComment
     */
    public java.util.Enumeration enumerateComment() {
        return commentList.elements();
    } //-- java.util.Enumeration enumerateComment()

    /**
     * Method getComment
     *
     * @param index
     */
    public java.lang.String getComment(int index)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > commentList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (String) commentList.elementAt(index);
    } //-- java.lang.String getComment(int)

    /**
     * Method getComment
     */
    public java.lang.String[] getComment() {
        int size = commentList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String) commentList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getComment()

    /**
     * Method getCommentCount
     */
    public int getCommentCount() {
        return commentList.size();
    } //-- int getCommentCount()

    /**
     * Returns the value of field 'software'. The field 'software'
     * has the following description: Specific information on the
     * conversion or processing software.
     *
     * @return the value of field 'software'.
     */
    public org.psi.ms.model.Software getSoftware() {
        return this.software;
    } //-- org.psi.ms.model.Software getSoftware()

    /**
     * Method removeAllComment
     */
    public void removeAllComment() {
        commentList.removeAllElements();
    } //-- void removeAllComment()

    /**
     * Method removeComment
     *
     * @param index
     */
    public java.lang.String removeComment(int index) {
        java.lang.Object obj = commentList.elementAt(index);
        commentList.removeElementAt(index);
        return (String) obj;
    } //-- java.lang.String removeComment(int)

    /**
     * Method setComment
     *
     * @param index
     * @param vComment
     */
    public void setComment(int index, java.lang.String vComment)
            throws java.lang.IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > commentList.size())) {
            throw new IndexOutOfBoundsException();
        }
        commentList.setElementAt(vComment, index);
    } //-- void setComment(int, java.lang.String)

    /**
     * Method setComment
     *
     * @param commentArray
     */
    public void setComment(java.lang.String[] commentArray) {
        //-- copy array
        commentList.removeAllElements();
        for (int i = 0; i < commentArray.length; i++) {
            commentList.addElement(commentArray[i]);
        }
    } //-- void setComment(java.lang.String)

    /**
     * Sets the value of field 'software'. The field 'software' has
     * the following description: Specific information on the
     * conversion or processing software.
     *
     * @param software the value of field 'software'.
     */
    public void setSoftware(org.psi.ms.model.Software software) {
        this.software = software;
    } //-- void setSoftware(org.psi.ms.model.Software)

}
