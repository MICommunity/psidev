/**
 * $Id: DtaSetConverter.java,v 1.7 2003/09/10 12:45:52 krunte Exp $
 *
 * Created by IntelliJ IDEA.
 * User: krunte
 * Date: Jul 23, 2003
 * Time: 5:24:22 PM
 */
package org.psi.ms.converter;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;
import org.psi.ms.helper.PsiMsConverterException;
import org.psi.ms.helper.SuffixFileFilter;
import org.psi.ms.helper.Utils;
import org.psi.ms.model.*;
import org.xml.sax.InputSource;

import java.io.File;
import java.io.FileWriter;
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
    private int arrayOutputType;
    private DtaReader dtaReader;

    public DtaSetConverter() {
        arrayOutputType = DtaReader.BASE64;
        dtaReader = new DtaReader(arrayOutputType);
    }

    public DtaSetConverter(int arrayOutputType) {
        this.arrayOutputType = arrayOutputType;
        dtaReader = new DtaReader(arrayOutputType);
    }

    public void convertDirectory(String sourceDirname, String outputFilename, MzData mzData) throws PsiMsConverterException, IOException, ValidationException, MarshalException {
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
        while (dtaIterator.hasNext() && ztaIterator.hasNext()) {
            String dtaFile = (String) dtaIterator.next();
            String ztaFile = (String) ztaIterator.next();
            System.out.println("Converting file: " + dtaFile);
            dtaReader.addAcquisitions(dtaFile, mzData);
            System.out.println("Converting file: " + ztaFile);
            dtaReader.addAcquisitions(ztaFile, mzData);
        }

        AcqDescList acqDescList = mzData.getDesc().getAcqDescList();
        acqDescList.setCount(acqDescList.getAcqDescCount());
        AcquisitionList acquisitionList = mzData.getRaw().getAcquisitionList();
        acquisitionList.setCount(acquisitionList.getAcquisitionCount());

        FileWriter fileWriter = new FileWriter(outputFilename);
/*
        mzData.marshal(fileWriter);
*/
        Mapping mapping = new Mapping();
        try {
            mapping.loadMapping(new InputSource(DtaReader.class.getResourceAsStream("mzDataXMLMapping.xml")));
            Marshaller marshaller = new Marshaller(fileWriter);
            marshaller.setMapping(mapping);
            marshaller.marshal(mzData);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MappingException e) {
            e.printStackTrace();
        }
    }
}
