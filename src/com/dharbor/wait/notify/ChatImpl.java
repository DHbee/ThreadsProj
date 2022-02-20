package com.dharbor.wait.notify;

public class ChatImpl {

    public static void main(String[] args) {
        Chat chat = new Chat();

        Thread t1 = new Thread(
                () -> {
                    while (true) {
                        chat.question();
                    }
                }
        );
        t1.start();
/*
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread t = new Thread(
                () -> {
                   while (true) {
                        String ans = chat.answer();
                        if (ans != null)
                            System.out.println(chat.answer());
                    }
                }
        );
        t.start();


    }
}
