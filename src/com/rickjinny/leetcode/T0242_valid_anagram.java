package com.rickjinny.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 242、有效的字母异位词
 * 给定两个字符串 s 和 t，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * <p>
 * 说明: 你可以假设字符串只包含小写字母。
 * 进阶: 如果输入字符串包含 unicode 字符怎么办? 你能否调整你的解法来应对这种情况?
 */
public class T0242_valid_anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
