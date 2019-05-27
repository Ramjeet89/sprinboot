package com.pool;

import java.util.List;

public class MultiRunnable implements Runnable {

    private final List<Runnable> runnableList;

    public MultiRunnable(List<Runnable> runnableList) {
        this.runnableList = runnableList;
    }

    public void run() {
        for (Runnable runnable : runnableList) {
            new Thread(runnable).start();
        }
    }
}
