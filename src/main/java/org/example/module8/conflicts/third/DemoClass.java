package org.example.module8.conflicts.third;

public class DemoClass implements FirstChildInterface, SecondChildInterface {
    @Override
    public void print() {
//        FirstChildInterface.super.print();
//        SecondChildInterface.super.print();
        System.out.println("Demo class");

    }
}
