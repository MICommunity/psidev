/**
 * $Id: TestUtils.java,v 1.2 2004/10/11 07:06:45 krunte Exp $
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
            byte[] bytes = Utils.floatListToByteArray(floatList);
            List list = Utils.byteArrayToFloatList(bytes);
            assertEquals("size differs between input and output list!", floatList.size(), list.size());
            for (int iii = 1; iii < floatList.size(); iii++) {
                Float original = (Float) floatList.get(iii);
                Float converted = (Float) list.get(iii);
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
                String base64orig = Utils.floatListToBase64String(floatList);
                List list = Utils.base64StringToFloatList(base64orig);
                String base64round1 = Utils.floatListToBase64String(list);
                assertEquals("size differs between input and output list!", floatList.size(), list.size());
                assertEquals("base64 string differs between input and output list!", base64orig, base64round1);
                for (int iii = 0; iii < floatList.size(); iii++) {
                    Float original = (Float) floatList.get(iii);
                    Float converted  = (Float) list.get(iii);
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
