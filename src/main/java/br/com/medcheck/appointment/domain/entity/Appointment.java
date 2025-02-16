package br.com.medcheck.appointment.domain.entity;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Appointment {

    private final Long doctorId;

    private final Long patientId;

    private final LocalDate date;

    public Appointment(final Long doctorId, final Long patientId) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = LocalDate.now();
    }

}
