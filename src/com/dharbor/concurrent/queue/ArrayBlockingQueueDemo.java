package com.dharbor.concurrent.queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: psaradhi
 * Created: 02-03-2023
 */

/*
    1. The ArrayBlockingQueue stores the elements internally in FIFO (First In, First Out) order
    2. It is thread safe when multiple threads access
    3. thread will be wait while accessing put() method when queue is empty
    4. adding elements will not allow when reaches capacity and thread is blocked.
    5. it is bounded queue means stores elements till capacity, stores elements in array.
 */

/*
    1. LinkedBlockingQueue, DelayBlockingQueue, PriorityBlockingQueue
    2. SynchronousBlockingQueue works,
     when one thread inserted one element, other thread has to take out that element
     otherwise thread will be blocked.
 */
public class ArrayBlockingQueueDemo {

    public static void main(String[] args) {
        try {
            BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(10);
            blockingQueue.put("1");
            blockingQueue.put("2");
            blockingQueue.put("3");
            blockingQueue.put("4");
            blockingQueue.put("5");

            System.out.println(blockingQueue.take()); //takes objects from fifo
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
            //System.out.println(blockingQueue.take()); //this blocks main thread to complete execution

            Collection collection = new ArrayList();
            blockingQueue.drainTo(collection);

            System.out.println(collection);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
