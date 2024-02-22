package org.example.module12.completablefuture;

import java.util.Random;

public class Demo {

    /*
    Time taken : 116083
    Time taken parallel: 4174
     */
    public static void main(String[] args) {
        Integer[] intArray = new Integer[200_000_000];
        Random random = new Random();
        SortUtil sortUtil = new SortUtil();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(Integer.MAX_VALUE);
        }
        long currentTime = System.currentTimeMillis();
        sortUtil.mergeSort(intArray);
        long timeResult = System.currentTimeMillis() - currentTime;

        System.out.println("Time taken : " + timeResult);
    }
}
