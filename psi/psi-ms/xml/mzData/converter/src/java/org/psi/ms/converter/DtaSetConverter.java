/**
 * $Id: DtaSetConverter.java,v 1.13 2003/09/17 15:53:54 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 5:24:22 PM
 */
package org.psi.ms.converter;

import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.helper.SuffixFileFilter;
import org.psi.ms.helper.Utils;
import org.psi.ms.model.MzData;
import org.psi.ms.xml.MzDataWriter;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.SortedSet;

/**
 * Reads in all .dta/.zta from a given directory and converts them
 * into a single peaklist XML document. Per default the arrays are
 * stored in the space-saving base64 format.
 *
 * @author krunte
 */
public class DtaSetConverter {

    private DtaReader dtaReader;

    public DtaSetConverter() {
        dtaReader = new DtaReader();
    }

    public void convertDirectory(String sourceDirname, String outputFilename, MzData mzData, MzDataWriter.OutputType outputType) throws PsiMsConverterException, IOException {
        this.convertDirectory(sourceDirname, outputFilename, mzData, outputType, null);
    }

    public void convertDirectory(String sourceDirname, String outputFilename, MzData mzData, MzDataWriter.OutputType outputType, ParseListener listener) throws PsiMsConverterException, IOException {
        File sourceDir = new File(sourceDirname);
        File[] dtaFiles = sourceDir.listFiles(new SuffixFileFilter(".dta"));
        File[] ztaFiles = sourceDir.listFiles(new SuffixFileFilter(".zta"));
        if (dtaFiles.length != ztaFiles.length) {
            throw new PsiMsConverterException("Number of .dta and .zta files differs!");
        }
        SortedSet dtaFileSet = Utils.fileArrayToTreeSet(dtaFiles);
        SortedSet ztaFileSet = Utils.fileArrayToTreeSet(ztaFiles);
        Iterator dtaIterator = dtaFileSet.iterator();
        Iterator ztaIterator = ztaFileSet.iterator();
        int acqId = 0;
        //Tell the GUI that we're busy...
        if (listener != null) {
            listener.setMessage("Parsing...");
        }

        while (dtaIterator.hasNext() && ztaIterator.hasNext()) {
            String dtaFile = (String) dtaIterator.next();
            String ztaFile = (String) ztaIterator.next();
            //Tell the GUI that we're busy...
            if (listener != null) {
                listener.setMessage("Converting file: " + dtaFile);
            } else {
                System.out.println("Converting file: " + dtaFile);
            }
            dtaReader.addAcquisitions(dtaFile, mzData, acqId);
            acqId++;
            //Parsing the .dta file...
            if (listener != null) {
                listener.fileParsed();
            }
            //Tell the GUI that we're busy...
            if (listener != null) {
                listener.setMessage("Converting file: " + ztaFile);
            } else {
                System.out.println("Converting file: " + ztaFile);
            }
            dtaReader.addAcquisitions(ztaFile, mzData, acqId);
            acqId++;
            //Parsing the .zta file...
            if (listener != null) {
                listener.fileParsed();
            }
        }

        //Writing the XML
        if (listener != null) {
            listener.indeterminiteProcess();
            listener.setMessage("Writing XML...");
        }

        MzDataWriter mzDataWriter = new MzDataWriter(new File(outputFilename));
        mzDataWriter.setOutputType(outputType);
        mzDataWriter.marshall(mzData);
    }

    public static void main(String[] argv) throws IOException, PsiMsConverterException {
        DtaSetConverter dtaSetConverter = new DtaSetConverter();
        MzData mzData = new MzData();
        dtaSetConverter = new DtaSetConverter();
        dtaSetConverter.convertDirectory(argv[0], argv[1], mzData, MzDataWriter.OutputType.BASE64);
    }
}
