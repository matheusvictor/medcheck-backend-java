package br.com.medcheck.commom.dto.response;

public record PatientResponseDTO(Long id, String name, int age, String document, String bloodType) {
}