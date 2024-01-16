package org.example.module7.immutable;

import java.math.BigDecimal;

public final class Invoice {
    private final int id;
    private final BigDecimal price;
    private final Customer customer;

    public Invoice(int id, BigDecimal price, Customer customer) {
        this.id = id;
        this.price = price;
        this.customer = new Customer(customer);
//        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }
}
