package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.model.Detector;
import org.psi.ms.model.InstParam;
import org.psi.ms.model.InstUserParam;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 2:01:18 PM
 * To change this template use Options | File Templates.
 */
public class DetectorData extends AbstractMZDataObject {

//    Detector detector;

    public Detector getDetector() {
        return desc.getInstrument().getDetector();
    }

    ////////////////////////////////////

//    public void setData(Desc desc) {
//        super.setData(desc);
//        this.detector = desc.getInstrument().getDetector();
//    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_DETECTOR_DETECTORTYPE, Boolean.TRUE);
    }
}
