package br.com.medcheck.doctor.presentation.controller;

import br.com.medcheck.commom.dto.request.DoctorRequestDTO;
import br.com.medcheck.doctor.application.service.DoctorService;
import br.com.medcheck.doctor.domain.entity.JpaDoctor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorService service;

    public DoctorController(final DoctorService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<JpaDoctor> get(@PathVariable final Long id) {
        return service.getDoctorById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody final DoctorRequestDTO request) {
        service.registerDoctor(request);
    }

}
