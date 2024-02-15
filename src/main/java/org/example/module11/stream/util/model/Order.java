package org.example.module11.stream.util.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Order {
    private Long orderId;
    private LocalDateTime orderedAt;
    private OrderStatus orderStatus;
    private Customer customer;
    private List<OrderItem> orderItems;
}
