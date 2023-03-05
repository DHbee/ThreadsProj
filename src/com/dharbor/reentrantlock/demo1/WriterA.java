package com.dharbor.reentrantlock.demo1;

import java.util.concurrent.locks.ReentrantLock;

public class WriterA extends Thread{

    PrintDemo printDemo;
    ReentrantLock reentrantLock;

    public WriterA(PrintDemo printDemo, ReentrantLock reentrantLock){
        super("writer A");
        this.reentrantLock = reentrantLock;
        this.printDemo = printDemo;

    }

    public void run(){
        try {
            reentrantLock.lock();
            sleep(2000);
            printDemo.print(Thread.currentThread().getName());
            reentrantLock.unlock();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
