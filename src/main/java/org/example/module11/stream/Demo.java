package org.example.module11.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Demo {
    public static void main(String[] args) {
//        int[] intArray = {1, 4, 3, 6, 4};
//        List<Integer> integerList = List.of(23, 534, 231, 4, 1);
//
//        Stream<Integer> integerStream = integerList.stream();
//        IntStream intStream = Arrays.stream(intArray);
//        IntStream range = IntStream.range(0, 100);
//        Stream<Integer> integerStreamOf = Stream.of(1, 23, 45);
//        Stream<Integer> iterate = Stream.iterate(0, i -> i + 1).limit(100);
//        Random random = new Random();
//        Stream<Integer> generate = Stream.generate(() -> random.nextInt(100));
//        Stream<Integer> stream = StreamSupport.stream(integerList.spliterator(), false);
//        Stream<Integer> concat = Stream.concat(integerList.stream(), integerList.stream());

        List<Integer> integers = List.of(2, 5, 15, 14);

        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                int temp = integer * 2;
                result.add(temp);
            }
        }
        System.out.println("result = " + result);

        List<Integer> streamResult = integers.stream()
                .filter(item -> item % 2 == 0) // Stream<Integer>
                .map(item -> item * 2) // Stream<Integer>
                .filter(item -> item < 20)  // Stream<Integer>
                .collect(Collectors.toList());
        System.out.println("streamResult = " + streamResult);
        System.out.println("integers = " + integers);
    }
}
