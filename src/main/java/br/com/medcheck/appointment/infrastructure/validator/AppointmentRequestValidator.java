package br.com.medcheck.appointment.infrastructure.validator;

import br.com.medcheck.appointment.app.adapter.dto.AppointmentRequestBody;

public interface AppointmentRequestValidator {

    void isValid(AppointmentRequestBody requestBody);
}
