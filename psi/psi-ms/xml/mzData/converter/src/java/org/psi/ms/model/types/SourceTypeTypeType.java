/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: SourceTypeTypeType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class SourceTypeTypeType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class SourceTypeTypeType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The ESI type
     */
    public static final int ESI_TYPE = 0;

    /**
     * The instance of the ESI type
     */
    public static final SourceTypeTypeType ESI = new SourceTypeTypeType(ESI_TYPE, "ESI");

    /**
     * The uESI type
     */
    public static final int UESI_TYPE = 1;

    /**
     * The instance of the uESI type
     */
    public static final SourceTypeTypeType UESI = new SourceTypeTypeType(UESI_TYPE, "uESI");

    /**
     * The nESI type
     */
    public static final int NESI_TYPE = 2;

    /**
     * The instance of the nESI type
     */
    public static final SourceTypeTypeType NESI = new SourceTypeTypeType(NESI_TYPE, "nESI");

    /**
     * The MALDI type
     */
    public static final int MALDI_TYPE = 3;

    /**
     * The instance of the MALDI type
     */
    public static final SourceTypeTypeType MALDI = new SourceTypeTypeType(MALDI_TYPE, "MALDI");

    /**
     * The APCI type
     */
    public static final int APCI_TYPE = 4;

    /**
     * The instance of the APCI type
     */
    public static final SourceTypeTypeType APCI = new SourceTypeTypeType(APCI_TYPE, "APCI");

    /**
     * The other type
     */
    public static final int OTHER_TYPE = 5;

    /**
     * The instance of the other type
     */
    public static final SourceTypeTypeType OTHER = new SourceTypeTypeType(OTHER_TYPE, "other");

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

    private SourceTypeTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.SourceTypeTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of SourceTypeTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this SourceTypeTypeType
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
        members.put("ESI", ESI);
        members.put("uESI", UESI);
        members.put("nESI", NESI);
        members.put("MALDI", MALDI);
        members.put("APCI", APCI);
        members.put("other", OTHER);
        return members;
    } //-- java.util.Hashtable init() 

    /**
     * Method toStringReturns the String representation of this
     * SourceTypeTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new SourceTypeTypeType based on the
     * given String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.SourceTypeTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid SourceTypeTypeType";
            throw new IllegalArgumentException(err);
        }
        return (SourceTypeTypeType) obj;
    } //-- org.psi.ms.model.types.SourceTypeTypeType valueOf(java.lang.String) 

}
