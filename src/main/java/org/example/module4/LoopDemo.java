package org.example.module4;

import java.util.Arrays;
import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) { //.csv
        String[] emails = {
                "oleg@gmail.com,26",
                "olena@gmail.com,4",
                "mykola@gmail.com,10",
                "stepan@gmail.com,6"
        };
//        for (int i = 0; i < emails.length; i++) {
//            sendBirthdayEmail(emails[i]);
//        }

//        for (int i = 0; i < emails.length; i++) {
//            String[] result = emails[i].split(","); // length = 2  ["oleg@gmail.com", "26"]
//            int daysBeforeExpiration = Integer.parseInt(result[1]);
//            if (daysBeforeExpiration < 7) {
//                sendRenewalEmail(result[0]);
//            }
//        }

        String[] students = {
                "Oleg", "Natalia", "Mykola", "Dmytro"
        };

        for (int i = 0; i < students.length; i++) {
            if (i % 2 != 0 ) {
               continue;
            }
            System.out.println(students[i]);
        }


//        int studentNumber = findStudentIndex(students);
//        System.out.println("studentNumber = " + studentNumber);

//        int[][] intArray = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
//
//        for (int i = 0; i < intArray.length; i++) {
//            for (int j = 0; j < intArray[i].length; j++) {
//                System.out.println(intArray[i][j]);
//            }
//        }

//        for (String email: emails) { //Iterator Iterable
//            System.out.println(email);
//        }

//        login();
        int[] intArray = {1, 43, 24, 56, 2};
        for (int i = 0; i < intArray.length; i++) {
            int intValue = intArray[i];
            intValue = intValue * 2;
        }
        System.out.println(Arrays.toString(intArray));

        for (int intValue : intArray) {
            System.out.println(intValue  * 2);
//            intValue = intValue  * 2;
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static int findStudentIndex(String[] students) {
        int result = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals("Natalia")) {
                result = i;
            }
        }
        return result;
    }

    public static void login() {
        String password = "qwerty";
        Scanner scanner = new Scanner(System.in);
        boolean isLogged = false;
        int attempts = 3;

        while (!isLogged && attempts > 0) { //true && true   true && false = false
            System.out.println("Please log in");
            String userPassword = scanner.nextLine();
            if (password.equals(userPassword)) {
                System.out.println("Welcome");
                isLogged = true;
            } else {
//                continue;
                System.out.println("Please try again");
                attempts--;
            }
        }


//        do {
//            //true && true   true && false = false
//            System.out.println("Please log in");
//            String userPassword = scanner.nextLine();
//            if (password.equals(userPassword)) {
//                System.out.println("Welcome");
//                isLogged = true;
//            } else {
//                System.out.println("Please try again");
//                attempts--;
//            }
//        } while (false);


    }

    public static void sendBirthdayEmail(String email) {
        System.out.println("Happy birthday email sent to " + email);
    }

    public static void sendRenewalEmail(String email) {
        System.out.println("Please renew your subscription email sent to " + email);
    }
}
