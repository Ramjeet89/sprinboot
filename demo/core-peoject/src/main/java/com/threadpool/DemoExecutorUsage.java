package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {

    private static ExecutorService executor = null;
    private static volatile Future taskOneResult = null;
    private static volatile Future taskTwoResult = null;

    public static void main(String[] args) {
        executor = Executors.newFixedThreadPool(2);
        while (true){
            try{
                checkTask();
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.err.println("Cought Exception: "+e.getMessage());
            }
        }
    }
    private static void checkTask(){
        if (taskOneResult==null||taskOneResult.isDone()||taskOneResult.isCancelled()){
            taskOneResult =executor.submit(new TaskOne());
        }
        if (taskTwoResult==null||taskTwoResult.isDone()||taskTwoResult.isCancelled()){
            taskTwoResult=executor.submit(new TaskTwo());
        }
    }
}

class TaskOne implements Runnable{
    public void run() {
        while (true){
            System.out.println("Executing TaskOne");
            try{
                Thread.sleep(1000);
            }catch (Throwable e){
                e.printStackTrace();
            }
        }
    }
}


class TaskTwo implements Runnable{
    public void run() {
        System.out.println("Executing TaskTwo");
        try{
            Thread.sleep(1000);
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
