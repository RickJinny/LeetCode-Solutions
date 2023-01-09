package com.rickjinny.leetcode_multithread;

import java.util.concurrent.CyclicBarrier;

public class T1115_print_foobar_alternately_CyclicBarrier {

    private int n;

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    volatile boolean fooExec = true;

    public T1115_print_foobar_alternately_CyclicBarrier(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) {
        for (int i = 0; i < n; i++) {
            while (!fooExec) {
                // false 的时候，bar 线程在执行，foo线程在这此处空转
            }

            // 打印 foo
            printFoo.run();
            // 设置变量
            fooExec = false;
            try {
                // 线程 foo 到达同步点
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void bar(Runnable printBar) {
        for (int i = 0; i < n; i++) {
            try {
                cyclicBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // 打印10次foobar
        T1115_print_foobar_alternately_CyclicBarrier foobar = new T1115_print_foobar_alternately_CyclicBarrier(10);
        Runnable printFoo = () -> {
            System.out.printf("%s\n", "foo");
        };
        Runnable printBar = () -> {
            System.out.printf("%s\n", "bar");
        };

        Thread fooThread = new Thread(() -> {
            try {
                foobar.foo(printFoo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread barThread = new Thread(() -> {
            try {
                foobar.bar(printBar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        fooThread.start();
        barThread.start();
    }
}
