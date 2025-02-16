package br.com.medcheck.appointment.shared.mapper;

import br.com.medcheck.appointment.domain.entity.Appointment;
import br.com.medcheck.appointment.infrastructure.database.JpaAppointment;

public class JpaAppointmentMapper {

    private JpaAppointmentMapper() {
    }

    public static JpaAppointment toEntity(final Appointment appointment) {
        return new JpaAppointment(
                appointment.getDoctorId(),
                appointment.getPatientId(),
                appointment.getDate()
        );
    }
}
