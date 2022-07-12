package com.gmail.arthurstrokov.doctorservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consultation {
    private Doctor doc;
    private Patient pat;
    private Diagnostic diag;
}
