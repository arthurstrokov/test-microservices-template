package com.gmail.arthurstrokov.doctorservice.feign;

import com.gmail.arthurstrokov.doctorservice.model.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "patient-client", url = "http://localhost:8081")
public interface PatientClient {
    @GetMapping("/patient/{patientId}")
    Patient getById(@PathVariable("patientId") long patientId);
}
