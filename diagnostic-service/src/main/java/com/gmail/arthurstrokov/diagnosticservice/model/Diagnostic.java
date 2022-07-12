package com.gmail.arthurstrokov.diagnosticservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diagnostic {
    private Long id;
    private String name;
    private String description;
}
