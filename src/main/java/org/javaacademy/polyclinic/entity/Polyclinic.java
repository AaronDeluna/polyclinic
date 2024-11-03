package org.javaacademy.polyclinic.entity;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class Polyclinic {

    private static final int DENTIST_INDEX = 0;
    private static final int THERAPIST_INDEX = 1;
    private static final int JUNIOR_SURGEON_INDEX = 2;
    private static final int SENIOR_SURGEON_INDEX = 3;

    private Cashier character;
    private List<Doctor> doctorList;

    /**
     * Лечит человека стоматологом.
     */
    public void treatWithDentist() {
        receiveTreatment(doctorList.get(DENTIST_INDEX));
    }

    /**
     * Лечит человека терапефтом.
     */
    public void treatWithTherapist() {
        receiveTreatment(doctorList.get(THERAPIST_INDEX));
    }

    /**
     * Лечит человека млачшим хирургом.
     */
    public void treatWithJuniorSurgeon() {
        receiveTreatment(doctorList.get(JUNIOR_SURGEON_INDEX));
    }

    /**
     * Лечит человека старшим хирургом.
     */
    public void treatWithSeniorSurgeon() {
        receiveTreatment(doctorList.get(SENIOR_SURGEON_INDEX));
    }

    /**
     * Лечит персонажа, добавляя результат лечения к его текущей "прибыльности".
     *
     * @param doctor доктор, выполняющий лечение.
     */
    private void receiveTreatment(Doctor doctor) {
        character.addProfit(doctor.treatPatient());
    }
}
