package com.rickjinny.other;

/**
 * 4.给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径（每次只能向下或者向右移动一步），
 * 使得路径上的数字总和为最小。
 * 示例:
 * 输入:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 **/
public class T04_MinPathSum {

    public static int minPathSum(int[][] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 起始位置为传入数组 arr 起始位置值
                if (i == 0 && j == 0) {
                    res[i][j] = arr[i][j];
                } else if (i == 0) {
                    // 第 0 行，每一列的值为前一列值(res数组)加上当前列的值(arr数组)
                    res[i][j] = res[i][j - 1] + arr[i][j];
                } else if (j == 0) {
                    // 第 0 列，每一行的值为前一行值(res数组)加上当前行的值(arr数组)
                    res[i][j] = res[i - 1][j] + arr[i][j];
                } else {
                    // 该位置的值为该位置(res[i][j])的左边和上边值的最小值 加上当前位置的值(arr数组)
                    res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + arr[i][j];
                }
            }
        }
        return res[m - 1][n - 1];
    }
}
