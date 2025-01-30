package br.com.medcheck.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Doctor extends User {

    private String crm;
    private String specialty;
    private List<Consultation> consultations;
}
