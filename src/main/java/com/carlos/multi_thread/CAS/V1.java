package com.carlos.multi_thread.CAS;

import sun.misc.Unsafe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicInteger.*;

public class V1 {

    static int i = 0;
    static void increment(){
        for (int l = 0; l < 100; l++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //i++;
//            do {
//                int k = i;
//                int j = k + 1;
//            }while()
        }

//        AtomicInteger
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(V1::increment);
        t1.start();
        Thread t2 = new Thread(V1::increment);
        t2.start();

        t1.join();
        t2.join();
        System.out.println(i);
    }
}
