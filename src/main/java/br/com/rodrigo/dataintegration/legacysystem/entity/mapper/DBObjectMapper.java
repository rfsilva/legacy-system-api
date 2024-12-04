package br.com.rodrigo.dataintegration.legacysystem.entity.mapper;

import br.com.rodrigo.dataintegration.legacysystem.entity.*;
import br.com.rodrigo.dataintegration.legacysystem.model.gen.*;

public final class DBObjectMapper {

    private DBObjectMapper() {
    }

    public static DBObject toEntity(InsertObject obj) {
        return DBObject.builder()
                .correlationId(obj.getObject().getCorrelationId())
                .description(obj.getObject().getDescription())
                .conversionStatus(obj.getObject().getConversionStatus())
                .networkIpAddress(obj.getObject().getNetworkIpAddress())
                .option(obj.getObject().getOption())
                .stepCode(obj.getObject().getStepCode())
                .channel(obj.getObject().getChannel())
                .mainData(obj.getObject().getMainData())
                .build();
    }
}
