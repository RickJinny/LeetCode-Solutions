package com.rickjinny.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 704、二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和 一个目标值 target，写一个函数搜索 nums 中的 target，
 * 如果目标值存在返回下标，否则返回 -1。
 * <p>
 * 示例1:
 * 输入: nums = [-1, 0, 3, 5, 9, 12], target = 9
 * 输出: 4
 * 解释: 出现在 nums 中并且下标为 4
 * <p>
 * 示例2:
 * 输入: nums = [-1, 0, 3, 5, 9, 12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中，因此返回 -1
 * <p>
 * 提示:
 * 1、你可以假设 nums 中的所有元素是不重复的。
 * 2、n 将在 [1, 10000] 之间。
 * 3、nums 的每个元素都将在 [-9999, 9999] 之间。
 */
public class T0704_binary_search {

    public static int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Integer result = map.getOrDefault(target, null);
        if (result == null) {
            return -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = search(nums, target);
        System.out.println(result);
    }

}
