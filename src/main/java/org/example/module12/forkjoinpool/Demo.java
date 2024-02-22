package org.example.module12.forkjoinpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Demo {
    public static void main(String[] args) {
//        List<String> emails = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            emails.add("customer" + i + "@gmail.com");
//        }
//        ForkJoinPool.commonPool().invoke(new EmailSenderTask(emails));


//        List<Integer> integers = List.of(1, 3, 43, 5643, 12, 432, 123, 534, 125);
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        Integer sum = ForkJoinPool.commonPool().invoke(new SumRecursiveTask(integers));
        System.out.println("sum = " + sum);

        Integer sumReduce = integers.parallelStream()
                .peek(x -> System.out.println(Thread.currentThread().getName()))
                .reduce(0, Integer::sum);
        System.out.println("sumReduce = " + sumReduce);
    }
}
