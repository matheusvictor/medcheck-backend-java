package br.com.medcheck.doctor.shared.mapper;

import br.com.medcheck.commom.dto.request.DoctorRequestDTO;
import br.com.medcheck.doctor.domain.entity.JpaDoctor;

public class JpaDoctorMapper {

    private JpaDoctorMapper() {
    }

    public static JpaDoctor toEntity(final DoctorRequestDTO doctor) {
        return new JpaDoctor(doctor.name(), doctor.crm());
    }
}
