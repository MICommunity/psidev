package org.psi.ms.view;

import org.psi.ms.model.*;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 2:01:36 PM
 * To change this template use Options | File Templates.
 */
public class TestData extends AbstractMZDataObject {

//    Test test = new Test();

    public Test getTest() {
        return desc.getTest();
    }
    /////////////////////////////////////

//    public void setData(Desc desc) {
//        super.setData(desc);
//        this.test = desc.getTest();
//    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_TEST_DATAPROCESSING_COMMENT, Boolean.TRUE);
        //todo need to get the fields mapped for the vectors
    }
}
