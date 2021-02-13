package com.rickjinny.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 290、单词规律
 * 给定一种规律 pattern 和 一个字符串 str，判断 str 是否遵循相同的规律。
 * 这里的 遵循 指完全匹配，例如：pattern 里每个字母和字符串 str 中的每个非空单词之间存在着双向连接的
 * 对应规律。
 *
 * 示例1:
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 *
 * 示例2:
 * 输入: pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 *
 * 示例3:
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 *
 * 示例4:
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 *
 * 说明: 你可以假设 pattern 只包含小写字母，str 包含了由空格分隔的小写字母。
 *
 */
public class T0290_word_pattern {

    public static boolean wordPattern(String pattern, String s) {
        if (pattern == null || s == null) {
            return false;
        }
        char[] chars = pattern.toCharArray();
        String[] split = s.split(" ");
        if (chars.length != split.length) {
            return false;
        }
        int length = chars.length;
        Map<Character, String> map = new HashMap<>();
        Set<String> valueSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(chars[i])) {
                // map中包含当前 key，检查 key 对应的 value 是否和当前值相同
                if (!map.get(chars[i]).equals(split[i])) {
                    return false;
                }
            } else {
                // 如果 map 中不包含当前 key，但是 set 中又已经有了当前值，说明存在不同的 key 对应相同的值，直接返回 false
                if (valueSet.contains(split[i])) {
                    return false;
                }

                map.put(chars[i], split[i]);
                valueSet.add(split[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
