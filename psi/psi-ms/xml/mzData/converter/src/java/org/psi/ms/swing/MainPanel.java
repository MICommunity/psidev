package org.psi.ms.swing;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.psi.ms.converter.ImporterI;
import org.psi.ms.converter.ImporterLoader;
import org.psi.ms.converter.ProvidedDataItem;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.model.Desc;
import org.psi.ms.model.MzData;
import org.psi.ms.xml.MzDataWriter;
import org.psi.ms.view.*;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.prefs.Preferences;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 9, 2003
 * Time: 5:26:14 PM
 * To change this template use Options | File Templates.
 */
public class MainPanel extends JPanel {

    private Logger logger = Logger.getLogger(MainPanel.class);

    public static Font FONT = new Font("Helvetica", Font.PLAIN, 12);

    private static JFrame parent;
    private AdminPanel oAdminPanel;
    private InstrumentSettingsPanel oSettingsPanel;
    private TestPanel oTestPanel;
    private DirectoryPanel oDirectoryPanel;
    private JButton oParseButton = new JButton("Convert");
    private ParseThread oParseThread;
    private Menu menu;
    final private ProgressPanel oProgressPanel = new ProgressPanel();

    //todo business logic class...
    private ImporterLoader importerLoader;
    private ImporterI currentImporter;
    private ParsingBusiness oParsingBusiness = new ParsingBusiness();
    private Vector dataObjects = new Vector();
    ////////

    public MainPanel(JFrame parent) {
        this.parent = parent;
        prepareImporter();
        prepareFields();
        prepareDataObjects();
        setImporter();
        layoutPanel();
    }

    private void prepareFields() {
        oAdminPanel = new AdminPanel();
        oSettingsPanel = new InstrumentSettingsPanel();
        oTestPanel = new TestPanel();
        oDirectoryPanel = new DirectoryPanel();
        oParseButton = new JButton("Convert");
        menu = new Menu();
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == Menu.PLUGINS) {
                    specifyPluginDir();
                    prepareImporter();
                    setImporter();
                }

