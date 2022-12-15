package com.rickjinny.leetcode_multithread;

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
 */
public class T1115_print_foobar_alternately {

    private int n;

    public T1115_print_foobar_alternately(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            printFoo.run();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            printBar.run();
        }
    }
}
