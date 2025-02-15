package br.com.medcheck.doctor.app.adapter;

import br.com.medcheck.doctor.app.adapter.dto.DoctorRequestBody;
import br.com.medcheck.doctor.app.adapter.dto.DoctorResponseDTO;
import br.com.medcheck.doctor.infrastructure.database.JpaDoctor;
import br.com.medcheck.doctor.infrastructure.repository.DoctorRepository;
import br.com.medcheck.doctor.shared.mapper.JpaDoctorMapper;
import org.springframework.stereotype.Service;

@Service
public class DoctorAdapter {

    private final DoctorRepository repository;

    public DoctorAdapter(final DoctorRepository repository) {
        this.repository = repository;
    }

    public DoctorResponseDTO createDoctor(final DoctorRequestBody requestBody) {
        final JpaDoctor doctor = repository.save(new JpaDoctor(requestBody.getName(), requestBody.getCrm()));
        return JpaDoctorMapper.toDto(doctor);
    }

    public DoctorResponseDTO getDoctorById(final Long id) {
        return repository.findById(id)
                .map(doctor -> new DoctorResponseDTO(doctor.getId(), doctor.getName(), doctor.getCrm()))
                .orElse(null);
    }
}
