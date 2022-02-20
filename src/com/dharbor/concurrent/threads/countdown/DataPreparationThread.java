package com.dharbor.concurrent.threads.countdown;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class DataPreparationThread extends Thread {

    CountDownLatch countDownLatch;

    public  DataPreparationThread(CountDownLatch countDownLatch){
        super("Date Preparation Thread ");
        this.countDownLatch = countDownLatch;

    }

    public void run(){
        try {
            Thread.sleep(5000);
            countDownLatch.countDown();
            System.out.println("DataPreparationThread is finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
