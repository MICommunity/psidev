/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: MzArrayBinaryType.java,v 1.3 2003/08/28 15:17:12 krunte Exp $
 */

package org.psi.ms.model;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/


/**
 * Class MzArrayBinaryType.
 *
 * @version $Revision: 1.3 $ $Date: 2003/08/28 15:17:12 $
 */
public abstract class MzArrayBinaryType implements java.io.Serializable {


    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _data
     */
    private org.psi.ms.model.Data _data;


    //----------------/
    //- Constructors -/
    //----------------/

    public MzArrayBinaryType() {
        super();
    } //-- org.psi.ms.model.MzArrayBinaryType()


    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'data'.
     *
     * @return the value of field 'data'.
     */
    public org.psi.ms.model.Data getData() {
        return this._data;
    } //-- org.psi.ms.model.Data getData()

    /**
     * Sets the value of field 'data'.
     *
     * @param data the value of field 'data'.
     */
    public void setData(org.psi.ms.model.Data data) {
        this._data = data;
    } //-- void setData(org.psi.ms.model.Data)

}
