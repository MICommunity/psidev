package org.psi.ms.swing;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Jan 13, 2004
 * Time: 11:57:21 AM
 * To change this template use Options | File Templates.
 */
public class Menu extends JMenuBar {

    public static String PLUGINS = "org.psi.ms.swing.Menu.plugins";
    public static String EXIT = "org.psi.ms.swing.Menu.exit";

    private JMenu optionsMenu;

    private ArrayList listeners = new ArrayList();

    public Menu() {
        super();
        prepareItems();
    }

    private void prepareItems() {
        optionsMenu = new JMenu("Options");
        optionsMenu.setFont(MainPanel.FONT);

        JMenuItem pluginsItem = new JMenuItem("Specify plugins directory");
        pluginsItem.setFont(MainPanel.FONT);
        pluginsItem.setActionCommand(this.PLUGINS);
        listeners.add(pluginsItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(MainPanel.FONT);
        exitItem.setActionCommand(this.EXIT);
        listeners.add(exitItem);

        optionsMenu.add(pluginsItem);
        optionsMenu.add(exitItem);
        this.add(optionsMenu);
    }

    public void addActionListener(ActionListener e) {
        for (int i = 0; i < listeners.size(); i++) {
            ((JMenuItem) listeners.get(i)).addActionListener(e);
        }
    }
}
