package com.dharbor.concurrent.dequeue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Author: psaradhi
 * Created: 02-03-2023
 */

/*
    1. Dequue means double ended queue
    2. can be add elements in both sides
    3. same instructions applies as same as blockqueue
 */
public class LinkedBlockingDequeDemo {

    public static void main(String[] args) {

        try {
            LinkedBlockingDeque<String> linkedBlockingDeque = new LinkedBlockingDeque<>(10);

            linkedBlockingDeque.put("1");
            linkedBlockingDeque.put("2");
            linkedBlockingDeque.putLast("b");
            linkedBlockingDeque.putFirst("a");

            Collection<String> collection = new ArrayList<>();
            linkedBlockingDeque.drainTo(collection);

            System.out.println(collection);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
