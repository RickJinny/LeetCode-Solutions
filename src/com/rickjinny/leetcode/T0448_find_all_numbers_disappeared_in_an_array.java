package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 448、找到所有数组中消失的数字
 * 给定一个范围在 1 <= a[i] <= n（n = 数组大小）的整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * 您能在不使用额外空间且时间复杂度为 O(n) 的情况下，完成这个任务吗？你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * 输入: [4, 3, 2, 7, 8, 2, 3, 1]
 * 输出: [5, 6]
 */
public class T0448_find_all_numbers_disappeared_in_an_array {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
    
}
