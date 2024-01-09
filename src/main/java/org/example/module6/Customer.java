package org.example.module6;

import java.util.Objects;

public class Customer extends Person {
    private String name;
    private Integer age;
    private String email;
    private String taxNumber;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(age, customer.age) && Objects.equals(email, customer.email) && Objects.equals(taxNumber, customer.taxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, taxNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                '}';
    }
}
