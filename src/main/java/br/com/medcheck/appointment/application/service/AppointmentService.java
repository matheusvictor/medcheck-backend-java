package br.com.medcheck.appointment.application.service;

import br.com.medcheck.appointment.domain.usecase.ScheduleAppointmentUseCase;
import br.com.medcheck.commom.dto.request.AppointmentRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final ScheduleAppointmentUseCase useCase;

    public AppointmentService(final ScheduleAppointmentUseCase registerPatientUseCase) {
        this.useCase = registerPatientUseCase;
    }

    public void scheduleAppointment(final AppointmentRequestDTO request) {
        useCase.execute(request);
    }

}
