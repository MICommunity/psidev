/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: InstrumentAcqSettings.java,v 1.6 2003/12/05 15:44:38 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

/**
 * InstrumentCommonSettings information common to all acquisitions is stored in
 * this section.
 * Todo: this data needs to be provided by the user
 *
 * @version $Revision: 1.6 $ $Date: 2003/12/05 15:44:38 $
 */
public class InstrumentAcqSettings implements Serializable {
    /**
     * Type of acquisition represented by the peak list (controlled)
     */
    private AcqType _acqType;
    /**
     * Number of stages of mass spectrometry performed to generate
     * the peak list (MS^n).
     */
    private int _msLevel;
    /**
     * keeps track of state for field: _msLevel
     */
    private boolean _has_msLevel;
    /**
     * Polarity of the ionization/mass analyzer (controlled).
     */
    private Polarity _polarity;
    /**
     * Range in m/z units of the mass analysis.
     */
    private MzRange _mzRange;
    /**
     * This element holds additional data or annotation
     * information. It is named, has a value and optionally a
     * description.
     */
    private java.util.Vector _instParamList;
    /**
     * This element holds additional data or annotation
     * information. Uncontrolled, or user controlled name values
     * are allowed here.
     */
    private java.util.Vector _instUserParamList;


    //----------------/
    //- Constructors -/
    //----------------/

    public InstrumentAcqSettings() {
        super();
        _instParamList = new Vector();
        _instUserParamList = new Vector();
    } //-- org.psi.ms.model.InstrumentAcqSettings()


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
     * Returns the value of field 'acqType'. The field 'acqType'
     * has the following description: Type of acquisition
     * represented by the peak list (controlled).
     *
     * @return the value of field 'acqType'.
     */
    public AcqType getAcqType() {
        return this._acqType;
    } //-- AcqType getAcqType()

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
     * Returns the value of field 'msLevel'. The field 'msLevel'
     * has the following description: Number of stages of mass
     * spectrometry performed to generate the peak list (MS^n).
     *
     * @return the value of field 'msLevel'.
     */
    public int getMsLevel() {
        return this._msLevel;
    } //-- int getMsLevel()

    /**
     * Returns the value of field 'mzRange'. The field 'mzRange'
     * has the following description: Range in m/z units of the
     * mass analysis.
     *
     * @return the value of field 'mzRange'.
     */
    public MzRange getMzRange() {
        return this._mzRange;
    } //-- org.psi.ms.model.MzRange getMzRange()

    /**
     * Returns the value of field 'polarity'. The field 'polarity'
     * has the following description: Polarity of the
     * ionization/mass analyzer (controlled).
     *
     * @return the value of field 'polarity'.
     */
    public Polarity getPolarity() {
        return this._polarity;
    } //-- Polarity getPolarity()

    /**
     * Method hasMsLevel
     */
    public boolean hasMsLevel() {
        return this._has_msLevel;
    } //-- boolean hasMsLevel()

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
     * Sets the value of field 'acqType'. The field 'acqType' has
     * the following description: Type of acquisition represented
     * by the peak list (controlled).
     *
     * @param acqType the value of field 'acqType'.
     */
    public void setAcqType(AcqType acqType) {
        this._acqType = acqType;
    } //-- void setAcqType(AcqType)

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
     * Sets the value of field 'msLevel'. The field 'msLevel' has
     * the following description: Number of stages of mass
     * spectrometry performed to generate the peak list (MS^n).
     *
     * @param msLevel the value of field 'msLevel'.
     */
    public void setMsLevel(int msLevel) {
        this._msLevel = msLevel;
        this._has_msLevel = true;
    } //-- void setMsLevel(int)

    /**
     * Sets the value of field 'mzRange'. The field 'mzRange' has
     * the following description: Range in m/z units of the mass
     * analysis.
     *
     * @param mzRange the value of field 'mzRange'.
     */
    public void setMzRange(MzRange mzRange) {
        this._mzRange = mzRange;
    } //-- void setMzRange(org.psi.ms.model.MzRange)

    /**
     * Sets the value of field 'polarity'. The field 'polarity' has
     * the following description: Polarity of the ionization/mass
     * analyzer (controlled).
     *
     * @param polarity the value of field 'polarity'.
     */
    public void setPolarity(Polarity polarity) {
        this._polarity = polarity;
    } //-- void setPolarity(Polarity)

    /**
     * Class AcqType.
     *
     * @version $Revision: 1.6 $ $Date: 2003/12/05 15:44:38 $
     */
    public static class AcqType implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The full type
         */
        public static final int FULL_TYPE = 0;

        /**
         * The instance of the full type
         */
        public static final AcqType FULL = new AcqType(FULL_TYPE, "full");

