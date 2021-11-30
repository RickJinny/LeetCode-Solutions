package com.rickjinny.leetcode;

/**
 * 697、数组的度
 * 给定一个非空且只包含非负数的整数数值 nums , 数组的度的定义是指数组里任一元素出现频数的最大值。
 * 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组, 返回其长度。
 *
 * 示例1:
 * 输入: [1, 2, 2, 3, 1]
 * 输出: 2
 * 解释: 输入数组的度是 2, 因为元素 1 和 2 的出现频数最大，均为 2.
 *      连续子数组里面拥有相同度的有如下所示:
 *      [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 *      最短连续子数组 [2, 2] 的长度为 2, 所以返回 2。
 *
 * 示例2:
 * 输入: [1, 2, 2, 3, 1, 4, 2]
 * 输出: 6
 *
 *
 * 提示: nums.length 在 1 到 50,000 区间范围内
 *      nums[i] 是一个在 0 到 49,999 范围内的整数
 *
 *
 */
public class T0697_degree_of_an_array {

    public int findShortestSubArray(int[] nums) {
        return 0;
    }
}
