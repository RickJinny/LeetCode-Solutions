package com.rickjinny.leetcode;

/**
 * 367、有效的完全平方数
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 true，否则返回 false/
 * 说明：不要使用任何内置的库函数，如: sqrt。
 *
 * 示例1:
 * 输入: 16
 * 输出: True
 *
 * 示例2:
 * 输入: 14
 * 输出: False
 */
public class T0367_valid_perfect_square {

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2;
        long right = num / 2;
        long x;
        long guessSquared;
        while (left <= right) {
            x = left + (right - left) / 2;
            guessSquared = x * x;
            if (guessSquared == num) {
                return true;
            }
            if (guessSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
            }
        }
        return false;
    }
}
