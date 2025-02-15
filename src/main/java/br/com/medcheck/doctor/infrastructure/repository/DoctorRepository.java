package br.com.medcheck.doctor.infrastructure.repository;

import br.com.medcheck.doctor.infrastructure.database.JpaDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<JpaDoctor, Long> {
}