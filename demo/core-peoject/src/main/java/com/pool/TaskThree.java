package com.pool;

public class TaskThree implements Runnable {
    public void run() {
        System.out.println("TaskThree Executing...");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
