/**
 * $Id: ParseListener.java,v 1.1 2003/09/11 15:38:59 krunte Exp $
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
}
