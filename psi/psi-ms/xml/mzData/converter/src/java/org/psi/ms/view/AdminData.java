package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.model.Person;
import org.psi.ms.model.SourceFile;
import org.psi.ms.model.Admin;
import org.psi.ms.converter.ProvidedDataItem;

import java.util.List;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 1:49:12 PM
 * To change this template use Options | File Templates.
 */
public class AdminData extends AbstractMZDataObject {

//    private Admin admin = new Admin();

    public Admin getAdmin() {
        return desc.getAdmin();
    }

//    public void setData(Desc desc) {
//        super.setData(desc);
//        this.admin = desc.getAdmin();
//    }

    protected void setFieldInterest() {
        suppliedFieldsMap.clear();
        suppliedFieldsMap.put(ProvidedDataItem.DESC_ADMIN_SAMPLENAME, Boolean.TRUE);
    }
}
