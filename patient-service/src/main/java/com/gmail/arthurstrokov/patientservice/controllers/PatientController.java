package com.gmail.arthurstrokov.patientservice.controllers;

import com.gmail.arthurstrokov.patientservice.PatientServiceApplication;
import com.gmail.arthurstrokov.patientservice.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @GetMapping("/list")
    public List<Patient> getAll() {
        return PatientServiceApplication.getPatients();
    }

    @GetMapping("/{patientId}")
    public Patient getById(@PathVariable("patientId") Long diagnosticId) {
        return PatientServiceApplication.getPatients().stream().filter(x -> x.getId() == diagnosticId).findFirst().orElse(null);
    }
}
