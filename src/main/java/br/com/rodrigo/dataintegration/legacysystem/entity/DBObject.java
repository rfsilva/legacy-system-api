package br.com.rodrigo.dataintegration.legacysystem.entity;

import lombok.*;

import java.io.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DBObject implements Serializable {

    @Serial
    private static final long serialVersionUid = 9393053903L;

    private String description;
    private String correlationId;
    private String mainData;
    private String option;
    private String conversionStatus;
    private String channel;
    private String stepCode;
    private String networkIpAddress;
}
