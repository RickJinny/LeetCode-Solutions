package com.rickjinny.leetcode_multithread;

/**
 * 1114、按序打印
 * 给你一个类：
 */
public class T1114_print_in_order {

    class Foo {

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            // printFirst.run() outputs "second". Do not change or remove this line.
            printSecond.run();
        }

        public void third(Runnable printThird) throws InterruptedException {
            // printFirst.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

}
