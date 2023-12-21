package org.example.module4;

import java.util.Arrays;
import java.util.Random;

public class AlgorithmDemo {
    /*
    Elements - 10_000
    Bubble sort - 121
    Merge sort - 7

    Elements - 50_000
    Bubble sort - 6213
    Merge sort - 15

    Elements - 200_000
    Bubble sort - 101900
    Merge sort - 40
     */

    public static void main(String[] args) {
        int[] intArray = new int[200_000];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(Integer.MAX_VALUE);
        }
        long currentTime = System.currentTimeMillis();
//        bubbleSort(intArray);

//        mergeSort(intArray);
        long timeResult = System.currentTimeMillis() - currentTime;

        System.out.println("Time taken : " + timeResult);
    }

    private static void mergeSort(int[] intArray) {
        if (intArray.length == 1) {
            return;
        }
        int middleIndex = intArray.length / 2;
        int[] left = Arrays.copyOfRange(intArray, 0, middleIndex);
        int[] right = Arrays.copyOfRange(intArray, middleIndex, intArray.length);
        mergeSort(left);
        mergeSort(right);
        performMergeSort(intArray, left, right);
    }

    private static void performMergeSort(int[] intArray, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int sourceIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                intArray[sourceIndex] = left[leftIndex];
                leftIndex++;
                sourceIndex++;
            } else {
                intArray[sourceIndex] = right[rightIndex];
                rightIndex++;
                sourceIndex++;
            }
        }
        while (leftIndex < left.length) {
            intArray[sourceIndex] = left[leftIndex];
            leftIndex++;
            sourceIndex++;
        }
        while (rightIndex < right.length) {
            intArray[sourceIndex] = right[rightIndex];
            rightIndex++;
            sourceIndex++;
        }
    }


    private static void bubbleSort(int[] intArray) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swapElements(intArray, i);
                    isSorted = false;
                }
            }
        }
    }

    private static void swapElements(int[] intArray, int i) {
        int temp = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1] = temp;
    }
}
