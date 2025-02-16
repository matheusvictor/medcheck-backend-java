package br.com.medcheck.appointment.infrastructure.request.patient;

public record PatientResponseDTO(Long id, String name, int age, String document, String bloodType) {
}