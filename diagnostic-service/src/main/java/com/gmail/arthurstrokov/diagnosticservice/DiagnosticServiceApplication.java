package com.gmail.arthurstrokov.diagnosticservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DiagnosticServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiagnosticServiceApplication.class, args);
    }
}
