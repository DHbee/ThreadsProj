package com.dharbor.concurrent.threads.cyclic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

//CyclicBarrier maintains a count of threads whereas CountDownLatch maintains a count of tasks.
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new AggregatorThread(list));
        for (int i =1; i<=5; i++){
            DataPreparationThread dataPreparationThread = new DataPreparationThread(i, list, cyclicBarrier);
            dataPreparationThread.start();
        }

    }


}
