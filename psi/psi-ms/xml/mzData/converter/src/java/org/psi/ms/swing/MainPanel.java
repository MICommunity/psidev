package org.psi.ms.swing;

import org.psi.ms.model.Desc;
import org.psi.ms.model.MzData;
import org.psi.ms.xml.MzDataWriter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 9, 2003
 * Time: 5:26:14 PM
 * To change this template use Options | File Templates.
 */
public class MainPanel extends JPanel {

    public static final JFileChooser CHOOSER = new JFileChooser();
    public static Font FONT = new Font("Helvetica", Font.PLAIN, 12);


    private AdminPanel oAdminPanel;
    private InstrumentSettingsPanel oSettingsPanel;
    private TestPanel oTestPanel;
    private DirectoryPanel oDirectoryPanel;
    final private JButton oParseButton = new JButton("Convert");
    private ParseThread oParseThread;

    final private ProgressPanel oProgressPanel = new ProgressPanel();


    private ParsingBusiness oParsingBusiness = new ParsingBusiness();

    public MainPanel() {
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

    MzData getDataObject() {
        MzData oData = new MzData();
        Desc oDesc = new Desc();
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
        MzData oData = getDataObject();
        String oSourceDir = oDirectoryPanel.getSourceFilePath();
        File oSourceFile = new File(oSourceDir);
        oProgressPanel.setMax(oSourceFile.listFiles().length);
        String oDestDir = oDirectoryPanel.getDestinationFilePath();
        MzDataWriter.OutputType oType = oDirectoryPanel.getOutputType();
        oParseButton.setEnabled(false);
        oParseThread = new ParseThread(oSourceDir, oDestDir, oData, oType, oProgressPanel, oParseButton);
        oParseThread.start();
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame("PSI-MS Converter");
        final MainPanel oMainPanel = new MainPanel();
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
    }

    class ParseThread extends Thread {

        //todo need to make the thread interruptable...
        private String oSourceDir;
        private String oDestDir;
        private MzData oData;
        private ProgressPanel oProgress;
        private JButton oButton;
        private MzDataWriter.OutputType oType;

        public ParseThread(String poSourceDir,
                           String poDestDir,
                           MzData poData,
                           MzDataWriter.OutputType poType,
                           ProgressPanel poProgress,
                           JButton poButton) {
            this.oSourceDir = poSourceDir;
            this.oDestDir = poDestDir;
            this.oData = poData;
            this.oProgress = poProgress;
            this.oType = poType;
            this.oButton = poButton;
        }

        public void run() {
            oParsingBusiness.parseData(this.oSourceDir,
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
