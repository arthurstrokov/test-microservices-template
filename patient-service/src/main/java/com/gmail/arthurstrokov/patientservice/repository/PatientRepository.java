package com.gmail.arthurstrokov.patientservice.repository;

import com.gmail.arthurstrokov.patientservice.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
