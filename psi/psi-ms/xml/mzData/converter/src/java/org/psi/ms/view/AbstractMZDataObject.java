package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 4:06:22 PM
 * To change this template use Options | File Templates.
 */
public abstract class AbstractMZDataObject implements MZDataObject {

    protected Desc desc = null;
    protected Map suppliedFieldsMap = new HashMap();
    protected boolean populated = false;

    public AbstractMZDataObject() {
        setFieldInterest();
    }

    public void setData(Desc desc) {
        this.desc = desc;
        setPopulated(true);
    }

    public Desc getData() {
        return desc;
    }

    public void setFieldActivation(List suppliedFields) {
        for (int i = 0; i < suppliedFields.size(); i++) {
            ProvidedDataItem item = (ProvidedDataItem) suppliedFields.get(i);
            if (suppliedFieldsMap.containsKey(item)) {
                suppliedFieldsMap.put(item, Boolean.FALSE);
            }
        }
    }

    public boolean isFieldActive(ProvidedDataItem field) {
        return ((Boolean) suppliedFieldsMap.get(field)).booleanValue();
    }

    public void clearData() {
        this.desc = null;
        setPopulated(false);
    }

    protected abstract void setFieldInterest();

    public boolean isPopulated() {
        return populated;
    }

    public void setPopulated(boolean populated) {
        this.populated = populated;
    }
}
