/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: InstrumentAcqSettingsTypeAcqTypeType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class InstrumentAcqSettingsTypeAcqTypeType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class InstrumentAcqSettingsTypeAcqTypeType implements java.io.Serializable {


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
    public static final InstrumentAcqSettingsTypeAcqTypeType FULL = new InstrumentAcqSettingsTypeAcqTypeType(FULL_TYPE, "full");

    /**
     * The zoom type
     */
    public static final int ZOOM_TYPE = 1;

    /**
     * The instance of the zoom type
     */
    public static final InstrumentAcqSettingsTypeAcqTypeType ZOOM = new InstrumentAcqSettingsTypeAcqTypeType(ZOOM_TYPE, "zoom");

    /**
     * The SIM type
     */
    public static final int SIM_TYPE = 2;

    /**
     * The instance of the SIM type
     */
    public static final InstrumentAcqSettingsTypeAcqTypeType SIM = new InstrumentAcqSettingsTypeAcqTypeType(SIM_TYPE, "SIM");

    /**
     * The SRM type
     */
    public static final int SRM_TYPE = 3;

    /**
     * The instance of the SRM type
     */
    public static final InstrumentAcqSettingsTypeAcqTypeType SRM = new InstrumentAcqSettingsTypeAcqTypeType(SRM_TYPE, "SRM");

    /**
     * The MRM type
     */
    public static final int MRM_TYPE = 4;

    /**
     * The instance of the MRM type
     */
    public static final InstrumentAcqSettingsTypeAcqTypeType MRM = new InstrumentAcqSettingsTypeAcqTypeType(MRM_TYPE, "MRM");

    /**
     * The Q1 type
     */
    public static final int Q1_TYPE = 5;

    /**
     * The instance of the Q1 type
     */
    public static final InstrumentAcqSettingsTypeAcqTypeType Q1 = new InstrumentAcqSettingsTypeAcqTypeType(Q1_TYPE, "Q1");

    /**
     * The Q3 type
     */
    public static final int Q3_TYPE = 6;

    /**
     * The instance of the Q3 type
     */
    public static final InstrumentAcqSettingsTypeAcqTypeType Q3 = new InstrumentAcqSettingsTypeAcqTypeType(Q3_TYPE, "Q3");

    /**
     * The ICR type
     */
    public static final int ICR_TYPE = 7;

    /**
     * The instance of the ICR type
     */
    public static final InstrumentAcqSettingsTypeAcqTypeType ICR = new InstrumentAcqSettingsTypeAcqTypeType(ICR_TYPE, "ICR");

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

    private InstrumentAcqSettingsTypeAcqTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of InstrumentAcqSettingsTypeAcqTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this
     * InstrumentAcqSettingsTypeAcqTypeType
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
     * InstrumentAcqSettingsTypeAcqTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new
     * InstrumentAcqSettingsTypeAcqTypeType based on the given
     * String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid InstrumentAcqSettingsTypeAcqTypeType";
            throw new IllegalArgumentException(err);
        }
        return (InstrumentAcqSettingsTypeAcqTypeType) obj;
    } //-- org.psi.ms.model.types.InstrumentAcqSettingsTypeAcqTypeType valueOf(java.lang.String) 

}
