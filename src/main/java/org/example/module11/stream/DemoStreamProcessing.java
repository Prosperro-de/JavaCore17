package org.example.module11.stream;

import org.example.module11.stream.util.OrderGenerator;
import org.example.module11.stream.util.model.Customer;
import org.example.module11.stream.util.model.Order;
import org.example.module11.stream.util.model.OrderItem;
import org.example.module11.stream.util.model.OrderStatus;
import org.example.module9.generic.CustomContainer;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreamProcessing {
    /*
    Intermediate operation

    filter(Predicate<T> predicate)
    map(Function<T, R> mapper)
    flatMap(Function<T, Stream<R>> mapper)
    distinct()
    sorted()
    sorted(Comparator<? super T> comparator)
    peek(Consumer<? super T> action)
    limit(long maxSize)
    skip(long n)
     */

    /*
    Terminal operators

    forEach(Consumer<? super T> action)
    forEachOrdered(Consumer<? super T> action)
    toArray()
    reduce(BinaryOperator<T> accumulator)
    collect(Collector<? super T,A,R> collector)
    min(Comparator<? super T> comparator)
    max(Comparator<? super T> comparator)
    count()
    anyMatch(Predicate<? super T> predicate)
    allMatch(Predicate<? super T> predicate)
    noneMatch(Predicate<? super T> predicate)
    findFirst()
    findAny()
     */
    public static void main(String[] args) {
        List<Order> orders = OrderGenerator.generateOrders(20);
        List<Order> completedOrderList = orders.stream()
                .filter(x -> OrderStatus.COMPLETED.equals(x.getOrderStatus()))
                .toList();

        Map<Customer, Order> customerOrderMap = orders.stream()
                .filter(x -> OrderStatus.COMPLETED.equals(x.getOrderStatus()))
                .collect(Collectors.toMap(Order::getCustomer, Function.identity()));

//        Map<OrderStatus, Order> statusOrderMap = orders.stream()
//                .collect(Collectors.toMap(Order::getOrderStatus, Function.identity())); //invalid

        Map<OrderStatus, List<Order>> orderStatusListMap = orders.stream()
                .collect(Collectors.groupingBy(Order::getOrderStatus));

        Map<Boolean, List<Order>> booleanListMap = orders.stream()
                .collect(Collectors.partitioningBy(order -> OrderStatus.IN_PROGRESS.equals(order.getOrderStatus())));

        CustomContainer<Object> objectCustomContainer = orders.stream()
                .collect(Collector.of(
                        CustomContainer::new,
                        CustomContainer::add,
                        (x, y) -> x
                ));

        BigDecimal totalPrice = orders.stream()
                .filter(x -> OrderStatus.IN_PROGRESS.equals(x.getOrderStatus()))
//                .map(order -> order.getOrderItems())
                .flatMap(order -> order.getOrderItems().stream())
                .map(OrderItem::getPrice)
                .peek(System.out::println)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        Order order1 = orders.stream()
                .filter(order -> OrderStatus.COMPLETED.equals(order.getOrderStatus()))
                .findAny()
                .orElseThrow();
//        System.out.println("b = " + b);
        System.out.println("totalPrice = " + totalPrice);

        Optional<Order> max = orders.stream()
                .max(Comparator.comparing(x -> x.getOrderItems().stream()
                        .map(OrderItem::getPrice)
                        .findAny()
                        .orElseThrow()));

        String s = "";
    }
}
