package com.dharbor.readwritelock;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class WriterB extends Thread{

    StringBuffer msg;
    ReadWriteLock readWriteLock;

    public WriterB(StringBuffer message, ReadWriteLock readWriteLock){
        super("writer B");
        this.msg = message;
        this.readWriteLock = readWriteLock;

    }

    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " "+ new Date());
            Lock lock = readWriteLock.writeLock();
            lock.lock();
            msg.append(" gokul");

            sleep(2000);
            lock.unlock();
            System.out.println("writer B done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
