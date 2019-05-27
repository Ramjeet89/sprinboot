package com.singleton;

public class ThreadSafeSingletonDoubleCheckedLock {

    private static ThreadSafeSingletonDoubleCheckedLock instance;

    private ThreadSafeSingletonDoubleCheckedLock() {
    }

    public static ThreadSafeSingletonDoubleCheckedLock getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonDoubleCheckedLock.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonDoubleCheckedLock();
                }
            }
        }
        return instance;
    }
}
