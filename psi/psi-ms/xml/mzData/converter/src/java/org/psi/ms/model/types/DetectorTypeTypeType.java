/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: DetectorTypeTypeType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class DetectorTypeTypeType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class DetectorTypeTypeType implements java.io.Serializable {


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
    public static final DetectorTypeTypeType EM = new DetectorTypeTypeType(EM_TYPE, "EM");

    /**
     * The PM type
     */
    public static final int PM_TYPE = 1;

    /**
     * The instance of the PM type
     */
    public static final DetectorTypeTypeType PM = new DetectorTypeTypeType(PM_TYPE, "PM");

    /**
     * The MPC type
     */
    public static final int MPC_TYPE = 2;

    /**
     * The instance of the MPC type
     */
    public static final DetectorTypeTypeType MPC = new DetectorTypeTypeType(MPC_TYPE, "MPC");

    /**
     * The Frequency type
     */
    public static final int FREQUENCY_TYPE = 3;

    /**
     * The instance of the Frequency type
     */
    public static final DetectorTypeTypeType FREQUENCY = new DetectorTypeTypeType(FREQUENCY_TYPE, "Frequency");

    /**
     * The other type
     */
    public static final int OTHER_TYPE = 4;

    /**
     * The instance of the other type
     */
    public static final DetectorTypeTypeType OTHER = new DetectorTypeTypeType(OTHER_TYPE, "other");

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

    private DetectorTypeTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.DetectorTypeTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of DetectorTypeTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this DetectorTypeTypeType
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
        members.put("EM", EM);
        members.put("PM", PM);
        members.put("MPC", MPC);
        members.put("Frequency", FREQUENCY);
        members.put("other", OTHER);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * DetectorTypeTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new DetectorTypeTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.DetectorTypeTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid DetectorTypeTypeType";
            throw new IllegalArgumentException(err);
        }
        return (DetectorTypeTypeType) obj;
    } //-- org.psi.ms.model.types.DetectorTypeTypeType valueOf(java.lang.String) 

}
