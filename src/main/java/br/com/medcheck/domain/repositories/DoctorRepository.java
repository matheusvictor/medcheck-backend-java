package br.com.medcheck.domain.repositories;

import br.com.medcheck.application.dto.DoctorResponseDTO;
import br.com.medcheck.domain.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<DoctorResponseDTO> findAllBySpecialty(final String specialty);
}