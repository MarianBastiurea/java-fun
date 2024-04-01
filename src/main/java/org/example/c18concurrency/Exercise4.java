package org.example.c18concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//Write a Java program that uses the ReentrantLock class to synchronize access to a shared
// resource among multiple threads.

public class Exercise4 {

    private static final int numThreads = 6;
    private static final int numIterations = 3;


    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        SharedResource sharedResource = new SharedResource();

        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Worker1(lock, sharedResource));
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

    static class Worker1 implements Runnable {

        private Lock lock;
        private SharedResource sharedResource;

        public Worker1(Lock lock, SharedResource sharedResource) {
            this.lock = lock;
            this.sharedResource = sharedResource;
        }

        @Override
        public void run() {
            for (int i = 0; i < numIterations; i++) {
                lock.lock();
                try {
                    sharedResource.doWork();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class SharedResource {
        public void doWork() {
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread " + threadName + " is performing work");
        }
    }
}
