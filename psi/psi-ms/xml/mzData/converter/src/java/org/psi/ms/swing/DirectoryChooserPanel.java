package org.psi.ms.swing;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.io.File;
import java.util.prefs.Preferences;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 10, 2003
 * Time: 3:11:35 PM
 * To change this template use Options | File Templates.
 */
public abstract class DirectoryChooserPanel extends JPanel {

    protected Preferences oPrefs = Preferences.userNodeForPackage(this.getClass());
    protected JFileChooser chooser;

    protected JTextField oFileField;
    protected JButton oBrowseButton;

    protected ArrayList listenerList = new ArrayList();

    public DirectoryChooserPanel() {
        prepareFields();
        layoutPanel();
        getDefaultFieldValues();
    }

    protected void layoutPanel() {
        this.setLayout(new BorderLayout());
        this.add(oFileField, BorderLayout.CENTER);
        this.add(oBrowseButton, BorderLayout.EAST);
    }

    protected void prepareFields() {

        oFileField = new JTextField();
        chooser = new JFileChooser();
        oBrowseButton = new JButton("Browse...");
        oBrowseButton.setFont(MainPanel.FONT);
        oBrowseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setFileField();
            }
        });
    }

    protected abstract void setFileField();

    String getFilePath() {
        return oFileField.getText();
    }

    public void addDocumentListener(DocumentListener e) {
        oFileField.getDocument().addDocumentListener(e);
    }

    protected abstract void getDefaultFieldValues();

    protected abstract void setDefaultFieldValues();

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new DirectoryChooserInputPanel());
        oFrame.setSize(800, 600);
        oFrame.setVisible(true);
    }
}
