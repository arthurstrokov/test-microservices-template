package com.gmail.arthurstrokov.doctorservice.repository;

import com.gmail.arthurstrokov.doctorservice.model.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}
