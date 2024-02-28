package org.example.module13.httpdemo.request;

import lombok.Builder;

@Builder
public record CreateOrderItemRequestDto (Integer quantity, Long productId) {
}
