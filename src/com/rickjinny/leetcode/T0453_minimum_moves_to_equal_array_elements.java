package com.rickjinny.leetcode;

/**
 * 453、最小操作次数使数组元素相等
 * 给定一个长度为 n 的非空整数数组，每次操作将会使 n-1 个元素增加1。
 * 找出让数组所有元素相等的最小操作次数。
 *
 * 示例:
 * 输入: [1, 2, 3]
 * 输出: 3
 * 解释: 只需要 3 次操作（注意每次操作会增加两个元素的值）
 * [1, 2, 3] => [2, 3, 3] => [3, 4, 3] => [4, 4, 4]
 */
public class T0453_minimum_moves_to_equal_array_elements {

    public int minMoves(int[] nums) {
        int min = 0;
        int max = nums.length - 1;
        int count = 0;

        while (true) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[max] < nums[i]) {
                    max = i;
                }

                if (nums[min] > nums[i]) {
                    min = i;
                }
            }

            if (nums[max] == nums[min]) {
                break;
            }

            for (int i = 0; i < nums.length; i++) {
                if (i != max) {
                    nums[i]++;
                }
            }

            count++;
        }
        return count;
    }

}
