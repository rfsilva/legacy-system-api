package br.com.rodrigo.dataintegration.legacysystem.model.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "legacyId"
})
@XmlRootElement(name = "insertObjectResponse")
public class InsertObjectResponse {

    @XmlElement(required = true)
    protected String legacyId;

    public String getLegacyId() {
        return legacyId;
    }

    public void setLegacyId(String value) {
        this.legacyId = value;
    }

}
