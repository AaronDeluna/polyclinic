package org.javaacademy.polyclinic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "doctor-rate")
@Data
public class PolyclinicProperty {
    private BigDecimal dentistRate;
    private BigDecimal therapistRate;
    private BigDecimal juniorSurgeonRate;
    private BigDecimal seniorSurgeonRate;
}
