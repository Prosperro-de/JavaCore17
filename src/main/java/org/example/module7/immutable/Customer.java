package org.example.module7.immutable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class Customer {
    private String name;
    private String tel;

    public Customer(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public Customer(Customer customer) {
        this.name = customer.getName();
        this.tel = customer.getTel();
    }
}
