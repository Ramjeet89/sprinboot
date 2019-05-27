package com.javaguides;

public class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("["+Thread.currentThread().getName()+"]"+"Message "+i);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
