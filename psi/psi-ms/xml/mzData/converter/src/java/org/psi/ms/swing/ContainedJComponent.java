/**
 * ContainedJComponent
 * A JComponent in a panel with a title, spaced margins etc. A utility class
 * for making UIs. The user should place contained JComponents in a container
 * with spaced margins, to keep them clear from the edge (I think).
 *
 *
 * Created: Wed Nov 15 15:38:11 2000
 *
 * @author Lawrence Bower
 * @version
 */

package org.psi.ms.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;

public class ContainedJComponent extends JPanel {

    JTextArea oComponentNameLabel;

    /**
     * Creates a new <code>ContainedJComponent</code> instance. With a title.
     *
     * @param poTitle The String title for the component
     * @param poComponent The component to be contained
     */

    public ContainedJComponent(String poTitle,
                               JComponent poComponent) {
        this.init(poTitle, poComponent, 10, false, null);
    }

    /**
     * Creates a new <code>ContainedJComponent</code> instance. With a title
     * and a specified gap between the title and the component (to allow
     * alignment with other ContainedJComponents in the parent UI.
     *
     * @param poTitle The title of the component
     * @param poComponent The component to contain
     * @param piNameLabelWidth The specified width of the title (in pixels).
     */
    public ContainedJComponent(String poTitle,
                               JComponent poComponent,
                               int piNameLabelWidth) {
        this.init(poTitle, poComponent, piNameLabelWidth, false, null);
    }

    /**
     * Creates a new <code>ContainedJComponent</code> instance. Also specifies a
     * boolean flag for 'vertical resize' if set to true the component will
     * resize both vertically and horizontally - handy for text areas.
     *
     * @param poTitle The title of the component
     * @param poComponent The component to contain
     * @param piNameLabelWidth The specified width of the title (in pixels).
     * @param ptVerticalResize a <code>boolean</code> value - true means the
     *        component resizes vertically as well as horizontally
     */
    public ContainedJComponent(String poTitle,
                               JComponent poComponent,
                               int piNameLabelWidth,
                               boolean ptVerticalResize) {
        this.init(poTitle,
                poComponent,
                piNameLabelWidth,
                ptVerticalResize,
                null);
    }

    /**
     * Creates a new <code>ContainedJComponent</code> instance. With a title
     * and a specified gap between the title and the component (to allow
     * alignment with other ContainedJComponents in the parent UI. Also
     * specifies a border.
     *
     * @param poTitle The title of the component
     * @param poComponent The component to contain
     * @param piNameLabelWidth The specified width of the title (in pixels).
     * @param ptVerticalResize a <code>boolean</code> value - true means the
     *        component resizes vertically as well as horizontally
     * @param poBorder - the border for this panel
     */

    public ContainedJComponent(String poTitle,
                               JComponent poComponent,
                               int piNameLabelWidth,
                               boolean ptVerticalResize,
                               Border poBorder) {
        this.init(poTitle,
                poComponent,
                piNameLabelWidth,
                ptVerticalResize,
                poBorder);
    }


    /**
     * The constructor method.
     *
     * @param poTitle The title of the component
     * @param poComponent The component to contain
     * @param piNameLabelWidth The specified width of the title (in pixels).
     * @param ptVerticalResize a <code>boolean</code> value - true means the
     *        component resizes vertically as well as horizontally
     * @param poBorder - the border for this panel
     */
    public void init(String poTitle,
                     JComponent poComponent,
                     int piNameLabelWidth,
                     boolean ptVerticalResize,
                     Border poBorder) {

        Font oFont = new Font("Helvetica", Font.PLAIN, 12);
        oComponentNameLabel = new JTextArea(poTitle);
        //oComponentNameLabel.setLineWrap(true);
        //oComponentNameLabel.setWrapStyleWord(true);
        oComponentNameLabel.setEditable(false);
        Insets oInset = new Insets(2, 0, 0, 0);
        ((JTextComponent) oComponentNameLabel).setMargin(oInset);//moving that bass

        oComponentNameLabel.setFont(oFont);
        oComponentNameLabel.setForeground(Color.black);
        oComponentNameLabel.setOpaque(false);
        //oComponentNameLabel.setColumns(piNameLabelWidth);

        setLayout(new BorderLayout());
        setOpaque(false);

        JPanel oPanelInset = new JPanel();
        FlowLayout oLayout = new FlowLayout();
        oLayout.setVgap(0);
        oPanelInset.setLayout(oLayout);
        oPanelInset.setOpaque(false);
        //oPanelInset.setBackground(Color.red);
        oPanelInset.add(oComponentNameLabel);
        oPanelInset.add(Box.createRigidArea(new Dimension(piNameLabelWidth,0)));

        JPanel oComponentPanel = new JPanel();
        oComponentPanel.setOpaque(false);
        oComponentPanel.setLayout(new BorderLayout());
        if (!ptVerticalResize) {
            oComponentPanel.add(poComponent, BorderLayout.NORTH);
        } else {
            oComponentPanel.add(poComponent, BorderLayout.CENTER);
        }

        if (poBorder != null) setBorder(poBorder);
        add(oComponentPanel, BorderLayout.CENTER);
        add(Box.createRigidArea(new Dimension(5, 5)), BorderLayout.SOUTH);
        add(Box.createRigidArea(new Dimension(5, 5)), BorderLayout.NORTH);
        add(oPanelInset, BorderLayout.WEST);
    }

    /**
     * Sets the font on the name label to a specified font.
     *
     * @param poFont a <code>Font</code> value - the desired font.
     */
    public void setLabelFont(Font poFont) {
        oComponentNameLabel.setFont(poFont);
    }

    public static void main(String[] args) {

        JFrame oFrame = new JFrame("Contained JComponent");
        JPanel oPanel = new JPanel();
        //oPanel.setLayout(new BoxLayout(oPanel,BoxLayout.X_AXIS));
        oPanel.add(new ContainedJComponent("Thing one", new JLabel("hello"), 200));
        //oPanel.add(new ContainedJComponent("Thing two",new JLabel("hello"),2));

//        JPanel oAreaPanel = new JPanel();
//        JTextArea oArea = new JTextArea("Hello");
//        oArea.setBackground(Color.red);
//        oAreaPanel.add(oArea);
//        oAreaPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        //     oFrame.getContentPane().setLayout(new BorderLayout());
        //     oFrame.getContentPane().add(oArea,BorderLayout.WEST);
        oFrame.getContentPane().add(oPanel);
        oFrame.setSize(new Dimension(200, 100));
        oFrame.setVisible(true);

    }
}

