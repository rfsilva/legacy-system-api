package br.com.rodrigo.dataintegration.legacysystem.model.gen;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "object", propOrder = {
    "description",
    "correlationId",
    "mainData",
    "option",
    "conversionStatus",
    "channel",
    "stepCode",
    "networkIpAddress"
})
public class Object {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String correlationId;
    @XmlElement(required = true)
    protected String mainData;
    @XmlElement(required = true)
    protected String option;
    @XmlElement(required = true)
    protected String conversionStatus;
    @XmlElement(required = true)
    protected String channel;
    @XmlElement(required = true)
    protected String stepCode;
    @XmlElement(required = true)
    protected String networkIpAddress;

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String value) {
        this.correlationId = value;
    }

    public String getMainData() {
        return mainData;
    }

    public void setMainData(String value) {
        this.mainData = value;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String value) {
        this.option = value;
    }

    public String getConversionStatus() {
        return conversionStatus;
    }

    public void setConversionStatus(String value) {
        this.conversionStatus = value;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String value) {
        this.channel = value;
    }

    public String getStepCode() {
        return stepCode;
    }

    public void setStepCode(String value) {
        this.stepCode = value;
    }

    public String getNetworkIpAddress() {
        return networkIpAddress;
    }

    public void setNetworkIpAddress(String value) {
        this.networkIpAddress = value;
    }

}
