package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 414、第三大的数
 * 给你一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。
 * <p>
 * 示例1:
 * 输入: [3, 2, 1]
 * 输出: 1
 * 解释: 第三大的数是 1。
 * <p>
 * 示例2:
 * 输入: [1, 2]
 * 输出: 2
 * 解释: 第三大的数不存在，所以返回最大的数 2。
 * <p>
 * 示例3:
 * 输入: [2, 2, 3, 1]
 * 输出: 1
 * 解释: 注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
 * <p>
 * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1。
 * <p>
 * 提示:
 * 1 <= nums.length <= 10^4
 * -2^31 <= num[i] <= 2^31 - 1
 * <p>
 * 进阶: 你能设计一个时间复杂度 O(n) 的解决方案吗？
 */
public class T0414_third_maximum_number {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();

        for (int i : nums) {
            if (ans.contains(i)) {
                continue;
            }
            ans.add(i);
        }

        int n = ans.size();
        if (n == 1 || n == 2) {
            return ans.get(n - 1);
        }
        return ans.get(ans.size() - 3);
    }
}
