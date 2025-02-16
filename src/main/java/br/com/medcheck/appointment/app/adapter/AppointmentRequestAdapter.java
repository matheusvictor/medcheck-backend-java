package br.com.medcheck.appointment.app.adapter;


import br.com.medcheck.appointment.app.adapter.dto.AppointmentRequestBody;
import br.com.medcheck.appointment.domain.entity.Appointment;
import br.com.medcheck.appointment.infrastructure.repository.AppointmentRepository;
import br.com.medcheck.appointment.infrastructure.request.doctor.DoctorResponseDTO;
import br.com.medcheck.appointment.infrastructure.request.patient.PatientResponseDTO;
import br.com.medcheck.appointment.infrastructure.validator.AppointmentRequestValidator;
import br.com.medcheck.appointment.shared.mapper.JpaAppointmentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentRequestAdapter {

    @Autowired
    private AppointmentRequestValidator requestValidator;

    @Autowired
    private PatientExistsAdapter patientExistsAdapter;

    @Autowired
    private DoctorExistsAdapter doctorExistsAdapter;

    @Autowired
    private AppointmentRepository repository;

    public void scheduleAppointment(final AppointmentRequestBody requestBody) {
        requestValidator.isValid(requestBody);
        final PatientResponseDTO patient = patientExistsAdapter.exists(requestBody.patientId());
        final DoctorResponseDTO doctor = doctorExistsAdapter.exists(requestBody.doctorId());

        if (patient != null && doctor != null) {
            final Appointment appointment = new Appointment(doctor.id(), patient.id());
            repository.save(JpaAppointmentMapper.toEntity(appointment));
        }
    }

}
