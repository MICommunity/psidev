package org.psi.ms.swing;

import org.psi.ms.model.Admin;
import org.psi.ms.model.Person;
import org.psi.ms.converter.ProvidedDataItem;
import org.psi.ms.view.AdminData;
import org.psi.ms.view.AdminContactPersonData;
import org.psi.ms.view.PersonData;

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

    //we are providing a view on these objects
    private AdminData adminData;
    private PersonData personData;

    private JTextField oSampleNameField;
    private JTextField oContactNameField;
    private JTextField oContactInstitutionField;

    private JTextArea oContactInfoField;
    private JScrollPane oContactInfoScroller;

//    private boolean populated = false;

    public AdminPanel() {
        prepareFields();
        layoutPanel();
    }

    private void layoutPanel() {

        this.setLayout(new BorderLayout());
        this.setBorder(new CompoundBorder
                (new TitledBorder(new EtchedBorder(), "Admin"),
                        new EmptyBorder(3, 3, 3, 3)));

        JPanel oInnerPanel = new JPanel();
        oInnerPanel.setLayout(new BoxLayout(oInnerPanel, BoxLayout.Y_AXIS));

        JPanel oInnerTopPanel = new JPanel();
        oInnerTopPanel.setLayout(new BoxLayout(oInnerTopPanel, BoxLayout.Y_AXIS));

        oInnerPanel.add(new ContainedJComponent("Name", oContactNameField, 15));
        oInnerPanel.add(new ContainedJComponent("Institute", oContactInstitutionField, 5));

        oContactInfoScroller.setBorder
                (new TitledBorder(new EmptyBorder(0, 0, 0, 0),
                        "Address",
                        TitledBorder.DEFAULT_JUSTIFICATION,
                        TitledBorder.DEFAULT_POSITION,
                        MainPanel.FONT));
        oInnerPanel.add(oContactInfoScroller);
        oInnerTopPanel.add(oInnerPanel);

        this.add(oInnerTopPanel, BorderLayout.NORTH);
    }

    private void prepareFields() {
        oSampleNameField = new JTextField();
        oSampleNameField.setMargin(new Insets(0, 2, 0, 2));
        oContactNameField = new JTextField();
        oContactNameField.setMargin(new Insets(0, 2, 0, 2));
        oContactInstitutionField = new JTextField();
        oContactInstitutionField.setMargin(new Insets(0, 2, 0, 2));
        oContactInfoField = new JTextArea() {
        };

        oContactInfoField.setMargin(new Insets(0, 5, 0, 2));
        oContactInfoScroller = new JScrollPane() {
            public Dimension getPreferredSize() {
                return new Dimension(super.getPreferredSize().width, 200);
            }
        };
        oContactInfoScroller.getViewport().add(oContactInfoField);
    }

    public boolean isPopulated() {
        if (adminData == null) {
            return false;
        }
        return adminData.isPopulated();
    }

//    private void setPopulated(boolean populated) {
//        this.populated = populated;
//    }

    void setData(AdminData adminData, PersonData personData) {
        this.adminData = adminData;
        this.personData = personData;
//        this.setPopulated(true);
    }

    protected void getDefaultFieldValues() {
        //checks to see if the fields are already provided by the dataobject, and are un-editable
        //if the fields are available for editing, checks to see if the value is not set
        if (isPopulated()) {
            if (adminData.isFieldActive(ProvidedDataItem.DESC_ADMIN_SAMPLENAME)) {
                if (adminData.getAdmin().getSampleName().equals("")) {
                    oSampleNameField.setText(oPrefs.get("SampleName", "Default Sample"));
                }
            }
            if (personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_NAME)) {
                if (personData.getPerson().getName().equals("")) {
                    oContactNameField.setText(oPrefs.get("ContactName", "Default Contact"));
                }
            }
            if (personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_INSTITUTION)) {
                if (personData.getPerson().getInstitution().equals("")) {
                    oContactInstitutionField.setText(oPrefs.get("ContactInstitution", "Default Institute"));
                }
            }
            if (personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_CONTACTINFO)) {
                if (personData.getPerson().getContactInfo().equals("")) {
                    oContactInfoField.setText(oPrefs.get("ContactInfo", "Default Info"));
                }
            }
        }
    }

    void refreshFieldValues() {
        if (isPopulated()) {
            oSampleNameField.setText(adminData.getAdmin().getSampleName());
            oContactNameField.setText(personData.getPerson().getName());
            oContactInstitutionField.setText(personData.getPerson().getInstitution());
            oContactInfoField.setText(personData.getPerson().getContactInfo());
            //getDefaultFieldValues();//need to fill up the fields with no values with default vaues
        }
        else {//dataobject empty so clear fields
            setFieldActivation(false);
        }
    }

    void setDefaultFieldValues() {
        oPrefs.put("SampleName", oSampleNameField.getText());
        oPrefs.put("ContactName", oContactNameField.getText());
        oPrefs.put("ContactInstitution", oContactInstitutionField.getText());
        oPrefs.put("ContactInfo", oContactInfoField.getText());
    }

    void setFieldActivation() {

        if (isPopulated()) {
            setFieldActivation(true);

            if (!adminData.isFieldActive(ProvidedDataItem.DESC_ADMIN_SAMPLENAME)) {
                oSampleNameField.setEnabled(false);
            }

            if (!personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_NAME)) {
                oContactNameField.setEnabled(false);
            }
            if (!personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_INSTITUTION)) {
                oContactInstitutionField.setEnabled(false);
            }
            if (!personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_CONTACTINFO)) {
                oContactInfoField.setEnabled(false);
            }
        }
    }

    private void setFieldActivation(boolean activate) {
        oSampleNameField.setEnabled(activate);
        oContactNameField.setEnabled(activate);
        oContactInstitutionField.setEnabled(activate);
        oContactInfoField.setEnabled(activate);
    }

    void setDataValues() {

        if (isPopulated()) {
            if (personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_NAME)) {
                personData.getPerson().setName(oContactNameField.getText());
            }
            if (personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_INSTITUTION)) {
                personData.getPerson().setInstitution(oContactInstitutionField.getText());
            }
            if (personData.isFieldActive(ProvidedDataItem.DESC_ADMIN_PERSON_CONTACTINFO)) {
                personData.getPerson().setContactInfo(oContactInfoField.getText());
            }

            if (!adminData.isFieldActive(ProvidedDataItem.DESC_ADMIN_SAMPLENAME)) {
                adminData.getAdmin().setSampleName(oSampleNameField.getText());
            }
        }
    }

    public static void main(String[] args) {
        JFrame oFrame = new JFrame();
        oFrame.getContentPane().add(new AdminPanel());
        oFrame.setSize(300, 300);
        oFrame.setVisible(true);
    }
}
