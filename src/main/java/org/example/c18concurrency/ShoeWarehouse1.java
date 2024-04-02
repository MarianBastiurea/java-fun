package org.example.c18concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShoeWarehouse1 {
    private List<Order1> shippingItems;
    private final ExecutorService fulfillmentService;
    public final static String[] PRODUCT_LIST =
            {"Running Shoes", "Sandals", "Boots", "Slippers", "High Tops"};

    public ShoeWarehouse1() {
        this.shippingItems = new ArrayList<>();
        this.fulfillmentService= Executors.newFixedThreadPool(3);
    }
    public void shutDown(){
        fulfillmentService.shutdown();
    }

    public synchronized void receiveOrder1(Order1 item) {

        while (shippingItems.size() > 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        shippingItems.add(item);
        System.out.println(Thread.currentThread().getName()+ "Incoming: " + item);
        fulfillmentService.submit(this::fulfillOrder);
        notifyAll();
    }

    public synchronized Order1 fulfillOrder() {

        while (shippingItems.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Order1 item = shippingItems.remove(0);
        System.out.println(Thread.currentThread().getName() + " Fulfilled: " + item);
        notifyAll();
        return item;
    }
}
