package org.example.module13.httpdemo.response;

import java.math.BigDecimal;

public record ProductResponseDto(
        Long id,
        String name,
        BigDecimal unitPrice,
        Integer quantityInStock,
        SupplierResponseDto supplier,
        CategoryResponseDto category){
        }
