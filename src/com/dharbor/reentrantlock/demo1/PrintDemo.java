package com.dharbor.reentrantlock.demo1;

public class PrintDemo {

    public void print(String threadName){
        try {
            System.out.println(threadName + " started");
            Thread.sleep(2000);
            System.out.println(threadName + " completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
