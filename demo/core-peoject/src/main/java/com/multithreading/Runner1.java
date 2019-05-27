package com.multithreading;

public class Runner1 extends  Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Hello "+i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runner1  t1 = new Runner1();
        Runner1  t2 = new Runner1();
        t1.start();
        t2.start();
    }
}
