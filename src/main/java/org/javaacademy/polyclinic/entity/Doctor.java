package org.javaacademy.polyclinic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@Slf4j
@AllArgsConstructor
public class Doctor {
    private BigDecimal appointmentPrice;
    private Specialization specialization;

    /**
     * Метод вылечить человека.
     *
     * @return вернет стоимоть за лечение
     */
    public BigDecimal treatPatient() {
        log.info("{} вылечил человека", specialization.getDesc());
        return appointmentPrice;
    }
}
