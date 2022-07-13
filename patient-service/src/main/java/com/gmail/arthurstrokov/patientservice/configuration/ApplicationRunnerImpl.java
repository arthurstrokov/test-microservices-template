package com.gmail.arthurstrokov.patientservice.configuration;

import com.gmail.arthurstrokov.patientservice.model.Patient;
import com.gmail.arthurstrokov.patientservice.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class ApplicationRunnerImpl implements ApplicationRunner {
    private final PatientRepository repository;

    @Override
    public void run(ApplicationArguments args) {
        Patient arthur = new Patient(1L, "arthur", "arthurstrokov@gmail.com");
        Patient avistate = new Patient(2L, "avistate", "avistate@gmail.com");
        List<Patient> patients = new ArrayList<>();
        patients.add(arthur);
        patients.add(avistate);
        repository.saveAll(patients);
    }
}
