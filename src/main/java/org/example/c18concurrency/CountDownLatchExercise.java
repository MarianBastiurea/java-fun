package org.example.c18concurrency;

import java.util.concurrent.CountDownLatch;

//Write a Java program that uses the CountDownLatch class to synchronize the start and finish of multiple threads.

public class CountDownLatchExercise {
    private static final int numThreads = 3;
    private static final CountDownLatch startLatch = new CountDownLatch(1);
    private static final CountDownLatch endLatch = new CountDownLatch(numThreads);

    public static void main(String[] args) {
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Worker3());
            threads[i].start();
        }
        startLatch.countDown();

        try {
            endLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads have finished they work");

    }

    static class Worker3 implements Runnable {
        @Override
        public void run() {
            try {
                startLatch.await();

                System.out.println("Thread " + Thread.currentThread().getName() + " has finished it's work");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                endLatch.countDown();
            }
        }
    }
}
