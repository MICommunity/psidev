/**
 * $Id: ImporterLoader.java,v 1.3 2004/01/13 15:14:04 lbower Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Nov 28, 2003
 * Time: 4:50:18 PM
 */
package org.psi.ms.converter;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.beans.Beans;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.prefs.Preferences;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;

/**
 * This class is responsible for loading plug-ins from a directory that
 * is set calling the {@link #ImporterLoader(File) constructor} or with the method
 * {@link #setPath(File) setPath}
 * @author Kai Runte
 */
public class ImporterLoader {

    /**
     * The preferences for the ImporterLoader
     */
    private Preferences preferences = Preferences.userNodeForPackage(ImporterLoader.class);

    /**
     * The log4j logger for this class
     */
    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * This is the plug-in search path
     */
    private File path = null;

    /**
     * This Vector contains all loaded plugins.
     */
    private Vector importerList;

    /**
     * Name for the prefences item plugin path.
     */
    public static final String PREF_PLUGIN_PATH = "ImporterLoader.plugins.path";

    /**
     * Create a new plug-in loader with the given search path.
     *
     * @throws java.lang.NullPointerException if <code>path</code>
     * equals <code>null</code>
     */
    public ImporterLoader(File path) {
        importerList = new Vector();
        this.path = path;
    }

    /**
     * Create a new plug-in loader with the default directory.
     */
    public ImporterLoader() throws FileNotFoundException {
        String pathString = preferences.get(PREF_PLUGIN_PATH, null);
//        String pathString = preferences.get("muggins", null);
        importerList = new Vector();
        if (pathString == null) {
            String classpath = System.getProperty("java.class.path");
            logger.debug("Classpath: " + classpath);
            String jarName = "converter.jar";
            StringTokenizer tokenizer = new StringTokenizer(classpath, ":");
            while (tokenizer.hasMoreTokens()) {
                String pathElement = tokenizer.nextToken();
                logger.debug("Path element: " + pathElement);
                if (pathElement.endsWith(jarName)) {
                    logger.debug("Path found: " + pathElement);
                    File tempPath = new File(pathElement).getParentFile();
                    String absolutePath = tempPath.getAbsolutePath();
                    tempPath = new File(absolutePath + File.separatorChar + "plugins");
                    if (tempPath.exists()) {
                        logger.debug("Found plugin directory: " + tempPath);
                        this.path = tempPath;
                        preferences.put(PREF_PLUGIN_PATH, this.path.getAbsolutePath());
                    }
                }
            }
        } else {
            this.path = new File(pathString);
        }
        if (this.path == null) {
            throw new FileNotFoundException("Could not find the plugins directory!");
        } else if (this.path.isFile()) {
            throw new FileNotFoundException("Given plugins path is poiting to a file: " + path.getAbsolutePath());
        }
        logger.debug("Plugin path is : " + path.getAbsolutePath());
    }

    /**
     * Returns the path to the directory, where the plug-ins are loaded from.
     * @return {@link java.io.File File} path to the plug-ins
     */
    public File getPath() {
        return path;
    }

    /**
     * Returns the list of found ImporterI implementations.
     * @return the list of found ImporterI implementations.
     */
    public List getImporterList() {
        return importerList;
    }

    /**
     * Sets the given path as default path to load plug-ins from.
     *
     * @param path path to the plug-ins
     */
    public void setPath(File path) {
        this.path = path;
        preferences.put(PREF_PLUGIN_PATH, this.path.getAbsolutePath());
    }

