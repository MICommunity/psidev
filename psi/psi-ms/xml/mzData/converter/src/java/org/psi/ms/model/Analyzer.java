/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Analyzer.java,v 1.3 2003/08/21 14:28:01 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Mass analyzer information
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/21 14:28:01 $
 */
public class Analyzer implements java.io.Serializable {
    /**
     * Mass analyzer type (controlled)
     */
    private Type _type;
    /**
     * Base mass analyzer resolution. This is defined as full peak
     * width at half maximum intensity divided by mass. This
     * paramter should hold the full scan resolution if variable
     * resolution is used, or if not otherwise specified in the
     * acquisition section.
     */
    private float _resolution;
    /**
     * keeps track of state for field: _resolution
     */
    private boolean _has_resolution;
    /**
     * Base mass accuracy. This is defined in m/z units. This
     * element hold the full scan accuracy if variable accuracy is
     * used or not otherwise specified in the acquisition section.
     */
    private float _accuracy;
    /**
     * keeps track of state for field: _accuracy
     */
    private boolean _has_accuracy;
    /**
     * This element holds additional data or annotation
     * information. Only controlled name values are allowed here.
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

    public Analyzer() {
        super();
        _instParamList = new Vector();
        _instUserParamList = new Vector();
    } //-- org.psi.ms.model.Analyzer()


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
    public static org.psi.ms.model.Analyzer unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.psi.ms.model.Analyzer) Unmarshaller.unmarshal(org.psi.ms.model.Analyzer.class, reader);
    } //-- org.psi.ms.model.Analyzer unmarshal(java.io.Reader)

    /**
     * Method validate
     */
    public void validate()
            throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate()

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
     * Returns the value of field 'accuracy'. The field 'accuracy'
     * has the following description: Base mass accuracy. This is
     * defined in m/z units. This element hold the full scan
     * accuracy if variable accuracy is used or not otherwise
     * specified in the acquisition section.
     *
     * @return the value of field 'accuracy'.
     */
    public float getAccuracy() {
        return this._accuracy;
    } //-- float getAccuracy()

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
     * Returns the value of field 'resolution'. The field
     * 'resolution' has the following description: Base mass
     * analyzer resolution. This is defined as full peak width at
     * half maximum intensity divided by mass. This paramter should
     * hold the full scan resolution if variable resolution is
     * used, or if not otherwise specified in the acquisition
     * section.
     *
     * @return the value of field 'resolution'.
     */
    public float getResolution() {
        return this._resolution;
    } //-- float getResolution()

    /**
     * Returns the value of field 'type'. The field 'type' has the
     * following description: Mass analyzer type (controlled)
     *
     * @return the value of field 'type'.
     */
    public Type getType() {
        return this._type;
    } //-- Type getType()

    /**
     * Method hasAccuracy
     */
    public boolean hasAccuracy() {
        return this._has_accuracy;
    } //-- boolean hasAccuracy()

    /**
     * Method hasResolution
     */
    public boolean hasResolution() {
        return this._has_resolution;
    } //-- boolean hasResolution()

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
     * Sets the value of field 'accuracy'. The field 'accuracy' has
     * the following description: Base mass accuracy. This is
     * defined in m/z units. This element hold the full scan
     * accuracy if variable accuracy is used or not otherwise
     * specified in the acquisition section.
     *
     * @param accuracy the value of field 'accuracy'.
     */
    public void setAccuracy(float accuracy) {
        this._accuracy = accuracy;
        this._has_accuracy = true;
    } //-- void setAccuracy(float)

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
     * Sets the value of field 'resolution'. The field 'resolution'
     * has the following description: Base mass analyzer
     * resolution. This is defined as full peak width at half
     * maximum intensity divided by mass. This paramter should hold
     * the full scan resolution if variable resolution is used, or
     * if not otherwise specified in the acquisition section.
     *
     * @param resolution the value of field 'resolution'.
     */
    public void setResolution(float resolution) {
        this._resolution = resolution;
        this._has_resolution = true;
    } //-- void setResolution(float)

    /**
     * Sets the value of field 'type'. The field 'type' has the
     * following description: Mass analyzer type (controlled)
     *
     * @param type the value of field 'type'.
     */
    public void setType(Type type) {
        this._type = type;
    } //-- void setType(Type)

    /**
     * Class Type.
     *
     * @version $Revision: 1.3 $ $Date: 2003/08/21 14:28:01 $
     */
    public static class Type implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The LinearQuad type
         */
        public static final int LINEARQUAD_TYPE = 0;

        /**
         * The instance of the LinearQuad type
         */
        public static final Type LINEARQUAD = new Type(LINEARQUAD_TYPE, "LinearQuad");

        /**
         * The PaulTrap type
         */
        public static final int PAULTRAP_TYPE = 1;

        /**
         * The instance of the PaulTrap type
         */
        public static final Type PAULTRAP = new Type(PAULTRAP_TYPE, "PaulTrap");

        /**
         * The LinearTrap type
         */
        public static final int LINEARTRAP_TYPE = 2;

        /**
         * The instance of the LinearTrap type
         */
        public static final Type LINEARTRAP = new Type(LINEARTRAP_TYPE, "LinearTrap");

        /**
         * The TOF type
         */
        public static final int TOF_TYPE = 3;

        /**
         * The instance of the TOF type
         */
        public static final Type TOF = new Type(TOF_TYPE, "TOF");

        /**
         * The Kingdon type
         */
        public static final int KINGDON_TYPE = 4;

        /**
         * The instance of the Kingdon type
         */
        public static final Type KINGDON = new Type(KINGDON_TYPE, "Kingdon");

        /**
         * The Sector type
         */
        public static final int SECTOR_TYPE = 5;

        /**
         * The instance of the Sector type
         */
        public static final Type SECTOR = new Type(SECTOR_TYPE, "Sector");

        /**
         * The ICR type
         */
        public static final int ICR_TYPE = 6;

        /**
         * The instance of the ICR type
         */
        public static final Type ICR = new Type(ICR_TYPE, "ICR");

        /**
         * The other type
         */
        public static final int OTHER_TYPE = 7;

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
            members.put("LinearQuad", LINEARQUAD);
            members.put("PaulTrap", PAULTRAP);
            members.put("LinearTrap", LINEARTRAP);
            members.put("TOF", TOF);
            members.put("Kingdon", KINGDON);
            members.put("Sector", SECTOR);
            members.put("ICR", ICR);
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
