package com.rickjinny.leetcode;

/**
 * 125、验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明: 本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例1:
 * 输入: "A man, a plan, a cancel: Panama"
 * 输出: true
 *
 * 示例2:
 * 输入: "race a car"
 * 输出：false
 */
public class T0125_valid_palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        s = s.toLowerCase();
        int length = s.length();
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c < '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a cancel: Panama");
        System.out.println(palindrome);
    }
}
