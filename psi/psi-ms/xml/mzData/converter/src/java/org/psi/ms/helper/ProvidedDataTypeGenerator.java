/**
 * $Id: ProvidedDataTypeGenerator.java,v 1.1 2003/11/21 15:24:06 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Nov 20, 2003
 * Time: 6:12:15 PM
 */
package org.psi.ms.helper;

import java.util.*;
import java.lang.reflect.Method;

/**
 * 
 * @author krunte
 */
public class ProvidedDataTypeGenerator {

    private static HashMap foundClasses = new HashMap();
    private static HashMap pathMap = new HashMap();

    public static void main(String[] args) throws ClassNotFoundException {
        // prepare the HashMap
        // we don't want marshalling code for standard classes
        // such as String, Class, etc.
        foundClasses.put(String.class, "");
        foundClasses.put(Class.class, "");
        foundClasses.put(int.class, "");
        foundClasses.put(boolean.class, "");
        foundClasses.put(float.class, "");
        foundClasses.put(short.class, "");
        foundClasses.put(long.class, "");
        String className = args[0];
        Class aClass = Class.forName(className);
        processClass(aClass, "");
        Set keySet = new TreeSet(pathMap.keySet());
        Iterator setIterator = keySet.iterator();
        int iii = 0;
        while (setIterator.hasNext()) {
            String path = (String) setIterator.next();
            String variableName = (String) pathMap.get(path);
            System.out.println("    public static int "
                    + variableName + "_TYPE = " + iii + ";");
            System.out.println("    public static ProvidedData "
                    + variableName + " =\n        new ProvidedData("
                    + variableName + "_TYPE, \""
                    + path + "\");");
            System.out.println();
            iii++;
        }
        System.out.println();
        System.out.println();
        setIterator = keySet.iterator();
        while (setIterator.hasNext()) {
            String path = (String) setIterator.next();
            String variableName = (String) pathMap.get(path);
            System.out.println("        members.put(\"" + path + "\", " + variableName + ");");
        }
    }

    private static void processClass(Class aClass, String parentNameSpace) throws ClassNotFoundException {
        String className = aClass.getName();
        String variableName = extractVariableName(className);
        Method[] methods = aClass.getMethods();
        Vector classesToProcess = new Vector();
        for (int iii = 0; iii < methods.length; iii++) {
            String methodName = methods[iii].getName();
            Class[] parameterTypes = methods[iii].getParameterTypes();
            if (methodName.startsWith("get") && parameterTypes.length == 0) {
                Class returnType = methods[iii].getReturnType();
                returnType = checkForArray(returnType);
                String itemName = convertMethodToVariableName(methodName);
                if (returnType != null) {
                    String path = null;
                    if (returnType.equals(String.class)) {
                        path = parentNameSpace + variableName + "/" + itemName;
                    } else if (returnType.equals(int.class)) {
                        path = parentNameSpace + variableName + "@" + itemName;
                    } else if (returnType.equals(boolean.class)) {
                        path = parentNameSpace + variableName + "@" + itemName;
                    } else if (returnType.equals(float.class)) {
                        path = parentNameSpace + variableName + "@" + itemName;
                    } else if (returnType.equals(short.class)) {
                        path = parentNameSpace + variableName + "@" + itemName;
                    } else if (returnType.equals(long.class)) {
                        path = parentNameSpace + variableName + "@" + itemName;
                    } else if (returnType.equals(Class.class)) {
                        // do nothing
                    } else {
                        if (foundClasses.get(returnType) == null) {
                            classesToProcess.add(returnType);
                            foundClasses.put(returnType, "");
                        }
                    }
                    if (path != null) {
                        pathMap.put(path, convertPathToVariableName(path));
                    }
                }
            }
        }
        int size = classesToProcess.size();
        for (int iii = 0; iii < size; iii++) {
            Class returnType = (Class) classesToProcess.get(iii);
            processClass(returnType, parentNameSpace + variableName + "/");
        }
    }

    private static Class checkForArray(Class aClass) throws ClassNotFoundException {
        String className = aClass.getName();
        //Check if it as an array
        if (className.startsWith("[L")) {
            className = className.substring(2);
            int length = className.length();
            if (length > 1) {
                className = className.substring(0, length - 1);
            }
            aClass = Class.forName(className);
        } else if (className.startsWith("[I")) {
            //integer array
            aClass = null;
        } else if (className.startsWith("[F")) {
            //float array
            aClass = null;
        } else if (className.startsWith("[B")) {
            //boolean array
            aClass = null;
        }
        return aClass;
    }

    private static String extractVariableName(String className) {
        String variableName;
        int index = className.lastIndexOf('.');
        if (index != -1) {
            variableName = className.substring(index + 1);
            String firstChar = variableName.substring(0, 1);
            variableName = variableName.replaceFirst(firstChar, firstChar.toLowerCase());
        } else {
            variableName = className.toLowerCase();
        }
        return variableName;
    }

    private static String convertMethodToVariableName(String methodName) {
        String variableName;
        variableName = methodName.substring(3);
        String firstChar = variableName.substring(0, 1);
        variableName = variableName.replaceFirst(firstChar, firstChar.toLowerCase());
        return variableName;
    }

    private static String convertPathToVariableName(String path) {
        String variableName;
        variableName = path.toUpperCase();
        variableName = variableName.replace('/', '_');
        variableName = variableName.replace('@', '_');
        return variableName;
    }
}
