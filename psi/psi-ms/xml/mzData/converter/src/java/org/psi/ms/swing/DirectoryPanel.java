package org.psi.ms.swing;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 12, 2003
 * Time: 11:25:51 AM
 * To change this template use Options | File Templates.
 */
public class DirectoryPanel extends JPanel {

    private DirectoryChooserPanel oSourceDirPanel;
    private DirectoryChooserPanel oDestDirPanel;

    public DirectoryPanel() {
        prepareFields();
        layoutPanel();
    }

    private void layoutPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Admin"),
                        new EmptyBorder(3, 3, 3, 3)));

        this.add(new ContainedJComponent("Source dir", oSourceDirPanel));
        this.add(new ContainedJComponent("Output dir", oDestDirPanel));
    }

    private void prepareFields() {
        oSourceDirPanel = new DirectoryChooserPanel(JFileChooser.DIRECTORIES_ONLY);
        oDestDirPanel = new DirectoryChooserPanel(JFileChooser.FILES_ONLY);
    }

    String getSourceFilePath() {
        return oSourceDirPanel.getFilePath();
    }

    String getDestinationFilePath() {
        return oDestDirPanel.getFilePath();
    }

    void setDefaultFieldValues() {
        oSourceDirPanel.setDefaultFieldValues();
    }
}
