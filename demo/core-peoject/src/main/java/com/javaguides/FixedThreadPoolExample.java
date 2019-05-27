package com.javaguides;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Thread Main starting");

       final ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task1());
        executorService.execute(new Task1());
        executorService.execute(new Task1());
        executorService.execute(new Task1());
        executorService.execute(new Task1());
        executorService.execute(new Task1());

        executorService.shutdown();

        System.out.println("Thread Main finished");

    }
}
