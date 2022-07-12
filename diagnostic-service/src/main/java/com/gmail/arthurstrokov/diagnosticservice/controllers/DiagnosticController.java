package com.gmail.arthurstrokov.diagnosticservice.controllers;

import com.gmail.arthurstrokov.diagnosticservice.DiagnosticServiceApplication;
import com.gmail.arthurstrokov.diagnosticservice.model.Diagnostic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diagnostic")
public class DiagnosticController {

    @GetMapping("/list")
    public List<Diagnostic> getAll() {
        return DiagnosticServiceApplication.getDiagnoses();
    }

    @GetMapping("/{diagnosticId}")
    public Diagnostic getById(@PathVariable("diagnosticId") Long diagnosticId) {
        return DiagnosticServiceApplication.getDiagnoses().stream().filter(x -> x.getId() == diagnosticId).findFirst().orElse(null);
    }
}
