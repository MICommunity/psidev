/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqTime.java,v 1.4 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class AcqTime.
 *
 * @version $Revision: 1.4 $ $Date: 2003/08/28 15:17:12 $
 */
public class AcqTime implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private java.util.Date _content;

    /**
     * Field _units
     */
    private Units _units;


    //----------------/
    //- Constructors -/
    //----------------/

    public AcqTime() {
        super();
    } //-- org.psi.ms.model.AcqTime()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     *
     * @return the value of field 'content'.
     */
    public java.util.Date getContent() {
        return this._content;
    } //-- java.util.Date getContent()

    /**
     * Returns the value of field 'units'.
     *
     * @return the value of field 'units'.
     */
    public Units getUnits() {
        return this._units;
    } //-- Units getUnits()

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     *
     * @param content the value of field 'content'.
     */
    public void setContent(java.util.Date content) {
        this._content = content;
    } //-- void setContent(java.util.Date)

    /**
     * Sets the value of field 'units'.
     *
     * @param units the value of field 'units'.
     */
    public void setUnits(Units units) {
        this._units = units;
    } //-- void setUnits(Units)

    /**
     * Class Units.
     *
     * @version $Revision: 1.4 $ $Date: 2003/08/28 15:17:12 $
     */
    public static class Units implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The hr type
         */
        public static final int HR_TYPE = 0;

        /**
         * The instance of the hr type
         */
        public static final Units HR = new Units(HR_TYPE, "hr");

        /**
         * The min type
         */
        public static final int MIN_TYPE = 1;

        /**
         * The instance of the min type
         */
        public static final Units MIN = new Units(MIN_TYPE, "min");

        /**
         * The sec type
         */
        public static final int SEC_TYPE = 2;

        /**
         * The instance of the sec type
         */
        public static final Units SEC = new Units(SEC_TYPE, "sec");

        /**
         * The ms type
         */
        public static final int MS_TYPE = 3;

        /**
         * The instance of the ms type
         */
        public static final Units MS = new Units(MS_TYPE, "ms");

        /**
         * The us type
         */
        public static final int US_TYPE = 4;

        /**
         * The instance of the us type
         */
        public static final Units US = new Units(US_TYPE, "us");

        /**
         * The ns type
         */
        public static final int NS_TYPE = 5;

        /**
         * The instance of the ns type
         */
        public static final Units NS = new Units(NS_TYPE, "ns");

        /**
         * Field _memberTable
         */
        private static java.util.Hashtable _memberTable = init();

        /**
         * Field type
         */
        private int type = -1;

        /**
         * Field stringValue
         */
        private java.lang.String stringValue = null;


        //----------------/
        //- Constructors -/
        //----------------/

        private Units(int type, java.lang.String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- Units(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of Units
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this Units
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("hr", HR);
            members.put("min", MIN);
            members.put("sec", SEC);
            members.put("ms", MS);
            members.put("us", US);
            members.put("ns", NS);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * Units
         */
        public java.lang.String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new Units based on the
         * given String value.
         *
         * @param string
         */
        public static Units valueOf(java.lang.String string) {
            java.lang.Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid Units";
                throw new IllegalArgumentException(err);
            }
            return (Units) obj;
        } //-- Units valueOf(java.lang.String)

    }
}
