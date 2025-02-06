package br.com.medcheck.appointment.domain.usecase;

import br.com.medcheck.appointment.application.gateway.DoctorGateway;
import br.com.medcheck.appointment.application.gateway.PatientGateway;
import br.com.medcheck.appointment.domain.entity.Appointment;
import br.com.medcheck.appointment.infrastructure.gateway.DoctorGatewayImpl;
import br.com.medcheck.appointment.infrastructure.gateway.PatientGatewayImpl;
import br.com.medcheck.appointment.infrastructure.repository.AppointmentRepository;
import br.com.medcheck.appointment.shared.mapper.JpaAppointmentMapper;
import br.com.medcheck.commom.dto.request.AppointmentRequestDTO;
import br.com.medcheck.commom.dto.response.DoctorResponseDTO;
import br.com.medcheck.commom.dto.response.PatientResponseDTO;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ScheduleAppointmentUseCase {

    private final AppointmentRepository repository;
    private final PatientGateway patientGateway;
    private final DoctorGateway doctorGateway;

    public ScheduleAppointmentUseCase(
            final AppointmentRepository repository,
            final PatientGatewayImpl patientGateway,
            final DoctorGatewayImpl doctorGateway) {
        this.repository = repository;
        this.patientGateway = patientGateway;
        this.doctorGateway = doctorGateway;
    }

    public void execute(final AppointmentRequestDTO dto) {

        final PatientResponseDTO patient = patientGateway.getPatientById(dto.patientId());
        final DoctorResponseDTO doctor = doctorGateway.getDoctorById(dto.doctorId());

        if (Objects.isNull(patient) || Objects.isNull(doctor)) {
            throw new IllegalArgumentException("Patient or Doctor not found");
        }

        final var appointment = new Appointment(doctor.id(), patient.id());
        repository.save(JpaAppointmentMapper.toEntity(appointment));
    }

}
