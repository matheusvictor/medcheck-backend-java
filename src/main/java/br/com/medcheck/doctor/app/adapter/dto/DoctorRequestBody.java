package br.com.medcheck.doctor.app.adapter.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DoctorRequestBody {

    @NotBlank(message = "Name is required")
    String name;

    @NotBlank(message = "CRM is required")
    @Size(min = 3, max = 7, message = "CRM must have 7 characters")
    String crm;

    public DoctorRequestBody(String name, String crm) {
        this.name = name;
        this.crm = crm;
    }

    public String getName() {
        return name;
    }

    public String getCrm() {
        return crm;
    }

}