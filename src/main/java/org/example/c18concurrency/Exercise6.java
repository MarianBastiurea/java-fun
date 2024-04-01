package org.example.c18concurrency;

import java.util.Date;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Write a Java program that uses the ScheduledExecutorService interface to schedule tasks for execution at a
// specified time or with a fixed delay.

import java.util.concurrent.Executors;

public class Exercise6 {
    private static final String[] lines = {
            "Humpty Dumpty sat on a wall,",
            "Humpty Dumpty had a great fall,",
            "All the king's horses and all the king's men,",
            "Couldn't put Humpty together again."
    };


    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // Schedule each line to be printed at intervals of 2 seconds
        for (int i = 0; i < lines.length; i++) {
            final int index = i;
            executor.schedule(() -> printLine(index), i * 2, TimeUnit.SECONDS);
        }

        // Shutdown executor after all tasks are completed
        executor.shutdown();
    }

    private static void printLine(int index) {
        System.out.println(lines[index]);
    }
}

