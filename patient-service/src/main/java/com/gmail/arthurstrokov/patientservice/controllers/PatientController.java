package com.gmail.arthurstrokov.patientservice.controllers;

import com.gmail.arthurstrokov.patientservice.model.Patient;
import com.gmail.arthurstrokov.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientRepository repository;

    @GetMapping("/list")
    public Iterable<Patient> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{patientId}")
    public Patient getById(@PathVariable("patientId") Long diagnosticId) {
        return repository.findById(diagnosticId).orElse(null);
    }
}
