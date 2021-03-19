package com.rickjinny.leetcode;

/**
 * 409、最长回文串
 */
public class T0409_longest_palindrome {

    public int longestPalindrome(String s) {
        int[] cnt = new int[58];
        for (char c : s.toCharArray()) {
            cnt[c - 'A'] += 1;
        }
        int ans = 0;
        for (int x : cnt) {
            // 字符出现的次数最多用偶数次
            ans += x - (x & 1);
        }
        // 如果最终的长度小于原字符串的长度，说明里面某个字符出现了奇数次，那么那个字符可以放在回文串的中间
        return ans < s.length() ? ans + 1 : ans;
    }
}
