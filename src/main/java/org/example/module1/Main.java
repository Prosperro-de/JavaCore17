package org.example.module1;

public class Main {

    /**
     * Runs entire logic in the app
     * @param args input arguments
     */
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println("First line");
        //This is second line

        System.out.println("Second line");
        System.out.println("Sum : " + sum(5, 10));
        String newSwitch = "";
    }

    public static int sum(int first, int second) {
        return first + second;
    }
}