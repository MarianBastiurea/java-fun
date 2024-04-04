package org.example.c18concurrency;

//Write a Java program to showcase the usage of the CyclicBarrier class for thread synchronization.

import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrier {

    private static final int numThreads = 3;
    private static final java.util.concurrent.CyclicBarrier barrier = new java.util.concurrent.CyclicBarrier(numThreads, new BarrierAction());

    public static void main(String[] args) {
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Worker2());
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

    static class Worker2 implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Thread:" + Thread.currentThread().getName() + " is waiting at the barrier");
                barrier.await();

                System.out.println("Thread "+Thread.currentThread().getName()+
                        " has crossed the barrier and continued execution");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    static class BarrierAction implements Runnable{
        @Override
        public void run() {
            System.out.println(" Barrier reached. All threads have arrived at the barrier");
        }
    }
}
