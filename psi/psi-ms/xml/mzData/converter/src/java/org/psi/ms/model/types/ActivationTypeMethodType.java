/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: ActivationTypeMethodType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class ActivationTypeMethodType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class ActivationTypeMethodType implements java.io.Serializable {


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
    public static final ActivationTypeMethodType CID = new ActivationTypeMethodType(CID_TYPE, "CID");

    /**
     * The PD type
     */
    public static final int PD_TYPE = 1;

    /**
     * The instance of the PD type
     */
    public static final ActivationTypeMethodType PD = new ActivationTypeMethodType(PD_TYPE, "PD");

    /**
     * The SID type
     */
    public static final int SID_TYPE = 2;

    /**
     * The instance of the SID type
     */
    public static final ActivationTypeMethodType SID = new ActivationTypeMethodType(SID_TYPE, "SID");

    /**
     * The ECD type
     */
    public static final int ECD_TYPE = 3;

    /**
     * The instance of the ECD type
     */
    public static final ActivationTypeMethodType ECD = new ActivationTypeMethodType(ECD_TYPE, "ECD");

    /**
     * The other type
     */
    public static final int OTHER_TYPE = 4;

    /**
     * The instance of the other type
     */
    public static final ActivationTypeMethodType OTHER = new ActivationTypeMethodType(OTHER_TYPE, "other");

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

    private ActivationTypeMethodType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.ActivationTypeMethodType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of ActivationTypeMethodType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * ActivationTypeMethodType
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
        members.put("CID", CID);
        members.put("PD", PD);
        members.put("SID", SID);
        members.put("ECD", ECD);
        members.put("other", OTHER);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * ActivationTypeMethodType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new ActivationTypeMethodType based
     * on the given String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.ActivationTypeMethodType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid ActivationTypeMethodType";
            throw new IllegalArgumentException(err);
        }
        return (ActivationTypeMethodType) obj;
    } //-- org.psi.ms.model.types.ActivationTypeMethodType valueOf(java.lang.String) 

}
