package org.psi.ms.view;

import org.psi.ms.model.Desc;
import org.psi.ms.model.Person;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lbower
 * Date: Dec 10, 2003
 * Time: 1:59:47 PM
 * To change this template use Options | File Templates.
 */
public abstract class PersonData extends AbstractMZDataObject {

    protected Person person = new Person();

    public Person getPerson() {
        return person;
    }

    /////////////////////////////////////////////////

    public abstract void setData(Desc desc);

}
