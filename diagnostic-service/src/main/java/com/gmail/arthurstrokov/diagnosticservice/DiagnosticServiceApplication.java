package com.gmail.arthurstrokov.diagnosticservice;

import com.gmail.arthurstrokov.diagnosticservice.model.Diagnostic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class DiagnosticServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiagnosticServiceApplication.class, args);
    }

    public static List<Diagnostic> list;

    public static List<Diagnostic> getDiagnoses() {
        if (list == null) {
            list = new ArrayList<>();
            Diagnostic p1 = new Diagnostic(1L, "COVID19", "Flu like something");
            Diagnostic p2 = new Diagnostic(2L, "Flu", "Something like COVID19");
            list.add(p1);
            list.add(p2);
        }
        return list;
    }
}
