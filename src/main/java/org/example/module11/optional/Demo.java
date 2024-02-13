package org.example.module11.optional;

import org.example.module11.lambda.Customer;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
//        Customer customer = new Customer("Mykola", 21);
//        System.out.println("age = " + customer.getAge());
//        Optional<Customer> optionalCustomer = Optional.ofNullable(customer);
        CustomerDao dao = new CustomerDao();
        for (int i = 0; i < 5; i++) {
            Optional<Customer> customerById = dao.getById(i);
//            Customer customer = customerById
//                    .orElse(new Customer("default name", 100));
//            System.out.println("customer.getName() = " + customer.getName());
            Customer customer = customerById.orElseThrow(() -> new CustomerDaoException());
//            System.out.println("customer.getName() = " + customer.getName());
//            customerById.ifPresent(System.out::println);
        }
        Optional<Customer> firstCustomer = dao.getById(0);
        Customer customer = firstCustomer.orElseGet(() -> dao.getCustomerFromAnotherDB());
        Customer customer2 = firstCustomer.orElse(dao.getCustomerFromAnotherDB());
        System.out.println("customer.getName() = " + customer.getName());

//        dao.getAll().ifPresent(customer -> System.out.println(customer));



    }
}
