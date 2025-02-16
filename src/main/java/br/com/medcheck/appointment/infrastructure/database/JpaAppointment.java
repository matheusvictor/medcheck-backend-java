package br.com.medcheck.appointment.infrastructure.database;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
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

}
