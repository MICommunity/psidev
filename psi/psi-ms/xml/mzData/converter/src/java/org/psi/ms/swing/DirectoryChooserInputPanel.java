package org.psi.ms.swing;

import javax.swing.*;
import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Jan 12, 2004
 * Time: 2:54:48 PM
 * To change this template use Options | File Templates.
 */
public class DirectoryChooserInputPanel extends DirectoryChooserPanel {

    public DirectoryChooserInputPanel() {
        super();
    }

    protected void setFileField() {
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        File oDirectory = new File("/");
        chooser.setCurrentDirectory(new File(oPrefs.get("SourceDir", "/")));
        int decision = chooser.showSaveDialog(this);
        if (decision != JFileChooser.CANCEL_OPTION) {
            oDirectory = chooser.getSelectedFile();
            if (oDirectory != null) {
                oPrefs.put("SourceDir", oDirectory.getPath());
            }

            System.out.println("the file is " + oDirectory);
            if (oDirectory != null) {
                oFileField.setText(oDirectory.getPath());
                oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
            }
        }
    }

    protected void getDefaultFieldValues() {
        oFileField.setText(oPrefs.get("SourceDir", "/"));
        oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
    }

    protected void setDefaultFieldValues() {
        oPrefs.put("SourceDir", oFileField.getText());
    }

}
