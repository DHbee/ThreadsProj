package com.dharbor.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolImpl {

    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(printDemo);
        executorService.submit(printDemo);
        executorService.submit(printDemo);
        executorService.submit(printDemo);

        //main thread will not complete, if shutdown is not called
        //executorService.shutdown();


    }
}
