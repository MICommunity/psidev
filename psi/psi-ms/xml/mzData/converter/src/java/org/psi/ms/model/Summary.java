/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Summary.java,v 1.2 2003/08/21 12:23:47 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Summary information for this acquisition.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 12:23:47 $
 */
public class Summary implements java.io.Serializable {
    /**
     * Field _lowMZ
     */
    private float _lowMZ;
    /**
     * keeps track of state for field: _lowMZ
     */
    private boolean _has_lowMZ;
    /**
     * Field _highMZ
     */
    private float _highMZ;
    /**
     * keeps track of state for field: _highMZ
     */
    private boolean _has_highMZ;
    /**
     * Field _TIC
     */
    private float _TIC;
    /**
     * keeps track of state for field: _TIC
     */
    private boolean _has_TIC;
    /**
     * Field _baseIon
     */
    private BaseIon _baseIon;


    //----------------/
    //- Constructors -/
    //----------------/

    public Summary() {
        super();
    } //-- org.psi.ms.model.Summary()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method isValid
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid()

    /**
     * Method marshal
     *
     * @param out
     */
    public void marshal(java.io.Writer out)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer)

    /**
     * Method marshal
     *
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
            throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {

        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler)

    /**
     * Method unmarshal
     *
     * @param reader
     */
    public static org.psi.ms.model.Summary unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.Summary) Unmarshaller.unmarshal(org.psi.ms.model.Summary.class, reader);
    } //-- org.psi.ms.model.Summary unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

    /**
     * Method deleteHighMZ
     */
    public void deleteHighMZ() {
        this._has_highMZ = false;
    } //-- void deleteHighMZ()

    /**
     * Method deleteLowMZ
     */
    public void deleteLowMZ() {
        this._has_lowMZ = false;
    } //-- void deleteLowMZ()

    /**
     * Method deleteTIC
     */
    public void deleteTIC() {
        this._has_TIC = false;
    } //-- void deleteTIC()

    /**
     * Returns the value of field 'baseIon'.
     *
     * @return the value of field 'baseIon'.
     */
    public BaseIon getBaseIon() {
        return this._baseIon;
    } //-- org.psi.ms.model.BaseIon getBaseIon()

    /**
     * Returns the value of field 'highMZ'.
     *
     * @return the value of field 'highMZ'.
     */
    public float getHighMZ() {
        return this._highMZ;
    } //-- float getHighMZ()

    /**
     * Returns the value of field 'lowMZ'.
     *
     * @return the value of field 'lowMZ'.
     */
    public float getLowMZ() {
        return this._lowMZ;
    } //-- float getLowMZ()

    /**
     * Returns the value of field 'TIC'.
     *
     * @return the value of field 'TIC'.
     */
    public float getTIC() {
        return this._TIC;
    } //-- float getTIC()

    /**
     * Method hasHighMZ
     */
    public boolean hasHighMZ() {
        return this._has_highMZ;
    } //-- boolean hasHighMZ()

    /**
     * Method hasLowMZ
     */
    public boolean hasLowMZ() {
        return this._has_lowMZ;
    } //-- boolean hasLowMZ()

    /**
     * Method hasTIC
     */
    public boolean hasTIC() {
        return this._has_TIC;
    } //-- boolean hasTIC()

    /**
     * Sets the value of field 'baseIon'.
     *
     * @param baseIon the value of field 'baseIon'.
     */
    public void setBaseIon(BaseIon baseIon) {
        this._baseIon = baseIon;
    } //-- void setBaseIon(org.psi.ms.model.BaseIon)

    /**
     * Sets the value of field 'highMZ'.
     *
     * @param highMZ the value of field 'highMZ'.
     */
    public void setHighMZ(float highMZ) {
        this._highMZ = highMZ;
        this._has_highMZ = true;
    } //-- void setHighMZ(float)

    /**
     * Sets the value of field 'lowMZ'.
     *
     * @param lowMZ the value of field 'lowMZ'.
     */
    public void setLowMZ(float lowMZ) {
        this._lowMZ = lowMZ;
        this._has_lowMZ = true;
    } //-- void setLowMZ(float)

    /**
     * Sets the value of field 'TIC'.
     *
     * @param TIC the value of field 'TIC'.
     */
    public void setTIC(float TIC) {
        this._TIC = TIC;
        this._has_TIC = true;
    } //-- void setTIC(float)

}
