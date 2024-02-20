package org.example.module12.thread;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Demo {
    private static int counter;
    static final Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
//        createThreadExamples();
//        createMultipleThreadExamples();
//        interruptThreadExample();
        concurrentResourcesAccess();

    }



    private static void concurrentResourcesAccess() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    incrementCounter();
//                    counter.getAndAdd(1);
                }
            });
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(counter);
    }

    private static void incrementCounter() {
        synchronized (object) {
            counter++;
        }
    }

    @SneakyThrows
    private static void interruptThreadExample() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("i = " + i);
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
//        thread.join();

        Thread.sleep(3000L);

        thread.interrupt();
    }

    static void createMultipleThreadExamples() throws InterruptedException {
        Thread thread1 = new Thread(() -> System.out.println("Starting thread 1"));
        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Starting thread 2");
                Thread.sleep(3000L);
                System.out.println("Ending thread 2");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
//        thread2.setDaemon(true);
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("End of main thread");
    }

    static void createThreadExamples() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        CustomThread customThread = new CustomThread();
        System.out.println("customThread.getName() = " + customThread.getName());
        customThread.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println("Anonymous thread creation");
            }
        }.start();
        new Thread(() -> {
            System.out.println("Thread with supplier");
        }).start();

        Thread withCustomRunnable = new Thread(new CustomRunnable());
        withCustomRunnable.start();
    }
}
