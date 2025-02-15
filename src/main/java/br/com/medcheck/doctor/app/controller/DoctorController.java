package br.com.medcheck.doctor.app.controller;

import br.com.medcheck.commons.HttpResponse;
import br.com.medcheck.doctor.app.adapter.DoctorAdapter;
import br.com.medcheck.doctor.app.adapter.dto.DoctorRequestBody;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private final DoctorAdapter adapter;

    public DoctorController(final DoctorAdapter adapter) {
        this.adapter = adapter;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody @Valid final DoctorRequestBody requestBody) {
        return ResponseEntity.ok(adapter.createDoctor(requestBody));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable final Long id) {
        final Optional<Object> doctor = Optional.ofNullable(adapter.getDoctorById(id));
        return doctor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity
                .status(404)
                .body(new HttpResponse(HttpStatus.NOT_FOUND.value(), "Doctor not found.")));
    }

}
