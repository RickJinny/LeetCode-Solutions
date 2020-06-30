package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 34、在排序数组中查找元素的第一个和最后一个位置。
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 *
 * 示例 2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 *
 */
public class T0034_find_first_and_last_position_of_element_in_sorted_array {

    public static int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        if (list.isEmpty() || list.size() == 1) {
            return new int[]{-1, -1};
        }
        return new int[]{list.get(0), list.get(list.size() - 1)};
    }
}
