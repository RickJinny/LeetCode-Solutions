package com.rickjinny.leetcode;

/**
 * 204、计数质数: 统计所有小于非负数 n 的质数的数量。
 *
 * 示例1:
 * 输入: n = 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个，它们是 2, 3, 5, 7
 *
 * 示例2:
 * 输入: n = 0
 * 输出: 0
 *
 * 示例3:
 * 输入: n = 1
 * 输出: 0
 *
 * 提示: 0 <= n <= 5 * 10 ^ 6
 *
 */
public class T0204_count_primes {

    public int countPrimes(int n) {
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }
    
    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
