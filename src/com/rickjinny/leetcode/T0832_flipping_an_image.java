package com.rickjinny.leetcode;

/**
 * 832、翻转图像
 * 给定一个 n * n 的二进制矩阵 image，先水平翻转图像，然后水平翻转图像，然后 反转 图像并返回结果。
 *
 * 水平翻转图片 就是将图片的每一行都进行翻转，即逆序。例如：水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]
 * 反转图片的意思是 图片中的 0 全部被 1 替换，1 全部被 0 替换。例如：发转 [0, 1, 1] 的结果是 [1, 0, 0]
 *
 * 示例1:
 * 输入: image = [[1, 1, 0], [1, 0, 1], [0, 0, 0]]
 * 输出: [[1, 0, 0], [0, 1, 1], [1, 1, 1]]
 * 解释: 首先翻转每一行: [[0, 1, 1], [1, 0, 1], [0, 0, 0]]
 *      然后反转图片: [[1, 0, 0], [0, 1, 0], [1, 1, 1]]
 *
 * 提示:
 * (1)、n == image.length
 * (2)、n == image[i].length
 * (3)、1 <= n <= 20
 * (4)、images[i][j] == 0 或 1
 */
public class T0832_flipping_an_image {

    public int[][] flipAndInvertImage(int[][] image) {
        // 计算出 image 的长度
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                if (image[i][left] == image[i][right]) {
                    image[i][left] ^= 1;
                    image[i][right] ^= 1;
                }
                left++;
                right--;
            }

            if (left == right) {
                image[i][left] ^= 1;
            }
        }
        return image;
    }

}
