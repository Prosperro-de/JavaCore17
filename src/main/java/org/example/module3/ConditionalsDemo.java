package org.example.module3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConditionalsDemo {

    public static final String YES = "так";
    public static final String NO = "ні";

    public static void main(String[] args) {
//        if (true) {
//            //...
//            System.out.println("Value is true");
//            if (true) {
//                System.out.println("Nested value is true");
//                //*** if
//            } else {
//                System.out.println("Nested value is false");
//            }
//            //...
//        }  if(false) {
//            System.out.println("Second value is true");
//        } else {
//            System.out.println("Value is false");
//        }
//        findWinner();
        boolean result = is18AgeOld(10);
        System.out.println("result = " + result);
        String dayOfWeek = getDayOfWeek(3);
        System.out.println("dayOfWeek = " + dayOfWeek);
    }

    private static String getDayOfWeek(int number) {
        String result = switch (number) { // == .equals
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input";
        };
        return result;
    }

    private static boolean is18AgeOld(int age) {
        return age >= 18 ? true : false;
    }

    private static void findWinner() {
        Scanner scanner = new Scanner(System.in);
        boolean isCommented = false;
        boolean isReposted = false;
        boolean isSubscribed = false;

        System.out.println("Чи підписався на сторінку?");
        String isSubscribedResponse = scanner.next();
        isSubscribed = parseResponse(isSubscribedResponse);


        System.out.println("Чи зробив репост?");
        String isRepostedResponse = scanner.next();
        isReposted = parseResponse(isRepostedResponse);


        System.out.println("Чи залишив коментар?");
        String isCommentedResponse = scanner.next();
        isCommented = parseResponse(isCommentedResponse);

        boolean isWinner = areAllConditionalsCompleted(isReposted, isCommented, isSubscribed);
//        boolean isWinner = twoConditionalsCompleted(isReposted, isCommented, isSubscribed);
        System.out.println("Чи переміг? : " + isWinner);
    }

    private static boolean parseResponse(String response) {
        if (response == null) {
            return false;
        }
        if (!response.equalsIgnoreCase(YES) && !response.equalsIgnoreCase(NO)) {
            throw new InputMismatchException("Очікується \"так\" або \"ні\"");
        }
        return response.equalsIgnoreCase(YES);
    }

    private static boolean twoConditionalsCompleted(boolean isReposted, boolean isCommented, boolean isSubscribed) {
        boolean result = false;
        if (isCommented && isReposted) {
            result = true;
        } else if (isReposted && isSubscribed) {
            result = true;
        } else if (isCommented && isSubscribed) {
            result = true;
        }
        return result;
    }

    private static boolean areAllConditionalsCompleted(boolean isReposted, boolean isCommented, boolean isSubscribed) {
        return (isReposted && isSubscribed) && isCommented;
    }
}
