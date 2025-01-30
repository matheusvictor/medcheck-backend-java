package br.com.medcheck.application.dto;

import lombok.Builder;

@Builder
public record DoctorResponseDTO(
        String name,
        String crm,
        String specialty) {
}