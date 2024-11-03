package org.javaacademy.polyclinic.config;

import lombok.AllArgsConstructor;
import org.javaacademy.polyclinic.entity.Doctor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.javaacademy.polyclinic.entity.Specialization.DENTIST;
import static org.javaacademy.polyclinic.entity.Specialization.THERAPIST;
import static org.javaacademy.polyclinic.entity.Specialization.SURGEON;

@Configuration
@EnableConfigurationProperties(value = PolyclinicProperty.class)
@AllArgsConstructor
public class PolyclinicConfiguration {

    private PolyclinicProperty polyclinicProperty;

    @Bean
    public Doctor dentist() {
        return new Doctor(polyclinicProperty.getDentistRate(), DENTIST);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(polyclinicProperty.getTherapistRate(), THERAPIST);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(polyclinicProperty.getJuniorSurgeonRate(), SURGEON);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(polyclinicProperty.getSeniorSurgeonRate(), SURGEON);
    }

}
