package org.example.module12.completablefuture;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class SortUtil {

    public <T extends Comparable<? super T>> void mergeSort(T[] array) {
        if (array.length == 1) {
            return;
        }
        int middleIndex = array.length / 2;
        T[] left = Arrays.copyOfRange(array, 0, middleIndex);
        T[] right = Arrays.copyOfRange(array, middleIndex, array.length);

//        mergeSort(left);
//        mergeSort(right);
        CompletableFuture.runAsync(() -> mergeSort(left));
        CompletableFuture.runAsync(() -> mergeSort(right));
        performMergeSort(array, left, right);
    }

    private <T extends Comparable<? super T>> void performMergeSort(T[] intArray, T[] left, T[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int sourceIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
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
}
