package org.psi.ms.swing;

import org.psi.ms.model.Source;
import org.psi.ms.model.Analyzer;
import org.psi.ms.model.Detector;
import org.psi.ms.model.InstrumentCommonSettings;
import org.psi.ms.converter.ProvidedDataItem;
import org.psi.ms.view.InstrumentCommonSettingsData;
import org.psi.ms.view.SourceData;
import org.psi.ms.view.AnalyzerData;
import org.psi.ms.view.DetectorData;

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

    //these are the data objects we are providing a view on
    private InstrumentCommonSettingsData instrumentCommonSettingsData;
    private SourceData sourceData;
    private AnalyzerData analyzerData;
    private DetectorData detectorData;

    private JComboBox oSourceTypeBox;
    private JComboBox oAnalyzerTypeBox;
    private JComboBox oDetectorTypeBox;
    private DefaultComboBoxModel oSourceBoxModel;
    private DefaultComboBoxModel oAnalyzerTypeBoxModel;
    private DefaultComboBoxModel oDetectorTypeBoxModel;

    private JTextField oInstrumentNameField;
    private FloatField oResolutionField;
    private FloatField oAccuracyField;

//    private boolean populated = false;

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
                (new TitledBorder(new LineBorder(Color.black, 1), "Source"),
                        new EmptyBorder(3, 3, 3, 3)));

        oSourcePanel.add(new ContainedJComponent("Type", oSourceTypeBox, 5));

        JPanel oAnalyzerPanel = new JPanel();
        oAnalyzerPanel.setLayout(new BoxLayout(oAnalyzerPanel, BoxLayout.Y_AXIS));
        oAnalyzerPanel.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Analyzer"),
                        new EmptyBorder(3, 3, 3, 3)));

        oAnalyzerPanel.add(new ContainedJComponent("Type", oAnalyzerTypeBox, 35));
        oAnalyzerPanel.add(new ContainedJComponent("Resolution", oResolutionField, 5));
        oAnalyzerPanel.add(new ContainedJComponent("Accuracy", oAccuracyField, 13));

        oSourcePanel.add(oAnalyzerPanel);

        JPanel oDetectorPanel = new JPanel();
        oDetectorPanel.setLayout(new BoxLayout(oDetectorPanel, BoxLayout.Y_AXIS));
        oDetectorPanel.setBorder(new CompoundBorder
                (new TitledBorder(new LineBorder(Color.black, 1), "Detector"),
                        new EmptyBorder(3, 3, 3, 3)));

        oDetectorPanel.add(new ContainedJComponent("Type", oDetectorTypeBox, 5));

        oInnerPanel.add(new ContainedJComponent("Name", oInstrumentNameField, 6));
        oInnerPanel.add(oSourcePanel);
        oInnerPanel.add(oDetectorPanel);
        this.add(oInnerPanel, BorderLayout.NORTH);

    }

    private void prepareFields() {

//        float ofloat = 2221.2345678456F;
//        System.out.println("float is " + ofloat);

        DecimalFormat oFormat = (DecimalFormat) NumberFormat.getNumberInstance();
        oFormat.setGroupingUsed(false);
        //oFormat.applyPattern("########");
        oInstrumentNameField = new JTextField();
        oInstrumentNameField.setMargin(new Insets(0, 2, 0, 2));
        oResolutionField = new FloatField();
        oResolutionField.setMargin(new Insets(0, 2, 0, 2));
        oAccuracyField = new FloatField();
        oAccuracyField.setMargin(new Insets(0, 2, 0, 2));

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

    public boolean isPopulated() {
        if (instrumentCommonSettingsData == null) {
            return false;
        }
        return instrumentCommonSettingsData.isPopulated();
    }

//    private void setPopulated(boolean populated) {
//        this.populated = populated;
//    }

    void setData(InstrumentCommonSettingsData instrumentCommonSettingsData,
                 SourceData sourceData,
                 AnalyzerData analyzerData,
                 DetectorData detectorData) {
        this.instrumentCommonSettingsData = instrumentCommonSettingsData;
        this.sourceData = sourceData;
        this.analyzerData = analyzerData;
        this.detectorData = detectorData;
//        this.setPopulated(true);
    }

    protected void getDefaultFieldValues() {
        if (isPopulated()) {
            if (instrumentCommonSettingsData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME)) {
                oInstrumentNameField.setText(oPrefs.get("InstrumentName", "Default name"));
            }
            if (analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION)) {
                oResolutionField.setText(oPrefs.get("Resolution", "-2"));
            }
            if (analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY)) {
                oAccuracyField.setText(oPrefs.get("Accuracy", "-2"));
            }
            if (analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE)) {
                oAnalyzerTypeBox.setSelectedItem(Analyzer.Type.valueOf(oPrefs.get("AnalyzerType", "other")));
            }
            if (sourceData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE)) {
                oSourceTypeBox.setSelectedItem(Source.Type.valueOf(oPrefs.get("SourceType", "other")));
            }
            if (detectorData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE)) {
                oDetectorTypeBox.setSelectedItem(Detector.Type.valueOf(oPrefs.get("DetectorType", "other")));
            }
        }
    }

    void refreshFieldValues() {
        if (isPopulated()) {
            oInstrumentNameField.setText(instrumentCommonSettingsData.getInstrumentCommonSettings().getInstName());
            oResolutionField.setText(new Float(analyzerData.getAnalyzer().getResolution()).toString());
            oAccuracyField.setText(new Float(analyzerData.getAnalyzer().getAccuracy()).toString());
            //todo keep an eye on this and check it works as it should
            oSourceTypeBox.setSelectedItem(Source.Type.valueOf(sourceData.getSource().getType().toString()));
            oAnalyzerTypeBox.setSelectedItem(Analyzer.Type.valueOf(analyzerData.getAnalyzer().getType().toString()));
            oDetectorTypeBox.setSelectedItem(Detector.Type.valueOf(detectorData.getDetector().getType().toString()));
            //getDefaultFieldValues();//why did I ever put this here?
        }
        else {//dataobject empty so clear fields
            setFieldActivation(false);
        }
    }

    void setDefaultFieldValues() {
        oPrefs.put("InstrumentName", oInstrumentNameField.getText());
        oPrefs.put("Resolution", oResolutionField.getText());
        oPrefs.put("Accuracy", oAccuracyField.getText());
        oPrefs.put("SourceType", oSourceTypeBox.getSelectedItem().toString());
        oPrefs.put("AnalyzerType", oAnalyzerTypeBox.getSelectedItem().toString());
        oPrefs.put("DetectorType", oDetectorTypeBox.getSelectedItem().toString());
    }

    void setFieldActivation() {
        setFieldActivation(true);

        if (isPopulated()) {
            if (!instrumentCommonSettingsData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME)) {
                oInstrumentNameField.setEnabled(false);
            }

            if (!analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION)) {
                oResolutionField.setEnabled(false);
            }
            if (!analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY)) {
                oAccuracyField.setEnabled(false);
            }
            if (!analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE)) {
                oAnalyzerTypeBox.setEnabled(false);
            }

            if (!sourceData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE)) {
                oSourceTypeBox.setEnabled(false);
            }

            if (!detectorData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE)) {
                oDetectorTypeBox.setEnabled(false);
            }
        }
    }

    private void setFieldActivation(boolean activate) {
        oInstrumentNameField.setEnabled(activate);
        oResolutionField.setEnabled(activate);
        oAccuracyField.setEnabled(activate);
        oSourceTypeBox.setEnabled(activate);
        oAnalyzerTypeBox.setEnabled(activate);
        oDetectorTypeBox.setEnabled(activate);
    }

    void setDataValues() {

        if (isPopulated()) {
            if (instrumentCommonSettingsData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME)) {
                instrumentCommonSettingsData.getInstrumentCommonSettings().setInstName(oInstrumentNameField.getText());
            }

            if (sourceData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE)) {
                sourceData.getSource().setType(((Source.Type) oSourceTypeBox.getSelectedItem()));
            }

            if (analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE)) {
                analyzerData.getAnalyzer().setType(((Analyzer.Type) oAnalyzerTypeBox.getSelectedItem()));
            }
            if (analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION)) {
                analyzerData.getAnalyzer().setResolution(new Float(oResolutionField.getText()).floatValue());
            }
            if (analyzerData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY)) {
                analyzerData.getAnalyzer().setAccuracy(new Float(oAccuracyField.getText()).floatValue());
            }

            if (detectorData.isFieldActive(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE)) {
                detectorData.getDetector().setType(((Detector.Type) oDetectorTypeBox.getSelectedItem()));
            }
        }
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new InstrumentSettingsPanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);
    }

}
