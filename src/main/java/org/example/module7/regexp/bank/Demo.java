package org.example.module7.regexp.bank;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        BankService bankService = BankService.getInstance();

        bankService.registerCustomer();

        System.out.println(Arrays.toString(bankService.getCustomers()));
    }
}
