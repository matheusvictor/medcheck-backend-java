package br.com.medcheck.presentation.controller;

import br.com.medcheck.application.dto.DoctorResponseDTO;
import br.com.medcheck.application.usecases.GetDoctorsBySpecialtyUseCase;
import br.com.medcheck.exception.NotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private GetDoctorsBySpecialtyUseCase useCase;

    @GetMapping("/specialty")
    public ResponseEntity<List<DoctorResponseDTO>> getDoctorBySpecialty(@RequestParam String specialty)
            throws NotFoundException {

        final var doctors = useCase.getAllDoctorsBySpecialty(specialty);
        return ResponseEntity.ok(doctors);
    }


}
