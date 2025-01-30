package br.com.medcheck.application.usecases.impl;

import br.com.medcheck.application.dto.DoctorResponseDTO;
import br.com.medcheck.application.usecases.GetDoctorsBySpecialtyUseCase;
import br.com.medcheck.domain.repositories.DoctorRepository;
import br.com.medcheck.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDoctorsBySpecialtyUseCaseImpl implements GetDoctorsBySpecialtyUseCase {

    @Autowired
    private DoctorRepository repository;

    @Override
    public List<DoctorResponseDTO> getAllDoctorsBySpecialty(String specialty) throws NotFoundException {
        final var doctors = repository.findAllBySpecialty(specialty);
        if (doctors.isEmpty()) {
            throw new NotFoundException("No doctors found with the specialty: " + specialty);
        }
        return doctors;
    }
}
