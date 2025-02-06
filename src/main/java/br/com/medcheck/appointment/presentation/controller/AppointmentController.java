package br.com.medcheck.appointment.presentation.controller;

import br.com.medcheck.appointment.application.service.AppointmentService;
import br.com.medcheck.commom.dto.request.AppointmentRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(final AppointmentService service) {
        this.service = service;
    }

    @PostMapping("/schedule_appointment")
    public void schedule(@RequestBody AppointmentRequestDTO request) {
        service.scheduleAppointment(request);
    }


}
