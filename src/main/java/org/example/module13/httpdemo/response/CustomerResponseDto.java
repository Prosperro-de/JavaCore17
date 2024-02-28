package org.example.module13.httpdemo.response;

public record CustomerResponseDto (
        Long id,
        String name,
        String address,
        String city,
        String postalCode,
        String country,
        String phone) {
}
