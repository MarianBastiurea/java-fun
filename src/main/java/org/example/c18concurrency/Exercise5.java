package org.example.c18concurrency;

//Write a Java program to demonstrate the usage of the Callable and Future interfaces for executing tasks
// asynchronously and obtaining their results.


import java.util.concurrent.*;

public class Exercise5 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new Task());
        try {
            int result = future.get();
            System.out.println("result of sum of 5 and 10 is: " + result);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            return sum(10, 5);
        }
    }
}
