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

    public void formatText() {
        System.out.println("text is " + getText());
        if (getText().compareTo("") != 0) {
            super.setText(Float.valueOf(getText()).toString());
        }
    }

    protected Document createDefaultModel() {
        return new WholeNumberDocument();
    }

    protected class WholeNumberDocument extends PlainDocument {

        public void insertString(int offs,
                                 String str,
                                 AttributeSet a)
                throws BadLocationException {

//            System.out.println("offs " + offs);
//            System.out.println("length " + this.getLength());

            String oCurrentText = this.getText(0, offs);
            oCurrentText += str;
            if (offs < this.getLength()) {
                oCurrentText += this.getText(offs, this.getLength() - offs);
            }

//            System.out.println("current text is " + oCurrentText);

            try {
                Float oValue = Float.valueOf(oCurrentText);
                //System.out.println(oValue.floatValue());
                if (oValue.isInfinite()) {
                    toolkit.beep();
                    System.out.println("no infinite values");
                    return;
                }
            } catch (NumberFormatException e) {
                toolkit.beep();
                System.out.println("number format exception");
                return;
            }

            super.insertString(offs, str, a);
        }
    }
}
