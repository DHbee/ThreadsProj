package com.dharbor.reentrantlock.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: psaradhi
 * Created: 26-02-2023
 */
public class ReentrantLockImpl {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);

        Counter counter = new Counter(reentrantLock);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0; i<5; i++) {
            executorService.submit(new Thread( () -> {
                for (int j=0; j<5; j++) {
                    counter.count();
                }
            }));
        }
        executorService.shutdown();
    }

}
