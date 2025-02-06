package br.com.medcheck.patient.domain.usecase;

import br.com.medcheck.patient.domain.entity.Patient;
import br.com.medcheck.patient.infrastructure.repository.PatientRepository;
import br.com.medcheck.patient.shared.mapper.JpaPatientMapper;
import org.springframework.stereotype.Service;

@Service
public class RegisterPatientUseCase {

    private final PatientRepository patientRepository;

    public RegisterPatientUseCase(final PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void execute(final String name, final int age, final String document, final String bloodType) {
        patientRepository.save(JpaPatientMapper.toEntity(new Patient(name, age, document, bloodType)));
    }
}
