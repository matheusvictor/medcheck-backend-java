package br.com.medcheck.patient.shared.dto;

public record PatientRequestDTO(String name, int age, String document, String bloodType) {
}