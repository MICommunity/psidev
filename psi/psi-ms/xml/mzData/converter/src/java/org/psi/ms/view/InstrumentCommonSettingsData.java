package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.model.InstrumentCommonSettings;
import org.psi.ms.model.InstParam;
import org.psi.ms.model.InstUserParam;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 2:00:36 PM
 * To change this template use Options | File Templates.
 */
public class InstrumentCommonSettingsData extends AbstractMZDataObject {

//    InstrumentCommonSettings instrumentCommonSettings = new InstrumentCommonSettings();

    public InstrumentCommonSettings getInstrumentCommonSettings() {
        return desc.getInstrument();
    }
    /////////////////////////////////////////

//    public void setData(Desc desc) {
//        super.setData(desc);
//        this.instrumentCommonSettings = desc.getInstrument();
//    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_INSTNAME, Boolean.TRUE);
    }
}
