/**
 * $Id: Utils.java,v 1.2 2003/08/21 14:28:01 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
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
 * @author krunte
 */
public class Utils {

    public static String floatListToBase64String(List floatList) throws EncoderException, IOException {
        byte[] raw = floatListToByteArray(floatList);
        Base64 base64 = new Base64();
        byte[] encoded = base64.encode(raw);
        return new String(encoded);
    }

    public static byte[] floatListToByteArray(List floatList) throws IOException {
        ByteArrayOutputStream bOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oOutputStream = new ObjectOutputStream(bOutputStream);
        int floatListSize = floatList.size();
        for (int iii = 0; iii < floatListSize; iii++) {
            oOutputStream.writeFloat(((Float) floatList.get(iii)).floatValue());
        }
        oOutputStream.flush();
        bOutputStream.flush();
        byte[] raw = bOutputStream.toByteArray();
        return raw;
    }

    public static List base64StringToFloatList(String base64String) throws DecoderException, IOException, StreamCorruptedException {
        Base64 base64 = new Base64();
        byte[] encoded = base64String.getBytes();
        byte[] raw = base64.decode(encoded);
        Vector floatList = byteArrayToFloatList(raw);
        return floatList;
    }

    public static Vector byteArrayToFloatList(byte[] raw) throws IOException {
        ByteArrayInputStream bInputStream = new ByteArrayInputStream(raw);
        ObjectInputStream oInputStream = new ObjectInputStream(bInputStream);
        Vector floatList = new Vector();
        try {
            while (true) {
                float f = oInputStream.readFloat();
                floatList.add(new Float(f));
            }
        } catch (IOException e) {
            //end of file reached
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
