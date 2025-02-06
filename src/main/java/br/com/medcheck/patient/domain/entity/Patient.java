package br.com.medcheck.patient.domain.entity;

import java.util.ArrayList;
import java.util.List;


public class Patient {

    private final String name;

    private final int age;

    private final String document;

    private final String bloodType;

    private final List<String> consultations;

    public Patient(String name, int age, String document, String bloodType) {
        this.name = name;
        this.age = age;
        this.document = document;
        this.bloodType = bloodType;
        this.consultations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDocument() {
        return document;
    }

    public String getBloodType() {
        return bloodType;
    }

    public List<String> getConsultations() {
        return consultations;
    }
}
