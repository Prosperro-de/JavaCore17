package org.example.module6.singleton;

public class Demo {
    public static void main(String[] args) {
       Logger first = Logger.getInstance();
       Logger second = Logger.getInstance();

        System.out.println(first == second);
    }
}
