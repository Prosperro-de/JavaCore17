package org.example.module12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo {
    public static void main(String[] args) {
//        ConcurrentHashMap
//        Semaphore
//        CountDownLatch
//        ReentrantLock
//        ReentrantReadWriteLock
//        CyclicBarrier
        List<String> emails = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            emails.add("customer" + i + "@gmail.com");
        }

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        System.out.println("Run our main order processing logic");
//        System.out.println("Send email");
//        for (String email : emails) {
//            executorService.execute(() -> sendEmail(email));
//
//        }
//
//        executorService.shutdown();
//        System.out.println("Continue order processing");

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);

        System.out.println("Run our main order processing logic");
        System.out.println("Send email");
        for (String email : emails) {
            scheduledExecutorService.scheduleWithFixedDelay(
                    () -> sendEmail(email),
                    1,
                    8,
                    TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(
                    () -> sendEmail(email),
                    5,
                    1,
                    TimeUnit.SECONDS);
        }





        System.out.println("Continue order processing");
    }

//    @Scheduled("* * * * / *") //crone expression
    static void sendEmail(String email) {
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread name" + Thread.currentThread().getName());
        System.out.println("Sending email to " + email);
    }

}
