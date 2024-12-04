package br.com.rodrigo.dataintegration.legacysystem.model.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "object"
})
@XmlRootElement(name = "insertObject")
public class InsertObject {

    @XmlElement(required = true)
    protected Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object value) {
        this.object = value;
    }

}
