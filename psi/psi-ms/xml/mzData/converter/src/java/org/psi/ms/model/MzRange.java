/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: MzRange.java,v 1.4 2003/10/20 10:03:02 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Range in m/z units of the mass analysis.
 *
 * @version $Revision: 1.4 $ $Date: 2003/10/20 10:03:02 $
 */
public class MzRange implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _start
     */
    private float _start;

    /**
     * keeps track of state for field: _start
     */
    private boolean _has_start;

    /**
     * Field _stop
     */
    private float _stop;

    /**
     * keeps track of state for field: _stop
     */
    private boolean _has_stop;


    //----------------/
    //- Constructors -/
    //----------------/

    public MzRange() {
        super();
    } //-- org.psi.ms.model.MzRange()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'start'.
     *
     * @return the value of field 'start'.
     */
    public float getStart() {
        return this._start;
    } //-- int getStart()

    /**
     * Returns the value of field 'stop'.
     *
     * @return the value of field 'stop'.
     */
    public float getStop() {
        return this._stop;
    } //-- int getStop()

    /**
     * Method hasStart
     */
    public boolean hasStart() {
        return this._has_start;
    } //-- boolean hasStart()

    /**
     * Method hasStop
     */
    public boolean hasStop() {
        return this._has_stop;
    } //-- boolean hasStop()

    /**
     * Sets the value of field 'start'.
     *
     * @param start the value of field 'start'.
     */
    public void setStart(float start) {
        this._start = start;
        this._has_start = true;
    } //-- void setStart(int)

    /**
     * Sets the value of field 'stop'.
     *
     * @param stop the value of field 'stop'.
     */
    public void setStop(float stop) {
        this._stop = stop;
        this._has_stop = true;
    } //-- void setStop(int)

}
