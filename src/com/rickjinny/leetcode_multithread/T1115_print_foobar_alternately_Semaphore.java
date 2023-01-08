package com.rickjinny.leetcode_multithread;

import java.util.concurrent.Semaphore;

/**
 * 1115、交替打印 FooBar
 * 给你一个类:
 *    class FooBar {
 *        public void foo() {
 *            for (int i = 0; i < n; i++) {
 *               print("foo");
 *           }
 *        }
 *
 *        public void bar() {
 *            for (int i = 0; i < n; i++) {
 *                print("bar");
 *            }
 *        }
 *    }
 *
 *  两个不同的线程将会共用一个 FooBar 实例:
 *  (1)、线程 A 将会调用 foo() 方法
 *  (2)、线程 B 将会调用 bar() 方法
 *
 *  请设计修改程序，以确保 "foobar" 被输出 n 次。
 *
 *  示例1:
 *    输入: n = 1
 *    输出: "foobar"
 *    解释: 这里有两个线程被异步启动。其中一个调用 foo() 方法，另一个调用 bar() 方法，"foobar"将被输出一次。
 *
 *  示例2:
 *    输入: n = 2
 *    输出: "foobarfoobar"
 *    解释: "foobar" 将被输出两次。
 *
 *  提示: 1 <= n <= 1000
 *
 *
 *
 *  方法1：使用 Semaphore
 *  (1) Semaphore 是一个计数信号器。
 *  (2) 从概念上 Semaphore 包含一组许可证。
 *  (3) 如果有需要的话，每个 acquire() 方法都会阻塞，直到获取一个可用的许可证。
 *  (4) 每个 release() 方法都会释放持有许可证的线程，并且归还 Semaphore 一个可用的许可证。
 *  (5) 然而，实际上并没有真实的许可证对象供线程使用，Semaphore 只是对可用的数量进行管理维护。
 *  (6) 总结：如果线程要访问一个资源就必须先获得信号量。如果信号量内部计数器大于0，信号量减1，然后允许共享这个资源；
 *           否则如果信号量的计数器等于0，信号量将会把线程置入休眠直至计数器大于0，当信号量使用完时，必须释放。
 *
 */
public class T1115_print_foobar_alternately_Semaphore {

    private int n;

    private Semaphore fooSema = new Semaphore(1);
    private Semaphore barSema = new Semaphore(0);

    public T1115_print_foobar_alternately_Semaphore(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // 值为1的时候，能拿到，执行下面的操作
            fooSema.acquire();
            printFoo.run();
            // 释放许可给 barSema 这个信号量 barSema 的值 + 1
            barSema.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // 值为1的时候，能拿到，执行下面的操作
            barSema.acquire();
            printBar.run();
            // 释放许可给 fooSema 这个信号量 fooSema 的值 + 1
            fooSema.release();
        }
    }

    public static void main(String[] args) {
        T1115_print_foobar_alternately_Semaphore foobar = new T1115_print_foobar_alternately_Semaphore(2);

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
