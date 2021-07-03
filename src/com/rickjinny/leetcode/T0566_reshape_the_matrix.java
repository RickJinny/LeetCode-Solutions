package com.rickjinny.leetcode;

/**
 * 566、重塑矩阵
 * 示例1:
 * 输入: nums = [[1,2], [3,4]]
 *      r = 1 , c = 4
 * 输出: [[1, 2, 3, 4]]
 * 解释: 行遍历 nums 的结果是 [1, 2, 3, 4]。新的矩阵是 1*4 矩阵，用之前的元素值一行一行填充新矩阵。
 *
 * 示例2:
 * 输入: nums = [[1, 2], [3, 4]]
 *      r = 2, c = 4
 * 输出: [[1, 2], [3, 4]]
 * 解释: 没有办法将 2*2 矩阵转化为 2*4 矩阵，所以输出原矩阵。
 */
public class T0566_reshape_the_matrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }

        int[][] ans = new int[r][c];
        for (int x = 0; x < m * n; ++x) {
            ans[x / c][x % c] = nums[x / n][x % n];
        }
        return ans;
    }
}
