/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Desc.java,v 1.4 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Each data set starts with a description section. Each
 * acquisition given in the 'raw' section has an entry in the
 * description section. This allows the desc section to be read and
 * then used to find specific entries in the raw section.
 *
 * @version $Revision: 1.4 $ $Date: 2003/08/28 15:17:12 $
 */
public class Desc implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Administrative information pertaining to the entire data set
     * is stored here.
     */
    private org.psi.ms.model.Admin _admin;

    /**
     * InstrumentCommonSettings information common to all acquisitions is stored
     * in this section.
     */
    private org.psi.ms.model.InstrumentCommonSettings _instrument;

    /**
     * Experimental information regarding the test which resulted
     * in this data set.
     */
    private org.psi.ms.model.Test _test;

    /**
     * List of descriptive information for each acquisition in the
     * raw section
     */
    private org.psi.ms.model.AcqDescList _acqDescList;

    /**
     * List of descriptive information for each supplemental data
     * entry in the raw section
     */
    private org.psi.ms.model.SupDescList _supDescList;


    //----------------/
    //- Constructors -/
    //----------------/

    public Desc() {
        super();
    } //-- org.psi.ms.model.Desc()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'acqDescList'. The field
     * 'acqDescList' has the following description: List of
     * descriptive information for each acquisition in the raw
     * section
     *
     * @return the value of field 'acqDescList'.
     */
    public org.psi.ms.model.AcqDescList getAcqDescList() {
        return this._acqDescList;
    } //-- org.psi.ms.model.AcqDescList getAcqDescList()

    /**
     * Returns the value of field 'admin'. The field 'admin' has
     * the following description: Administrative information
     * pertaining to the entire data set is stored here.
     *
     * @return the value of field 'admin'.
     */
    public org.psi.ms.model.Admin getAdmin() {
        return this._admin;
    } //-- org.psi.ms.model.Admin getAdmin()

    /**
     * Returns the value of field 'instrument'. The field
     * 'instrument' has the following description: InstrumentCommonSettings
     * information common to all acquisitions is stored in this
     * section.
     *
     * @return the value of field 'instrument'.
     */
    public org.psi.ms.model.InstrumentCommonSettings getInstrument() {
        return this._instrument;
    } //-- org.psi.ms.model.InstrumentCommonSettings getInstrument()

    /**
     * Returns the value of field 'supDescList'. The field
     * 'supDescList' has the following description: List of
     * descriptive information for each supplemental data entry in
     * the raw section
     *
     * @return the value of field 'supDescList'.
     */
    public org.psi.ms.model.SupDescList getSupDescList() {
        return this._supDescList;
    } //-- org.psi.ms.model.SupDescList getSupDescList()

    /**
     * Returns the value of field 'test'. The field 'test' has the
     * following description: Experimental information regarding
     * the test which resulted in this data set.
     *
     * @return the value of field 'test'.
     */
    public org.psi.ms.model.Test getTest() {
        return this._test;
    } //-- org.psi.ms.model.Test getTest()

    /**
     * Sets the value of field 'acqDescList'. The field
     * 'acqDescList' has the following description: List of
     * descriptive information for each acquisition in the raw
     * section
     *
     * @param acqDescList the value of field 'acqDescList'.
     */
    public void setAcqDescList(org.psi.ms.model.AcqDescList acqDescList) {
        this._acqDescList = acqDescList;
    } //-- void setAcqDescList(org.psi.ms.model.AcqDescList)

    /**
     * Sets the value of field 'admin'. The field 'admin' has the
     * following description: Administrative information pertaining
     * to the entire data set is stored here.
     *
     * @param admin the value of field 'admin'.
     */
    public void setAdmin(org.psi.ms.model.Admin admin) {
        this._admin = admin;
    } //-- void setAdmin(org.psi.ms.model.Admin)

    /**
     * Sets the value of field 'instrument'. The field 'instrument'
     * has the following description: InstrumentCommonSettings information common
     * to all acquisitions is stored in this section.
     *
     * @param instrument the value of field 'instrument'.
     */
    public void setInstrument(org.psi.ms.model.InstrumentCommonSettings instrument) {
        this._instrument = instrument;
    } //-- void setInstrument(org.psi.ms.model.InstrumentCommonSettings)

    /**
     * Sets the value of field 'supDescList'. The field
     * 'supDescList' has the following description: List of
     * descriptive information for each supplemental data entry in
     * the raw section
     *
     * @param supDescList the value of field 'supDescList'.
     */
    public void setSupDescList(org.psi.ms.model.SupDescList supDescList) {
        this._supDescList = supDescList;
    } //-- void setSupDescList(org.psi.ms.model.SupDescList)

    /**
     * Sets the value of field 'test'. The field 'test' has the
     * following description: Experimental information regarding
     * the test which resulted in this data set.
     *
     * @param test the value of field 'test'.
     */
    public void setTest(org.psi.ms.model.Test test) {
        this._test = test;
    } //-- void setTest(org.psi.ms.model.Test)

}
