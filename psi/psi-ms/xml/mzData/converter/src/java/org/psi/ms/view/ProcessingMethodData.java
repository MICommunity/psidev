package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.model.ProcessingMethod;
import org.psi.ms.model.Test;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 2:01:58 PM
 * To change this template use Options | File Templates.
 */
public class ProcessingMethodData extends AbstractMZDataObject {

//    private ProcessingMethod processingMethod = new ProcessingMethod();

    public ProcessingMethod getProcessingMethod() {
        return desc.getTest().getProcessingMethod();
    }

    //////////////////////////////

//    public void setData(Desc desc) {
//        super.setData(desc);
//        this.processingMethod = desc.getTest().getProcessingMethod();
//    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKPROCESSING, new Boolean(true));
        suppliedFieldsMap.put(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_PEAKTHRESHOLD, new Boolean(true));
        suppliedFieldsMap.put(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_DEISOTOPED, new Boolean(true));
        suppliedFieldsMap.put(ProvidedDataItem.DESC_TEST_PROCESSINGMETHOD_CHARGEDECONVOLVED, new Boolean(true));
    }
}
