package org.example.module6;

public class InnerClassDemo { // Inner - Nested

    public void print(String s) {
        new StringPrinter().print(s);
    }

    class StringPrinter {
        public void print(String s) {
            System.out.println("s = " + s);
        }
    }
}
