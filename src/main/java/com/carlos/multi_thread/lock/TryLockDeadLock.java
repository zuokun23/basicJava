package com.carlos.multi_thread.lock;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDeadLock {

    int flag = 1;
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void run1(){
        for (int i = 0; i < 100 ; i++) {
            try {
                if(lock1.tryLock(800, TimeUnit.MILLISECONDS)){
                    try{
                        System.out.println("线程1获取到了锁1");
                        Thread.sleep(new Random().nextInt(1000));

                        if(lock2.tryLock(800, TimeUnit.MILLISECONDS)){
                            try{
                                System.out.println("线程1获取两把锁");
                                //不再循环
                                break;
                            }finally {
                                lock2.unlock();
                            }
                        }else{
                            System.out.println("线程1获取锁2失败，以及重试");
                        }
                    }finally {
                        lock1.unlock();
                        Thread.sleep(new Random().nextInt(1000));
                    }
                }else{
                    System.out.println("线程1获取锁1失败，已重试");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void run2(){
        for (int i = 0; i < 100 ; i++) {
            try {
                if(lock2.tryLock(800, TimeUnit.MILLISECONDS)){
                    try{
                        System.out.println("线程2获取到了锁2");
                        Thread.sleep(new Random().nextInt(1000));

                        if(lock1.tryLock(800, TimeUnit.MILLISECONDS)){
                            try{
                                System.out.println("线程2获取两把锁");
                                //不再循环
                                break;
                            }finally {
                                lock1.unlock();
                            }
                        }else{
                            System.out.println("线程2获取锁1失败，已重试");
                        }
                    }finally {
                        lock2.unlock();
                        Thread.sleep(new Random().nextInt(1000));
                    }
                }else{
                    System.out.println("线程2获取锁2失败，已重试");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        new Thread(TryLockDeadLock::run1).start();
        new Thread(TryLockDeadLock::run2).start();
    }
}
