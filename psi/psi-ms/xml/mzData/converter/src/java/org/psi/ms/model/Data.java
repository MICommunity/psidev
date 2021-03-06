/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Data.java,v 1.4 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Class Data.
 *
 * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
 */
public class Data implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * internal content storage
     */
    private byte[] _content;

    /**
     * Field _precision
     */
    private Precision _precision;

    /**
     * Field _length
     */
    private int _length;

    /**
     * keeps track of state for field: _length
     */
    private boolean _has_length;


    //----------------/
    //- Constructors -/
    //----------------/

    public Data() {
        super();
    } //-- org.psi.ms.model.Data()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'content'. The field 'content'
     * has the following description: internal content storage
     *
     * @return the value of field 'content'.
     */
    public byte[] getContent() {
        return this._content;
    } //-- byte[] getContent()

    /**
     * Returns the value of field 'length'.
     *
     * @return the value of field 'length'.
     */
    public int getLength() {
        return this._length;
    } //-- int getLength()

    /**
     * Returns the value of field 'precision'.
     *
     * @return the value of field 'precision'.
     */
    public Precision getPrecision() {
        return this._precision;
    } //-- Precision getPrecision()

    /**
     * Method hasLength
     */
    public boolean hasLength() {
        return this._has_length;
    } //-- boolean hasLength()

    /**
     * Sets the value of field 'content'. The field 'content' has
     * the following description: internal content storage
     *
     * @param content the value of field 'content'.
     */
    public void setContent(byte[] content) {
        this._content = content;
    } //-- void setContent(byte)

    /**
     * Sets the value of field 'length'.
     *
     * @param length the value of field 'length'.
     */
    public void setLength(int length) {
        this._length = length;
        this._has_length = true;
    } //-- void setLength(int)

    /**
     * Sets the value of field 'precision'.
     *
     * @param precision the value of field 'precision'.
     */
    public void setPrecision(Precision precision) {
        this._precision = precision;
    } //-- void setPrecision(Precision)

    /**
     * Class Precision.
     *
     * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
     */
    public static class Precision implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The 32 type
         */
        public static final int THIRTYTWO_TYPE = 0;

        /**
         * The instance of the 32 type
         */
        public static final Precision THIRTYTWO = new Precision(THIRTYTWO_TYPE, "32");

        /**
         * The 64 type
         */
        public static final int SIXTYFOUR_TYPE = 1;

        /**
         * The instance of the 64 type
         */
        public static final Precision SIXTYFOUR = new Precision(SIXTYFOUR_TYPE, "64");

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

        private Precision(int type, java.lang.String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- Precision(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of Precision
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this Precision
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("32", THIRTYTWO);
            members.put("64", SIXTYFOUR);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * Precision
         */
        public java.lang.String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new Precision based on the
         * given String value.
         *
         * @param string
         */
        public static Precision valueOf(java.lang.String string) {
            java.lang.Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid Precision";
                throw new IllegalArgumentException(err);
            }
            return (Precision) obj;
        } //-- Precision valueOf(java.lang.String)

    }
}
