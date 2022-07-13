package com.gmail.arthurstrokov.doctorservice.controllers;

import com.gmail.arthurstrokov.doctorservice.feign.DiagnosticClient;
import com.gmail.arthurstrokov.doctorservice.feign.PatientClient;
import com.gmail.arthurstrokov.doctorservice.model.Consultation;
import com.gmail.arthurstrokov.doctorservice.model.Diagnostic;
import com.gmail.arthurstrokov.doctorservice.model.Doctor;
import com.gmail.arthurstrokov.doctorservice.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final RestTemplate restTemplate;
    private final PatientClient patientClient;
    private final DiagnosticClient diagnosticClient;

    @GetMapping
    public Consultation getAll(@RequestParam("patientId") Long patientId, @RequestParam("diagnosticId") Long diagnosticId) {
        Patient patient = restTemplate.getForObject("http://patient-service/patient/" + patientId, Patient.class);
        Diagnostic diagnostic = restTemplate.getForObject("http://diagnostic-service/diagnostic/" + diagnosticId, Diagnostic.class);
        Consultation consultation = new Consultation();
        Doctor doctor = new Doctor(1L, "Alex");
        consultation.setPat(patient);
        consultation.setDiag(diagnostic);
        consultation.setDoc(doctor);
        return consultation;
    }

    @GetMapping("/patient/{patientId}")
    public Patient getPatient(@PathVariable long patientId) {
        return patientClient.getById(patientId);
    }

    @GetMapping("/diagnostic/{diagnosticId}")
    Diagnostic getDiagnostic(@PathVariable("diagnosticId") long diagnosticId) {
        return diagnosticClient.getById(diagnosticId);
    }
}
