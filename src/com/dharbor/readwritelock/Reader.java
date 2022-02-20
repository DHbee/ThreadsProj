package com.dharbor.readwritelock;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class Reader extends Thread {

    StringBuffer msg;
    ReadWriteLock readWriteLock;

    public Reader(StringBuffer message, ReadWriteLock readWriteLock){
        super("reader");
        this.msg = message;
        this.readWriteLock = readWriteLock;

    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " "+ new Date());
        Lock lock = readWriteLock.readLock();
        lock.lock();
        lock.unlock();
        System.out.println("reader done");


    }
}
