package org.example.module3;

import java.util.Scanner;

public class DemoInputOutput {
    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println("hello = " + hello);
        int i = 10;
        System.out.println(i);
        User user = new User();
        System.out.println(user);

        Scanner scanner = new Scanner(System.in);
//        String scannerResult = scanner.nextLine();
//        System.out.println("scannerResult = " + scannerResult);
//        System.out.println("Hello \n World");
        // Delimiters: UNIX: \n Win: \r\n
//        String template = "Hello %s %s";
//        String name = scanner.nextLine();
//        String surname = scanner.nextLine();
//        String helloMessage = String.format(template, name, surname);
//        System.out.printf(template, name, surname);
        String first = scanner.next();
        String second = scanner.next();

        System.out.println(first + second);
    }
}
