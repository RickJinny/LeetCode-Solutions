package com.rickjinny.leetcode;

/**
 * 461、汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y, 计算他们之间的汉明距离。
 * 注意：0 <= x, y <= 2^31
 */
public class T0461_hamming_distance {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            distance += 1;
            xor = xor & (xor - 1);
        }
        return distance;
    }
}
