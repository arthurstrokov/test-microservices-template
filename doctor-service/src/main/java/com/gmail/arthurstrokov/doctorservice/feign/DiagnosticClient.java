package com.gmail.arthurstrokov.doctorservice.feign;

import com.gmail.arthurstrokov.doctorservice.model.Diagnostic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "diagnostic-client", url = "http://localhost:8082")
public interface DiagnosticClient {
    @GetMapping("/diagnostic/{diagnosticId}")
    Diagnostic getById(@PathVariable("diagnosticId") long diagnosticId);
}
