package com.dharbor.readwritelock.demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: psaradhi
 * Created: 26-02-2023
 */
public class ReadWriteLockImpl {

    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        InsertUpdateImpl insertUpdate = new InsertUpdateImpl(readWriteLock);

        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i=0; i<5; i++) {
            executorService.submit(new Thread( () -> {
                for (int j=0; j<5; j++) {
                    insertUpdate.insert(j+"");
                    System.out.println(insertUpdate.get());
                }

            }));
        }

        executorService.shutdown();

    }
}
