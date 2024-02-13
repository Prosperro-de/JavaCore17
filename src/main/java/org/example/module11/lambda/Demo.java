package org.example.module11.lambda;

import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
        // number -> number * 2
        Predicate<String> emailValidator = email -> email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        System.out.println("emailValidator.validate(\"valid@gmail.com\") = " + emailValidator.test("valid@gmail.com"));
        System.out.println("emailValidator.validate(\"invalid\") = " + emailValidator.test("invalid"));

        Customer mykola = new Customer("Mykola", 32);

        Predicate<Customer> customerValidator = customer -> customer.getAge() >= 18;
        System.out.println("customerValidator.validate(mykola) = " + customerValidator.test(mykola));

        boolean result = validate(mykola, customerValidator);
        System.out.println("result = " + result);

        /*
        Predicate<T>
        Function<T, R>
        Consumer<T>
        Supplier<T>
         */
        Function<String, Integer> mapToInt = input -> Integer.parseInt(input);
        System.out.println("mapToInt = " + mapToInt.apply("124"));
        Function<Integer, Integer> multiply = Demo::multiply;
        System.out.println("multiply.apply(5) = " + multiply.apply(5));

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        Supplier<String> java = () -> "Java";
        System.out.println("java.get() = " + java.get());
    }

    private static int multiply(int input) {
        return input * input;
    }

    private static <T> boolean validate(T input, Predicate<T> validator) {
        return validator.test(input);
    }
}
