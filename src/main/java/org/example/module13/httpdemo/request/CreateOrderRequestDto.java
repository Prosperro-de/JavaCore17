package org.example.module13.httpdemo.request;

import lombok.Builder;

import java.util.List;

@Builder
public record CreateOrderRequestDto (Long customerId, List<CreateOrderItemRequestDto> items) {
}