        /**
         * The zoom type
         */
        public static final int ZOOM_TYPE = 1;

        /**
         * The instance of the zoom type
         */
        public static final AcqType ZOOM = new AcqType(ZOOM_TYPE, "zoom");

        /**
         * The SIM type
         */
        public static final int SIM_TYPE = 2;

        /**
         * The instance of the SIM type
         */
        public static final AcqType SIM = new AcqType(SIM_TYPE, "SIM");

        /**
         * The SRM type
         */
        public static final int SRM_TYPE = 3;

        /**
         * The instance of the SRM type
         */
        public static final AcqType SRM = new AcqType(SRM_TYPE, "SRM");

        /**
         * The MRM type
         */
        public static final int MRM_TYPE = 4;

        /**
         * The instance of the MRM type
         */
        public static final AcqType MRM = new AcqType(MRM_TYPE, "MRM");

        /**
         * The Q1 type
         */
        public static final int Q1_TYPE = 5;

        /**
         * The instance of the Q1 type
         */
        public static final AcqType Q1 = new AcqType(Q1_TYPE, "Q1");

        /**
         * The Q3 type
         */
        public static final int Q3_TYPE = 6;

        /**
         * The instance of the Q3 type
         */
        public static final AcqType Q3 = new AcqType(Q3_TYPE, "Q3");

        /**
         * The ICR type
         */
        public static final int ICR_TYPE = 7;

        /**
         * The instance of the ICR type
         */
        public static final AcqType ICR = new AcqType(ICR_TYPE, "ICR");

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

        private AcqType(int type, java.lang.String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- AcqType(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of AcqType
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this
         * AcqType
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("full", FULL);
            members.put("zoom", ZOOM);
            members.put("SIM", SIM);
            members.put("SRM", SRM);
            members.put("MRM", MRM);
            members.put("Q1", Q1);
            members.put("Q3", Q3);
            members.put("ICR", ICR);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * AcqType
         */
        public java.lang.String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new
         * AcqType based on the given
         * String value.
         *
         * @param string
         */
        public static AcqType valueOf(java.lang.String string) {
            java.lang.Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid AcqType";
                throw new IllegalArgumentException(err);
            }
            return (AcqType) obj;
        } //-- AcqType valueOf(java.lang.String)

    }

    /**
     * Class Polarity.
     *
     * @version $Revision: 1.6 $ $Date: 2003/12/05 15:44:38 $
     */
    public static class Polarity implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The + type
         */
        public static final int VALUE_0_TYPE = 0;

        /**
         * The instance of the + type
         */
        public static final Polarity VALUE_0 = new Polarity(VALUE_0_TYPE, "+");

        /**
         * The - type
         */
        public static final int VALUE_1_TYPE = 1;

        /**
         * The instance of the - type
         */
        public static final Polarity VALUE_1 = new Polarity(VALUE_1_TYPE, "-");

        /**
         * The any type
         */
        public static final int VALUE_2_TYPE = 2;

        /**
         * The instance of the any type
         */
        public static final Polarity VALUE_2 = new Polarity(VALUE_2_TYPE, "any");

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

        private Polarity(int type, java.lang.String value) {
            super();
            this.type = type;
            this.stringValue = value;
        } //-- Polarity(int, java.lang.String)


        //-----------/
        //- Methods -/
        //-----------/

        /**
         * Method enumerateReturns an enumeration of all possible
         * instances of Polarity
         */
        public static java.util.Enumeration enumerate() {
            return _memberTable.elements();
        } //-- java.util.Enumeration enumerate()

        /**
         * Method getTypeReturns the type of this
         * Polarity
         */
        public int getType() {
            return this.type;
        } //-- int getType()

        /**
         * Method init
         */
        private static java.util.Hashtable init() {
            Hashtable members = new Hashtable();
            members.put("+", VALUE_0);
            members.put("-", VALUE_1);
            members.put("any", VALUE_2);
            return members;
        } //-- java.util.Hashtable init()

        /**
         * Method toStringReturns the String representation of this
         * Polarity
         */
        public java.lang.String toString() {
            return this.stringValue;
        } //-- java.lang.String toString()

        /**
         * Method valueOfReturns a new
         * Polarity based on the given
         * String value.
         *
         * @param string
         */
        public static Polarity valueOf(java.lang.String string) {
            java.lang.Object obj = null;
            if (string != null) obj = _memberTable.get(string);
            if (obj == null) {
                String err = "'" + string + "' is not a valid Polarity";
                throw new IllegalArgumentException(err);
            }
            return (Polarity) obj;
        } //-- Polarity valueOf(java.lang.String)

    }
}
