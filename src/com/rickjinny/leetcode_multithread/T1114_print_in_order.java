package com.rickjinny.leetcode_multithread;

import java.util.concurrent.CountDownLatch;

/**
 * 1114、按序打印
 * 方法一: CountDownLatch (减法计数器)
 */
public class T1114_print_in_order {

    static class Foo {
        CountDownLatch countDownLatch12;
        CountDownLatch countDownLatch23;

        public Foo() {
            countDownLatch12 = new CountDownLatch(1);
            countDownLatch23 = new CountDownLatch(1);
        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            // 唤醒线程2
            countDownLatch12.countDown();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            // printFirst.run() outputs "second". Do not change or remove this line.

            // latch12 的值为 0 会执行下面的语句，否则会在此阻塞
            countDownLatch12.await();
            printSecond.run();
            // 唤醒线程3
            countDownLatch23.countDown();
        }

        public void third(Runnable printThird) throws InterruptedException {
            // printFirst.run() outputs "third". Do not change or remove this line.
            // latch23 的值为 0 会执行下面的语句，否则会在此阻塞
            countDownLatch23.await();
            printThird.run();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        foo.first(() -> System.out.println("first "));
        foo.second(() -> System.out.println("second "));
        foo.third(() -> System.out.println("third "));
    }

}
