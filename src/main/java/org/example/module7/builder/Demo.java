package org.example.module7.builder;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Mykola", "@gmail", "555-555-55", "qwerty");
        Customer mykola = new CustomerBuilder()
                .withEmail("example@gmail")
                .withTel("123345")
                .withName("Mykola")
                .build();
        System.out.println("mykola = " + mykola);

        Customer mykola1 = Customer.builder().name("Mykola").build();
        System.out.println("mykola1 = " + mykola1);
    }
}
