package com.pool;

public class TaskTwo implements Runnable {
    public void run() {
        System.out.println("TaskTwo Executing...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
