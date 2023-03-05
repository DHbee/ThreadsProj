package com.dharbor.collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Map {

    public static void main(String[] args) {
        java.util.Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "one");
        hashMap.put("2", "two");
        hashMap.put("3", "three");
        hashMap.put("4", "four");

        hashMap.forEach((k, v) -> {
            if (k.equals("3")){
                //it throws Exception, use concurrent hash map
                hashMap.put("5","five");
            }
        });


    }
}
