package com.rickjinny.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 645、错误的集合
 * 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，
 * 导致集合 丢失了一个数字 并且 有一个数字重复。
 * 给定一个数组 nums 代表了集合 s 发生错误后的结果。
 * 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 示例1:
 * 输入: nums = [1, 2, 2, 4]
 * 输出: [2, 3]
 *
 * 示例2:
 * 输入: nums = [1, 1]
 * 输出: [1, 2]
 *
 */
public class T0645_set_mismatch {

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        Map<String, Integer> map = new HashMap<>(16);
        for (int num : nums) {
            String key = String.valueOf(num);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int[] result = new int[2];
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                int num = Integer.parseInt(entry.getKey());
                result[0] = num;
                if (num == 1) {
                    result[1] = num + 1;
                    return result;
                }
                int beforeNum = num - 1;
                Integer beforeSize = map.getOrDefault(String.valueOf(beforeNum), null);
                if (beforeSize == null) {
                    result[1] = num - 1;
                } else {
                    result[1] = num + 1;
                }
            }
        }

        return result;
    }

    /**
     * 正确解法
     */
    public static int[] findErrorNums2(int[] nums) {
        int[] errorNums = new int[2];
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            int count = map.getOrDefault(i, 0);
            if (count == 2) {
                errorNums[0] = i;
            } else if (count == 0) {
                errorNums[1] = i;
            }
        }
        return errorNums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2};
        int[] errorNums = findErrorNums2(nums);
        System.out.println(Arrays.toString(errorNums));
    }
}
