package br.com.rodrigo.dataintegration.legacysystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.*;
import java.time.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "TB_BUSINESS_OBJECT")
public class DBObject implements Serializable {

    @Serial
    private static final long serialVersionUid = 9393053903L;

    @Id
    @Column(name = "BO_NR_IDENTITY", nullable = false, unique = true)
    private Long id;

    @Column(name = "BO_ST_DESCRIPTION")
    private String description;

    @Column(name = "BO_ST_CORRELATION_ID")
    private String correlationId;

    @Column(name = "BO_ST_MAIN_DATA")
    private String mainData;

    @Column(name = "BO_ST_OPTION")
    private String option;

    @Column(name = "BO_TP_CONVERSION_STATUS")
    private String conversionStatus;

    @Column(name = "BO_ID_CHANNEL")
    private String channel;

    @Column(name = "BO_ST_STEP_CODE")
    private String stepCode;

    @Column(name = "BO_ST_NETWORK_IP_ADDRESS")
    private String networkIpAddress;

    @Column(name = "BO_DT_INSERTION_DATE")
    private LocalDateTime insertionDate;
}
