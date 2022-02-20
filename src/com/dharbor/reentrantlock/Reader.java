package com.dharbor.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class Reader extends Thread {

    PrintDemo printDemo;
    ReentrantLock reentrantLock;

    public Reader(PrintDemo printDemo, ReentrantLock reentrantLock){
        super("reader");
        this.reentrantLock = reentrantLock;
        this.printDemo = printDemo;

    }

    public void run(){
        try {
            reentrantLock.lock();
            sleep(2000);
            printDemo.print(Thread.currentThread().getName());
            reentrantLock.unlock();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
