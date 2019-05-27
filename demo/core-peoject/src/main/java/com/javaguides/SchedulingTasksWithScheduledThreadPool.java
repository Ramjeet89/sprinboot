package com.javaguides;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulingTasksWithScheduledThreadPool {
    public static void main(String[] args) {
        System.out.println("Thread Main Started");

        Runnable task1 = () -> {
            System.out.println("Executing Task1:" + new Date());
        };

        Runnable task2 = () -> {
            System.out.println("Executing Task2: " + new Date());
        };

        Runnable task3 = () -> {
            System.out.println("Executing task3: " + new Date());
        };

        final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        System.out.println("Executing the task to run after 5 second: " + new Date());
        executorService.schedule(task1, 5, TimeUnit.SECONDS);
        executorService.schedule(task2, 5, TimeUnit.SECONDS);
        executorService.schedule(task3, 5, TimeUnit.SECONDS);
        executorService.shutdown();
        System.out.println("Thread Main finished");
    }
}
