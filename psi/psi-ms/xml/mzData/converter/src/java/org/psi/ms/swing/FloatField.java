package org.psi.ms.swing;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.NumberFormat;

public class FloatField extends JTextField {
    private Toolkit toolkit;
    private NumberFormat integerFormatter;

    public FloatField() {
        super();
        toolkit = Toolkit.getDefaultToolkit();
        this.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                formatText();
            }

        });
    }


    /**
     * Formats the text to the string representation of a float upon loosing focus.
     */
    public void formatText() {
        if (getText().compareTo("") != 0) {
            super.setText(Float.valueOf(getText()).toString());
        }
    }

    protected Document createDefaultModel() {
        return new FloatDocument();
    }

    /**
     * ENSURES THAT THE ENTERED TEXT CAN BE CAST TO A FLOAT, IF NO, WILL BEEP
     * AND FAIL TO ENTER THE TEXT
     *
     */
    protected class FloatDocument extends PlainDocument {

        public void insertString(int offs,
                                 String str,
                                 AttributeSet a)
                throws BadLocationException {

            String oCurrentText = this.getText(0, offs);
            oCurrentText += str;
            if (offs < this.getLength()) {
                oCurrentText += this.getText(offs, this.getLength() - offs);
            }

            try {
                Float oValue = Float.valueOf(oCurrentText);
                if (oValue.isInfinite()) {
                    toolkit.beep();
                    System.out.println("no infinite values");
                    return;
                }
            }
            catch (NumberFormatException e) {
                toolkit.beep();
                System.out.println("number format exception");
                return;
            }

            super.insertString(offs, str, a);
        }
    }
}
