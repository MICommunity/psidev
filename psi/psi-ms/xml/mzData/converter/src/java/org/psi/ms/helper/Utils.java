/**
 * $Id: Utils.java,v 1.5 2004/10/11 07:06:44 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jul 22, 2003
 * Time: 11:00:54 AM
 */
package org.psi.ms.helper;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.binary.Base64;

import java.io.*;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author Kai Runte
 */
public class Utils {

    public static String floatListToBase64String(List floatList) throws EncoderException {
        byte[] raw = floatListToByteArray(floatList);
        Base64 base64 = new Base64();
        byte[] encoded = base64.encode(raw);
        return new String(encoded);
    }

    /**
     * Returns a byte array representing the float values in the IEEE 754 floating-point "single format" bit layout.
     * @param floatList a list of float values
     * @return a byte array representing the float values in the IEEE 754 floating-point "single format" bit layout.
     */
    public static byte[] floatListToByteArray(List floatList) {
        int floatListSize = floatList.size();
        byte[] raw = new byte[floatListSize * 4];
        int jjj = 0;
        for (int iii = 0; iii < floatListSize; iii++) {
            Float aFloat = (Float) floatList.get(iii);
            int ieee754 = Float.floatToIntBits(aFloat.floatValue());
            raw[jjj] = (byte) ((ieee754 >> 24) & 0xff);
            raw[jjj + 1] = (byte) ((ieee754 >> 16) & 0xff);
            raw[jjj + 2] = (byte) ((ieee754 >> 8) & 0xff);
            raw[jjj + 3] = (byte) ((ieee754) & 0xff);
            jjj += 4;
        }
        return raw;
    }

    public static List base64StringToFloatList(String base64String) throws DecoderException {
        Base64 base64 = new Base64();
        byte[] encoded = base64String.getBytes();
        byte[] raw = base64.decode(encoded);
        List floatList = byteArrayToFloatList(raw);
        return floatList;
    }

    public static List byteArrayToFloatList(byte[] raw) {
        Vector floatList = new Vector();
        for (int iii = 0; iii < raw.length; iii += 4) {
            int ieee754 = 0;
            ieee754 |= (((int) raw[iii]) & 0xff);
            ieee754 <<= 8;
            ieee754 |= (((int) raw[iii + 1]) & 0xff);
            ieee754 <<= 8;
            ieee754 |= (((int) raw[iii + 2]) & 0xff);
            ieee754 <<= 8;
            ieee754 |= (((int) raw[iii + 3]) & 0xff);
            float aFloat = Float.intBitsToFloat(ieee754);
            floatList.add(new Float(aFloat));
        }
        return floatList;
    }

    /**
     * A helper method that turns a file array into a TreeSet for easier searching.
     * @param array The String array to convert.
     * @return The created TreeSet.
     */
    public static TreeSet fileArrayToTreeSet(File[] array) {
        TreeSet treeSet = new TreeSet();

        for (int iii = 0; iii < array.length; iii++) {
            treeSet.add(array[iii].getPath());
        }
        return treeSet;
    }
}
