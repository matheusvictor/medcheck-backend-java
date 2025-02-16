package br.com.medcheck.appointment.app.adapter;

import br.com.medcheck.appointment.infrastructure.request.patient.PatientRequestData;
import br.com.medcheck.appointment.infrastructure.request.patient.PatientResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientExistsAdapter {

    @Autowired
    private final PatientRequestData requestData;

    public PatientResponseDTO exists(final Long patientId) {
        return requestData.getPatientById(patientId);
    }
}
