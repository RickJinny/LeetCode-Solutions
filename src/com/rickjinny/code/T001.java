package com.rickjinny.code;

import java.util.HashMap;
import java.util.Map;

/**
 * 1、Two Sum
 * 题意：返回数组中和为给定数的下标
 * 分类：Array, HashTable
 * 算法：题目说明了数组中一定有解，且解唯一，所以用哈希表记录已遍历的元素即可。
 */
public class T001 {

    public static int[] twoSum(int[] nums, int target) {
        // 定义一个 Map 集合
        Map<Integer, Integer> map = new HashMap<>();
        // 定义一个数组
        int[] result = new int[2];
        // 遍历 nums 数组，将 (nums[i], i) 添加到 map 中
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // 遍历 nums 数组
        for (int i = 0; i < nums.length; i++) {
            // 将目标值 - 第 i 元素的值
            int temp = target - nums[i];
            // 如果map中的键, 包含temp; 并且temp键对应的值不等于i
            if (map.containsKey(temp) && map.get(temp) != i) {
                result[0] = i;
                result[1] = map.get(temp);
                break;
            }
        }
        return result;
    }
}
