package br.com.medcheck.appointment.infrastructure.request.patient;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PatientRequestData {

    private final RestTemplate restTemplate;
    private static final String PATIENTS_URL = "http://localhost:8080/patients/%s";

    public PatientRequestData() {
        this.restTemplate = new RestTemplate();
    }

    public PatientResponseDTO getPatientById(Long id) {
        return restTemplate.getForObject(PATIENTS_URL.formatted(id), PatientResponseDTO.class);
    }
}
