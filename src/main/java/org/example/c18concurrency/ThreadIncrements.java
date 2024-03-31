package org.example.c18concurrency;

//Write a Java program to create and start multiple threads that increment a shared counter variable
// concurrently.

class IncrementThread extends Thread {
private Counter counter;
private int incrementsPerThread;

    public IncrementThread(Counter counter, int incrementsPerThread) {
        this.counter = counter;
        this.incrementsPerThread = incrementsPerThread;
    }

    @Override
    public void run() {
        for(int i=0; i<incrementsPerThread; i++){
            counter.increment();
        }
    }
}

class Counter{
    private int count=0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadIncrements{
    public static void main(String[] args) {
        Counter counter=new Counter();
        int numThreads=6;
        int incrementsPerThread=10000;
        IncrementThread[] threads=new IncrementThread[numThreads];
        for (int i=0; i<numThreads; i++){
            threads[i] = new IncrementThread(counter, incrementsPerThread);
            threads[i].start();
        }
        try {
            for (IncrementThread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter.getCount());



    }
}

