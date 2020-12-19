package com.rickjinny.leetcode;

/**
 * 172、阶乘后的零
 * 给定一个整数 n, 返回 n! 结果尾数中零的数量。
 * <p>
 * 示例1:
 * 输入：3
 * 输出：0
 * 解释：3! = 6，尾部中没有零。
 * <p>
 * 示例2:
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零。
 * <p>
 * 说明: 算法的时间复杂度应为 O(log n)。
 */
public class T0172_factorial_trailing_zeroes {

    public static int trailingZeroes(int n) {
        if (n == 0) {
            return 0;
        }

        // 能除开 5 都算
        int fiveTimes = 0;
        // 能除开 2 都算
        int twoTimes = 0;
        // 因为只有 5 和 2 相乘才可以是 10。于是计算 n 中 5 的个数，要注意比如 25 其实是有两个 5
        while (n >= 5) {
            fiveTimes += n / 5;
            n = n / 5;
        }
        return fiveTimes;
    }

    public static void main(String[] args) {
        int sum = trailingZeroes(5);
        System.out.println(sum);
    }
}
