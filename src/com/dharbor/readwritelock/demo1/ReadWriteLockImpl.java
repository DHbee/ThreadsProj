package com.dharbor.readwritelock.demo1;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockImpl {


    public static void main(String[] args) {

        try {
            ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);
            StringBuffer msg = new StringBuffer("this is message");

            WriterA writerA = new WriterA(msg, readWriteLock);
            writerA.start();

            WriterB writerB = new WriterB(msg, readWriteLock);
            writerB.start();

            Reader reader = new Reader(msg, readWriteLock);
            reader.start();

            reader.join();
            writerA.join();
            writerB.join();

            System.out.println(msg);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
