package com.rickjinny.leetcode;

/**
 * 371、两整数之后
 * 不使用运算符 + 和 -，计算两整数 a、b 之和。
 *
 * 示例1:
 * 输入: a = 1, b = 2
 * 输出: 3
 *
 * 示例2:
 * 输入: a = -2, b = 3
 * 输出: 1
 */
public class T0371_sum_of_two_integers {

    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;



    }
}
