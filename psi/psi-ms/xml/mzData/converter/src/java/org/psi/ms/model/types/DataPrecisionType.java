/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DataPrecisionType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class DataPrecisionType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class DataPrecisionType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The 32 type
     */
    public static final int VALUE_0_TYPE = 0;

    /**
     * The instance of the 32 type
     */
    public static final DataPrecisionType VALUE_0 = new DataPrecisionType(VALUE_0_TYPE, "32");

    /**
     * The 64 type
     */
    public static final int VALUE_1_TYPE = 1;

    /**
     * The instance of the 64 type
     */
    public static final DataPrecisionType VALUE_1 = new DataPrecisionType(VALUE_1_TYPE, "64");

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

    private DataPrecisionType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.DataPrecisionType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DataPrecisionType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this DataPrecisionType
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
        members.put("32", VALUE_0);
        members.put("64", VALUE_1);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * DataPrecisionType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DataPrecisionType based on the
     * given String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.DataPrecisionType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DataPrecisionType";
            throw new IllegalArgumentException(err);
        }
        return (DataPrecisionType) obj;
    } //-- org.psi.ms.model.types.DataPrecisionType valueOf(java.lang.String) 

}
