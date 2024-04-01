package org.example.c18concurrency;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.*;
import java.util.List;

record Order1(long orderId, String item, int qty) {
};

public class MainShoeWarehouse1 {


    private static final Random random = new Random();

    public static void main(String[] args) {

        ShoeWarehouse1 warehouse1 = new ShoeWarehouse1();

        ExecutorService orderingService = Executors.newCachedThreadPool();
        Callable<Order1> orderingTask1 = () -> {
            {
                Order1 newOrder1 = generateOrder1();
                try {
                    Thread.sleep(random.nextInt(500, 5000));
                    warehouse1.receiveOrder1(newOrder1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return newOrder1;
            }
        };

        List<Callable<Order1>> tasks = Collections.nCopies(15, orderingTask1);
        try {
            orderingService.invokeAll(tasks);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        orderingService.shutdown();
        try {
            orderingService.awaitTermination(6, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        warehouse1.shutDown();
    }

    private static Order1 generateOrder1() {
        return new Order1(
                random.nextLong(1000000, 9999999),
                ShoeWarehouse1.PRODUCT_LIST[random.nextInt(0, 5)],
                random.nextInt(1, 4));
    }

}
