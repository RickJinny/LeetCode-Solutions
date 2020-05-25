package com.rickjinny.code;

/**
 * 11、Container With Most Water
 * 题意：数组下标代表横坐标，数组中的值代表纵坐标，求最大面积
 * 分类：Array, Two Pointers
 * Tips：复杂度可以为 O(N), 指针往里走, 若值也小了，则面积一定不会增大。
 */
public class T011 {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while (left < right) {
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
