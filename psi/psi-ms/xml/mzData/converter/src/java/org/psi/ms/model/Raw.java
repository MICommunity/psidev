/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Raw.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * This is the actual peak list data. All that is stored here is
 * the actual data, all descriptive information is in the desc
 * section.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
 */
public class Raw implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * List of acquisitions.
     */
    private org.psi.ms.model.AcquisitionList _acquisitionList;

    /**
     * List of supplemental data arrays
     */
    private org.psi.ms.model.SupplementList _supplementList;


    //----------------/
    //- Constructors -/
    //----------------/

    public Raw() {
        super();
    } //-- org.psi.ms.model.Raw()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     *
     * @return the value of field 'acquisitionList'.
     */
    public org.psi.ms.model.AcquisitionList getAcquisitionList() {
        return this._acquisitionList;
    } //-- org.psi.ms.model.AcquisitionList getAcquisitionList()

    /**
     * Returns the value of field 'supplementList'. The field
     * 'supplementList' has the following description: List of
     * supplemental data arrays
     *
     * @return the value of field 'supplementList'.
     */
    public org.psi.ms.model.SupplementList getSupplementList() {
        return this._supplementList;
    } //-- org.psi.ms.model.SupplementList getSupplementList()

    /**
     * Sets the value of field 'acquisitionList'. The field
     * 'acquisitionList' has the following description: List of
     * acquisitions.
     *
     * @param acquisitionList the value of field 'acquisitionList'.
     */
    public void setAcquisitionList(org.psi.ms.model.AcquisitionList acquisitionList) {
        this._acquisitionList = acquisitionList;
    } //-- void setAcquisitionList(org.psi.ms.model.AcquisitionList)

    /**
     * Sets the value of field 'supplementList'. The field
     * 'supplementList' has the following description: List of
     * supplemental data arrays
     *
     * @param supplementList the value of field 'supplementList'.
     */
    public void setSupplementList(org.psi.ms.model.SupplementList supplementList) {
        this._supplementList = supplementList;
    } //-- void setSupplementList(org.psi.ms.model.SupplementList)

}
