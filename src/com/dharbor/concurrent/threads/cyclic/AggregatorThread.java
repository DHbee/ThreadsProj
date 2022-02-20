package com.dharbor.concurrent.threads.cyclic;

import java.util.List;

public class AggregatorThread extends Thread {

    List<Integer> list;
    int sum;

    public AggregatorThread(List<Integer> list) {
        this.list = list;
    }

    public void run(){
        System.out.println("Aggregator Thread name: "+ Thread.currentThread().getName());
        list.forEach( item -> {
            sum = sum + item;
        });

        System.out.println("sum "+ sum);
    }
}
