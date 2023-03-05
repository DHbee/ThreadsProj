package com.dharbor.reentrantlock.demo1;

import java.util.concurrent.locks.ReentrantLock;

/*
    1. It is similar to synchronized block
    2. It will give priority to execute for long waiting threads, unlike synchronized. fairness property will do it.
    3. can view all threads which are looking for lock
    4. lock() -> will acquire lock
    5. unlock() -> will release lock
    6. mandatory should call unlock() method, so can be used try & finally() must be.

 */
public class ReentrantLockImpl {


    public static void main(String[] args) {

        try {
            PrintDemo printDemo = new PrintDemo();
            ReentrantLock reentrantLock = new ReentrantLock(true);

            WriterA writerA = new WriterA(printDemo, reentrantLock);
            writerA.start();

            WriterB writerB = new WriterB(printDemo, reentrantLock);
            writerB.start();

            Reader reader = new Reader(printDemo, reentrantLock);
            reader.start();

            System.out.println("main thread");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
