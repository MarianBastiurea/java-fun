package org.example.c18concurrency;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Write a Java program that uses the ScheduledExecutorService interface to schedule tasks for execution at a
// specified time or with a fixed delay.

import java.util.concurrent.Executors;

public class Exercise6 {

    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.schedule(new Task(), 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new Task(), 3, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }

    static class Task implements Runnable {

        private final String text = """
                Humpty Dumpty sat on a wall,
                Humpty Dumpty had a great fall,
                All the king's horses and all the king's men,
                Couldn't put Humpty together again.""";

        @Override
        public void run() {
            System.out.println(text+new Date());
        }
    }
}
