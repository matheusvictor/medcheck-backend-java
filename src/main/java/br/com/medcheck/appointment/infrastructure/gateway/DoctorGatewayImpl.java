package br.com.medcheck.appointment.infrastructure.gateway;

import br.com.medcheck.appointment.application.gateway.DoctorGateway;
import br.com.medcheck.commom.dto.response.DoctorResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DoctorGatewayImpl implements DoctorGateway {

    private final RestTemplate restTemplate;
    private static final String DOCTORS_URL = "http://localhost:8080/doctors/";

    public DoctorGatewayImpl(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public DoctorResponseDTO getDoctorById(final Long id) {
        return restTemplate.getForObject(DOCTORS_URL + id, DoctorResponseDTO.class);
    }
}
