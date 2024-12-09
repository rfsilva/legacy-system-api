package br.com.rodrigo.dataintegration.legacysystem.entity.mapper;

import br.com.rodrigo.dataintegration.legacysystem.entity.*;
import br.com.rodrigo.dataintegration.legacysystem.model.gen.*;
import br.com.rodrigo.dataintegration.legacysystem.model.gen.Object;

import java.time.*;
import java.util.*;

public final class DBObjectMapper {

    private static Random random = new Random();

    private DBObjectMapper() {
    }

    public static DBObject toEntity(Object obj) {
        return DBObject.builder()
                .correlationId(obj.getCorrelationId())
                .description(obj.getDescription())
                .conversionStatus(obj.getConversionStatus())
                .networkIpAddress(obj.getNetworkIpAddress())
                .option(obj.getOption())
                .stepCode(obj.getStepCode())
                .channel(obj.getChannel())
                .mainData(obj.getMainData())
                .insertionDate(LocalDateTime.now())
                .build();
    }
}
