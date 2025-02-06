package br.com.medcheck.patient.application.service;

import br.com.medcheck.patient.domain.entity.JpaPatient;
import br.com.medcheck.patient.domain.usecase.RegisterPatientUseCase;
import br.com.medcheck.commom.dto.request.PatientRequestDTO;
import br.com.medcheck.patient.infrastructure.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository repository;

    private final RegisterPatientUseCase registerPatientUseCase;

    public PatientService(
            final RegisterPatientUseCase registerPatientUseCase,
            final PatientRepository repository
    ) {
        this.registerPatientUseCase = registerPatientUseCase;
        this.repository = repository;
    }

    public Optional<JpaPatient> getPatientById(final Long id) {
        return repository.findById(id);
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
