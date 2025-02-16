package br.com.medcheck.appointment.infrastructure.request.doctor;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class DoctorRequestData {

    @Autowired
    private RestTemplate restTemplate;
    private static final String DOCTORS_URL = "http://localhost:8080/doctors/";

    public DoctorResponseDTO getDoctorById(final Long id) {
        return restTemplate.getForObject(DOCTORS_URL + id, DoctorResponseDTO.class);
    }
}
