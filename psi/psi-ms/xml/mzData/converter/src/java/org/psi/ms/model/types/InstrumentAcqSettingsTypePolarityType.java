/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: InstrumentAcqSettingsTypePolarityType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class InstrumentAcqSettingsTypePolarityType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class InstrumentAcqSettingsTypePolarityType implements java.io.Serializable {


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
    public static final InstrumentAcqSettingsTypePolarityType VALUE_0 = new InstrumentAcqSettingsTypePolarityType(VALUE_0_TYPE, "+");

    /**
     * The - type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the - type
     */
    public static final InstrumentAcqSettingsTypePolarityType VALUE_1 = new InstrumentAcqSettingsTypePolarityType(VALUE_1_TYPE, "-");

    /**
     * The any type
     */
    public static final int VALUE_2_TYPE = 2;

    /**
     * The instance of the any type
     */
    public static final InstrumentAcqSettingsTypePolarityType VALUE_2 = new InstrumentAcqSettingsTypePolarityType(VALUE_2_TYPE, "any");

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

    private InstrumentAcqSettingsTypePolarityType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of InstrumentAcqSettingsTypePolarityType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * InstrumentAcqSettingsTypePolarityType
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
        members.put("+", VALUE_0);
        members.put("-", VALUE_1);
        members.put("any", VALUE_2);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * InstrumentAcqSettingsTypePolarityType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * InstrumentAcqSettingsTypePolarityType based on the given
     * String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid InstrumentAcqSettingsTypePolarityType";
            throw new IllegalArgumentException(err);
        }
        return (InstrumentAcqSettingsTypePolarityType) obj;
    } //-- org.psi.ms.model.types.InstrumentAcqSettingsTypePolarityType valueOf(java.lang.String) 

}
