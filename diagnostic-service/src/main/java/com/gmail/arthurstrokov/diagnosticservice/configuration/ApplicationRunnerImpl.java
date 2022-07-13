package com.gmail.arthurstrokov.diagnosticservice.configuration;

import com.gmail.arthurstrokov.diagnosticservice.model.Diagnostic;
import com.gmail.arthurstrokov.diagnosticservice.repository.DiagnosticRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class ApplicationRunnerImpl implements ApplicationRunner {
    private final DiagnosticRepository repository;

    @Override
    public void run(ApplicationArguments args) {
        Diagnostic diagnosticCovid = new Diagnostic(1L, "COVID19", "Flu like something");
        Diagnostic diagnosticFlu = new Diagnostic(2L, "Flu", "Something like COVID19");
        List<Diagnostic> diagnostics = new ArrayList<>();
        diagnostics.add(diagnosticCovid);
        diagnostics.add(diagnosticFlu);
        repository.saveAll(diagnostics);
    }
}
