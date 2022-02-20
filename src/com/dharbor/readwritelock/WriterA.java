package com.dharbor.readwritelock;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class WriterA extends Thread{

    StringBuffer msg;
    ReadWriteLock readWriteLock;

    public WriterA(StringBuffer message, ReadWriteLock readWriteLock){
        super("writer A");
        this.msg = message;
        this.readWriteLock = readWriteLock;

    }

    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " "+ new Date());
            Lock lock = readWriteLock.writeLock();
            lock.lock();

            msg.append(" saradhi");
            sleep(2000);
            lock.unlock();
            System.out.println("writer A done");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
