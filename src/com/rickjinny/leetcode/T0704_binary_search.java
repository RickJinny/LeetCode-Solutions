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

    /**
     * 方法一
     */
    public static int search01(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(8);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        Integer result = map.getOrDefault(target, null);
        if (result == null) {
            return -1;
        }
        return result;
    }

    /**
     * 方法二
     */
    public static int search02(int[] nums, int target) {
        return getBack(nums, 0, nums.length - 1, target);
    }

    public static int getBack(int[] nums, int left, int right, int key) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == key) {
            return mid;
        } else if (nums[mid] > key) {
            return getBack(nums, left, mid - 1, key);
        } else {
            return getBack(nums, mid + 1, right, key);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result01 = search01(nums, target);
        System.out.println("方法一: " + result01);

        int result02 = search02(nums, target);
        System.out.println("方法二: " + result02);
    }

}
