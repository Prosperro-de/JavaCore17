package org.example.module13.httpdemo.response;

import java.time.LocalDate;
import java.util.List;

public record OrderResponseDto (Long id,
                                LocalDate orderedAt,
                                LocalDate deliveredAt,
                                String orderStatus,
                                CustomerResponseDto customer,
                                List<OrderItemResponseDto> persistedOrderItems) {
}
