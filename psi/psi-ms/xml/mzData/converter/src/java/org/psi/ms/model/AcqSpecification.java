/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqSpecification.java,v 1.6 2004/01/14 15:57:36 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/

import java.util.Hashtable;

/**
 * Specification for combining raw scans/acquisitions into a single
 * peak list. Either a list of acquisitions, or a range of
 * acquisitions can be specified.
 *
 * @version $Revision: 1.6 $ $Date: 2004/01/14 15:57:36 $
 */
public class AcqSpecification implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _method
     */
    private Method _method;

    /**
     * A list of acquisitions used to create the peak list. (May
     * contain a single entry)
     */
    private org.psi.ms.model.List _list;

    /**
     * If a range of scans or acquistions was used to create the
     * peak list then a start and end value can be specified.
     */
    private org.psi.ms.model.Range _range;


    //----------------/
    //- Constructors -/
    //----------------/

    public AcqSpecification() {
        super();
    } //-- org.psi.ms.model.AcqSpecification()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'list'. The field 'list' has the
     * following description: A list of acquisitions used to create
     * the peak list. (May contain a single entry)
     *
     * @return the value of field 'list'.
     */
    public org.psi.ms.model.List getList() {
        return this._list;
    } //-- org.psi.ms.model.List getList()

    /**
     * Returns the value of field 'method'.
     *
     * @return the value of field 'method'.
     */
    public Method getMethod() {
        return this._method;
    } //-- Method getMethod()

    /**
     * Returns the value of field 'range'. The field 'range' has
     * the following description: If a range of scans or
     * acquistions was used to create the peak list then a start
     * and end value can be specified.
     *
     * @return the value of field 'range'.
     */
    public org.psi.ms.model.Range getRange() {
        return this._range;
    } //-- org.psi.ms.model.Range getRange()

    /**
     * Sets the value of field 'list'. The field 'list' has the
     * following description: A list of acquisitions used to create
     * the peak list. (May contain a single entry)
     *
     * @param list the value of field 'list'.
     */
    public void setList(org.psi.ms.model.List list) {
        this._list = list;
    } //-- void setList(org.psi.ms.model.List)

    /**
     * Sets the value of field 'method'.
     *
     * @param method the value of field 'method'.
     */
    public void setMethod(Method method) {
        this._method = method;
    } //-- void setMethod(Method)

    /**
     * Sets the value of field 'range'. The field 'range' has the
     * following description: If a range of scans or acquistions
     * was used to create the peak list then a start and end value
     * can be specified.
     *
     * @param range the value of field 'range'.
     */
    public void setRange(org.psi.ms.model.Range range) {
        this._range = range;
    } //-- void setRange(org.psi.ms.model.Range)

    /**
     * Class Method.
     *
     * @version $Revision: 1.6 $ $Date: 2004/01/14 15:57:36 $
     */
    public static class Method implements java.io.Serializable {


        //--------------------------/
        //- Class/Member Variables -/
        //--------------------------/

        /**
         * The sum type
         */
        public static final int SUM_TYPE = 0;

        /**
         * The instance of the sum type
         */
        public static final Method SUM = new Method(SUM_TYPE, "sum");

        /**
         * The average type
         */
        public static final int AVERAGE_TYPE = 1;

        /**
         * The instance of the average type
         */
        public static final Method AVERAGE = new Method(AVERAGE_TYPE, "average");

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
        } //-- Method(int, java.lang.String)


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
            members.put("sum", SUM);
            members.put("average", AVERAGE);
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
        } //-- Method valueOf(java.lang.String)

    }
}
