package br.com.medcheck.doctor.shared.mapper;

import br.com.medcheck.doctor.app.adapter.dto.DoctorRequestBody;
import br.com.medcheck.doctor.app.adapter.dto.DoctorResponseDTO;
import br.com.medcheck.doctor.infrastructure.database.JpaDoctor;

public class JpaDoctorMapper {

    private JpaDoctorMapper() {
    }

    public static JpaDoctor toEntity(final DoctorRequestBody doctor) {
        return new JpaDoctor(doctor.getName(), doctor.getCrm());
    }

    public static DoctorResponseDTO toDto(final JpaDoctor doctor) {
        return new DoctorResponseDTO(doctor.getId(), doctor.getName(), doctor.getCrm());
    }

}
