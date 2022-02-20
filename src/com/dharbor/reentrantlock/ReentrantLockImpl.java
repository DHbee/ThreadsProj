package com.dharbor.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

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
