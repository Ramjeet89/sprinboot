package com.multithreading;

import java.util.Scanner;

public class Processor extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }

    public static void main(String[] args) {
        Processor p = new Processor();
        p.start();
        System.out.println("Press return to stop");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        p.shutdown();
    }
}
