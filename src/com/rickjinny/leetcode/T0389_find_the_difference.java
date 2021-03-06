package com.rickjinny.leetcode;

/**
 * 389、找不同
 * 给定两个字符串 s 和 t，他们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 *
 * 示例1:
 * 输入: s = "abcd"， t = "abcde"
 * 输出: "e"
 * 解释: 'e' 是那个被添加的字母。
 *
 * 示例2:
 * 输入: s = ""， t = "y"
 * 输出: "y"
 *
 * 示例3:
 * 输入: s = "a", t = "aa"
 * 输出: "a"
 *
 * 示例4:
 * 输入: s = "ae", t = "aea"
 * 输出: "a"
 *
 * 提示:
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s 和 t 只包含小字母
 */
public class T0389_find_the_difference {

    public char findTheDifferent(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }
}
