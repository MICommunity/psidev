/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Desc.java,v 1.8 2004/10/11 07:05:40 krunte Exp $
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
 * @version $Revision: 1.8 $ $Date: 2004/10/11 07:05:40 $
 */
public class Desc implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Administrative information pertaining to the entire data set
     * is stored here.
     */
    private Admin admin;

    /**
     * InstrumentCommonSettings information common to all acquisitions is stored
     * in this section.
     */
    private InstrumentCommonSettings instrument;

    /**
     * Experimental information regarding the test which resulted
     * in this data set.
     */
    private org.psi.ms.model.Test test;
    
    private DataProcessing dataProcessing;


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
        if (admin == null)
            admin = new Admin();
        return this.admin;
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
        if (instrument == null)
            instrument = new InstrumentCommonSettings();
        return this.instrument;
    } //-- org.psi.ms.model.InstrumentCommonSettings getInstrument()

    /**
     * Returns the value of field 'test'. The field 'test' has the
     * following description: Experimental information regarding
     * the test which resulted in this data set.
     *
     * @return the value of field 'test'.
     */
    public org.psi.ms.model.Test getTest() {
        if (test == null)
            test = new Test();
        return this.test;
    } //-- org.psi.ms.model.Test getTest()

	/**
	 * Returns the dataProcessing. The field 'dataProcessing' has the
	 * following description: Experimental information regarding
	 * the test which resulted in this data set.
	 * 
	 * @return the value of the field 'dataProcessing'.
	 */
	public DataProcessing getDataProcessing() {
		if (dataProcessing == null) 
			dataProcessing = new DataProcessing();
		return dataProcessing;
	}

	/**
     * Sets the value of field 'admin'. The field 'admin' has the
     * following description: Administrative information pertaining
     * to the entire data set is stored here.
     *
     * @param admin the value of field 'admin'.
     */
    public void setAdmin(org.psi.ms.model.Admin admin) {
        this.admin = admin;
    } //-- void setAdmin(org.psi.ms.model.Admin)

    /**
     * Sets the value of field 'instrument'. The field 'instrument'
     * has the following description: InstrumentCommonSettings information common
     * to all acquisitions is stored in this section.
     *
     * @param instrument the value of field 'instrument'.
     */
    public void setInstrument(org.psi.ms.model.InstrumentCommonSettings instrument) {
        this.instrument = instrument;
    } //-- void setInstrument(org.psi.ms.model.InstrumentCommonSettings)

    /**
     * Sets the value of field 'test'. The field 'test' has the
     * following description: Experimental information regarding
     * the test which resulted in this data set.
     *
     * @param test the value of field 'test'.
     */
    public void setTest(org.psi.ms.model.Test test) {
        this.test = test;
    } //-- void setTest(org.psi.ms.model.Test)

	/**
	 * Set the dataProcessing. The field 'dataProcessing' has the
	 * following description: Experimental information regarding
	 * the test which resulted in this data set.
	 * 
	 * @param dataProcessing the value of the field 'dataProcessing'.
	 */
	public void setDataProcessing(DataProcessing dataProcessing) {
		this.dataProcessing = dataProcessing;
	}
}
