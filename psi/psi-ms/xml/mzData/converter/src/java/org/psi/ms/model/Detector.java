/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Detector.java,v 1.4 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;
import java.util.Vector;

/**
 * Detection information
 *
 * @version $Revision: 1.4 $ $Date: 2003/08/28 15:17:12 $
 */
public class Detector implements java.io.Serializable {
    /**
     * Type of detection for this data set (controlled).
     */
    private Type _type;
    /**
     * This element holds additional data or annotation
     * information. Only controlled name values are allowed here.
     */
    private Vector _instParamList;
    /**
     * This element holds additional data or annotation
     * information. Uncontrolled, or user controlled name values
     * are allowed here.
     */
    private Vector _instUserParamList;


    //----------------/
    //- Constructors -/
    //----------------/

    public Detector() {
        super();
        _instParamList = new Vector();
        _instUserParamList = new Vector();
    } //-- org.psi.ms.model.Detector()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method addInstParam
     *
     * @param vInstParam
     */
    public void addInstParam(InstParam vInstParam)
            throws IndexOutOfBoundsException {
        _instParamList.addElement(vInstParam);
    } //-- void addInstParam(org.psi.ms.model.InstParam)

    /**
     * Method addInstParam
     *
     * @param index
     * @param vInstParam
     */
    public void addInstParam(int index, InstParam vInstParam)
            throws IndexOutOfBoundsException {
        _instParamList.insertElementAt(vInstParam, index);
    } //-- void addInstParam(int, org.psi.ms.model.InstParam)

    /**
     * Method addInstUserParam
     *
     * @param vInstUserParam
     */
    public void addInstUserParam(InstUserParam vInstUserParam)
            throws IndexOutOfBoundsException {
        _instUserParamList.addElement(vInstUserParam);
    } //-- void addInstUserParam(org.psi.ms.model.InstUserParam)

    /**
     * Method addInstUserParam
     *
     * @param index
     * @param vInstUserParam
     */
    public void addInstUserParam(int index, InstUserParam vInstUserParam)
            throws IndexOutOfBoundsException {
        _instUserParamList.insertElementAt(vInstUserParam, index);
    } //-- void addInstUserParam(int, org.psi.ms.model.InstUserParam)

    /**
     * Method enumerateInstParam
     */
    public java.util.Enumeration enumerateInstParam() {
        return _instParamList.elements();
    } //-- java.util.Enumeration enumerateInstParam()

    /**
     * Method enumerateInstUserParam
     */
    public java.util.Enumeration enumerateInstUserParam() {
        return _instUserParamList.elements();
    } //-- java.util.Enumeration enumerateInstUserParam()

