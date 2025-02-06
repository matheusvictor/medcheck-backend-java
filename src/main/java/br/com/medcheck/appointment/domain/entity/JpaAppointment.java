package br.com.medcheck.appointment.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class JpaAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final Long doctorId;

    private final Long patientId;

    private final LocalDate date;


    public JpaAppointment(final Long doctorId, final Long patientId, final LocalDate date) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = date;
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
