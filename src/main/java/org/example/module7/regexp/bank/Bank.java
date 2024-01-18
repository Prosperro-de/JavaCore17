package org.example.module7.regexp.bank;

import lombok.Data;

@Data
public class Bank {
    private Customer[] customers;
    private int customerSize;

    public Bank() {
        this.customers = new Customer[10];
    }

    public void addCustomer(Customer customer) {
        customers[customerSize] = customer;
        customerSize++;
    }
}
