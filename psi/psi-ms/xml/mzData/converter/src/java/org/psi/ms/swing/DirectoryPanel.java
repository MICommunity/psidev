package org.psi.ms.swing;

import org.psi.ms.xml.MzDataWriter;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

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
    private OutputTypePanel oOutputTypePanel;

    public DirectoryPanel() {
        prepareFields();
        layoutPanel();
    }

    private void layoutPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Source/Output"),
                        new EmptyBorder(3, 3, 3, 3)));

        this.add(new ContainedJComponent("Source", oSourceDirPanel));
        this.add(new ContainedJComponent("Output", oDestDirPanel));
        this.add(new ContainedJComponent("Type", oOutputTypePanel));
    }

    private void prepareFields() {
        oSourceDirPanel = new DirectoryChooserInputPanel();
        oDestDirPanel = new DirectoryChooserOutputPanel();
        oOutputTypePanel = new OutputTypePanel();
    }

    String getSourceFilePath() {
        return oSourceDirPanel.getFilePath();
    }

    String getDestinationFilePath() {
        return oDestDirPanel.getFilePath();
    }

    MzDataWriter.OutputType getOutputType() {
        return oOutputTypePanel.getOutputType();
    }

    void setDefaultFieldValues() {
        oSourceDirPanel.setDefaultFieldValues();
        oOutputTypePanel.setDefaultFieldValues();
    }

    public void addInputFileDocumentListener(DocumentListener e) {
        oSourceDirPanel.addDocumentListener(e);
    }

    public void addOutputFileDocumentListener(DocumentListener e) {
        oDestDirPanel.addDocumentListener(e);
    }
}
