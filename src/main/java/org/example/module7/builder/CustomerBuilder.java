package org.example.module7.builder;

public class CustomerBuilder {
    private String name;
    private String email;
    private String tel;
    private String address = "Dnipro";

    public CustomerBuilder withName(String name){
        this.name = name;
        return this;
    }

    public CustomerBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public CustomerBuilder withTel(String tel){
        this.tel = tel;
        return this;
    }

    public CustomerBuilder withAddress(String address){
        this.address = address;
        return this;
    }

    public Customer build() {
        return new Customer(name, email, tel, address);
    }
}
