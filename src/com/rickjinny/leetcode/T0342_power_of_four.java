package com.rickjinny.leetcode;

/**
 * 342、4的幂
 * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true; 否则，返回 false。
 * 整数 n 是 4 的幂次方需满足: 存在整数 x, 使得 n == 4^x。
 *
 * 示例1:
 * 输入: n = 16
 * 输出: true
 *
 * 示例2:
 * 输入: n = 5
 * 输出: false
 *
 * 示例3:
 * 输入: n = 1
 * 输出: true
 *
 * 提示: -2^31 <= n <= 2^31 - 1
 *
 * 进阶: 你能不使用循环或者递归来完成本题吗？
 */
public class T0342_power_of_four {

    public boolean isPowerOfFour(int num) {
        // 解法1: 判断最低位的 1
        if (num < 1 || (num & (num - 1)) != 0) {
            return false;
        } else {
            for (int i = 0; i < 32; ++i) {
                if ((num >> i & 1) == 1) {
                    return i % 2 == 0;
                }
            }
        }
        return false;
    }
}
