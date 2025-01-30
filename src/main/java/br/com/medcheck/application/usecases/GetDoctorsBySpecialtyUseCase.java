package br.com.medcheck.application.usecases;

import br.com.medcheck.application.dto.DoctorResponseDTO;
import br.com.medcheck.exception.NotFoundException;

import java.util.List;

public interface GetDoctorsBySpecialtyUseCase {

    List<DoctorResponseDTO> getAllDoctorsBySpecialty(final String specialty) throws NotFoundException;
}
