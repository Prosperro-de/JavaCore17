package org.example.module10.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private Integer postCode;
}
