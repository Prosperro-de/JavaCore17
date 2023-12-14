package org.example.module3;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[5]; //4000
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 5;
        int length = intArray.length;
        System.out.println(intArray[length - 1]);

        String[] stringArray = {"a", "b", "c"};
//        String[] newStringArray = stringArray;
//        newStringArray[0] = "Error";
//        System.out.println("newStringArray[0] = " + newStringArray[0]);
//        System.out.println("stringArray[0] = " + stringArray[0]);

        String[] newStringArray = Arrays.copyOf(stringArray, 4);
//        String[] newStringArray = System.arraycopy();
        //....
        newStringArray[3] = "d";
        System.out.println(Arrays.toString(newStringArray));

//        int[][] array = {{1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9}};
//
//
//        int arrayLastElement = array.length - 1;
//        int[] subArray = array[arrayLastElement];
//        int subArrayLastElement = subArray.length - 1;
//        int lastElement = subArray[subArrayLastElement];  // it's 9
//        System.out.println("lastElement = " + lastElement);
        printArray(newStringArray, 0);
    }

    public static void printArray(String[] array, int counter) {
        if (counter == array.length) {
            return;
        }
        System.out.print(array[counter]);
        counter++;
        printArray(array, counter);
    }

}
