package com.dharbor.concurrent.threads.countdown;

import java.util.concurrent.CountDownLatch;

public class AggregatorThread extends Thread {

    CountDownLatch countDownLatch;

    public AggregatorThread(CountDownLatch countDownLatch) {
        super("Aggregation thread");
        this.countDownLatch = countDownLatch;
    }

    public void run(){
        try {
            Thread.sleep(5000);
            countDownLatch.countDown();
            System.out.println("AggregatorThread is finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
