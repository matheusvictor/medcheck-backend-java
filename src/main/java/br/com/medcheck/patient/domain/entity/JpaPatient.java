package br.com.medcheck.patient.domain.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "patients")
public class JpaPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false, unique = true)
    private String document;

    @Column(nullable = false, name = "blood_type")
    private String bloodType;

    private List<String> consultations = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

}
