package com.rickjinny.leetcode;

/**
 * 628、三个数的最大乘积
 * 给你一个整型数组 nums, 在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * 示例1:
 * 输入: nums = [1, 2, 3]
 * 输出: 6
 *
 * 示例2:
 * 输入: nums = [1, 2, 3, 4]
 * 输出: 24
 *
 * 示例3:
 * 输入: nums = [-1, -2, -3]
 * 输出: -6
 *
 * 提示:
 *   3 <= nums.length <= 10^4
 *   -1000 <= num[i] <= 1000
 *
 */
public class T0628_maximum_product_of_three_numbers {

    public static int maximumProduct(int[] nums) {
        // 最小的 和 第二小的
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        // 最大的、第二大的 和 第三大的
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }

            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3};
        System.out.println(maximumProduct(nums));
    }
}
