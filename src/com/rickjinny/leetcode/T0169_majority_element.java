package com.rickjinny.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 169、多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 n/2 的元素。
 * 你可以假定数组是非空的，并且给定的数组总数存在多数元素。
 *
 * 示例1:
 * 输入: [3, 2, 3]
 * 输出: 3
 *
 * 示例2:
 * 输入: [2, 2, 1, 1, 1, 2, 2]
 * 输出: 2
 */
public class T0169_majority_element {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }

    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }
}
