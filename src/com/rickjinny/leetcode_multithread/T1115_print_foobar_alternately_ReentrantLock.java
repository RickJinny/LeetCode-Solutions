package com.rickjinny.leetcode_multithread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock 主要利用 CAS + AQS 队列来实现。它支持公平锁和非公平锁，两者的实现类似。
 */
public class T1115_print_foobar_alternately_ReentrantLock {

    private int n;

    private ReentrantLock lock = new ReentrantLock(true);

    volatile boolean fooExec = true;

    public T1115_print_foobar_alternately_ReentrantLock(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; ) {
            lock.lock();
            try {
                if (fooExec) {
                    printFoo.run();
                    fooExec = false;
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; ) {
            lock.lock();
            try {
                if (!fooExec) {
                    printBar.run();
                    fooExec = true;
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        T1115_print_foobar_alternately_ReentrantLock foobar = new T1115_print_foobar_alternately_ReentrantLock(2);

        Runnable runnable1 = () -> {
            try {
                foobar.foo(() -> System.out.print("foo"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable2 = () -> {
            try {
                foobar.bar(() -> System.out.print("bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }

}
