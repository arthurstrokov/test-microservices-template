package com.gmail.arthurstrokov.diagnosticservice.controllers;

import com.gmail.arthurstrokov.diagnosticservice.model.Diagnostic;
import com.gmail.arthurstrokov.diagnosticservice.repository.DiagnosticRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagnostic")
@RequiredArgsConstructor
public class DiagnosticController {
    private final DiagnosticRepository repository;

    @GetMapping("/list")
    public Iterable<Diagnostic> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{diagnosticId}")
    public Diagnostic getById(@PathVariable("diagnosticId") Long diagnosticId) {
        return repository.findById(diagnosticId).orElse(null);
    }
}
