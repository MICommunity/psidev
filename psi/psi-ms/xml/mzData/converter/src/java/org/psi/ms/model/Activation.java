/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Activation.java,v 1.4 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Type and energy level used for activation.
 *
 * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
 */
public class Activation implements java.io.Serializable {
    /**
     * Activation method (controlled)
     */
    private Method _method;
    /**
     * Activation energy. This is instrument dependent, i.e. the
     * instrument type and method must be known to interpret this
     * value.
     */
    private float _energy;
    /**
     * keeps track of state for field: _energy
     */
    private boolean _has_energy;


    //----------------/
    //- Constructors -/
    //----------------/

    public Activation() {
        super();
    } //-- org.psi.ms.model.Activation()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method deleteEnergy
     */
    public void deleteEnergy() {
        this._has_energy = false;
    } //-- void deleteEnergy()

    /**
     * Returns the value of field 'energy'. The field 'energy' has
     * the following description: Activation energy. This is
     * instrument dependent, i.e. the instrument type and method
     * must be known to interpret this value.
     *
     * @return the value of field 'energy'.
     */
    public float getEnergy() {
        return this._energy;
    } //-- float getEnergy()

    /**
     * Returns the value of field 'method'. The field 'method' has
     * the following description: Activation method (controlled)
     *
     * @return the value of field 'method'.
     */
    public Method getMethod() {
        return this._method;
    } //-- org.psi.ms.model.types.Method getMethod()

    /**
     * Method hasEnergy
     */
    public boolean hasEnergy() {
        return this._has_energy;
    } //-- boolean hasEnergy()

    /**
     * Sets the value of field 'energy'. The field 'energy' has the
     * following description: Activation energy. This is instrument
     * dependent, i.e. the instrument type and method must be known
     * to interpret this value.
     *
     * @param energy the value of field 'energy'.
     */
    public void setEnergy(float energy) {
        this._energy = energy;
        this._has_energy = true;
    } //-- void setEnergy(float)

    /**
     * Sets the value of field 'method'. The field 'method' has the
     * following description: Activation method (controlled)
     *
     * @param method the value of field 'method'.
     */
    public void setMethod(Method method) {
        this._method = method;
    } //-- void setMethod(org.psi.ms.model.types.Method)

    /**
     * Class Method.
     *
     * @version $Revision: 1.4 $ $Date: 2004/01/14 15:57:36 $
     */
    public static class Method implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The CID type
         */
        public static final int CID_TYPE = 0;

        /**
         * The instance of the CID type
         */
        public static final Method CID = new Method(CID_TYPE, "CID");

        /**
         * The PD type
         */
        public static final int PD_TYPE = 1;

        /**
         * The instance of the PD type
         */
        public static final Method PD = new Method(PD_TYPE, "PD");

        /**
         * The SID type
         */
        public static final int SID_TYPE = 2;

        /**
         * The instance of the SID type
         */
        public static final Method SID = new Method(SID_TYPE, "SID");

        /**
         * The ECD type
         */
        public static final int ECD_TYPE = 3;

        /**
         * The instance of the ECD type
         */
        public static final Method ECD = new Method(ECD_TYPE, "ECD");

        /**
         * The other type
         */
        public static final int OTHER_TYPE = 4;

        /**
         * The instance of the other type
         */
        public static final Method OTHER = new Method(OTHER_TYPE, "other");

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

        private Method(int type, java.lang.String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- org.psi.ms.model.types.Method(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of Method
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this
         * Method
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("CID", CID);
            members.put("PD", PD);
            members.put("SID", SID);
            members.put("ECD", ECD);
            members.put("other", OTHER);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * Method
         */
        public java.lang.String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new Method based
         * on the given String value.
         *
         * @param string
         */
        public static Method valueOf(java.lang.String string) {
            java.lang.Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid Method";
                throw new IllegalArgumentException(err);
            }
            return (Method) obj;
        } //-- org.psi.ms.model.types.Method valueOf(java.lang.String)

    }
}
