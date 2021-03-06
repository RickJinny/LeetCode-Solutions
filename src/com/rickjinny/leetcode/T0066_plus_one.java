package com.rickjinny.leetcode;

/**
 * 66、加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位，数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以 0 开头。
 *
 * 示例1：
 * 输入：[1, 2, 3]
 * 输出：[1, 2, 4]
 * 解释：输入数组表示数字 123。
 *
 * 示例2：
 * 输入：[4, 3, 2, 1]
 * 输出：[4, 3, 2, 2]
 * 解释：输入数组表示数字 4321。
 */
public class T0066_plus_one {

    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        for (int i = len; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        // 如果所有位都是进位，则长度+1
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
