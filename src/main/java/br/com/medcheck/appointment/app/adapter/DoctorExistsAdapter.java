package br.com.medcheck.appointment.app.adapter;

import br.com.medcheck.appointment.infrastructure.request.doctor.DoctorRequestData;
import br.com.medcheck.appointment.infrastructure.request.doctor.DoctorResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorExistsAdapter {

    @Autowired
    private final DoctorRequestData requestData;

    public DoctorResponseDTO exists(final Long doctorId) {
        return requestData.getDoctorById(doctorId);
    }
}
