/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AcqTimeUnitsType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
 */

package org.psi.ms.model.types;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AcqTimeUnitsType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class AcqTimeUnitsType implements java.io.Serializable {


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
    public static final AcqTimeUnitsType HR = new AcqTimeUnitsType(HR_TYPE, "hr");

    /**
     * The min type
     */
    public static final int MIN_TYPE = 1;

    /**
     * The instance of the min type
     */
    public static final AcqTimeUnitsType MIN = new AcqTimeUnitsType(MIN_TYPE, "min");

    /**
     * The sec type
     */
    public static final int SEC_TYPE = 2;

    /**
     * The instance of the sec type
     */
    public static final AcqTimeUnitsType SEC = new AcqTimeUnitsType(SEC_TYPE, "sec");

    /**
     * The ms type
     */
    public static final int MS_TYPE = 3;

    /**
     * The instance of the ms type
     */
    public static final AcqTimeUnitsType MS = new AcqTimeUnitsType(MS_TYPE, "ms");

    /**
     * The us type
     */
    public static final int US_TYPE = 4;

    /**
     * The instance of the us type
     */
    public static final AcqTimeUnitsType US = new AcqTimeUnitsType(US_TYPE, "us");

    /**
     * The ns type
     */
    public static final int NS_TYPE = 5;

    /**
     * The instance of the ns type
     */
    public static final AcqTimeUnitsType NS = new AcqTimeUnitsType(NS_TYPE, "ns");

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

    private AcqTimeUnitsType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.AcqTimeUnitsType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of AcqTimeUnitsType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this AcqTimeUnitsType
     */
    public int getType()
    {
        return this.type;
    } //-- int getType() 

    /**
     * Method init
     */
    private static java.util.Hashtable init()
    {
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
     * AcqTimeUnitsType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new AcqTimeUnitsType based on the
     * given String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.AcqTimeUnitsType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AcqTimeUnitsType";
            throw new IllegalArgumentException(err);
        }
        return (AcqTimeUnitsType) obj;
    } //-- org.psi.ms.model.types.AcqTimeUnitsType valueOf(java.lang.String) 

}
