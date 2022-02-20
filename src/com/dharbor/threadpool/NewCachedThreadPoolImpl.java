package com.dharbor.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolImpl {

    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();

        //it is not fixed thread pool, allocates threads if more required
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(printDemo);
        executorService.submit(printDemo);
        executorService.submit(printDemo);
        executorService.submit(printDemo);



    }
}
