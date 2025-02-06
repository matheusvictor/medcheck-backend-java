package br.com.medcheck.appointment.infrastructure.repository;

import br.com.medcheck.appointment.domain.entity.JpaAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<JpaAppointment, Long> {
}