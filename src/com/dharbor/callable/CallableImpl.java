package com.dharbor.callable;

import java.util.concurrent.*;

public class CallableImpl {

    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<String> future = executorService.submit(new CallableImpl().new  CallableDemo());
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    class CallableDemo implements Callable<String>{
        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            return "completed";
        }
    }
}
