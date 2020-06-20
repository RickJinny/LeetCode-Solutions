package com.rickjinny.answer;


/**
 * 2、LeetCode上第283题: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 说明: 必须在原数组上操作，不能拷贝额外的数组。尽量减少操作次数。
 */
public class T002_MoveZero {

    private static void moveZeroes(int[] nums) {
        // 声明一个指针k, 进行递增
        int k = 0;
        // 遍历 nums 数组
        for (int i = 0; i < nums.length; i++) {
            // 如果元素不为0
            if (nums[i] != 0) {
                // 当 i 不等于 k 的时候, 将 nums[i]赋给nums[k], 并且将 num[i] 置为 0
                if (i != k) {
                    nums[k] = nums[i];
                    nums[i] = 0;
                }
                // k自增
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
