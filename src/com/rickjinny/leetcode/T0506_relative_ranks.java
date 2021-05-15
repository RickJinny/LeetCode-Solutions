package com.rickjinny.leetcode;

import java.util.Arrays;

/**
 * 506、相对名次
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予
 * "金牌"、"银牌"、"铜牌"（"Gold Medal", "Silver Medal", "Bronze Medal"）.
 * (注：分数越高的选手，排名越靠前)
 *
 * 示例1:
 * 输入: [5, 4, 3, 2, 1]
 * 输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * 解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 "金牌"、"银牌" 和 "铜牌"
 * ("Gold Medal", "Silver Medal" and "Bronze Medal").
 * 余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
 *
 * 提示:
 * 1、N 是一个正整数并且不会超过 10000.
 * 2、所有运动员的成绩都不相同。
 */
public class T0506_relative_ranks {

    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        // 拷贝数组
        System.arraycopy(nums, 0, array, 0, n);
        // 对数组进行排序
        Arrays.sort(array);
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            // 查找当前成绩排第几名
            int index = n - Arrays.binarySearch(array, nums[i]);
            switch (index) {
                case 1:
                    result[i] = "Gold Medal";
                    break;
                case 2:
                    result[i] = "Silver Medal";
                    break;
                case 3:
                    result[i] = "Bronze Medal";
                    break;
                default:
                    result[i] = String.valueOf(index);
            }
        }
        return result;
    }
}
