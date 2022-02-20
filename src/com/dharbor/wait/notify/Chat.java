package com.dharbor.wait.notify;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Chat {

    Map<String, String> chatData = Collections.synchronizedMap(new HashMap<>());
    String query;

    public Chat() {
        chatData.put("hi", "hi partha");
        chatData.put("bye", "bye partha");
    }

    public synchronized void question() {
        try {
            System.out.println("enter query > ");
            InputStream inputStream = System.in;
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            query = reader.readLine();
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized String answer() {
        String ans = null;
        try {
            wait();
            ans = chatData.get(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ans;
    }


}
