package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 12:10:19 PM
 * To change this template use Options | File Templates.
 */
public interface MZDataObject {

    public void setData(Desc desc);

    public Desc getData();

    public void setFieldActivation(List suppliedFields);

    public boolean isFieldActive(ProvidedDataItem field);

    public void clearData();

}
