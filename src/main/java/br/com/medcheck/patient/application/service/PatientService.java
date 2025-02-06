package br.com.medcheck.patient.application.service;

import br.com.medcheck.patient.domain.usecase.RegisterPatientUseCase;
import br.com.medcheck.patient.shared.dto.PatientRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final RegisterPatientUseCase registerPatientUseCase;

    public PatientService(final RegisterPatientUseCase registerPatientUseCase) {
        this.registerPatientUseCase = registerPatientUseCase;
    }

    public void registerPatient(final PatientRequestDTO request) {
        registerPatientUseCase.execute(
                request.name(),
                request.age(),
                request.document(),
                request.bloodType()
        );
    }
}
