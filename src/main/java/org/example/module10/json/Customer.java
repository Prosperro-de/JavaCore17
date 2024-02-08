package org.example.module10.json;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
public class Customer {
    private String name;
    private Integer age;
    private BigDecimal accountStatus;
    private List<Address> address;
    private Map<String, String> additionalInfo;
}
