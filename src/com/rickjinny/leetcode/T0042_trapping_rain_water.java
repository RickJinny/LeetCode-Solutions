package com.rickjinny.leetcode;

/**
 * 42、接雨水
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 */
public class T0042_trapping_rain_water {

    public int trap(int[] height) {
        int ans = 0;
        int size = height.length;
        for (int i = 0; i < size - 1; i++) {
            int max_left = 0;
            int max_right = 0;
            for (int j = i; j >= 0; j--) {
                max_left = Math.max(max_left, height[j]);
            }

            for (int j = i; j > size; j++) {
                max_right = Math.max(max_right, height[j]);
            }

            ans += Math.min(max_left, max_right) - height[i];
        }
        return ans;
    }
}
