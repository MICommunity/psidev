package org.psi.ms.swing;

import org.psi.ms.model.ProcessingMethod;
import org.psi.ms.model.Test;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.prefs.Preferences;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 10, 2003
 * Time: 1:41:22 PM
 * To change this template use Options | File Templates.
 */
public class TestPanel extends JPanel {

    Preferences oPrefs = Preferences.userNodeForPackage(this.getClass());

    JTextField oPeakProcessingField;
    FloatField oPeakThresholdField;
    JCheckBox oPeakprocessingBox;
    JCheckBox oDeIsotopedBox;
    JCheckBox oChargeDeconvolvedBox;

    public TestPanel() {
        prepareFields();
        layoutPanel();
        getDefaultFieldValues();
    }

    private void layoutPanel() {

        this.setLayout(new BorderLayout());
        this.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Test"),
                        new EmptyBorder(3, 3, 3, 3)));

        JPanel oInnerPanel = new JPanel(new GridLayout(3, 0));
        //oInnerPanel.add(oPeakprocessingBox);
        oInnerPanel.add(new ContainedJComponent("Processing", oPeakProcessingField, 6));
        oInnerPanel.add(new ContainedJComponent("Threshold", oPeakThresholdField));
        FlowLayout oLayout = new FlowLayout(FlowLayout.LEFT,0,0);
        JPanel oCheckPanel = new JPanel(oLayout);
        oCheckPanel.add(new ContainedJComponent("Deisotoped ?", oDeIsotopedBox));
        oCheckPanel.add(Box.createRigidArea(new Dimension(50,0)));
        oCheckPanel.add(new ContainedJComponent("Deconvolved ?", oChargeDeconvolvedBox));
        oInnerPanel.add(oCheckPanel);

        this.add(oInnerPanel, BorderLayout.NORTH);
    }

    private void prepareFields() {

        //todo does this field need validating?
        oPeakProcessingField = new JTextField();
        oPeakProcessingField.setMargin(new Insets(0, 2, 0, 2));
        oPeakThresholdField = new FloatField();
        oPeakThresholdField.setMargin(new Insets(0, 2, 0, 2));

        oPeakprocessingBox = new JCheckBox();
        oPeakprocessingBox.setSelected(true);
        oDeIsotopedBox = new JCheckBox();
        oDeIsotopedBox.setSelected(true);
        oChargeDeconvolvedBox = new JCheckBox();
        oChargeDeconvolvedBox.setSelected(true);

        oPeakprocessingBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    oPeakProcessingField.setEditable(true);
                } else {
                    oPeakProcessingField.setEditable(false);
                }
            }
        });
    }

    private void getDefaultFieldValues() {
        oPeakProcessingField.setText(oPrefs.get("PeakProcessing", "?"));
        oPeakThresholdField.setText(oPrefs.get("PeakThreshold", "13"));
        oDeIsotopedBox.setSelected(oPrefs.getBoolean("DeIsotoped", true));
        oChargeDeconvolvedBox.setSelected(oPrefs.getBoolean("ChargeDeconvolved", true));
    }

    void setDefaultFieldValues() {
        oPrefs.put("PeakProcessing", oPeakProcessingField.getText());
        oPrefs.put("PeakThreshold", oPeakThresholdField.getText());
        oPrefs.putBoolean("DeIsotoped", oDeIsotopedBox.isSelected());
        oPrefs.putBoolean("ChargeDeconvolved", oChargeDeconvolvedBox.isSelected());
    }

    Test getTest() {
        Test oData = new Test();

        ProcessingMethod oMethod = new ProcessingMethod();
        oMethod.setPeakProcessing(oPeakProcessingField.getText());
        oMethod.setDeisotoped(oDeIsotopedBox.isSelected());
        oMethod.setChargeDeconvolved(oChargeDeconvolvedBox.isSelected());
        oMethod.setPeakThreshold(new Float(oPeakThresholdField.getText()).floatValue());

        oData.setProcessingMethod(oMethod);
        return oData;
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new TestPanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);
    }

}
