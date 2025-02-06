package br.com.medcheck.patient.shared.mapper;

import br.com.medcheck.patient.domain.entity.JpaPatient;
import br.com.medcheck.patient.domain.entity.Patient;

public class JpaPatientMapper {

    private JpaPatientMapper() {
    }

    public static JpaPatient toEntity(Patient patient) {
        JpaPatient entity = new JpaPatient();
        entity.setAge(patient.getAge());
        entity.setName(patient.getName());
        entity.setDocument(patient.getDocument());
        entity.setBloodType(patient.getBloodType());
        return entity;
    }
}
