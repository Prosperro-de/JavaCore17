package org.example.module11.stream.util;

import lombok.experimental.UtilityClass;
import org.example.module11.stream.util.model.Customer;
import org.example.module11.stream.util.model.Order;
import org.example.module11.stream.util.model.OrderItem;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

import static org.example.module11.stream.util.model.OrderStatus.CREATED;
import static org.example.module11.stream.util.model.OrderStatus.IN_PROGRESS;
import static org.example.module11.stream.util.model.OrderStatus.COMPLETED;


@UtilityClass
public class OrderGenerator {

    public static List<Order> generateOrders(int amount) {
        return IntStream.range(0, amount)
                .mapToObj(i -> Order.builder()
                        .orderId((long) i)
                        .orderedAt(LocalDateTime.now().minusDays(i))
                        .orderStatus(i % 3 == 0 ? CREATED : (i % 3 == 1 ? IN_PROGRESS : COMPLETED))
                        .customer(Customer.builder()
                                .name("Customer " + i)
                                .email("customer" + i + "@example.com")
                                .build())
                        .orderItems(List.of(
                                OrderItem.builder()
                                        .productName("Product " + i)
                                        .quantity(i + 1)
                                        .price(BigDecimal.valueOf(10.0 * (i + 1)))
                                        .build()))
                        .build())
                .toList();
    }
}
