/**
 * $Id: SashimiReaderTest.java,v 1.1 2004/01/27 12:13:14 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: Kai Runte
 * Date: Jan 14, 2004
 * Time: 11:36:36 AM
 */
package org.psi.ms.importers;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;

import org.psi.ms.model.Desc;
import org.psi.ms.model.Acquisition;
import org.psi.ms.model.MzData;
import org.psi.ms.xml.MzDataWriter;
import org.psi.ms.helper.PsiMsConverterException;

/**
 * 
 * @author Kai Runte
 */
public class SashimiReaderTest extends TestCase {

    public SashimiReaderTest(String s) {
        super(s);
    }

    public void testActions() {
        File file = new File("/Users/krunte/work/mass_spec/input_formats/Sashimi/10mix2.mzXML");
        File out = new File("/Users/krunte/work/mass_spec/input_formats/Sashimi/10mix2.xml");
        Desc desc = new Desc();
        try {
            SashimiReader sashimiReader = new SashimiReader(desc, file);
            if (sashimiReader.hasNext()) {
                MzData mzData = new MzData();
                mzData.setDesc(desc);

                MzDataWriter mzDataWriter = new MzDataWriter(out);
                mzDataWriter.setOutputType(MzDataWriter.OutputType.BASE64);

                mzDataWriter.initialize(mzData, 0);
                Acquisition acquisition = sashimiReader.next();
                mzDataWriter.marshall(acquisition);

                while(sashimiReader.hasNext()) {
                    acquisition = sashimiReader.next();
                    mzDataWriter.marshall(acquisition);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (PsiMsConverterException e) {
            e.printStackTrace();
        }
    }
}
