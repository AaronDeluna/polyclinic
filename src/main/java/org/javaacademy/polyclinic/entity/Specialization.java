package org.javaacademy.polyclinic.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Specialization {
    DENTIST("Стоматолог"),
    SURGEON("Хирург"),
    THERAPIST("Терапевт");

    private final String desc;
}
