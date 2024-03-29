package com.thread13;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
       Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random  = new Random();
                int duration  = random.nextInt(4000);

                if (duration>2000){
                    throw  new IOException("Sleeping for too long...");
                }
                System.out.println("Starting...");
                try{
                    Thread.sleep(duration);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Finishing...");
                return duration;
            }
        });
        executorService.shutdown();

        //executorService.awaitTermination();
       try{
           System.out.println("Result  is : "+future.get());
       }catch (InterruptedException e){
           e.printStackTrace();
       }catch (ExecutionException e){
           IOException ex = (IOException)e.getCause();
           System.out.println(ex.getMessage());
       }
       }
    }

