package com.rickjinny.code;

import java.util.HashMap;
import java.util.Map;

/**
 * 1、Two Sum
 * 题意：返回数组中和为给定数的下标
 * 难度：Easy
 * 分类：Array, HashTable
 * 算法：题目说明了数组中一定有解，且解唯一，所以用哈希表记录已遍历的元素即可。
 */
public class T01 {

    public static int[] twoSum(int[] nums, int target) {
        // 定义一个 Map 集合
        Map<Integer, Integer> map = new HashMap<>();
        // 定义一个数组
        int[] result = new int[2];
        // 遍历 nums 数组
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            map.put(target - nums[i], i);
        }
        return result;
    }
}
