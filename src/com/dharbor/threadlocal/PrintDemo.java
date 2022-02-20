package com.dharbor.threadlocal;

public class PrintDemo {

    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    int count = 0;

    public void print(String threadName){
        threadLocal.set(threadLocal.get() != null ? threadLocal.get() + 1 : 0);
        System.out.println("thread local "+ threadLocal.get());

        count = count + 1;
        System.out.println(count);
    }
}
