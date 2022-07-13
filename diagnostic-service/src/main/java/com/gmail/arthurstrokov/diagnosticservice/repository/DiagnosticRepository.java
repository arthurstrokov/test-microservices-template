package com.gmail.arthurstrokov.diagnosticservice.repository;

import com.gmail.arthurstrokov.diagnosticservice.model.Diagnostic;
import org.springframework.data.repository.CrudRepository;

public interface DiagnosticRepository extends CrudRepository<Diagnostic, Long> {
}
