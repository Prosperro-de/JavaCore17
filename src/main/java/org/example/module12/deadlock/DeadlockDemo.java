package org.example.module12.deadlock;

public class DeadlockDemo {

    private static final Object MONITOR_1  = new Object();
    private static final Object MONITOR_2  = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (MONITOR_1) {
                System.out.println("Thread 1 is holding monitor 1");
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("Thread 1 is waiting for monitor 2");
                synchronized (MONITOR_2) {
                    System.out.println("Thread 1 is holding monitor 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (MONITOR_2) {
                System.out.println("Thread 2 is holding monitor 2");
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("Thread 2 is waiting for monitor 1");
                synchronized (MONITOR_1) {
                    System.out.println("Thread 2 is holding monitor 1");
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
