package org.example.c18concurrency;

import java.util.concurrent.Semaphore;

//Write a Java program to demonstrate Semaphore usage for thread synchronization.

public class SemaphoreExercise {
    private static final int numThreads = 5;
    private static final int numPermits = 3;

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(numPermits);
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Worker(semaphore));
            threads[i].start();
        }
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Worker implements Runnable {
    private Semaphore semaphore;

    public Worker(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Thread " + Thread.currentThread().getName() + " acquired the semaphore");
            Thread.sleep(2000);
            System.out.println("thread " + Thread.currentThread().getName() + " release the semaphore");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
