package org.psi.ms.swing;

import org.psi.ms.model.Source;
import org.psi.ms.model.Analyzer;
import org.psi.ms.model.Detector;
import org.psi.ms.model.InstrumentCommonSettings;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.Vector;
import java.util.Enumeration;
import java.util.prefs.Preferences;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 10, 2003
 * Time: 10:39:12 AM
 * To change this template use Options | File Templates.
 */
public class InstrumentSettingsPanel extends JPanel {

    Preferences oPrefs = Preferences.userNodeForPackage(this.getClass());

    private JComboBox oSourceTypeBox;
    private JComboBox oAnalyzerTypeBox;
    private JComboBox oDetectorTypeBox;
    private DefaultComboBoxModel oSourceBoxModel;
    private DefaultComboBoxModel oAnalyzerTypeBoxModel;
    private DefaultComboBoxModel oDetectorTypeBoxModel;

    private JTextField oInstrumentNameField;
    private FloatField oResolutionField;
    private FloatField oAccuracyField;

    public InstrumentSettingsPanel() {
        prepareFields();
        layoutPanel();
        getDefaultFieldValues();
    }

    private void layoutPanel() {

        this.setLayout(new BorderLayout());
        JPanel oInnerPanel = new JPanel();
        oInnerPanel.setLayout(new BoxLayout(oInnerPanel, BoxLayout.Y_AXIS));
        this.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Common Instrument Settings"),
                        new EmptyBorder(3, 3, 3, 3)));


        JPanel oSourcePanel = new JPanel();
        oSourcePanel.setLayout(new BoxLayout(oSourcePanel, BoxLayout.Y_AXIS));
        oSourcePanel.setBorder(new CompoundBorder
                (new TitledBorder(new LineBorder(Color.black,1), "Source"),
                        new EmptyBorder(3, 3, 3, 3)));

        oSourcePanel.add(new ContainedJComponent("Type",oSourceTypeBox,5));

        JPanel oAnalyzerPanel = new JPanel();
        oAnalyzerPanel.setLayout(new BoxLayout(oAnalyzerPanel, BoxLayout.Y_AXIS));
        oAnalyzerPanel.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Analyzer"),
                        new EmptyBorder(3, 3, 3, 3)));

        oAnalyzerPanel.add(new ContainedJComponent("Type",oAnalyzerTypeBox,35));
        oAnalyzerPanel.add(new ContainedJComponent("Resolution",oResolutionField,5));
        oAnalyzerPanel.add(new ContainedJComponent("Accuracy",oAccuracyField,13));

        oSourcePanel.add(oAnalyzerPanel);

        JPanel oDetectorPanel = new JPanel();
        oDetectorPanel.setLayout(new BoxLayout(oDetectorPanel, BoxLayout.Y_AXIS));
        oDetectorPanel.setBorder(new CompoundBorder
                (new TitledBorder(new LineBorder(Color.black,1), "Detector"),
                        new EmptyBorder(3, 3, 3, 3)));

        oDetectorPanel.add(new ContainedJComponent("Type",oDetectorTypeBox,5));

        oInnerPanel.add(new ContainedJComponent("Name",oInstrumentNameField,6));
        oInnerPanel.add(oSourcePanel);
        oInnerPanel.add(oDetectorPanel);
        this.add(oInnerPanel, BorderLayout.NORTH);

    }

    private void prepareFields() {

        float ofloat = 2221.2345678456F;
        System.out.println("float is " + ofloat);

        DecimalFormat oFormat = (DecimalFormat)NumberFormat.getNumberInstance();
        oFormat.setGroupingUsed(false);
        //oFormat.applyPattern("########");
        oInstrumentNameField = new JTextField();
        oInstrumentNameField.setMargin(new Insets(0,2,0,2));
        //todo this field needs validating for floats
        oResolutionField = new FloatField();
        oResolutionField.setMargin(new Insets(0,2,0,2));
        //todo this field needs validating for floats
        oAccuracyField = new FloatField();
        oAccuracyField.setMargin(new Insets(0,2,0,2));

        Vector oSourceTypes = new Vector();
        Enumeration oEnr = Source.Type.enumerate();
        while (oEnr.hasMoreElements()) {
            oSourceTypes.add(oEnr.nextElement());
        }

        oSourceBoxModel = new DefaultComboBoxModel(oSourceTypes);
        oSourceTypeBox = new JComboBox(oSourceBoxModel);
        oSourceTypeBox.setFont(MainPanel.FONT);
        oSourceTypeBox.setBackground(Color.white);

        Vector oAnalyzerTypes = new Vector();
        oEnr = Analyzer.Type.enumerate();
        while (oEnr.hasMoreElements()) {
            oAnalyzerTypes.add(oEnr.nextElement());
        }
        oAnalyzerTypeBoxModel = new DefaultComboBoxModel(oAnalyzerTypes);
        oAnalyzerTypeBox = new JComboBox(oAnalyzerTypeBoxModel);
        oAnalyzerTypeBox.setFont(MainPanel.FONT);

        Vector oDetectorTypes = new Vector();
        oEnr = Detector.Type.enumerate();
        while (oEnr.hasMoreElements()) {
            oDetectorTypes.add(oEnr.nextElement());
        }

        oDetectorTypeBoxModel = new DefaultComboBoxModel(oDetectorTypes);
        oDetectorTypeBox = new JComboBox(oDetectorTypeBoxModel);
        oDetectorTypeBox.setFont(MainPanel.FONT);

    }

    private void getDefaultFieldValues() {
        oInstrumentNameField.setText(oPrefs.get("InstrumentName", "Default name"));
        oResolutionField.setText(oPrefs.get("Resolution", "-1"));
        oAccuracyField.setText(oPrefs.get("Accuracy", "-1"));
        oSourceTypeBox.setSelectedItem(Source.Type.valueOf(oPrefs.get("SourceType","other")));
        oAnalyzerTypeBox.setSelectedItem(Analyzer.Type.valueOf(oPrefs.get("AnalyzerType","other")));
        oDetectorTypeBox.setSelectedItem(Detector.Type.valueOf(oPrefs.get("DetectorType","other")));
    }

    void setDefaultFieldValues() {
        oPrefs.put("InstrumentName", oInstrumentNameField.getText());
        oPrefs.put("Resolution", oResolutionField.getText());
        oPrefs.put("Accuracy", oAccuracyField.getText());
        oPrefs.put("SourceType",oSourceTypeBox.getSelectedItem().toString());
        oPrefs.put("AnalyzerType",oAnalyzerTypeBox.getSelectedItem().toString());
        oPrefs.put("DetectorType",oDetectorTypeBox.getSelectedItem().toString());
    }

    InstrumentCommonSettings getSettings() {
        InstrumentCommonSettings oSettings = new InstrumentCommonSettings();
        Source oSource = new Source();
        Analyzer oAnalyzer = new Analyzer();
        Detector oDetector = new Detector();

        oSource.setType(((Source.Type) oSourceTypeBox.getSelectedItem()));
        oAnalyzer.setType(((Analyzer.Type) oAnalyzerTypeBox.getSelectedItem()));
        //need to add verifiacion to this field
        oAnalyzer.setResolution(new Float(oResolutionField.getText()).floatValue());
        //need to add verifiacion to this field
        oAnalyzer.setAccuracy(new Float(oAccuracyField.getText()).floatValue());

        oDetector.setType(((Detector.Type) oDetectorTypeBox.getSelectedItem()));

        oSettings.setSource(oSource);
        oSettings.setInstName(oInstrumentNameField.getText());
        oSettings.setAnalyzer(oAnalyzer);
        oSettings.setDetector(oDetector);

        return oSettings;
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new InstrumentSettingsPanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);
    }

}
