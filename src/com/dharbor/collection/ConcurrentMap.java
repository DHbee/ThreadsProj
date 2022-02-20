package com.dharbor.collection;

import java.util.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

    public static void main(String[] args) {
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("1", "one");
        concurrentMap.put("2", "two");
        concurrentMap.put("3", "three");
        concurrentMap.put("4", "four");

        concurrentMap.forEach((k, v) -> {
            if (k.equals("3")){
                concurrentMap.put("5","five");
            }
        });

        concurrentMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

    }
}
