package org.psi.ms.swing;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.io.File;
import java.util.prefs.Preferences;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 10, 2003
 * Time: 3:11:35 PM
 * To change this template use Options | File Templates.
 */
public class DirectoryChooserPanel extends JPanel {

    private Preferences oPrefs = Preferences.userNodeForPackage(this.getClass());

    private JTextField oFileField;
    private JButton oBrowseButton;
    private int iBrowseType;

    public DirectoryChooserPanel(int piBrowseType) {
        this.iBrowseType = piBrowseType;
        prepareFields();
        layoutPanel();
        getDefaultFieldValues();
    }

    private void layoutPanel() {
        this.setLayout(new BorderLayout());
        this.add(oFileField, BorderLayout.CENTER);
        this.add(oBrowseButton, BorderLayout.EAST);
    }

    private void prepareFields() {

        oFileField = new JTextField();
        oBrowseButton = new JButton("Browse...");
        oBrowseButton.setFont(MainPanel.FONT);
        oBrowseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setFileField();
            }
        });
    }

    private void setFileField() {
        MainPanel.CHOOSER.setFileSelectionMode(iBrowseType);

        File oDirectory = new File("/");
        if (iBrowseType == JFileChooser.FILES_AND_DIRECTORIES) {
            MainPanel.CHOOSER.setCurrentDirectory(new File(oPrefs.get("SourceDir", "/")));
            MainPanel.CHOOSER.showOpenDialog(this);
            oDirectory = MainPanel.CHOOSER.getSelectedFile();
            oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
            if (oDirectory != null) {
                oPrefs.put("SourceDir", oDirectory.getPath());
            }
        } else if (iBrowseType == JFileChooser.FILES_ONLY) {
            MainPanel.CHOOSER.setCurrentDirectory(new File(oPrefs.get("DestDir", "/")));
            MainPanel.CHOOSER.showSaveDialog(this);
            oDirectory = MainPanel.CHOOSER.getSelectedFile();
            oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
            if (oDirectory != null) {
                oPrefs.put("DestDir", oDirectory.getPath());
            }
        }

        System.out.println("the file is " + oDirectory);
        if (oDirectory != null) {
            oFileField.setText(oDirectory.getPath());
        }

    }

    String getFilePath() {
        return oFileField.getText();
    }

    private void getDefaultFieldValues() {
        if (iBrowseType == JFileChooser.FILES_AND_DIRECTORIES) {
            oFileField.setText(oPrefs.get("SourceDir", "/"));
            oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
        } else {
            oFileField.setText(oPrefs.get("DestDir", "/"));
            //todo need to get the caret position to appear at the end of the path, this code
            //does not work for some reason
            oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
        }
        //oSampleNameField.setText(oPrefs.get("SampleName", "Default Sample"));
    }

    void setDefaultFieldValues() {
        if (iBrowseType == JFileChooser.FILES_AND_DIRECTORIES) {
            oPrefs.get("SourceDir", oFileField.getText());
        } else {
            oPrefs.get("DestDir", oFileField.getText());
        }
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new DirectoryChooserPanel(JFileChooser.FILES_AND_DIRECTORIES));
        oFrame.setSize(800, 600);
        oFrame.setVisible(true);
    }
}
