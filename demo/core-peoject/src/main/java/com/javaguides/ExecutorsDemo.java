package com.javaguides;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo {
    public static void main(String[] args) {
        ExecutorsDemo demo = new ExecutorsDemo();
        demo.newSingleThreadScheduledExecutor();
    }

    private void newSingleThreadScheduledExecutor() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> {
            System.out.println("Executing task1:: " + new Date());
        };
        scheduledExecutorService.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);
        System.out.println("Thread main Finished");
    }
}
