package org.example.module7.string;

import java.util.Arrays;

public class StringDemo {
    public static final Integer NUMBER_OF_DAYS = 7;

    public static void main(String[] args) {
//        char[] charArray = "Hello".toCharArray();
//        System.out.println(Arrays.toString(charArray));
//
//        byte[] bytes = "Hello".getBytes();
//        System.out.println(Arrays.toString(bytes));
//
//
//        bytes[2] = 76;
//        String stringResult = new String(bytes);
//        System.out.println("stringResult = " + stringResult);

//        byte[] bytes1 = "Привіт".getBytes();
//        System.out.println(Arrays.toString(bytes1));
//
//        bytes1[2] = 76;
//        System.out.println(new String(bytes1));

        String concatExample = "Hello" + " " + "World" + " " + "from" + " " + "Java";
        /*
        "Hello"
        "Hello "
        "Hello World"
        "Hello World "
        "Hello World from"
        "Hello World from "
        "Hello World from Java"
         */
        String result = new StringBuilder("Hello")
                .append(" ")
                .append("World")
                .append(" ")
                .append("from")
                .append(" ")
                .append("Java")
                .toString();
        System.out.println(result);
//        System.out.println("string = " + string);
//        System.out.println("stringBuilder = " + stringBuilder);

        String customResult = new CustomStringBuilder()
                .append("Hello")
                .append(" ")
                .append("World")
                .append(" ")
                .append("from")
                .append(" ")
                .append("Java")
                .toString();
        System.out.println(customResult);

    }
}
