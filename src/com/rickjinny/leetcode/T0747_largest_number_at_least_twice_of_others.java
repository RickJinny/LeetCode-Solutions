package com.rickjinny.leetcode;

/**
 * 747、至少是其他数字两倍的最大数
 * 给你一个整数数组 nums，其中总是存在 唯一的 一个最大整数。
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍。如果是，则返回 最大元素的下标，否则返回 -1。
 *
 * 示例1:
 * 输入: nums = [3, 6, 1, 0]
 * 输出: 1
 * 解释: 6 是最大的整数，对于数组中的其他整数，6 至少是数组中其他元素的两倍。6 的下标是 1，所以返回 1。
 *
 * 示例2:
 * 输入: nums = [1, 2, 3, 4]
 * 输出: -1
 * 解释: 4 没有超过 3 的两倍大，所以返回 -1。
 *
 * 示例3:
 * 输入: nums = [1, 2, 3, 4]
 * 输出: 0
 * 解释: 因为不存在其他数字，所以认为现有数字 1 至少是其他数字的两倍。
 *
 * 提示:
 * (1)、1 <= nums.length <= 50
 * (2)、0 <= nums[i] <= 100
 * (3)、nums 中的最大元素是唯一的
 *
 */
public class T0747_largest_number_at_least_twice_of_others {

    public int domainIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }

        int a = -1;
        int b = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[b]) {
                a = b;
                b = i;
            } else if (a == -1 || nums[i] > nums[a]) {
                a = i;
            }
        }

        return nums[b] >= nums[a] * 2 ? b : -1;
    }

}
