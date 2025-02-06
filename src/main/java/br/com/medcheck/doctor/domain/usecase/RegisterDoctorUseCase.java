package br.com.medcheck.doctor.domain.usecase;

import br.com.medcheck.commom.dto.request.DoctorRequestDTO;
import br.com.medcheck.doctor.infrastructure.repository.DoctorRepository;
import br.com.medcheck.doctor.shared.mapper.JpaDoctorMapper;
import org.springframework.stereotype.Service;

@Service
public class RegisterDoctorUseCase {

    private final DoctorRepository repository;

    public RegisterDoctorUseCase(final DoctorRepository repository) {
        this.repository = repository;
    }

    public void execute(final DoctorRequestDTO requestDTO) {
        repository.save(JpaDoctorMapper.toEntity(requestDTO));
    }
}
