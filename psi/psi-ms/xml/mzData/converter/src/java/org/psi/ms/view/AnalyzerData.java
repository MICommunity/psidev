package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.model.Analyzer;
import org.psi.ms.model.InstParam;
import org.psi.ms.model.InstUserParam;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 2:00:59 PM
 * To change this template use Options | File Templates.
 */
public class AnalyzerData extends AbstractMZDataObject {

//    Analyzer analyzer;

    public Analyzer getAnalyzer() {
        return desc.getInstrument().getAnalyzer();
    }

//    public void setData(Desc desc) {
//        super.setData(desc);
//        this.analyzer = desc.getInstrument().getAnalyzer();
//    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ACCURACY, Boolean.TRUE);
        suppliedFieldsMap.put(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_ANALYZERTYPE, Boolean.TRUE);
        suppliedFieldsMap.put(ProvidedDataItem.DESC_INSTRUMENTCOMMONSETTINGS_ANALYZER_RESOLUTION, Boolean.TRUE);
    }
}
