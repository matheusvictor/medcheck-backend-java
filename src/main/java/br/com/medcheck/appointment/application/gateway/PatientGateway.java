package br.com.medcheck.appointment.application.gateway;

import br.com.medcheck.commom.dto.response.PatientResponseDTO;

public interface PatientGateway {

    PatientResponseDTO getPatientById(final Long id);

}