package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.converter.ProvidedDataItem;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 5:00:31 PM
 * To change this template use Options | File Templates.
 */
public class AdminContactPersonData extends PersonData {

    public void setData(Desc desc) {
        this.desc = desc;
        this.person = desc.getAdmin().getContact();
        setPopulated(true);
    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_ADMIN_PERSON_NAME, Boolean.TRUE);
        suppliedFieldsMap.put(ProvidedDataItem.DESC_ADMIN_PERSON_CONTACTINFO, Boolean.TRUE);
        suppliedFieldsMap.put(ProvidedDataItem.DESC_ADMIN_PERSON_INSTITUTION, Boolean.TRUE);
    }
}
