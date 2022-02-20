package com.dharbor.collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Map {

    public static void main(String[] args) {
        java.util.Map<String, String> concurrentMap = new HashMap<>();
        concurrentMap.put("1", "one");
        concurrentMap.put("2", "two");
        concurrentMap.put("3", "three");
        concurrentMap.put("4", "four");

        concurrentMap.forEach((k, v) -> {
            if (k.equals("3")){
                //it throws Exception, use concurrent hash map
                concurrentMap.put("5","five");
            }
        });


    }
}
