package org.example.module6;

public class ConstructorDemo {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setName("Mykola");
//        customer.setAge(32);
//        customer.setEmail("example@gmail.com");
//        customer.setTaxNumber("123454");
//        Customer customer = new Customer("Mykola");
//        Customer customer = new Customer("Mykola", 32, 12344);
//        Customer customer = new Customer("Mykola", 32, "example@gmail.com", "123454");
//        Customer customer = new Customer(5555L, "Mykola", "Oleg", 32, "example@gmail.com", "123454");
//        customer.getPhoneNumber()
//        System.out.println("customer = " + customer);
//        System.out.println("customer.getName() = " + customer.getName());
//        Customer customer = new Customer();


        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.print("Hello from inner class");

        NestedClassDemo.StringPrinter stringPrinter = new NestedClassDemo.StringPrinter();
        stringPrinter.print("Hello from nested class");

        LocalClassDemo localClassDemo = new LocalClassDemo();
        localClassDemo.print("Hello from local class");

        Person person = new Person() {
            @Override
            public void goToWork() {
                System.out.println("I'm going to work");
            }
        };
        person.goToWork();

        Person person1 = new Person() {
            @Override
            public void goToWork() {
//                some other logic
            }
        };
    }
}
