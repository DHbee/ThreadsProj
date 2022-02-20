package com.dharbor.concurrent.threads.countdown;

import java.util.concurrent.CountDownLatch;

//CyclicBarrier maintains a count of threads whereas CountDownLatch maintains a count of tasks.
public class CountDownLatchDemo {

    public static void main(String[] args) {


        try {
            CountDownLatch countDownLatch = new CountDownLatch(2);

            DataPreparationThread dataPreparationThread = new DataPreparationThread(countDownLatch);
            dataPreparationThread.start();

            AggregatorThread aggregatorThread = new AggregatorThread(countDownLatch);
            aggregatorThread.start();

            countDownLatch.await();

            System.out.println("main thread finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
