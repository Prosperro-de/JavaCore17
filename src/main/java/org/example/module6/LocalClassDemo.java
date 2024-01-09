package org.example.module6;

public class LocalClassDemo {
    public void print(String s) {
        class NamePrinter {
            public void print(String s) {
                System.out.println(s);
            }
        }
        NamePrinter namePrinter = new NamePrinter();
        namePrinter.print(s);
    }
}
