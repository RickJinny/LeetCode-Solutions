package com.rickjinny.leetcode;

/**
 * 485、最大连续 1 的个数
 * 给定一个二进制数组，计算其中最大连续 1 的个数。
 *
 * 示例:
 * 输入: [1, 1, 0, 1, 1, 1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位数都是连续 1 , 所以最大连续 1 的个数是 3。
 *
 * 提示:
 * (1)、输入的数组只包含 0 和 1
 * (2)、输入数组的长度是正整数，且不超过 10,000。
 */
public class T0485_max_consecutive_ones {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
