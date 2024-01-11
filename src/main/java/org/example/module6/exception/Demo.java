package org.example.module6.exception;

import org.example.module6.Customer;

import java.io.*;
import java.net.SocketException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//            readFile();
//            readAnotherFile();
//        readInput();
//        Customer customer = null;
//        goToWork(customer);
        throw new CustomGoItException("Warning message");
    }

    public static void goToWork(Customer customer) {
        if (customer == null) {
            return;
        }
        customer.goToWork();
    }

//    public static void readFile() throws IOException {
//        File file = new File("C://invalidPath");
//        FileInputStream fIs = null;
//        try {
//            fIs = new FileInputStream(file);
//            System.out.println("after file input");
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (RuntimeException ex) {
//            System.out.println("Runtime exception");
//        } finally {
//            fIs.close();
//        }
//
//    }

    public static void readFile() throws IOException {
        File file = new File("C://invalidPath");
        FileInputStream fIs = new FileInputStream(file);
    }

    public static void readAnotherFile() throws IOException {
        File file = new File("C://invalidPath");
        FileInputStream fIs = new FileInputStream(file);
    }

    public static void readInput() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (!s.equals("password")) {
            throw new InputMismatchException("Invalid password");
        }
    }
}
