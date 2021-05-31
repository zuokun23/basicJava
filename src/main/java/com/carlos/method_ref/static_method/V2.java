package com.carlos.method_ref.static_method;

public class V2 {

    static void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        new Thread(V2::run).start();
    }
}
