package com.gmail.arthurstrokov.doctorservice.service;

import com.gmail.arthurstrokov.doctorservice.model.Consultation;
import com.gmail.arthurstrokov.doctorservice.model.Diagnostic;
import com.gmail.arthurstrokov.doctorservice.model.Doctor;
import com.gmail.arthurstrokov.doctorservice.model.Patient;
import com.gmail.arthurstrokov.doctorservice.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository repository;

    public Consultation getConsultation(Patient patient, Diagnostic diagnostic) {
        Consultation consultation = new Consultation();
        Doctor doctor = repository.findById(1L).orElse(new Doctor(1L, "Alexandra"));
        consultation.setPat(patient);
        consultation.setDiag(diagnostic);
        consultation.setDoc(doctor);
        return consultation;
    }
}
