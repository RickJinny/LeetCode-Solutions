package com.rickjinny.leetcode;

/**
 * 696、计数二进制子串
 * 给定一个字符串 s，计算具有相同数量 0 和 1 的非空（连续）子字符串的数量，并且这些子字符串的所有 0 和 所有 1 都是连续的。
 * 重复出现的子串要计算他们出现的次数。
 * <p>
 * 示例1:
 * 输入: "00110011"
 * 输出: 6
 * 解释: 有 6 个子串具有相同数量的连续 1 和 0："0011", "01", "1100", "10", "0011" 和 "01"。
 * 请注意，一些重复出现的子串要计算他们出现的次数。
 * 另外，"00110011" 不是有效的子串，因为所有的 0（和1）没有组合在一起。
 * <p>
 * 示例2:
 * 输入: "10101"
 * 输出: 4
 * 解释: 有 4 个子串: "10", "01", "10", "01"，他们具有相同数量的连续 1 和 0。
 * <p>
 * 提示:
 * s.length 在 1 到 50000 之间。
 * s 只包含 "0" 或 "1" 字符。
 */
public class T0696_count_binary_substrings {

    public int countBinarySubstrings(String s) {
        int ptr = 0;
        int n = s.length();
        int last = 0;
        int ans = 0;
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }
}
