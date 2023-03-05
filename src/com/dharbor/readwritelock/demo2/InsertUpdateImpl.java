package com.dharbor.readwritelock.demo2;

import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @Author: psaradhi
 * Created: 26-02-2023
 */
public class InsertUpdateImpl {

    ReadWriteLock readWriteLock;

    public InsertUpdateImpl(ReadWriteLock readWriteLock){
        this.readWriteLock = readWriteLock;
    }
    private Collection<String> dataCol = new ArrayList<>();

    public void insert(String data){
        readWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName());
        dataCol.add(data);
        readWriteLock.writeLock().unlock();
    }

    public Collection<String> get(){
        try {
            readWriteLock.readLock().lock();
            return dataCol;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

}
