package br.com.medcheck.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Patient extends ExternalUser {

    private String bloodType;
    private List<Consultation> consultations = new ArrayList<>();

}
