/**
 * $Id: TestUtils.java,v 1.1 2004/01/26 16:50:55 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jan 26, 2004
 * Time: 4:02:42 PM
 */
package org.psi.ms.helper;

import junit.framework.TestCase;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.DecoderException;

/**
 * 
 * @author Kai Runte
 */
public class TestUtils extends TestCase {

    public void testByteFloatConversion() {
        for (int kkk = 0; kkk < 100; kkk++) {
            Random random = new Random();
            ArrayList floatList = new ArrayList();
            for (int iii = 0; iii < 1000; iii++) {
                float aFloat = random.nextFloat();
                floatList.add(new Float(aFloat));
            }
            // Because of rounding errors the original floatList
            // will always differ from the first converted list.
            // However, in the second round of conversion these
            // errors should be the same, hence create the same
            // numbers.
            byte[] bytes = Utils.floatListToByteArray(floatList);
            List list = Utils.byteArrayToFloatList(bytes);
            byte[] bytes2 = Utils.floatListToByteArray(list);
            List list2 = Utils.byteArrayToFloatList(bytes2);
            assertEquals("size differs between input and output list!", list.size(), list2.size());
            for (int iii = 1; iii < list.size(); iii++) {
                Float original = (Float) list.get(iii);
                Float converted = (Float) list2.get(iii);
                assertEquals("converter float differs from original float value!", original, converted);
            }
        }
    }

    public void testBase64Conversion() {
        for (int kkk = 0; kkk < 100; kkk++) {
            Random random = new Random();
            ArrayList floatList = new ArrayList();
            for (int iii = 0; iii < 1000; iii++) {
                float aFloat = random.nextFloat();
                floatList.add(new Float(aFloat));
            }
            try {
                // Because of rounding errors the original floatList
                // will always differ from the first converted list.
                // However, in the second round of conversion these
                // errors should be the same, hence create the same
                // numbers.
                String base64orig = Utils.floatListToBase64String(floatList);
                List list = Utils.base64StringToFloatList(base64orig);
                String base64round1 = Utils.floatListToBase64String(list);
                List list2 = Utils.base64StringToFloatList(base64round1);
                String base64round2 = Utils.floatListToBase64String(list2);
                assertEquals("size differs between input and output list!", list.size(), list2.size());
                assertEquals("base64 string differs between input and output list!", base64round1, base64round2);
                for (int iii = 0; iii < list.size(); iii++) {
                    Float original = (Float) list.get(iii);
                    Float converted  = (Float) list2.get(iii);
                    assertEquals("converter float differs from original float value!", original, converted);
                }
            } catch (EncoderException e) {
                fail("Unexpected exception: " + e);
            } catch (DecoderException e) {
                fail("Unexpected exception: " + e);
            }
        }
    }
}
