package com.dharbor.threadlocal;

public class ThreadLocalImpl {

    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();
        Thread t1 = new Thread(
                () -> {
                    printDemo.print(Thread.currentThread().getName());
                });

        Thread t2 = new Thread(
                () -> {
                    printDemo.print(Thread.currentThread().getName());
                });

        Thread t3 = new Thread(
                () -> {
                    printDemo.print(Thread.currentThread().getName());
                });

        t1.start();
        t2.start();
        t3.start();


    }
}
