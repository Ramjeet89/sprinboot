package com.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiTaskExecutor {
    public static void main(String[] args) {
        BlockingQueue<Runnable> worksQueue = new ArrayBlockingQueue<Runnable>(10);
        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandelerImpl();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3, 3, 10, TimeUnit.SECONDS, worksQueue, rejectedExecutionHandler);

        executor.prestartAllCoreThreads();
        List<Runnable> taskGroup = new ArrayList<Runnable>();
        taskGroup.add(new TaskOne());
        taskGroup.add(new TaskTwo());
        taskGroup.add(new TaskThree());
        worksQueue.add(new MultiRunnable(taskGroup));
    }
}
class RejectedExecutionHandelerImpl implements RejectedExecutionHandler {
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor executor) {
        System.out.println(runnable.toString() + ": I've been Rejected...!!");
    }
}
