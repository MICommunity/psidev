/**
 * $Id: ParseListener.java,v 1.2 2003/11/28 15:46:50 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 11, 2003
 * Time: 3:04:48 PM
 */
package org.psi.ms.converter;

/**
 * This interface is used for communication between Converter and GUI.
 *
 * @author lbower
 */
public interface ParseListener {
    public void fileParsed();

    public void indeterminiteProcess();

    public void setMessage(String message);

    void setMax(int piMax);

    void increment();
}
