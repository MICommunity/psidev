/**
 * $Id: MultiTypeValue.java,v 1.1 2003/09/11 16:31:56 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Sep 11, 2003
 * Time: 5:26:33 PM
 */
package org.psi.ms.model;

import java.util.Date;
import java.net.URI;

/**
 * 
 * @author krunte
 */
public class MultiTypeValue {
    /**
     * the actual value of the core parameter
     */
    private Object _value;
    /**
     * the current class of the value
     */
    private Class _valueClass;

    public MultiTypeValue() {
        super();
    }

    /**
     * Returns the value of the coreParameter.
     *
     * @return the value of the coreParameter.
     */
    public Object getValue() {
        return this._value;
    }

    /**
     * Returns the class of the current value of the coreParameter.
     *
     * @return the class of the current value of the coreParameter.
     */
    public Class getValueClass() {
        return _valueClass;
    }

    /**
     * Sets a String as the value of the coreParameter.
     *
     * @param value the value to be set.
     */
    public void setValue(String value) {
        this._value = value;
        this._valueClass = value.getClass();
    }

    /**
     * Sets a Integer as the value of the coreParameter.
     *
     * @param value the value to be set.
     */
    public void setValue(Integer value) {
        this._value = value;
        this._valueClass = value.getClass();
    }

    /**
     * Sets a Float as the value of the coreParameter.
     *
     * @param value the value to be set.
     */
    public void setValue(Float value) {
        this._value = value;
        this._valueClass = value.getClass();
    }

    /**
     * Sets a Date as the value of the coreParameter.
     *
     * @param value the value to be set.
     */
    public void setValue(Date value) {
        this._value = value;
        this._valueClass = value.getClass();
    }

    /**
     * Sets a URI as the value of the coreParameter.
     *
     * @param value the value to be set.
     */
    public void setValue(URI value) {
        this._value = value;
        this._valueClass = value.getClass();
    }
}
