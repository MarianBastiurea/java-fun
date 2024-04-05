package org.example.c18concurrency;
import java.util.concurrent.ConcurrentLinkedQueue;

//Write a Java program that utilizes the ConcurrentLinkedQueue class to implement a thread-safe queue.


class Producer implements Runnable {
    private final ConcurrentLinkedQueue<Integer> queue;
    private final int maxItems;

    public Producer(ConcurrentLinkedQueue<Integer> queue, int maxItems) {
        this.queue = queue;
        this.maxItems = maxItems;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxItems; i++) {
            System.out.println("Producing item: " + i);
            queue.offer(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private final ConcurrentLinkedQueue<Integer> queue;
    private int itemsConsumed;

    public Consumer(ConcurrentLinkedQueue<Integer> queue) {
        this.queue = queue;
        this.itemsConsumed = 0;
    }

    @Override
    public void run() {
        while (itemsConsumed < 10) {
            Integer item = queue.poll();
            if (item == null) {
                System.out.println("Queue is empty. Waiting for items...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Consumed item: " + item);
                itemsConsumed++;
            }
        }
    }
}
public class ConcurrentLinkedQueueExercise {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        Producer producer = new Producer(queue, 10);
        Consumer consumer = new Consumer(queue);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}