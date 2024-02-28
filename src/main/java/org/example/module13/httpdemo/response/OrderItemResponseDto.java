package org.example.module13.httpdemo.response;

public record OrderItemResponseDto (
        Long id,
        Integer quantity,
        ProductResponseDto product
) {

}
