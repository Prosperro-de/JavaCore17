package org.example.module13.httpdemo.request;

import lombok.Builder;

@Builder
public record CreateCustomerRequestDto(
        String name,
        String address,
        String city,
        String postalCode,
        String country,
        String phone) {
}
