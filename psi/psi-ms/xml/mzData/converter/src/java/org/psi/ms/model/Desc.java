/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Desc.java,v 1.7 2004/01/14 15:57:36 krunte Exp $
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
 * @version $Revision: 1.7 $ $Date: 2004/01/14 15:57:36 $
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
     * Returns the value of field 'admin'. The field 'admin' has
     * the following description: Administrative information
     * pertaining to the entire data set is stored here.
     *
     * @return the value of field 'admin'.
     */
    public org.psi.ms.model.Admin getAdmin() {
        if (_admin == null)
            _admin = new Admin();
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
        if (_instrument == null)
            _instrument = new InstrumentCommonSettings();
        return this._instrument;
    } //-- org.psi.ms.model.InstrumentCommonSettings getInstrument()

    /**
     * Returns the value of field 'test'. The field 'test' has the
     * following description: Experimental information regarding
     * the test which resulted in this data set.
     *
     * @return the value of field 'test'.
     */
    public org.psi.ms.model.Test getTest() {
        if (_test == null)
            _test = new Test();
        return this._test;
    } //-- org.psi.ms.model.Test getTest()

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
