/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: MzArrayBinary.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/



/**
 * Here the list of m/z values (for any type of spectrum). If this
 * is a true mass spectrum, then z=1. The array is stored as a
 * base64 encoded binary. The only type allowed is IEEE-754
 * floating point and the precision must be specified as either 32
 * or 64.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
 */
public class MzArrayBinary extends MzArrayBinaryType
        implements java.io.Serializable {


    //----------------/
    //- Constructors -/
    //----------------/

    public MzArrayBinary() {
        super();
    } //-- org.psi.ms.model.MzArrayBinary()


    //-----------/
    //- Methods -/
    //-----------/

}
