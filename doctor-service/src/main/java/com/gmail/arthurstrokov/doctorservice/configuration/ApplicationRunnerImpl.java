package com.gmail.arthurstrokov.doctorservice.configuration;

import com.gmail.arthurstrokov.doctorservice.model.Doctor;
import com.gmail.arthurstrokov.doctorservice.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApplicationRunnerImpl implements ApplicationRunner {
    private final DoctorRepository repository;

    @Override
    public void run(ApplicationArguments args) {
        Doctor doctor = new Doctor();
        doctor.setName("Alexandra");
        repository.save(doctor);
    }
}
