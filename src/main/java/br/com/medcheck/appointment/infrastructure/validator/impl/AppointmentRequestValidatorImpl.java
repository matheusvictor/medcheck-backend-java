package br.com.medcheck.appointment.infrastructure.validator.impl;


import br.com.medcheck.appointment.app.adapter.dto.AppointmentRequestBody;
import br.com.medcheck.appointment.infrastructure.validator.AppointmentRequestValidator;
import org.springframework.stereotype.Service;

@Service
public class AppointmentRequestValidatorImpl implements AppointmentRequestValidator {

    @Override
    public void isValid(final AppointmentRequestBody requestBody) {
        if (requestBody.patientId() == null) {
            throw new IllegalArgumentException("Patient ID is required");
        }
        if (requestBody.doctorId() == null) {
            throw new IllegalArgumentException("Doctor ID is required");
        }
    }
}


