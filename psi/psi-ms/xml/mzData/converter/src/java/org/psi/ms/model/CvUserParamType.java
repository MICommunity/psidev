/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: CvUserParamType.java,v 1.6 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/


/**
 * Data type for user parameters with or without xref numbers
 * (uncontrolled vocabulary)
 *
 * @version $Revision: 1.6 $ $Date: 2004/01/14 15:57:36 $
 */
public abstract class CvUserParamType extends CvCoreParamType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/


    //----------------/
    //- Constructors -/
    //----------------/

    public CvUserParamType() {
        super();
    } //-- org.psi.ms.model.CvUserParamType()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method deleteXref
     */
    public void deleteXref() {
        this._xref = -1;
    } //-- void deleteXref()

    /**
     * Method hasXref
     */
    public boolean hasXref() {
        return this._xref == -1;
    } //-- boolean hasXref()

}
