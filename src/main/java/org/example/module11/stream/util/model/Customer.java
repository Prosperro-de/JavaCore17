package org.example.module11.stream.util.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Customer {
    private String name;
    private String email;
}
