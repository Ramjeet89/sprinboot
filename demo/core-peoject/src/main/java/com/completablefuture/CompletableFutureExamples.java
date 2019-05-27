package com.completablefuture;

import sun.text.resources.mk.CollationData_mk;

import java.util.Random;
import java.util.concurrent.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;


public class CompletableFutureExamples {
    static ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    });

    static Random random = new Random();

    public static void main(String[] args) {

        try {

        } finally {
            executorService.shutdown();
        }
    }

    /*
       1. Creating a Completed CompletableFuture
     */
    static void completedFutureExample() {
        CompletableFuture<String> cf = new CompletableFuture<>();
        assertTrue(cf.isDone());
        assertEquals("message", cf.getNow(null));
    }

    /*
    2. Running a Simple Asynchronous Stage
     */

    static void runAsyncExample() {
        CompletableFuture cf = CompletableFuture.runAsync(() -> {
            assertTrue(Thread.currentThread().isDaemon());
            randomSleep();
        });
        assertFalse(cf.isDone());
        sleepEnough();
        assertFalse(cf.isDone());
    }

    /*
    3. Applying a Function on the Previous Stage
     */

    static void thenApplyExample() {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApply(s -> {
            assertFalse(Thread.currentThread().isDaemon());
            return s.toUpperCase();
        });
        assertEquals("MESSAGE", cf.getNow(null));
    }

    /*
    4. Asynchronously Applying a Function on a Previous Stage
     */
    static void thenApplyAsyncExample() {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(s -> {
            assertTrue(Thread.currentThread().isDaemon());
            randomSleep();
            return s.toUpperCase();
        });
        assertNull(cf.getNow(null));
        assertEquals("Message", cf.join());
    }

    static ExecutorService executor = Executors.newFixedThreadPool(3, new ThreadFactory() {
        int count = 0;

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "custom-executor" + count++);
        }
    });


    static void thenApplyAsyncWithExecutorExample() {
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message").thenApplyAsync(s -> {
            assertTrue(Thread.currentThread().getName().startsWith("custom-executor"));
            assertFalse(Thread.currentThread().isDaemon());
            randomSleep();
            return s.toUpperCase();
        }, executor);
        assertNull(cf.getNow(null));
        assertEquals("Message", cf.join());
    }
/*
6. Consuming the Result of the Previous Stage
 */

    static void thenAcceptExample() {
        StringBuilder result = new StringBuilder();
        CompletableFuture.completedFuture("thenaccept-message").thenAccept(s -> result.append(s));
        assertTrue("Result was true", result.length() > 0);
    }
/*
7. Asynchronously Consuming the Result of the Previous Stage
 */


    static void thenAcceptAsyncExample() {
        StringBuilder result = new StringBuilder();
        CompletableFuture<Void> cf = CompletableFuture.completedFuture("thenAcceptAsyn message").thenAcceptAsync((s -> result.append(s)));
        cf.join();
        assertTrue("Result was ture", result.length() > 0);
    }

    //=========================================================================================//
    private static void randomSleep() {
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sleepEnough() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
