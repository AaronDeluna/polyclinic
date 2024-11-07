package org.javaacademy.polyclinic.entity;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class Cashier {
    private BigDecimal profit = BigDecimal.ZERO;

    /**
     * Метод добовляет прибыль в кассу.
     *
     * @param many стоимость услуги.
     */
    public void addProfit(BigDecimal many) {
        profit = profit.add(many);
    }

    /**
     * Метод печати информации по заработку.
     */
    @PreDestroy
    public void printProfitStatistic() {
        log.info("Клиника всего заработала: {}", profit);
    }
}
