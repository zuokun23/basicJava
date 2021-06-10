package com.carlos.multi_thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MustUnlock {

    private static Lock lock = new ReentrantLock();
    public static void main(String[] args) {

        lock.lock();
        try{
            //获取本锁保护的逻辑
            System.out.println(Thread.currentThread().getName() + "开始执行任务");
        }finally {
            lock.unlock();
        }
    }
}
