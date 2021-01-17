package com.rickjinny.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 219、存在重复元素II
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums[i] = nums[j]，
 * 并且 i 和 j 的差的绝对值至多为 k。
 *
 * 示例1:
 * 输入: nums = [1, 2, 3, 1], k = 3
 * 输出: true
 *
 * 示例2:
 * 输入: nums = [1, 0, 1, 1], k = 1
 * 输出: true
 *
 * 示例3:
 * 输入: nums = [1, 2, 3, 1, 2, 3], k = 2
 * 输出: false
 */
public class T0219_contains_duplicate_ii {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // set 集合
        Set<Integer> set = new HashSet<>();
        // 遍历 set 集合
        for (int i = 0; i < nums.length; i++) {
            // 如果 set 集合中，包含有 num[i] 值
            if (set.contains(nums[i])) {
                // 直接返回 true
                return true;
            }
            // 将 num[i] 值，添加到 set 中
            set.add(nums[i]);
            // 如果 set 的大小，大于 k，则删除元素 nums[i-k]
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
