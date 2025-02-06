package br.com.medcheck.patient.presentation.controller;

import br.com.medcheck.patient.application.service.PatientService;
import br.com.medcheck.patient.shared.dto.PatientRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/create")
    public void create(@RequestBody final PatientRequestDTO request) {
        patientService.registerPatient(request);
    }


}
