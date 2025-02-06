package br.com.medcheck.commom.dto.request;

public record PatientRequestDTO(String name, int age, String document, String bloodType) {
}