package org.psi.ms.swing;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.prefs.*;
import javax.swing.*;

public class PersistentWindows
{
  private Set windows = new HashSet();
  private Preferences prefs =
    Preferences.userNodeForPackage( getClass() );
  static private final String NAMES[] = {
    "Main", "Source", "Assembly", "Classes", "Watch", "Project" };

  // Default positions of the windows
  static final private Rectangle DEFAULTS[] = {
    new Rectangle( 39, 2, 728, 81 ),
    new Rectangle( 218, 83, 548, 312 ),
    new Rectangle( 218, 396, 547, 125 ),
    new Rectangle( 39, 244, 179, 277 ),
    new Rectangle( 38, 522, 726, 85 ),
    new Rectangle( 39, 83, 179, 161),
  };

  public PersistentWindows() {
    setupGUI();
  }

  private void setupGUI() {
    PersistentWindow pw = null;

    pw = addWindow( 0 );
    pw.getContentPane().setLayout( new BorderLayout() );
    pw.getContentPane().add( new JTextArea(), BorderLayout.CENTER );
    JMenuBar mb = new JMenuBar();
    pw.setJMenuBar( mb );
    JMenu fileMenu = new JMenu( "File" );
    fileMenu.setMnemonic( KeyEvent.VK_F );
    mb.add( fileMenu );
    JMenuItem exitMI = new JMenuItem( "Exit", KeyEvent.VK_X );
    exitMI.addActionListener( new ActionListener() {
        public void actionPerformed( ActionEvent ae ) {
          removeWindows();
          System.exit( 0 );
        }
      } );
    fileMenu.add( exitMI );
    pw.setVisible( true );

    pw = addWindow( 1 );
    pw.getContentPane().setLayout( new BorderLayout() );
    pw.getContentPane().add( new JTextArea(), BorderLayout.CENTER );
    pw.setVisible( true );

    pw = addWindow( 2 );
    pw.getContentPane().setLayout( new BorderLayout() );
    pw.getContentPane().add( new JTextArea(), BorderLayout.CENTER );
    pw.setVisible( true );

    pw = addWindow( 3 );
    pw.getContentPane().setLayout( new BorderLayout() );
    pw.getContentPane().add( new JTextArea(), BorderLayout.CENTER );
    pw.setVisible( true );

    pw = addWindow( 4 );
    pw.getContentPane().setLayout( new BorderLayout() );
    pw.getContentPane().add( new JTextArea(), BorderLayout.CENTER );
    pw.setVisible( true );

    pw = addWindow( 5 );
    pw.getContentPane().setLayout( new BorderLayout() );
    pw.getContentPane().add( new JTextArea(), BorderLayout.CENTER );
    pw.setVisible( true );
  }

  // Return the window with the given name
  private PersistentWindow getWindow( String name ) {
    for (Iterator it=windows.iterator(); it.hasNext();) {
      PersistentWindow pw = (PersistentWindow)it.next();
      if (pw.name().equals( name ))
        return pw;
    }
    return null;
  }

  private PersistentWindow addWindow( int windowNum ) {
    PersistentWindow pw =
      new PersistentWindow( NAMES[windowNum], DEFAULTS[windowNum] );

    windows.add( pw );

    return pw;
  }

  private void removeWindow( PersistentWindow pw ) {
    windows.remove( pw );

    // If there are no more windows left, quit
    if (windows.size()==0) {
      System.exit( 0 );
    }
  }

  private void removeWindows() {
    Object ws[] = windows.toArray();
    for (int i=0; i<ws.length; ++i) {
      ((PersistentWindow)ws[i]).remove();
    }
  }

  /**
   * Inner class: PersistentWindow is a JFrame
   * whose position is managed by PersistentWindows
   * class.
   */
  class PersistentWindow extends JFrame {
    private String name;

    public PersistentWindow( String name, Rectangle defaults ) {
      super( name );
      this.name = name;
      setLocation( defaults );
      addListeners();
    }

    public String name() { return name; }

    public void setLocation( Rectangle defaults ) {
      int x = prefs.getInt( name+"_x", defaults.x );
      int y = prefs.getInt( name+"_y", defaults.y );
      int width = prefs.getInt( name+"_width", defaults.width );
      int height = prefs.getInt( name+"_height", defaults.height );
      setLocation( x, y );
      setSize( width, height );
    }

    private void saveLocation() {
      int x = getLocation().x;
      int y = getLocation().y;
      int width = getSize().width;
      int height = getSize().height;
      prefs.putInt( name+"_x", x );
      prefs.putInt( name+"_y", y );
      prefs.putInt( name+"_width", width );
      prefs.putInt( name+"_height", height );
    }

    private void remove() {
      saveLocation();
      setVisible( false );

      // Remove this window from the parent
      // object's list
      removeWindow( PersistentWindow.this );
    }

    private void addListeners() {
      addWindowListener( new WindowListener() {
        public void windowActivated( WindowEvent we ) {
        }
        public void windowClosed( WindowEvent we ) {
        }
        public void windowClosing( WindowEvent we ) {
          // Remove window if the close-button is pressed
          remove();
        }
        public void windowDeactivated( WindowEvent we ) {
        }
        public void windowDeiconified( WindowEvent we ) {
        }
        public void windowIconified( WindowEvent we ) {
        }
        public void windowOpened( WindowEvent we ) {
        }
      } );
    }
  }

  static public void main( String args[] ) {
    new PersistentWindows();
  }
}
