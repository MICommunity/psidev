package org.psi.ms.swing;

import org.psi.ms.converter.ParseListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 11, 2003
 * Time: 1:40:24 PM
 * To change this template use Options | File Templates.
 */
public class ProgressPanel extends JPanel implements ParseListener {

    private JProgressBar oProgress;

    public ProgressPanel() {
        prepareFields();
        layoutPanel();
    }

    private void layoutPanel() {
        this.setLayout(new BorderLayout());
        this.add(oProgress, BorderLayout.CENTER);
    }

    private void prepareFields() {
        oProgress = new JProgressBar();
        oProgress.setStringPainted(true);
        oProgress.setForeground(Color.blue);
        oProgress.getFont();
        //oProgress.setBackground(Color.blue);

    }

    public void setMax(int piMax) {
        oProgress.setMaximum(piMax);
    }

    public void setMessage(String poMessage) {
        oProgress.setString(poMessage);
    }

    public void increment() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                oProgress.setValue(oProgress.getValue() + 1);
            }
        });
    }

    public void clear() {
        oProgress.setIndeterminate(false);
        oProgress.setValue(0);
    }

    public void fileParsed() {
        increment();
    }

    public void indeterminiteProcess() {
        oProgress.setIndeterminate(true);
    }

}
