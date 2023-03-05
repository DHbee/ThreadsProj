package com.dharbor.reentrantlock.demo2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: psaradhi
 * Created: 26-02-2023
 */
public class Counter {

    ReentrantLock reentrantLock;

    public  Counter(ReentrantLock reentrantLock){
        this.reentrantLock = reentrantLock;
    }
    public void count() {
        try {
            reentrantLock.lock();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}
