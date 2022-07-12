package com.gmail.arthurstrokov.patientservice;

import com.gmail.arthurstrokov.patientservice.model.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class PatientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientServiceApplication.class, args);
    }

    public static List<Patient> list;

    public static List<Patient> getPatients() {
        if (list == null) {
            list = new ArrayList<>();
            Patient p1 = new Patient(1L, "arthur", "arthurstrokov@gmail.com");
            Patient p2 = new Patient(2L, "avistate", "avistate@gmail.com");
            list.add(p1);
            list.add(p2);
        }
        return list;
    }
}
