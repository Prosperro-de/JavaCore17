package org.example.module8.enums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Product {
    private String name;
    private ProductType productType; // Standard,  Premium
    private ProductStatus productStatus; // creationInProgress Created
}
