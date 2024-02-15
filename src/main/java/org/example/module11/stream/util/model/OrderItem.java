package org.example.module11.stream.util.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
public class OrderItem {
    private String productName;
    private Integer quantity;
    private BigDecimal price;
}
