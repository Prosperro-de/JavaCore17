package org.example.module6;

public abstract class Person {
    private Long phoneNumber;
    private String name;

    static {
        System.out.println("Static person init block");
    }

    {
        System.out.println("Person Init block");
    }

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(Long phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public abstract void goToWork();

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
