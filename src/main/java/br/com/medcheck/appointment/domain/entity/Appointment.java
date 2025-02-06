package br.com.medcheck.appointment.domain.entity;

import java.time.LocalDate;

public class Appointment {

    private final Long doctorId;

    private final Long patientId;

    private final LocalDate date;

    public Appointment(final Long doctorId, final Long patientId) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = LocalDate.now();
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public LocalDate getDate() {
        return date;
    }

}