    /**
     * Method getInstParam
     *
     * @param index
     */
    public InstParam getInstParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (InstParam) _instParamList.elementAt(index);
    } //-- org.psi.ms.model.InstParam getInstParam(int)

    /**
     * Method getInstParam
     */
    public InstParam[] getInstParam() {
        int size = _instParamList.size();
        InstParam[] mArray = new InstParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (InstParam) _instParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.InstParam[] getInstParam()

    /**
     * Method getInstParamCount
     */
    public int getInstParamCount() {
        return _instParamList.size();
    } //-- int getInstParamCount()

    /**
     * Method getInstUserParam
     *
     * @param index
     */
    public InstUserParam getInstUserParam(int index)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }

        return (InstUserParam) _instUserParamList.elementAt(index);
    } //-- org.psi.ms.model.InstUserParam getInstUserParam(int)

    /**
     * Method getInstUserParam
     */
    public InstUserParam[] getInstUserParam() {
        int size = _instUserParamList.size();
        InstUserParam[] mArray = new InstUserParam[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (InstUserParam) _instUserParamList.elementAt(index);
        }
        return mArray;
    } //-- org.psi.ms.model.InstUserParam[] getInstUserParam()

    /**
     * Method getInstUserParamCount
     */
    public int getInstUserParamCount() {
        return _instUserParamList.size();
    } //-- int getInstUserParamCount()

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Type of detection for this data set
     * (controlled).
     *
     * @return the value of field 'type'.
     */
    public Type getType() {
        return this._type;
    } //-- Type getType()

    /**
     * Method removeAllInstParam
     */
    public void removeAllInstParam() {
        _instParamList.removeAllElements();
    } //-- void removeAllInstParam()

    /**
     * Method removeAllInstUserParam
     */
    public void removeAllInstUserParam() {
        _instUserParamList.removeAllElements();
    } //-- void removeAllInstUserParam()

    /**
     * Method removeInstParam
     *
     * @param index
     */
    public InstParam removeInstParam(int index) {
        Object obj = _instParamList.elementAt(index);
        _instParamList.removeElementAt(index);
        return (InstParam) obj;
    } //-- org.psi.ms.model.InstParam removeInstParam(int)

    /**
     * Method removeInstUserParam
     *
     * @param index
     */
    public InstUserParam removeInstUserParam(int index) {
        Object obj = _instUserParamList.elementAt(index);
        _instUserParamList.removeElementAt(index);
        return (InstUserParam) obj;
    } //-- org.psi.ms.model.InstUserParam removeInstUserParam(int)

    /**
     * Method setInstParam
     *
     * @param index
     * @param vInstParam
     */
    public void setInstParam(int index, InstParam vInstParam)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _instParamList.setElementAt(vInstParam, index);
    } //-- void setInstParam(int, org.psi.ms.model.InstParam)

    /**
     * Method setInstParam
     *
     * @param instParamArray
     */
    public void setInstParam(InstParam[] instParamArray) {
        //-- copy array
        _instParamList.removeAllElements();
        for (int i = 0; i < instParamArray.length; i++) {
            _instParamList.addElement(instParamArray[i]);
        }
    } //-- void setInstParam(org.psi.ms.model.InstParam)

    /**
     * Method setInstUserParam
     *
     * @param index
     * @param vInstUserParam
     */
    public void setInstUserParam(int index, InstUserParam vInstUserParam)
            throws IndexOutOfBoundsException {
        //-- check bounds for index
        if ((index < 0) || (index > _instUserParamList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _instUserParamList.setElementAt(vInstUserParam, index);
    } //-- void setInstUserParam(int, org.psi.ms.model.InstUserParam)

    /**
     * Method setInstUserParam
     *
     * @param instUserParamArray
     */
    public void setInstUserParam(InstUserParam[] instUserParamArray) {
        //-- copy array
        _instUserParamList.removeAllElements();
        for (int i = 0; i < instUserParamArray.length; i++) {
            _instUserParamList.addElement(instUserParamArray[i]);
        }
    } //-- void setInstUserParam(org.psi.ms.model.InstUserParam)

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Type of detection for this data set
     * (controlled).
     *
     * @param type the value of field 'type'.
     */
    public void setType(Type type) {
        this._type = type;
    } //-- void setType(Type)

    /**
     * Class Type.
     *
     * @version $Revision: 1.4 $ $Date: 2003/08/28 15:17:12 $
     */
    public static class Type implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The EM type
         */
        public static final int EM_TYPE = 0;

        /**
         * The instance of the EM type
         */
        public static final Type EM = new Type(EM_TYPE, "EM");

        /**
         * The PM type
         */
        public static final int PM_TYPE = 1;

        /**
         * The instance of the PM type
         */
        public static final Type PM = new Type(PM_TYPE, "PM");

        /**
         * The MPC type
         */
        public static final int MPC_TYPE = 2;

        /**
         * The instance of the MPC type
         */
        public static final Type MPC = new Type(MPC_TYPE, "MPC");

        /**
         * The Frequency type
         */
        public static final int FREQUENCY_TYPE = 3;

        /**
         * The instance of the Frequency type
         */
        public static final Type FREQUENCY = new Type(FREQUENCY_TYPE, "Frequency");

        /**
         * The other type
         */
        public static final int OTHER_TYPE = 4;

        /**
         * The instance of the other type
         */
        public static final Type OTHER = new Type(OTHER_TYPE, "other");

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

        private Type(int type, java.lang.String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- Type(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of Type
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this Type
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("EM", EM);
            members.put("PM", PM);
            members.put("MPC", MPC);
            members.put("Frequency", FREQUENCY);
            members.put("other", OTHER);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * Type
         */
        public java.lang.String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new Type based on
         * the given String value.
         *
         * @param string
         */
        public static Type valueOf(java.lang.String string) {
            java.lang.Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid Type";
                throw new IllegalArgumentException(err);
            }
            return (Type) obj;
        } //-- Type valueOf(java.lang.String)

    }
}
