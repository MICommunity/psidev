/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Range.java,v 1.2 2003/08/21 14:28:02 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * If a range of scans or acquistions was used to create the peak
 * list then a start and end value can be specified.
 *
 * @version $Revision: 1.2 $ $Date: 2003/08/21 14:28:02 $
 */
public class Range implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _start
     */
    private int _start;

    /**
     * keeps track of state for field: _start
     */
    private boolean _has_start;

    /**
     * Field _end
     */
    private int _end;

    /**
     * keeps track of state for field: _end
     */
    private boolean _has_end;


    //----------------/
    //- Constructors -/
    //----------------/

    public Range() {
        super();
    } //-- org.psi.ms.model.Range()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'end'.
     *
     * @return the value of field 'end'.
     */
    public int getEnd() {
        return this._end;
    } //-- int getEnd()

    /**
     * Returns the value of field 'start'.
     *
     * @return the value of field 'start'.
     */
    public int getStart() {
        return this._start;
    } //-- int getStart()

    /**
     * Method hasEnd
     */
    public boolean hasEnd() {
        return this._has_end;
    } //-- boolean hasEnd()

    /**
     * Method hasStart
     */
    public boolean hasStart() {
        return this._has_start;
    } //-- boolean hasStart()

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
     * Sets the value of field 'end'.
     *
     * @param end the value of field 'end'.
     */
    public void setEnd(int end) {
        this._end = end;
        this._has_end = true;
    } //-- void setEnd(int)

    /**
     * Sets the value of field 'start'.
     *
     * @param start the value of field 'start'.
     */
    public void setStart(int start) {
        this._start = start;
        this._has_start = true;
    } //-- void setStart(int)

    /**
     * Method unmarshal
     *
     * @param reader
     */
    public static org.psi.ms.model.Range unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.Range) Unmarshaller.unmarshal(org.psi.ms.model.Range.class, reader);
    } //-- org.psi.ms.model.Range unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

}
