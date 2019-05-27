package com.pool;

public class TaskOne implements Runnable {
    public void run() {
        System.out.println("TaskOne Executing...");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
