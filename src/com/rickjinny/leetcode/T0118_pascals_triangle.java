package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 118、杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */
public class T0118_pascals_triangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // 第一个位置和最后一个位置的元素为1
                if (j == 0 || j == i) {
                    subList.add(1);
                } else {
                    // 上一行的元素进行相加
                    subList.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(i));
                }
            }
            result.add(subList);
        }
        return result;
    }
}
