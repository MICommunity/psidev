/**
 * $Id: PsiMsConverterException.java,v 1.3 2003/09/15 12:44:58 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 5:45:33 PM
 */
package org.psi.ms.helper;

/**
 *
 * @author krunte
 */
public class PsiMsConverterException extends Exception {

    public PsiMsConverterException(String message) {
        super(message);
    }

    public PsiMsConverterException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public PsiMsConverterException(Throwable throwable) {
        super(throwable);
    }

}
