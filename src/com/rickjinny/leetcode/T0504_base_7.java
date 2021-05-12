package com.rickjinny.leetcode;

/**
 * 504、七进制数
 * 给定一个整数，将其转化为 7 进制，并以字符串形式输出。
 *
 * 示例1:
 * 输入: 100
 * 输出: "202"
 *
 * 示例2:
 * 输入: -7
 * 输出: "-10"
 *
 * 注意: 输入范围是 [-1e7, 1e7]
 *
 */
public class T0504_base_7 {

    public String convertToBase(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) {
            return "0";
        }

        boolean flag = num < 0;
        num = Math.abs(num);
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (flag) {
            sb.append("-");
        }

        return sb.reverse().toString();
    }
}
