package com.rickjinny.leetcode;

/**
 * 415、字符串相加
 * 给定两个字符串形式的非负整数 num1 和 num2，计算它们的和。
 *
 * 提示:
 * 1、num1 和 num2 的长度都小于 5100
 * 2、num1 和 num2 都只包含数字 0 ~ 9
 * 3、num1 和 num2 都不包含任何前导零
 * 4、你不能使用任何内建 BigInteger 库，也不能直接将输入的字符串转换为整数形式。
 */
public class T0415_add_strings {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }

            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
}
