package com.rickjinny.leetcode;

/**
 * 680、验证回文字符串 II
 * 给定一个非空字符串 s, 最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例1:
 * 输入: s = "aba"
 * 输出: true
 *
 * 示例2:
 * 输入: s = "abca"
 * 输出: true
 * 解释: 你可以删除 c 字符
 *
 * 示例3:
 * 输入: s = "abc"
 * 输出: false
 *
 * 提示:
 * ① 1 <= s.length <=  10^5
 * ② s 由小写英文字母组成
 *
 */
public class T680_valid_palindrome_ii {

    //记录删除的字符次数
    int del = 0;

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                // 不相等的话，若没有删除字符，则删除左边或右边的字符再判断；若删除过一次，则不是回文串
                if (del == 0) {
                    del++;
                    return validPalindrome(s.substring(i, j)) || validPalindrome(s.substring(i + 1, j + 1));
                }
                return false;
            }
        }

        return true;
    }
}
