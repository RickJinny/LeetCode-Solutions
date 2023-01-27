package com.rickjinny.leetcode_multithread;

import java.util.function.IntConsumer;

/**
 * 1116、打印零与奇偶数
 * 现有函数 printNumber 可以用一个整数参数调用，并输出该整数到控制台。
 * 例如，调用 printNumber(7) 将会输出 7 到控制台。
 *
 * 给你类 ZeroEvenOdd 的一个实例，该类中有三个函数：zero、even 和 odd。ZeroEvenOdd 的相同实例将会传递给三个不同线程:
 * (1) 线程A: 调用 zero()，只输出 0。
 * (2) 线程B: 调用 even()，只输出偶数。
 * (3) 线程C: 调用 odd()，只输出奇数。
 * 修改给出的类，以输出序列 "010203040506..."，其中序列的长度必须为 2n。
 *
 * 实现 ZeroEvenOdd 类：
 * (1) ZeroEvenOdd(int n) 用数字 n 初始化对象，表示需要输出的数。
 * (2) void zero(printNumber) 调用 printNumber 以输出一个 0。
 * (3) void even(printNumber) 调用 printNumber 以输出偶数。
 * (4) void odd(printNumber) 调用 printNumber 以输出奇数。
 *
 *
 * 示例1:
 * 输入: n = 2
 * 输出: "0102"
 * 解释: 三条线程异步执行，其中一个调用 zero()，另一个线程调用 even()，最后一个线程调用 odd()，正确的输出为 "0102"
 *
 * 示例2:
 * 输入: n = 5
 * 输出: "0102030405"
 *
 * 提示: 1 <= n <= 1000
 */
public class T1116_print_zero_even_odd {

    private int n;

    public T1116_print_zero_even_odd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

    }

    public void even(IntConsumer printNumber) throws InterruptedException {

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

    }

}
