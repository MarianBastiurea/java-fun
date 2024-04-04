package org.example.c18concurrency;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//Write a Java program to illustrate the usage of the ReadWriteLock interface for concurrent read-write access to a shared resource.

class SharedResource1 {
    private int resource = 0;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(int value) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is writing...");
            resource = value;
            System.out.println(Thread.currentThread().getName() + " wrote: " + resource);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int read() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is reading...");
            return resource;
        } finally {
            lock.readLock().unlock();
        }
    }
}

class ReadWriteLockExample {
    public static void main(String[] args) {
        final SharedResource1 sharedResource1 = new SharedResource1();

        // Writer thread
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedResource1.write(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Writer").start();

        // Reader threads
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " read: " + sharedResource1.read());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Reader 1").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " read: " + sharedResource1.read());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Reader 2").start();
    }
}