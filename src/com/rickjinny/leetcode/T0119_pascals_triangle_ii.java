package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 119、杨辉三角 II
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 示例：
 * 输入：3
 * 输出：[1, 3, 3, 1]
 */
public class T0119_pascals_triangle_ii {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long cur = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) cur);
            cur = cur * (rowIndex - i) / (i + 1);
        }
        return res;
    }
}
