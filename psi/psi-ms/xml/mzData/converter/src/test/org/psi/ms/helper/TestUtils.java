/**
 * $Id: TestUtils.java,v 1.3 2004/10/20 11:47:37 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jan 26, 2004
 * Time: 4:02:42 PM
 */
package org.psi.ms.helper;

import junit.framework.TestCase;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
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
            byte[] bytes = Utils.floatListToByteArray(floatList, true);
            List list = Utils.byteArrayToFloatList(bytes, true);
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
                String base64orig = Utils.floatListToBase64String(floatList, true);
                List list = Utils.base64StringToFloatList(base64orig, true);
                String base64round1 = Utils.floatListToBase64String(list, true);
                assertEquals("size differs between input and output list!", floatList.size(), list.size());
                assertEquals("base64 string differs between input and output list!", base64orig, base64round1);
                for (int iii = 0; iii < floatList.size(); iii++) {
                    Float original = (Float) floatList.get(iii);
                    Float converted = (Float) list.get(iii);
                    assertEquals("converter float differs from original float value!", original, converted);
                }
            } catch (EncoderException e) {
                fail("Unexpected exception: " + e);
            } catch (DecoderException e) {
                fail("Unexpected exception: " + e);
            }
        }
    }

    final static String mass = "340vRFMLMESokDBEVxAxRHOQMUQLDDJEQ5IyRLvNMkRjUDNEtdIzRGNRNETg0TREaVA1RJHPNUTXTjZE/s42RN9TN0Rx3jdE2pM4RFcUOUQPkzlELhI6RLGMOkQCHDtEghJAROabQERiDEJE/ZpCRAgRRESKUUVEHthFRNEVRkQb1UZEmFNHRNTZR0RUV0lEWNZJREFXSkSSzkpE2FVLRBiaS0T6EUxEaI9MRFzNTURrFk9EYJhPRM7YT0SMWlBEt89QREaYUkQKS1NE7RVURNRXVUQ1E1dEcIxXRG4YWERCllhEUcxYRAzaWUSK2VpEKk5bRNedXESsWl9Eq91fRCdYYET0WGFEwtFjRPFUZERJ2mVE7VxoRBKbaURQYGtE26JtREIdbkQtG29EyaBvRBvicESZXXNEh95zRKgZdkRbmnpEECd9RPQrgUSwZ4FEtq6BRBbugUQ01YdEchmVRHb4nkR0hp9EMxyqRLCsqkRLEqtEDXmrROxdrERKMq1ERpetRPLerUQARK5Emx2vRA+er0QY3LFEWj20RLPYu0QEYbxESvq8REFAvUT81L1EeN/IRBigyUSJWspE/xPLRKQ7zETYms9EOv3RROk91UQRpd9ERLzgRFTf4UR3/uJEBLzlRFZ+50QPw+dES1npRE6k60S8P+1El2DuRFkk8kQDpfZECcb3RHvD/USUxv5En1IARYPkA0U=";
    final static String intensity = "5BdVSMDUzkevaQlIWCb5R2RP00cgf+hHJ61yRwwV00fqcp5Hv0vgR7l/jEfzU7NHjjefR466m0cpM2RH2hG9RysQwEf85nZJnrXMR84cu0fW++pH5dCHRxSQQ0f7C/pKmPsJSIniV0mQxQNILDKoR7n9L0dMCYBHjUnVR2HHpkjedcxH2v4/R+5CBEhEPatHpD/sRg8Nl0fd74tHc/6KR2sOZ0hJIfBHMD57RyTqrUeiSnlHCF4VRywWLUgsyoRH4ORVR1zwk0cpSYBInWQpR0XO40dO9fhGB7mkRyYmSUe31jVHwDFHSImyIUdUhXFHF4rMRzchW0c114hH1BUzR65rs0f49T9H7LfrRvbeikes4RpHfid3R0YuhEccRYNJhTj8Rjh2UUf4DoNH+ooeR+LDd0jmGr1G9p2FRz3QQUekPXtHU93hRjwFwUZMuhZHqvvARgQbKkf8tptIdDTgRq48m0lEGElHDqPqSdhT2kddHRRIZtOeRyfodUpeympIkDnRR9ZMhEitRLhH2VtIScwUb0fzqh5IWMTDRwj0wEkeSyZKuSuMR3ZBUEh9OtZI4xoiS/mBhUlyIUlJAVbkSCFJqEcwglVH6t+OR1SLo0f0EZxHrP6yR6L6UUcHAJdKoql1SdKpcEeHG3pKe/+HSDdqQ0thLUBJsZzkSeOPcUrbZ99HoOhISnCLN0frtV9HHde7R3ZrNUo=";
    final static float[][] mzArray = {
        {702.217F, 218207.563F},
        {704.177F, 105897.500F},
        {706.260F, 140710.734F},
        {708.255F, 127564.688F},
        {710.257F, 108190.781F},
        {712.188F, 119038.250F},
        {714.285F, 62125.152F},
        {715.215F, 108074.094F},
        {717.256F, 81125.828F},
        {719.292F, 114839.492F},
        {721.272F, 71935.445F},
        {723.279F, 91815.898F},
        {725.256F, 81519.109F},
        {727.243F, 79733.109F},
        {729.232F, 58419.160F},
        {731.234F, 96803.703F},
        {733.310F, 98336.336F},
        {735.476F, 1011311.750F},
        {738.310F, 104811.234F},
        {740.318F, 95801.609F},
        {742.298F, 120311.672F},
        {744.284F, 69537.789F},
        {746.198F, 50064.078F},
        {748.438F, 8193533.500F},
        {768.289F, 141294.375F},
        {770.436F, 884264.563F},
        {776.194F, 134934.250F},
        {778.422F, 86116.344F},
        {784.266F, 45053.723F},
        {789.274F, 65554.594F},
        {791.377F, 109203.102F},
        {792.341F, 341563.031F},
        {795.330F, 104683.734F},
        {797.306F, 49150.852F},
        {799.404F, 135435.719F},
        {805.365F, 87674.531F},
        {807.349F, 30239.820F},
        {809.363F, 77338.117F},
        {811.228F, 71647.727F},
        {813.341F, 71164.898F},
        {814.408F, 236601.672F},
        {816.281F, 122946.570F},
        {818.241F, 64318.188F},
        {823.209F, 89044.281F},
        {828.350F, 63818.633F},
        {830.381F, 38238.031F},
        {831.388F, 177240.688F},
        {833.415F, 67988.344F},
        {835.246F, 54756.875F},
        {842.379F, 75744.719F},
        {845.172F, 262729.281F},
        {848.343F, 43364.613F},
        {853.372F, 116636.539F},
        {860.300F, 31866.652F},
        {862.194F, 84338.055F},
        {864.382F, 51494.148F},
        {866.348F, 46550.715F},
        {867.192F, 203975.000F},
        {871.407F, 41394.535F},
        {875.399F, 61829.328F},
        {877.221F, 104724.180F},
        {882.466F, 56097.215F},
        {893.417F, 70062.414F},
        {895.464F, 45845.828F},
        {897.377F, 91863.359F},
        {901.390F, 49141.969F},
        {911.277F, 30171.961F},
        {913.327F, 71101.922F},
        {919.411F, 39649.672F},
        {929.452F, 63271.492F},
        {934.423F, 67676.547F},
        {941.505F, 1075363.500F},
        {950.545F, 32284.260F},
        {952.457F, 53622.219F},
        {956.425F, 67101.938F},
        {958.512F, 40586.977F},
        {963.533F, 253711.531F},
        {973.462F, 24205.449F},
        {975.477F, 68411.922F},
        {984.401F, 49616.238F},
        {1002.412F, 64317.641F},
        {1012.610F, 28910.662F},
        {1033.374F, 24706.617F},
        {1035.240F, 38586.297F},
        {1037.460F, 24701.832F},
        {1039.440F, 43547.016F},
        {1086.663F, 318903.875F},
        {1192.795F, 28698.227F},
        {1271.764F, 1271701.750F},
        {1276.202F, 51480.266F},
        {1360.881F, 1922145.750F},
        {1365.396F, 111783.688F},
        {1368.572F, 151669.453F},
        {1371.783F, 81318.797F},
        {1378.935F, 4028937.750F},
        {1385.572F, 240425.469F},
        {1388.727F, 107123.125F},
        {1390.967F, 270950.688F},
        {1394.125F, 94345.352F},
        {1400.925F, 820669.563F},
        {1404.939F, 61204.797F},
        {1422.878F, 162475.797F},
        {1441.917F, 100232.688F},
        {1502.772F, 1580673.000F},
        {1507.032F, 2724551.500F},
        {1511.821F, 71767.445F},
        {1514.008F, 213253.844F},
        {1518.656F, 438739.906F},
        {1606.983F, 10623715.000F},
        {1613.003F, 1093695.125F},
        {1618.829F, 823831.125F},
        {1624.625F, 467632.031F},
        {1633.864F, 86162.258F},
        {1660.839F, 54658.188F},
        {1679.913F, 73151.828F},
        {1705.935F, 83734.656F},
        {1789.158F, 79907.906F},
        {1797.883F, 91645.344F},
        {1806.979F, 53754.633F},
        {1815.952F, 4947971.500F},
        {1837.875F, 1006234.125F},
        {1851.948F, 61609.820F},
        {1854.096F, 4097761.750F},
        {1866.790F, 278523.844F},
        {1885.134F, 12806711.000F},
        {1897.992F, 787158.063F},
        {1907.018F, 1872790.125F},
        {1937.136F, 3957752.750F},
        {1973.157F, 114383.711F},
        {1982.189F, 3291688.000F},
        {2030.109F, 46987.438F},
        {2038.206F, 57269.918F},
        {2053.164F, 96174.227F},
        {2110.282F, 2972381.500F}
    };

    public void testListOfFloats() {
        try {
            List massList = Utils.base64StringToFloatList(mass, false);
            List intensityList = Utils.base64StringToFloatList(intensity, false);
            assertEquals("number of values in list", massList.size(), mzArray.length);
            assertEquals("number of values in list", intensityList.size(), mzArray.length);
            for (int iii = 0; iii < massList.size(); iii++) {
                Float massFloat = (Float) massList.get(iii);
                Float intensityFloat = (Float) intensityList.get(iii);
                assertEquals(mzArray[iii][0], massFloat.floatValue(), 0.001);
                assertEquals(mzArray[iii][1], intensityFloat.floatValue(), 0.001);
            }
        } catch (DecoderException e) {
            fail("Unexpected exception: " + e);
        }
    }
}
