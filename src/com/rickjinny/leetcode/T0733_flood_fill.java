package com.rickjinny.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 733、图像渲染
 * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
 * 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值 (行, 列) 和 一个新的颜色值 newColor, 让你重新上色这幅图像。
 *
 * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这
 * 四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，......，重复该过程，将所有记录的
 * 像素点的颜色值改为新的颜色值。
 *
 * 最后返回经过上色渲染后的图像。
 *
 * 示例1:
 * 输入: image = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
 *      sr = 1, sc = 1, newColor = 2
 * 输出: [[2, 2, 2], [2, 2, 0], [2, 0, 1]]
 * 解释: 在图像的正中间，(坐标(sr, sc) = (1, 1))，在路径上所有符合条件的像素点的颜色都被更改成 2。
 *      注意，右下角的像素没有更改为 2。因为它不是在上下左右四个方向上与初始点相连的像素点。
 *
 * 注意点:
 * (1)、image 和 image[0] 的长度在范围 [1, 50] 内。
 * (2)、给出的初始点将满足 0 <= sr <= image.length 和 0 <= sc < image[0].length。
 * (3)、image[i][j] 和 newColor 表示的颜色值在范围 [0, 65535] 内。
 *
 */
public class T0733_flood_fill {

    int[] dx = {1, 0, 0, -1};
    int[] dy = {0, 1, -1, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int currColor = image[sr][sc];
        if (currColor == newColor) {
            return image;
        }

        int n = image.length;
        int m = image[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i];
                int my = y + dy[i];
                if (mx >= 0 && mx < n && my < m && image[mx][my] == currColor) {
                    queue.offer(new int[]{mx, my});
                    image[mx][my] = newColor;
                }
            }
        }
        return image;
    }
    
}
