package com.rickjinny.leetcode;

/**
 * 326、3的幂
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true; 否则，返回 false。
 * 整数 n 是 3 的幂次方需满足: 存在整数 x 使得 n == 3^x
 * <p>
 * 示例1:
 * 输入: n = 27
 * 输出: true
 * <p>
 * 示例2:
 * 输入: n = 0
 * 输出: false
 * <p>
 * 示例3:
 * 输入: n = 9
 * 输出: true
 * <p>
 * 示例4:
 * 输入: n = 45
 * 输出: false
 * <p>
 * 提示: -2^31 <= n <= 2^31 -1
 */
public class T0326_power_of_three {

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
