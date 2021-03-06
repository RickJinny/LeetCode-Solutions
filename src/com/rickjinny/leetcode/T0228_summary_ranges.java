package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 228、汇总区间
 * 给定一个无重复元素的有序整数数组 nums。
 * 返回恰好覆盖数组中所有数字 的 最小有序区间范围列表。也就是说: nums 的每个元素恰好被某个区间
 * 范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x。
 * 列表中的每个区间范围 [a, b] 应该按如下格式输出:
 *  "a->b"，如果 a != b
 *  "a"，如果 a == b
 */
public class T0228_summary_ranges {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums == null || nums.length < 1) {
            return ans;
        }

        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (i == n - 1) {
                ans.add(String.valueOf(nums[i++]));
            } else {
                int start = nums[i];
                int end = nums[i++];
                while (i < n && nums[i] == end + 1) {
                    i++;
                    end++;
                }
                String item = start == end ? String.valueOf(start) : start + "->" + end;
                ans.add(item);
            }
        }
        return ans;
    }
}
