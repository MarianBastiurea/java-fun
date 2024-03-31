package org.example.c18concurrency;

//Write a Java program to create a producer-consumer scenario using the wait() and
// notify() methods for thread synchronization. Finish process after 10 product.

import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    LinkedList<Integer> buffer = new LinkedList<>();
    int capacity = 5;
    int productCount = 0;

    public void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }

                if (productCount == 10) {
                    System.out.println("Producer finished producing. Exiting...");
                    notify(); // Notify consumer to check for exit condition
                    return;
                }

                productCount++;
                buffer.add(productCount);
                System.out.println("Producer produced: " + productCount);

                notify();

                Thread.sleep(1000); // Simulate some processing time
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait();
                }

                int consumed = buffer.removeFirst();
                System.out.println("Consumer consumed: " + consumed);

                if (productCount == 10
                        && buffer.isEmpty()) {
                    System.out.println("Consumer finished consuming. Exiting...");
                    return;
                }

                notify();

                Thread.sleep(1000); // Simulate some processing time
            }
        }
    }
}


public class Exercise2 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}