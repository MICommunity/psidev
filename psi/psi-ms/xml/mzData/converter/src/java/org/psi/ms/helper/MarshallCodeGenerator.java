/**
 * $Id: MarshallCodeGenerator.java,v 1.2 2004/01/14 15:57:35 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Sep 12, 2003
 * Time: 1:18:45 BASE64
 */
package org.psi.ms.helper;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Vector;

/**
 * This class creates marshall methods recursively for all fields
 * of a given class. It uses reflection for finding all getters.
 * It takes the class name as only argument and prints the marshall
 * code to System.out
 *
 * @author Kai Runte
 */
public class MarshallCodeGenerator {

    private static HashMap foundClasses = new HashMap();

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
        processClass(aClass);
    }

    private static void processClass(Class aClass) throws ClassNotFoundException {
        String className = aClass.getName();
        String variableName = extractVariableName(className);
        System.out.println("private void marshall(" + className + " " + variableName + ") throws IOException {");
        System.out.println("    startTag(null, \"" + variableName + "\");");
        Method[] methods = aClass.getMethods();
        Vector classesToProcess = new Vector();
        for (int iii = 0; iii < methods.length; iii++) {
            String methodName = methods[iii].getName();
            if (methodName.startsWith("get")) {
                Class returnType = methods[iii].getReturnType();
                returnType = checkForArray(returnType);
                if (returnType != null) {
                    if (returnType.equals(String.class)) {
                        System.out.println("    text(" + variableName + "." + methodName + "());");
                    } else if (returnType.equals(int.class)) {
                        System.out.println("    attribute(null, \"" + methodName + "\", Integer.toString(" + variableName + "." + methodName + "()));");
                    } else if (returnType.equals(boolean.class)) {
                        System.out.println("    attribute(null, \"" + methodName + "\", Boolean.toString(" + variableName + "." + methodName + "()));");
                    } else if (returnType.equals(float.class)) {
                        System.out.println("    attribute(null, \"" + methodName + "\", Float.toString(" + variableName + "." + methodName + "()));");
                    } else if (returnType.equals(short.class)) {
                        System.out.println("    attribute(null, \"" + methodName + "\", Short.toString(" + variableName + "." + methodName + "()));");
                    } else if (returnType.equals(long.class)) {
                        System.out.println("    attribute(null, \"" + methodName + "\", Long.toString(" + variableName + "." + methodName + "()));");
                    } else if (returnType.equals(Class.class)) {
                        // do nothing
                    } else {
                        System.out.println("    marshall(" + variableName + "." + methodName + "());");
                        if (foundClasses.get(returnType) == null) {
                            classesToProcess.add(returnType);
                            foundClasses.put(returnType, "");
                        }
                    }
                }
            }
        }
        System.out.println("    endTag(null, \"" + variableName + "\");");
        System.out.println("}");
        System.out.println();
        int size = classesToProcess.size();
        for (int iii = 0; iii < size; iii++) {
            Class returnType = (Class) classesToProcess.get(iii);
            processClass(returnType);
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
}
