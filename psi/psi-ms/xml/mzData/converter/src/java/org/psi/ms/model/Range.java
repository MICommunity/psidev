/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Range.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * If a range of scans or acquistions was used to create the peak
 * list then a start and end value can be specified.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
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

}
