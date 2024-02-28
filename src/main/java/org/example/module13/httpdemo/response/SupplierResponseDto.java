package org.example.module13.httpdemo.response;

import java.util.List;

public record SupplierResponseDto(
        Long id,
        String supplierName,
        String contactName,
        String streetName,
        String city,
        String postalCode,
        String country,
        String phone,
        List<ProductResponseDto> products) {
}
