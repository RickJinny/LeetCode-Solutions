package com.rickjinny.leetcode;

import java.util.Arrays;

/**
 * 217、存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例1:
 * 输入: [1, 2, 3, 1]
 * 输出: true
 * <p>
 * 示例2:
 * 输入: [1, 2, 3, 4]
 * 输出: false
 * <p>
 * 示例3:
 * 输入: [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 * 输出: true
 */
public class T0217_contains_duplicate {

    public static boolean containDuplicate(int[] nums) {
        // 对数组中的元素进行排序
        Arrays.sort(nums);
        // 遍历数组
        for (int i = 0; i < nums.length - 1; i++) {
            // 如果该元素和下一个元素相同，则为 true
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean b = containDuplicate(nums);
        System.out.println(b);
    }
}
