package org.psi.ms.swing;

import org.psi.ms.xml.MzDataWriter;

import javax.swing.*;
import java.awt.*;
import java.util.prefs.Preferences;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 17, 2003
 * Time: 4:31:57 PM
 * To change this template use Options | File Templates.
 */
public class OutputTypePanel extends JPanel {

    //MzDataWriter.OutputType.

    Preferences oPrefs = Preferences.userNodeForPackage(this.getClass());

    JRadioButton oBase64Button;
    JRadioButton oXMLButton;

    public OutputTypePanel() {
        prepareFields();
        layoutPanel();
        getDefaultFieldValues();
    }

    private void layoutPanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        this.add(oBase64Button);
        this.add(oXMLButton);

    }

    private void prepareFields() {
        oBase64Button = new JRadioButton("Base 64");
        oXMLButton = new JRadioButton("XML");
        oBase64Button.setFont(MainPanel.FONT);
        oXMLButton.setFont(MainPanel.FONT);
        oBase64Button.setSize(oBase64Button.getPreferredSize().width,10);
        oXMLButton.setSize(oXMLButton.getPreferredSize().width,10);

        ButtonGroup oGroup = new ButtonGroup();
        oGroup.add(oBase64Button);
        oGroup.add(oXMLButton);
    }

    private void getDefaultFieldValues() {
        String outputTypeString = oPrefs.get("OutputType" , null);
        if (outputTypeString != null) {
            try {
                MzDataWriter.OutputType outputType = MzDataWriter.OutputType.valueOf(outputTypeString);
                switch (outputType.getType()) {
                    case MzDataWriter.OutputType.BASE64_TYPE:
                        oBase64Button.setSelected(true);
                        break;
                    case MzDataWriter.OutputType.XML_TYPE:
                        oXMLButton.setSelected(true);
                        break;
                }
            } catch (IllegalArgumentException e) {
                oBase64Button.setSelected(true);
                oPrefs.put("OutputType", MzDataWriter.OutputType.BASE64.toString());
            }

        } else {
            oBase64Button.setSelected(true);
            oPrefs.put("OutputType", MzDataWriter.OutputType.BASE64.toString());
        }
    }

    void setDefaultFieldValues() {
        //code using the prefs will go here
        if (oBase64Button.isSelected()) {
            oPrefs.put("OutputType", MzDataWriter.OutputType.BASE64.toString());
        } else {
            oPrefs.put("OutputType", MzDataWriter.OutputType.XML.toString());
        }
    }

    MzDataWriter.OutputType getOutputType() {
        if (oBase64Button.isSelected()) {
            return MzDataWriter.OutputType.BASE64;
        } else {
            return MzDataWriter.OutputType.XML;
        }
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new OutputTypePanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);

    }
}
