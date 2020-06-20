package com.rickjinny.answer;

/**
 * 27、移除元素
 * 给你一个数组 nums 和一个值 value，你需要原地移除所有数值等于 val 的元素，并且返回移除后数组的新长度。
 * 示例: nums = [3, 2, 2, 3], val = 3
 *      返回新的长度为 2, 并且 nums 中的前两个元素均为 2
 */
public class T003_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
