package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.model.Source;
import org.psi.ms.model.InstParam;
import org.psi.ms.model.InstUserParam;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 2:00:47 PM
 * To change this template use Options | File Templates.
 */
public class SourceData extends AbstractMZDataObject {

//    Source source = new Source();

    public Source getSource() {
        return desc.getInstrument().getSource();
    }
    ///////////////////////////////////////

//    public void setData(Desc desc) {
//        super.setData(desc);
//        this.source = desc.getInstrument().getSource();
//    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_SOURCE_SOURCETYPE, Boolean.TRUE);
    }
}
