package org.psi.ms.swing;

import org.psi.ms.model.ProcessingMethod;
import org.psi.ms.model.Test;
import org.psi.ms.converter.ProvidedDataItem;
import org.psi.ms.view.TestData;
import org.psi.ms.view.ProcessingMethodData;

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

    private TestData testData;
    private ProcessingMethodData processingMethodData;

    JTextField oPeakProcessingField;
    FloatField oPeakThresholdField;
    JCheckBox oPeakprocessingBox;
    JCheckBox oDeIsotopedBox;
    JCheckBox oChargeDeconvolvedBox;

//    private boolean populated = false;

    public TestPanel() {
        prepareFields();
        layoutPanel();
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
        FlowLayout oLayout = new FlowLayout(FlowLayout.LEFT, 0, 0);
        JPanel oCheckPanel = new JPanel(oLayout);
        oCheckPanel.add(new ContainedJComponent("Deisotoped ?", oDeIsotopedBox));
        oCheckPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        oCheckPanel.add(new ContainedJComponent("Deconvolved ?", oChargeDeconvolvedBox));
        oInnerPanel.add(oCheckPanel);

        this.add(oInnerPanel, BorderLayout.NORTH);
    }

    private void prepareFields() {

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
                }
                else {
                    oPeakProcessingField.setEditable(false);
                }
            }
        });
    }

    void setData(TestData testData, ProcessingMethodData processingMethodData) {
        this.testData = testData;
        this.processingMethodData = processingMethodData;
//        this.setPopulated(true);
        getDefaultFieldValues();
    }

    public boolean isPopulated() {
        if (testData == null) {
            return false;
        }
        return testData.isPopulated();
    }

//    private void setPopulated(boolean populated) {
//        this.populated = populated;
//    }

    protected void getDefaultFieldValues() {
        if (processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING)) {
            oPeakProcessingField.setText(oPrefs.get("PeakProcessing", "?"));
        }
        if (processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD)) {
            oPeakThresholdField.setText(oPrefs.get("PeakThreshold", "13"));
        }
        if (processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_DEISOTOPED)) {
            oDeIsotopedBox.setSelected(oPrefs.getBoolean("DeIsotoped", true));
        }
        if (processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED)) {
            oChargeDeconvolvedBox.setSelected(oPrefs.getBoolean("ChargeDeconvolved", true));
        }
    }

    void refreshFieldValues() {
        if (isPopulated()) {
            oPeakProcessingField.setText(processingMethodData.getProcessingMethod().getPeakProcessing());
            oPeakThresholdField.setText(new Float(processingMethodData.getProcessingMethod().getPeakThreshold()).toString());
            oDeIsotopedBox.setSelected(processingMethodData.getProcessingMethod().getDeisotoped());
            oChargeDeconvolvedBox.setSelected(processingMethodData.getProcessingMethod().getChargeDeconvolved());
            //getDefaultFieldValues();
        }
        else {//dataobject empty so clear fields
            setFieldActivation(false);
        }
    }

    void setDefaultFieldValues() {
        oPrefs.put("PeakProcessing", oPeakProcessingField.getText());
        oPrefs.put("PeakThreshold", oPeakThresholdField.getText());
        oPrefs.putBoolean("DeIsotoped", oDeIsotopedBox.isSelected());
        oPrefs.putBoolean("ChargeDeconvolved", oChargeDeconvolvedBox.isSelected());
    }

    void setFieldActivation() {

        if (isPopulated()) {
            setFieldActivation(true);

            if (!processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING)) {
                oPeakProcessingField.setEnabled(false);
            }

            if (!processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD)) {
                oPeakThresholdField.setEnabled(false);
            }

            if (!processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_DEISOTOPED)) {
                oDeIsotopedBox.setEnabled(false);
            }

            if (!processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED)) {
                oChargeDeconvolvedBox.setEnabled(false);
            }
        }
    }

    private void setFieldActivation(boolean activate) {
        oPeakProcessingField.setEnabled(activate);
        oPeakThresholdField.setEnabled(activate);
        oDeIsotopedBox.setEnabled(activate);
        oChargeDeconvolvedBox.setEnabled(activate);
    }

    void setDataValues() {
        if (isPopulated()) {
            if (processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING)) {
                processingMethodData.getProcessingMethod().setPeakProcessing(oPeakProcessingField.getText());
            }

            if (!processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_DEISOTOPED)) {
                processingMethodData.getProcessingMethod().setDeisotoped(oDeIsotopedBox.isSelected());
            }

            if (!processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED)) {
                processingMethodData.getProcessingMethod().setChargeDeconvolved(oChargeDeconvolvedBox.isSelected());
            }

            if (!processingMethodData.isFieldActive(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD)) {
                processingMethodData.getProcessingMethod().setPeakThreshold(new Float(oPeakThresholdField.getText()).floatValue());
            }
        }
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new TestPanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);
    }

}