                if (e.getActionCommand() == Menu.EXIT) {
                    exit();
                }
            }
        });

        oParseButton.setFont(MainPanel.FONT);
        oParseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parseData();
            }
        });

        oDirectoryPanel.addInputFileDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            public void changedUpdate(DocumentEvent e) {
                setImporter();
            }
        });
    }

    private void layoutPanel() {

        this.setLayout(new BorderLayout());
        this.setBorder(new EmptyBorder(5, 5, 5, 5));

        JPanel oInnerPanel = new JPanel(new GridLayout(0, 2)) {
            public Dimension getPreferredSize() {
                return new Dimension(750, 450);
            }
        };

        JPanel oLeftInnerPanel = new JPanel();
        oLeftInnerPanel.setLayout(new BoxLayout(oLeftInnerPanel, BoxLayout.Y_AXIS));
        oLeftInnerPanel.add(oSettingsPanel);
        oLeftInnerPanel.add(oTestPanel);
        oInnerPanel.add(oLeftInnerPanel);

        JPanel oRightInnerPanel = new JPanel();
        oRightInnerPanel.setLayout(new BoxLayout(oRightInnerPanel, BoxLayout.Y_AXIS));
        oRightInnerPanel.add(oAdminPanel);
        oRightInnerPanel.add(oDirectoryPanel);
        JPanel oParsePanel = new JPanel(new BorderLayout());
        oParsePanel.add(oParseButton, BorderLayout.WEST);
        oParsePanel.add(oProgressPanel, BorderLayout.CENTER);

        oInnerPanel.add(oRightInnerPanel);
        this.add(new JScrollPane(oInnerPanel), BorderLayout.CENTER);
        this.add(oParsePanel, BorderLayout.SOUTH);
        this.parent.setJMenuBar(menu);

    }

    private void prepareDataObjects() {

        TestData testData = new TestData();
        ProcessingMethodData processingMethodData = new ProcessingMethodData();
        SourceData sourceData = new SourceData();
        InstrumentCommonSettingsData instrumentCommonSettingsData = new InstrumentCommonSettingsData();
        DetectorData detectorData = new DetectorData();
        AnalyzerData analyzerData = new AnalyzerData();
        AdminData adminData = new AdminData();
        AdminContactPersonData adminContactPersonData = new AdminContactPersonData();

        //assingn dataobjects to array for ease of manipulation
        dataObjects.add(testData);
        dataObjects.add(processingMethodData);
        dataObjects.add(sourceData);
        dataObjects.add(instrumentCommonSettingsData);
        dataObjects.add(detectorData);
        dataObjects.add(analyzerData);
        dataObjects.add(adminData);
        dataObjects.add(adminContactPersonData);

        //set the dataobjects with the relevant swing panels
        oTestPanel.setData(testData, processingMethodData);
        oAdminPanel.setData(adminData, adminContactPersonData);
        oSettingsPanel.setData(instrumentCommonSettingsData, sourceData, analyzerData, detectorData);
    }

    private void setData(Desc desc) {
        //set the data in the dataobjects
        for (int i = 0; i < dataObjects.size(); i++) {
            ((MZDataObject) dataObjects.get(i)).setData(desc);
        }
    }

    private void clearData() {
        //clear the data in the dataobjects
        for (int i = 0; i < dataObjects.size(); i++) {
            ((MZDataObject) dataObjects.get(i)).clearData();
        }
        refreshUI();
    }

    /**
     * Takes the values from the Swing components and sets the underlying
     * values in the dataobjects.
     */
    private void updateDataObjects() {
        oAdminPanel.setDataValues();
        oSettingsPanel.setDataValues();
        oTestPanel.setDataValues();
    }

    MzData getMZData() {

        MzData oData = new MzData();
        oData.setDesc(((MZDataObject) dataObjects.get(0)).getData());

        return oData;
    }

    private void specifyPluginDir() {

        Preferences oPrefs = Preferences.userNodeForPackage(ImporterLoader.class);

        //making anew chooser as do not want to pick up action events upon selecting directories
        JFileChooser chooser = new JFileChooser("./");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        File oDirectory;
        chooser.setCurrentDirectory(new File(oPrefs.get(ImporterLoader.PREF_PLUGIN_PATH, "/")));
        int decision = chooser.showOpenDialog(this);
        if (decision != JFileChooser.CANCEL_OPTION) {
            oDirectory = chooser.getSelectedFile();
            if (oDirectory != null) {
                oPrefs.put(ImporterLoader.PREF_PLUGIN_PATH, oDirectory.getPath());
            }
        }
    }

    //todo business logic class...
    private void prepareImporter() {

        BasicConfigurator.configure();
        importerLoader = null;

        try {
            importerLoader = new ImporterLoader();
        }
        catch (FileNotFoundException e) {

            int decision = JOptionPane.showConfirmDialog(null,
                    "Error while reading plug-ins:\n" +
                    e.getMessage() +
                    "\nPlease specify a plugin directory",
                    "ImporterLoader error",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

            if (decision == JOptionPane.OK_OPTION) {
                specifyPluginDir();
                prepareImporter();
                return;
            }
            else {
                System.exit(0);
            }
        }

        if (importerLoader != null) {
            try {
                importerLoader.loadImporters();
                oProgressPanel.setMessage(importerLoader.getImporterList().size() + " importers loaded");
            }
            catch (FileNotFoundException e) {
                int decision = JOptionPane.showConfirmDialog(null,
                        "Error while reading plug-ins:\n" +
                        e.getMessage(),
                        "ImporterLoader error",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.ERROR_MESSAGE);
                if (decision == JOptionPane.OK_OPTION) {
                    specifyPluginDir();
                    prepareImporter();
                    return;
                }
                else {
                    System.exit(0);
                }
            }
        }
    }

    //todo business logic class...
    private void setImporter() {

        String oSourceDir = oDirectoryPanel.getSourceFilePath();
        //String oSourceDir = sourceDir;
        logger.debug("SETTING IMPORTER " + oSourceDir);
        //String oSourceDir = "";//for debugging
        File oSourceFile = new File(oSourceDir);

        java.util.List importerList = importerLoader.getImporterList();
        currentImporter = null;
        boolean importerFound = false;
        int importerListSize = importerList.size();
        logger.debug("Number of importers found: " + importerListSize);
        for (int iii = 0; !importerFound && iii < importerListSize; iii++) {
            currentImporter = (ImporterI) importerList.get(iii);
            logger.debug(currentImporter.getImporterName());
            importerFound = currentImporter.isSupportedInputFormat(oSourceFile);
        }

        if (importerFound) {
            logger.debug("Importer found");
            setData(initilizeImporter());
            setFieldActivation();
            refreshUI();
            getUIDefaultValues();
            oParseButton.setEnabled(true);
            oProgressPanel.setMessage("");
        }
        else {
            logger.debug("No importer found");
            currentImporter = null;
            clearData();
            oParseButton.setEnabled(false);
            oProgressPanel.setMessage("NO VALID IMPORTERS FOUND!");
        }
    }

    private Desc initilizeImporter() {
        if (currentImporter != null) {
            try {

                String oSourceDir = oDirectoryPanel.getSourceFilePath();
                File oSourceFile = new File(oSourceDir);

                Desc desc = null;
                desc = currentImporter.initialize(oSourceFile, oProgressPanel);

                return desc;

            }
            catch (PsiMsConverterException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    //todo dataobject IF
    private void setFieldActivation() {
        if (currentImporter != null) {
            List list = currentImporter.getProvidedData();

            //for debugging
//            List list = new ArrayList();
//            Enumeration enur = ProvidedDataItem.enumerate();
//            while (enur.hasMoreElements()) {
//                list.add(enur.nextElement());
//            }


            for (int i = 0; i < dataObjects.size(); i++) {
                ((MZDataObject) dataObjects.get(i)).setFieldActivation(list);
            }

            oTestPanel.setFieldActivation();
            oAdminPanel.setFieldActivation();
            oSettingsPanel.setFieldActivation();
        }
    }

    private void refreshUI() {
        oTestPanel.refreshFieldValues();
        oSettingsPanel.refreshFieldValues();
        oAdminPanel.refreshFieldValues();
    }

    private void getUIDefaultValues() {
        oTestPanel.getDefaultFieldValues();
        oSettingsPanel.getDefaultFieldValues();
        oAdminPanel.getDefaultFieldValues();
    }

    private void persistFieldValues() {
        oAdminPanel.setDefaultFieldValues();
        oSettingsPanel.setDefaultFieldValues();
        oTestPanel.setDefaultFieldValues();
        oDirectoryPanel.setDefaultFieldValues();
    }

    //todo business logic class...
    void parseData() {
        String oDestDir = oDirectoryPanel.getDestinationFilePath();
        MzDataWriter.OutputType oType = oDirectoryPanel.getOutputType();

        oParseButton.setEnabled(false);
        updateDataObjects();
        MzData oData = getMZData();
        oParseThread = new ParseThread(currentImporter, oDestDir, oData, oType, oProgressPanel, oParseButton);
        oParseThread.start();

    }


    public static void main(String[] args) {
        JFrame oFrame = new JFrame("PSI-MS Converter");
        final MainPanel oMainPanel = new MainPanel(oFrame);
        oFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                super.windowClosed(e);
                oMainPanel.exit();
            }
        });

        oFrame.getContentPane().add(oMainPanel);
        oFrame.setSize(800, 540);
        oFrame.setResizable(false);
        oFrame.setVisible(true);
    }

    private void exit() {
        this.persistFieldValues();
        System.exit(0);
    }

    class ParseThread extends Thread {

        //todo need to make the thread interruptable...
        private ImporterI importerI;
        private String oDestDir;
        private MzData oData;
        private ProgressPanel oProgress;
        private JButton oButton;
        private MzDataWriter.OutputType oType;

        public ParseThread(ImporterI importerI,
                           String poDestDir,
                           MzData poData,
                           MzDataWriter.OutputType poType,
                           ProgressPanel poProgress,
                           JButton poButton) {
            this.importerI = importerI;
            this.oDestDir = poDestDir;
            this.oData = poData;
            this.oProgress = poProgress;
            this.oType = poType;
            this.oButton = poButton;
        }

        public void run() {
            oParsingBusiness.parseData(this.importerI,
                    this.oDestDir,
                    this.oData,
                    this.oType,
                    this.oProgress);
            oButton.setEnabled(true);
            oProgress.clear();
            oProgress.setMessage("Done");
        }
    }

}
