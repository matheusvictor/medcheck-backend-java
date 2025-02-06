package br.com.medcheck.doctor.application.service;

import br.com.medcheck.commom.dto.request.DoctorRequestDTO;
import br.com.medcheck.doctor.domain.entity.JpaDoctor;
import br.com.medcheck.doctor.domain.usecase.RegisterDoctorUseCase;
import br.com.medcheck.doctor.infrastructure.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository repository;

    private final RegisterDoctorUseCase useCase;

    public DoctorService(final DoctorRepository repository, final RegisterDoctorUseCase useCase) {
        this.repository = repository;
        this.useCase = useCase;
    }

    public Optional<JpaDoctor> getDoctorById(final Long id) {
        return Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doutor não encontrado")));
    }

    public void registerDoctor(final DoctorRequestDTO request) {
        useCase.execute(request);
    }

}
