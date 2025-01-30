package br.com.medcheck.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Consultation {

    private Long id;
    private Doctor doctor;
    private ExternalUser patient;
    private LocalDate date = LocalDate.now();
}
