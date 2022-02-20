package com.dharbor.concurrent.threads.cyclic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class DataPreparationThread extends Thread {

    List<Integer> list;
    CyclicBarrier cyclicBarrier;

    public  DataPreparationThread(int i, List<Integer> list, CyclicBarrier cyclicBarrier){
        super("Thread "+i);
        this.list = list;
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run(){

        try {
            for (int i=1; i<=3; i++){
                list.add(i);
            }

            System.out.println(Thread.currentThread().getName() +" suspended");
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() +" resumed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
