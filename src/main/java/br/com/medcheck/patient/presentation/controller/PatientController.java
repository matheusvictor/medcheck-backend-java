package br.com.medcheck.patient.presentation.controller;

import br.com.medcheck.commom.dto.request.PatientRequestDTO;
import br.com.medcheck.patient.application.service.PatientService;
import br.com.medcheck.patient.domain.entity.JpaPatient;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(final PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/{id}")
    public Optional<JpaPatient> get(@PathVariable final Long id) {
        return patientService.getPatientById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody final PatientRequestDTO request) {
        patientService.registerPatient(request);
    }

    @PostMapping("/schedule_appointment")
    public void schedule(@RequestBody final PatientRequestDTO request) {
        patientService.registerPatient(request);
    }


}
