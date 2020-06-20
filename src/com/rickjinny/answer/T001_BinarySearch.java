package com.rickjinny.answer;

/**
 * 1、二分查找：从有序的数组中，查找元素
 */
public class T001_BinarySearch {

    public int binarySearch(int[] arr, int target) {
        // 定义 [left, right], 在此范围内寻找 target
        int left = 0;
        int right = arr.length - 1;
        // 当 left == right 时, 区间 [left ... right] 依然是有效的
        while (left <= right) {
            int mid = (left + right) / 2;
            // 如果 target 等于 中间值 arr[mid] 的话, 那么就直接返回
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                // 如果 target 要比中间值大的话，那么就在 [mid + 1, right] 中寻找 target
                left = mid + 1;
            } else { // arr[mid] > target
                // 如果 target 要比中间值小的话，那么就在 [left, mid -1]
                right = mid - 1;
            }
        }
        // 没有的话，直接返回 -1
        return -1;
    }
}
