/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AnalyzerTypeTypeType.java,v 1.1 2003/08/11 17:30:00 krunte Exp $
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
 * Class AnalyzerTypeTypeType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/08/11 17:30:00 $
 */
public class AnalyzerTypeTypeType implements java.io.Serializable {


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
    public static final AnalyzerTypeTypeType LINEARQUAD = new AnalyzerTypeTypeType(LINEARQUAD_TYPE, "LinearQuad");

    /**
     * The PaulTrap type
     */
    public static final int PAULTRAP_TYPE = 1;

    /**
     * The instance of the PaulTrap type
     */
    public static final AnalyzerTypeTypeType PAULTRAP = new AnalyzerTypeTypeType(PAULTRAP_TYPE, "PaulTrap");

    /**
     * The LinearTrap type
     */
    public static final int LINEARTRAP_TYPE = 2;

    /**
     * The instance of the LinearTrap type
     */
    public static final AnalyzerTypeTypeType LINEARTRAP = new AnalyzerTypeTypeType(LINEARTRAP_TYPE, "LinearTrap");

    /**
     * The TOF type
     */
    public static final int TOF_TYPE = 3;

    /**
     * The instance of the TOF type
     */
    public static final AnalyzerTypeTypeType TOF = new AnalyzerTypeTypeType(TOF_TYPE, "TOF");

    /**
     * The Kingdon type
     */
    public static final int KINGDON_TYPE = 4;

    /**
     * The instance of the Kingdon type
     */
    public static final AnalyzerTypeTypeType KINGDON = new AnalyzerTypeTypeType(KINGDON_TYPE, "Kingdon");

    /**
     * The Sector type
     */
    public static final int SECTOR_TYPE = 5;

    /**
     * The instance of the Sector type
     */
    public static final AnalyzerTypeTypeType SECTOR = new AnalyzerTypeTypeType(SECTOR_TYPE, "Sector");

    /**
     * The ICR type
     */
    public static final int ICR_TYPE = 6;

    /**
     * The instance of the ICR type
     */
    public static final AnalyzerTypeTypeType ICR = new AnalyzerTypeTypeType(ICR_TYPE, "ICR");

    /**
     * The other type
     */
    public static final int OTHER_TYPE = 7;

    /**
     * The instance of the other type
     */
    public static final AnalyzerTypeTypeType OTHER = new AnalyzerTypeTypeType(OTHER_TYPE, "other");

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

    private AnalyzerTypeTypeType(int type, java.lang.String value) {
        super();
        this.type = type;
        this.stringValue = value;
    } //-- org.psi.ms.model.types.AnalyzerTypeTypeType(int, java.lang.String)


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method enumerateReturns an enumeration of all possible
     * instances of AnalyzerTypeTypeType
     */
    public static java.util.Enumeration enumerate()
    {
        return _memberTable.elements();
    } //-- java.util.Enumeration enumerate() 

    /**
     * Method getTypeReturns the type of this AnalyzerTypeTypeType
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
     * AnalyzerTypeTypeType
     */
    public java.lang.String toString()
    {
        return this.stringValue;
    } //-- java.lang.String toString() 

    /**
     * Method valueOfReturns a new AnalyzerTypeTypeType based on
     * the given String value.
     * 
     * @param string
     */
    public static org.psi.ms.model.types.AnalyzerTypeTypeType valueOf(java.lang.String string)
    {
        java.lang.Object obj = null;
        if (string != null) obj = _memberTable.get(string);
        if (obj == null) {
            String err = "'" + string + "' is not a valid AnalyzerTypeTypeType";
            throw new IllegalArgumentException(err);
        }
        return (AnalyzerTypeTypeType) obj;
    } //-- org.psi.ms.model.types.AnalyzerTypeTypeType valueOf(java.lang.String) 

}
