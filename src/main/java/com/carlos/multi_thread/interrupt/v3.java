package com.carlos.multi_thread.interrupt;

import java.util.concurrent.TimeUnit;

public class v3 {


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    //判断当前线程是否被中断
                    if (Thread.interrupted()) {
                        System.out.println("线程中断");
                        break;
                    }
                }

                System.out.println("已跳出循环,线程中断!");
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        t1.interrupt();

        TimeUnit.SECONDS.sleep(2);
        System.out.println(t1.isInterrupted());

        /**
         * 输出结果:
         线程中断
         已跳出循环,线程中断!
         */
    }
}
