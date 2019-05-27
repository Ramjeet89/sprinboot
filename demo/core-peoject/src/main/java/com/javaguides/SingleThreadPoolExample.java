package com.javaguides;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Thread Main started");

        Runnable task1 = () -> {
            System.out.println("Executing Task1 inside:: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        };


        Runnable task2 = () -> {
            System.out.println("Executing Task2 inside:: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        };

        Runnable task3 = () -> {
            System.out.println("Executing task3  inside:: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        };

        final ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Submeting the task for execution");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
        System.out.println("Thread Main finished");
    }
}
