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
public class DirectoryChooserOutputPanel extends DirectoryChooserPanel {

    public DirectoryChooserOutputPanel() {
        super();
    }

    protected void setFileField() {
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        File oDirectory = new File("/");
        chooser.setCurrentDirectory(new File(oPrefs.get("DestDir", "/")));
        int decision = chooser.showSaveDialog(this);
        if (decision != JFileChooser.CANCEL_OPTION) {
            oDirectory = chooser.getSelectedFile();
            if (oDirectory != null) {
                oPrefs.put("DestDir", oDirectory.getPath());
            }

            System.out.println("the file is " + oDirectory);
            if (oDirectory != null) {
                oFileField.setText(oDirectory.getPath());
                oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
            }
        }
    }

    protected void getDefaultFieldValues() {
        oFileField.setText(oPrefs.get("DestDir", "/"));
        //todo need to get the caret position to appear at the end of the path, this code
        //does not work for some reason
        oFileField.setCaretPosition(oFileField.getDocument().getLength() - 1);
        //oSampleNameField.setText(oPrefs.get("SampleName", "Default Sample"));
    }

    protected void setDefaultFieldValues() {
        oPrefs.put("DestDir", oFileField.getText());
    }

}
