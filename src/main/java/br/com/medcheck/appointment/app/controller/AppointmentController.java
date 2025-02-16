package br.com.medcheck.appointment.app.controller;

import br.com.medcheck.appointment.app.adapter.AppointmentRequestAdapter;
import br.com.medcheck.appointment.app.adapter.dto.AppointmentRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRequestAdapter adapter;

    @PostMapping("/schedule_appointment")
    public void schedule(@RequestBody final AppointmentRequestBody requestBody) {
        adapter.scheduleAppointment(requestBody);
    }

}
