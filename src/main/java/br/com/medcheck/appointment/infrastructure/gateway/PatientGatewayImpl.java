package br.com.medcheck.appointment.infrastructure.gateway;

import br.com.medcheck.appointment.application.gateway.PatientGateway;
import br.com.medcheck.commom.dto.response.PatientResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PatientGatewayImpl implements PatientGateway {

    private final RestTemplate restTemplate;
    private static final String PATIENTS_URL = "http://localhost:8080/patients/%s";

    public PatientGatewayImpl(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public PatientResponseDTO getPatientById(final Long id) {
        return restTemplate.getForObject(PATIENTS_URL.formatted(id), PatientResponseDTO.class);
    }
}
