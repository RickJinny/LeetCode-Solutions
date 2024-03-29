package com.rickjinny.leetcode;

/**
 * 762、二进制表示中质数个计算置位
 * 给定两个整数 L 和 R，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
 * （注意: 计算置位代表二进制表示中 1 的个数。例如: 21 的二进制表示 10101 有 3 个计算置位。还有 1 不是质数。）
 *
 * 示例1:
 * 输入: L = 6, R = 10
 * 输出: 4
 * 解释:
 * 6 -> 110（2个计算置位, 2是质数）
 * 7 -> 111（3个计算置位，3是质数）
 * 9 -> 1001（2个计算置位，2是质数）
 * 10 -> 1010（2个计算置位，2是质数）
 *
 * 示例2:
 * 输入: L = 10, R = 15
 * 输出: 5
 * 解释:
 * 10 -> 1010（2个计算置位，2 是质数）
 * 11 -> 1011（3个计算置位，3 是质数）
 * 12 -> 1100（2个计算置位，2 是质数）
 * 13 -> 1101（3个计算置位，3 是质数）
 * 14 -> 1110（3个计算置位，3 是质数）
 * 15 -> 1111（4个计算置位，4 不是质数）
 *
 * 注意:
 * (1)、L, R 是 L <= R 且在 [1, 10^6] 中的整数。
 * (2)、R - L 的最大值为 10000。
 *
 */
public class T0762_prime_number_of_set_bits_in_binary_representation {

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; ++i) {
            if (isSmallPrime(Integer.bitCount(i))) {
                ans++;
            }
        }
        return ans;
    }

    private boolean isSmallPrime(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7 || n == 11 || n == 13 || n == 17 || n == 19;
    }

}
