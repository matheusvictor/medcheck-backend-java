package br.com.medcheck.appointment.app.adapter;

import br.com.medcheck.appointment.domain.entity.Appointment;
import br.com.medcheck.appointment.infrastructure.repository.AppointmentRepository;
import br.com.medcheck.appointment.infrastructure.request.doctor.DoctorResponseDTO;
import br.com.medcheck.appointment.infrastructure.request.patient.PatientResponseDTO;
import br.com.medcheck.appointment.shared.mapper.JpaAppointmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveAppointmentAdapter {

    @Autowired
    private AppointmentRepository repository;

    public void save(PatientResponseDTO patient, DoctorResponseDTO doctor) {
        final var appointment = new Appointment(doctor.id(), patient.id());
        repository.save(JpaAppointmentMapper.toEntity(appointment));
    }
}
