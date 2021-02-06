package com.rickjinny.leetcode;

import java.util.Arrays;

/**
 * 268、丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * 进阶: 你能否实现线性时间复杂度、仅使用额外常数空间的算法解决此问题?
 *
 * 示例1:
 * 输入: nums = [3, 0, 1]
 * 输出: 2
 * 解释: n = 3, 因为有 3 个数字，所以所有的数字都在范围 [0, 3] 内。2 是丢失的数字，因为它没有出现
 * 在 nums 中。
 *
 * 示例2:
 * 输入: nums = [0, 1]
 * 输出: 2
 * 解释: n = 2，因为有 2 个数字，所以所有的数字都在范围 [0, 2] 内。2 是丢失的数字，因为它没有出现内在
 * nums 中。
 *
 * 示例3:
 * 输入: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
 * 输出: 8
 * 解释: n = 9, 因为有 9 个数字，所以所有的数字都在范围 [0, 9] 内。8 是丢失的数字，因为它没有出现在
 *  nums 中。
 *
 * 示例4:
 * 输入: nums = [0]
 * 输出: 1
 * 解释: n = 1, 因为有 1 个数字，所以所有的数字都在范围 [0, 1] 内。1 是丢失的数字，因为它没有出现在
 * nums 中。
 *
 * 提示:
 * n == nums.length
 * 1 <= n <= 10^4
 * 0 <= nums[i] <= n
 * nums 中的所有数字都独一无二
 */
public class T0268_missing_number {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length - 1] != nums.length) { // 判断 n 是否出现在末尾
            return nums.length;
        } else if (nums[0] != 0) { // 判断 0 是否出现在首位
            return 0;
        }

        // 此时缺失的数字一定在 (0, n) 中
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int expectedNum = nums[i - 1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }

        // 未缺失任何数字（保证函数有返回值）
        return -1;
    }
}
