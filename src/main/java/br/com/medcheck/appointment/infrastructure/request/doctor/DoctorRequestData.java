package br.com.medcheck.appointment.infrastructure.request.doctor;

import br.com.medcheck.appointment.app.adapter.dto.DoctorResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DoctorRequestData {

    private final RestTemplate restTemplate;
    private static final String DOCTORS_URL = "http://localhost:8080/doctors/";

    public DoctorRequestData(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DoctorResponseDTO getDoctorById(final Long id) {
        return restTemplate.getForObject(DOCTORS_URL + id, DoctorResponseDTO.class);
    }
}