    /**
     * Loads the plug-ins that can be found in directory set by the
     * construtor or setPluginPath.
     * Right now it keeps pretty quiet and does not throw any
     * exceptions. This is subject to change for the future.
     * Have a look at the source-code for more details.
     */
    public void loadImporters() throws FileNotFoundException {
        logger.debug("Loading importers.");

        if (path.isFile()) {
            throw new FileNotFoundException("Given plugins path is poiting to a file: " + path.getAbsolutePath());
        }

        // Retrieve a list of files in the directory plugins.
        File[] filelist = path.listFiles();
        if (filelist == null) {
            throw new FileNotFoundException("Given plugins path contains no files: " + path.getAbsolutePath());
        }

        // Still here? filelist seems to be sane, then.

        // beanList contains all the URLs that point to a jar file
        Vector beanList = new Vector();
        // beanNames contains all the classname (without .class or
        // .ser for serialised classes), which are proven to be a
        // bean
        Vector beanNames = new Vector();

        logger.debug("Number of files found: " + filelist.length);
        for (int iii = 0; iii < filelist.length; iii++) {
            try {
                // For each file in filelist there has to be created a url
                // from its filename in order to load it as a jar-file
                URL url = new URL("jar", "", filelist[iii].toURL() + "!/");
                JarURLConnection juc = (JarURLConnection) url.openConnection();

                // Attribute in jar-files is the information that is
                // saved in the so-called manifest. For example, for
                // the .dta importer it looks like this:
                // Manifest-Version: 1.0
                // Name: org.psi.ms.importers.DtaSetImporter.class
                // Java-Bean: True
                Attributes attr = juc.getMainAttributes();
                logger.debug("Jar attributes: " + attr);

                // addToBeanLists checks class is a bean and if so
                // adds its name to beanNames and the URL to beanList
                addToBeanLists(beanNames, beanList, attr, url, null);

                // Sometimes it happens that several classes in a
                // jar-file are tagged as a bean, but this information
                // is not saved in the main attributes (it took me a
                // while to figure that out)! It is saved with each
                // element and to make my life not to easy, the
                // attributes of the first class (the one with the
                // main attributes) is not saved in this
                // enumeration...
                Enumeration entries = juc.getJarFile().entries();
                while (entries.hasMoreElements()) {
                    JarEntry entry = (JarEntry) entries.nextElement();
                    logger.debug("Jar entry: " + entry);
                    attr = entry.getAttributes();
                    logger.debug("Jar attributes: " + attr);
                    // addToBeanLists checks class is a bean and if so
                    // adds its name to beanNames and the URL to beanList
                    addToBeanLists(beanNames, beanList, attr, url, entry);
                }

            }
            // This happens if someone place a file in the plug-in
            // directory that isn't a jar-file.
            catch (java.util.zip.ZipException e) {
                logger.error("Error while reading plug-ins:\n" + filelist[iii] + " is no jar-file!", e);
            }
            // This happens while creating a new URL via
            // filelist[iii].toURL()
            catch (java.net.MalformedURLException e) {
                logger.error("Error while reading plug-ins:\n" + filelist[iii] + " caused a MalformedURLException", e);
            }
            // This happens while creating a new URL via
            // filelist[iii].toURL(), url.openConnection() or
            // juc.getMainAttributes()
            catch (java.io.IOException e) {
                logger.error("Error while reading plug-ins:\n" + filelist[iii] + " caused an IOException", e);
            }

        }// for (int iii = 0;iii<filelist.length;iii++)


        // After finding which files contain JavaBeans and what are
        // the names of them, they are actually loaded...
        //
        // Create an array of all the URLs pointing to jar-files
        // containing beans.
        int beanListSize = beanList.size();
        logger.debug("Number of beans found: " + beanListSize);
        URL[] beanURLs = new URL[beanListSize];
        beanURLs = (URL[]) beanList.toArray(beanURLs);
        // Create a new URLClassLoader
        URLClassLoader ucl = new URLClassLoader(beanURLs);
        int beanNamesSize = beanNames.size();
        logger.debug("Number of bean names found: " + beanNamesSize);
        for (int iii = 0; iii < beanNamesSize; iii++) {
            logger.debug("BeanNames: " + beanNames.get(iii).toString());
            Object obj = null;
            try {
                obj = Beans.instantiate(ucl, beanNames.get(iii).toString());
            } catch (Exception e) {
                logger.error("Error while instantiating " + beanNames.get(iii).toString(), e);
            }

            // If the current class was load successfully...
            if (obj != null) {
                Class c = obj.getClass();
                Class[] interfaces = c.getInterfaces();
                boolean pluginFlag = false;

                // Maybe it is more efficient to directly cast the
                // Object obj to the interface
                // org.psi.ms.converter.ImporterI? I might try out this
                // later...

                // This loop checks if the loaded class implements the
                // interface org.psi.ms.converter.ImporterI and sets
                // pluginFlag accordingly
                String importerInterfaceName = ImporterI.class.getName();
                for (int jjj = 0; jjj < interfaces.length; jjj++) {
                    if (interfaces[jjj].getName().equals(importerInterfaceName))
                        pluginFlag = true;
                } // for (int jjj = 0; jjj < interfaces.length; jjj++)

                // The loaded bean has to implement the interface
                // org.psi.ms.converter.ImporterI to be recognised as
                // an importer.
                if (pluginFlag) {
                    logger.debug("Is importer.");
                    // We can savely cast the Object obj to the type
                    // org.psi.ms.converter.ImporterI
                    ImporterI importer = (ImporterI) obj;
                    importerList.add(importer);
                } else {
                    logger.debug("Is not importer.");
                    obj = null;
                }

            }// if (obj!=null)

        }// for (int iii = 0;iii<beanNames.size();iii++)

    }

    protected void addToBeanLists(Vector beanNames, Vector beanList, Attributes attr, URL url, JarEntry entry) {
        if (attr != null) {
            // isBeanString contains the value of the jar-file attribute
            // 'Java-Bean'.
            Set keySet = attr.keySet();
            Iterator iterator = keySet.iterator();
            while (iterator.hasNext()) {
                Object o = iterator.next();
                logger.debug("Attribute key: " + o);
            }
            String isBeanString = attr.getValue("Java-Bean");
            logger.debug("Java-Bean: " + isBeanString);
            // If it is a bean (that is isBeanString equals 'True'),
            // it will be added to the list of beans.
            if (isBeanString != null) {
                boolean isBean = Boolean.valueOf(isBeanString).booleanValue();
                logger.debug("Java-Bean: " + isBean);
                if (isBean) {
                    String classname = attr.getValue("Name");
                    if (classname == null && entry != null) {
                        classname = entry.toString();
                        // Replace all forward/backward slashes by dots
                        classname.replace('/', '.');
                        classname.replace('\\', '.');
                    }
                    logger.debug("The classname: " + classname);
                    logger.debug("The URL: " + url);
                    if (classname != null) {
                        if (classname.endsWith(".class")) {
                            classname = classname.substring(0, classname.length() - 6);
                        }
                        if (classname.endsWith(".ser")) {
                            classname = classname.substring(0, classname.length() - 4);
                        }
                        beanNames.add(classname);
                        // If a bean is found in the jar-file, the
                        // URL can be added to the beanList
                        beanList.add(url);
                    }
                }
            }
        }
    }
}
