package com.dharbor.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolImpl {

    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(printDemo);
        executorService.submit(printDemo);
        executorService.submit(printDemo);
        executorService.submit(printDemo);

        //main thread will not complete, if shutdown is not called
        executorService.shutdown();


    }
}
