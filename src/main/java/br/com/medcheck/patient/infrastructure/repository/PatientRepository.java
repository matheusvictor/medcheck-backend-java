package br.com.medcheck.patient.infrastructure.repository;

import br.com.medcheck.patient.domain.entity.JpaPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<JpaPatient, Long> {
}