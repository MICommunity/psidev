package org.psi.ms.swing;

import org.psi.ms.model.Admin;
import org.psi.ms.model.Person;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.prefs.Preferences;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Sep 10, 2003
 * Time: 9:59:00 AM
 * To change this template use Options | File Templates.
 */
public class AdminPanel extends JPanel {

    Preferences oPrefs = Preferences.userNodeForPackage(this.getClass());

    private JTextField oSampleNameField;
    private JTextField oContactNameField;
    private JTextField oContactInstitutionField;

    private JTextArea oContactInfoField;
    private JScrollPane oContactInfoScroller;

    public AdminPanel() {
        prepareFields();
        layoutPanel();
        getDefaultFieldValues();
    }

    private void layoutPanel() {

        this.setLayout(new BorderLayout());
        this.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Admin"),
                        new EmptyBorder(3, 3, 3, 3)));

        JPanel oInnerPanel = new JPanel();
        oInnerPanel.setLayout(new BoxLayout(oInnerPanel, BoxLayout.Y_AXIS));
//        oInnerPanel.setBorder(new CompoundBorder
//                (new TitledBorder(new EtchedBorder(), "Contact"),
//                        new EmptyBorder(3, 3, 3, 3)));

        JPanel oInnerTopPanel = new JPanel();
        oInnerTopPanel.setLayout(new BoxLayout(oInnerTopPanel, BoxLayout.Y_AXIS));
        //oInnerTopPanel.add(new ContainedJComponent("Sample",oSampleNameField,6), BorderLayout.NORTH);
        oInnerPanel.add(new ContainedJComponent("Name",oContactNameField,15));
        oInnerPanel.add(new ContainedJComponent("Institute",oContactInstitutionField,5));

        oContactInfoScroller.setBorder
                (new TitledBorder(new EmptyBorder(0,0,0,0),
                        "Address",
                        TitledBorder.DEFAULT_JUSTIFICATION,
                        TitledBorder.DEFAULT_POSITION,
                        MainPanel.FONT));
        oInnerPanel.add(oContactInfoScroller);
        oInnerTopPanel.add(oInnerPanel);

        //oInnerPanel.add(oInnerTopPanel, BorderLayout.NORTH);

        //this.add(oInnerPanel, BorderLayout.NORTH);
        this.add(oInnerTopPanel,BorderLayout.NORTH);
    }

    private void prepareFields() {
        oSampleNameField = new JTextField();
        oSampleNameField.setMargin(new Insets(0,2,0,2));
        oContactNameField = new JTextField();
        oContactNameField.setMargin(new Insets(0,2,0,2));
        oContactInstitutionField = new JTextField();
        oContactInstitutionField.setMargin(new Insets(0,2,0,2));
        oContactInfoField = new JTextArea(){
//            public Dimension getPreferredize() {
//                int iHeight = super.getPreferredSize().height;
//                //System.out.println("iHeight is " + iHeight);
//                if(iHeight < 200) {
//                    iHeight = 200;
//                }
//                return new Dimension(super.getPreferredSize().width,100);
//            }
        };

        oContactInfoField.setMargin(new Insets(0,5,0,2));
        oContactInfoScroller = new JScrollPane(){
            public Dimension getPreferredSize() {
                return new Dimension(super.getPreferredSize().width,200);
            }
        };
        oContactInfoScroller.getViewport().add(oContactInfoField);
    }

    private void getDefaultFieldValues() {
        oSampleNameField.setText(oPrefs.get("SampleName", "Default Sample"));
        oContactNameField.setText(oPrefs.get("ContactName", "Default Contact"));
        oContactInstitutionField.setText(oPrefs.get("ContactInstitution", "Default Institute"));
        oContactInfoField.setText(oPrefs.get("ContactInfo", "Default Info"));
    }

    void setDefaultFieldValues() {
        //code using the prefs will go here
        oPrefs.put("SampleName", oSampleNameField.getText());
        oPrefs.put("ContactName", oContactNameField.getText());
        oPrefs.put("ContactInstitution", oContactInstitutionField.getText());
        oPrefs.put("ContactInfo", oContactInfoField.getText());
    }

    Admin getAdmin() {
        Admin oData = new Admin();
        Person oContact = new Person();

        //not setting the name anymore as this is retrieved elsewhere
        oContact.setName(oContactNameField.getText());
        oContact.setInstitution(oContactInstitutionField.getText());
        oContact.setContactInfo(oContactInfoField.getText());

        oData.setContact(oContact);
        oData.setSampleName(oSampleNameField.getText());

        return oData;
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new AdminPanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);
    }
}
