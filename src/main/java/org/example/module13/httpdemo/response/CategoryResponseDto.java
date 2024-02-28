package org.example.module13.httpdemo.response;

import java.util.Set;

public record CategoryResponseDto(Long id, String categoryName, Set<ProductResponseDto> products) {
}
