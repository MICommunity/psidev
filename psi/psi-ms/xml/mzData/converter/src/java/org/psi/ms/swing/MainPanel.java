package org.psi.ms.swing;

import org.psi.ms.model.Desc;
import org.psi.ms.model.MzData;
import org.psi.ms.xml.MzDataWriter;
import org.psi.ms.converter.ImporterLoader;
import org.psi.ms.converter.ImporterI;
import org.psi.ms.helper.PsiMsConverterException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 9, 2003
 * Time: 5:26:14 PM
 * To change this template use Options | File Templates.
 */
public class MainPanel extends JPanel {

    private Logger logger = Logger.getLogger(MainPanel.class);

    public static final JFileChooser CHOOSER = new JFileChooser();
    public static Font FONT = new Font("Helvetica", Font.PLAIN, 12);


    private AdminPanel oAdminPanel;
    private InstrumentSettingsPanel oSettingsPanel;
    private TestPanel oTestPanel;
    private DirectoryPanel oDirectoryPanel;
    final private JButton oParseButton = new JButton("Convert");
    private ParseThread oParseThread;

    final private ProgressPanel oProgressPanel = new ProgressPanel();

    private ImporterLoader importerLoader;

    private ParsingBusiness oParsingBusiness = new ParsingBusiness();

    public MainPanel(ImporterLoader importerLoader) {
        this.importerLoader = importerLoader;
        prepareFields();
        layoutPanel();
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

    }

    private void prepareFields() {
        oAdminPanel = new AdminPanel();
        oSettingsPanel = new InstrumentSettingsPanel();
        oTestPanel = new TestPanel();
        oDirectoryPanel = new DirectoryPanel();
        oParseButton.setFont(MainPanel.FONT);
        oParseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parseData();
            }
        });
    }

    MzData getDataObject(Desc oDesc, ImporterI importerI) {
        // the importer implementation defines which data elements
        // are provided from the file format.
        //Todo: these need to be considered while filling the Desc object.
        MzData oData = new MzData();
        oDesc.setAdmin(oAdminPanel.getAdmin());
        oDesc.setInstrument(oSettingsPanel.getSettings());
        oDesc.setTest(oTestPanel.getTest());
        oData.setDesc(oDesc);

        return oData;
    }

    private void persistFieldValues() {
        oAdminPanel.setDefaultFieldValues();
        oSettingsPanel.setDefaultFieldValues();
        oTestPanel.setDefaultFieldValues();
        oDirectoryPanel.setDefaultFieldValues();
    }

    void parseData() {
        String oSourceDir = oDirectoryPanel.getSourceFilePath();
        File oSourceFile = new File(oSourceDir);
        oProgressPanel.setMax(oSourceFile.listFiles().length);
        String oDestDir = oDirectoryPanel.getDestinationFilePath();
        MzDataWriter.OutputType oType = oDirectoryPanel.getOutputType();

        java.util.List importerList = importerLoader.getImporterList();
        ImporterI importerI = null;
        boolean importerFound = false;
        int importerListSize = importerList.size();
        logger.debug("Number of importers found: " + importerListSize);
        for (int iii = 0; !importerFound && iii < importerListSize; iii++) {
            importerI = (ImporterI) importerList.get(iii);
            logger.debug(importerI.getImporterName());
            importerFound = importerI.isSupportedInputFormat(oSourceFile);
        }
        if (importerFound) {
            logger.debug("Importer found");
            oParseButton.setEnabled(false);
            try {
                Desc desc = importerI.initialize(oSourceFile, oProgressPanel);
                MzData oData = getDataObject(desc, importerI);
                oParseThread = new ParseThread(importerI, oDestDir, oData, oType, oProgressPanel, oParseButton);
                oParseThread.start();
            } catch (PsiMsConverterException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            logger.debug("No importer found");
        }
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        ImporterLoader importerLoader = null;
        try {
            importerLoader = new ImporterLoader();
        } catch (FileNotFoundException e) {
            // Todo: here we would need a requester asking for the plugin directory
            JOptionPane.showConfirmDialog(null,
                    "Error while reading plug-ins:\n" +
                    e.getMessage(),
                    "ImporterLoader error", JOptionPane.OK_OPTION,
                    JOptionPane.ERROR_MESSAGE);
        }
        if (importerLoader != null) {
            try {
                importerLoader.loadImporters();
                JFrame oFrame = new JFrame("PSI-MS Converter");
                final MainPanel oMainPanel = new MainPanel(importerLoader);
                oFrame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        super.windowClosed(e);
                        oMainPanel.persistFieldValues();
                        System.exit(0);
                    }
                });

                oFrame.getContentPane().add(oMainPanel);
                oFrame.setSize(800, 520);
                oFrame.setResizable(false);
                oFrame.setVisible(true);
            } catch (FileNotFoundException e) {
                // Todo: here we would need a requester asking for the plugin directory
                JOptionPane.showConfirmDialog(null,
                        "Error while reading plug-ins:\n" +
                        e.getMessage(),
                        "ImporterLoader error", JOptionPane.OK_OPTION,
                        JOptionPane.ERROR_MESSAGE);
            }
        }
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
