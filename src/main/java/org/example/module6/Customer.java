package org.example.module6;

import lombok.Data;

import java.util.Objects;

@Data
public class Customer extends Person {
    private String name;
    private Integer age;
    private String email;
    private String taxNumber;
    private String address;

    static {
        System.out.println("Static init block");
    }

    {
        System.out.println("Init block");
    }

    public Customer() {
        System.out.println("Customer constructor");
    }

//    public Customer(String name, Long phoneNumber) {
//        super(phoneNumber);
//        this.name = name;
//    }
//    public Customer(String name, Integer age, String email) {
//        this(name, age);
//        this.email = email;
//    }
//
//    public Customer(String name, Integer age) {
//        this(name);
//        this.age = age;
//    }


//    public Customer(String name, Integer age, String email, String taxNumber) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.taxNumber = taxNumber;
//    }
//
//    public Customer(Long phoneNumber, String name, Integer age, String email, String taxNumber) {
//        super(phoneNumber);
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.taxNumber = taxNumber;
//    }
//
//    public Customer(Long phoneNumber, String name, String name1, Integer age, String email, String taxNumber) {
//        super(phoneNumber, name);
//        this.name = name1;
//        this.age = age;
//        this.email = email;
//        this.taxNumber = taxNumber;
//    }


    @Override
    public void goToWork() {

    }


}
