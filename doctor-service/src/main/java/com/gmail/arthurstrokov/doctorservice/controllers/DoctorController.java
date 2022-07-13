package com.gmail.arthurstrokov.doctorservice.controllers;

import com.gmail.arthurstrokov.doctorservice.model.Consultation;
import com.gmail.arthurstrokov.doctorservice.model.Diagnostic;
import com.gmail.arthurstrokov.doctorservice.model.Doctor;
import com.gmail.arthurstrokov.doctorservice.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {

    private final RestTemplate restTemplate;

    @GetMapping
    public Consultation getAll(@RequestParam("patientId") Long patientId, @RequestParam("diagnosticId") Long diagnosticId) {

        /*
         * getPatientById
         * getDiagnosticById
         * setAvailableDoctor and return Consultation object
         * */

        Patient patient = restTemplate.getForObject("http://patient-service/patient/" + patientId, Patient.class);

        Diagnostic diagnostic = restTemplate.getForObject("http://diagnostic-service/diagnostic/" + diagnosticId, Diagnostic.class);

        Consultation consultation = new Consultation();
        Doctor doctor = new Doctor(1L, "Alex");

        consultation.setPat(patient);
        consultation.setDiag(diagnostic);
        consultation.setDoc(doctor);

        return consultation;
    }
}