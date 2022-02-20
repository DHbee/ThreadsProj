package com.dharbor.threadpool;

public class PrintDemo implements Runnable{


    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
