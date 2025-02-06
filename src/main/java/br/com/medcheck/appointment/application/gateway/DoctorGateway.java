package br.com.medcheck.appointment.application.gateway;

import br.com.medcheck.commom.dto.response.DoctorResponseDTO;

public interface DoctorGateway {

    DoctorResponseDTO getDoctorById(final Long id);

}