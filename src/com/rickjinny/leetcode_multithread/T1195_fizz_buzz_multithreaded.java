package com.rickjinny.leetcode_multithread;

import java.util.function.IntConsumer;

/**
 * 1195、交替打印字符串
 * 编写一个可以从 1 到 n 输出代表这个数字的字符串的程序，但是：
 * (1) 如果这个数字可以被 3 整除，输出 "fizz"。
 * (2) 如果这个数字可以被 5 整除，输出 "buzz"。
 * (3) 如果这个数字可以同时被 3 和 5 整除，输出 "fizzbuzz"。
 * 例如：当 n = 15，输出 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz。
 * 假设有这么一个类：
 *      class FizzBuzz {
 *          public FizzBuzz(int n) {...}       // constructor
 *          public void fizz(printFizz) {...}  // only output "fizz"
 *          public void buzz(printBuzz) {...}  // only output "buzz"
 *          public void fizzbuzz(printFizzBuzz) {...} // only output "fizzbuzz"
 *          public void number(printNumber) {...} // only output the numbers
 *      }
 *
 *  请你实现一个有四个线程的多线程版本 FizzBuzz，同一个 FizzBuzz 实例会被如下四个线程使用:
 *  (1) 线程 A 调用 fizz() 来判断是否能被 3 整除，如果可以，则输出 fizz。
 *  (2) 线程 B 调用 buzz() 来判断是否能被 5 整除，如果可以，则输出 buzz。
 *  (3) 线程 C 调用 fizzbuzz() 来判断是否同时被 3 和 5 整除，如果可以，则输出 fizzbuzz。
 *  (4) 线程 D 调用 number() 来实现输出既不能被 3 整除也不能被 5 整除的数字。
 *
 */
public class T1195_fizz_buzz_multithreaded {

    private int n;

    public T1195_fizz_buzz_multithreaded(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {

    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {

    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {

    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {

    }

}
