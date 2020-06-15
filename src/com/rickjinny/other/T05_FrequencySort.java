package com.rickjinny.other;

import java.util.HashMap;
import java.util.Map;

/**
 * 05、给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * 第一步、先把字符串里面的字符的个数，进行统计;
 * 第二步、然后再按照频率降序排列;
 */
public class T05_FrequencySort {

    public String frequencySort(String s) {
        // 定义一个 Map, Key 是字符，Value 是字符的个数
        Map<Character, Integer> map = new HashMap<>();
        // 对字符串进行遍历
        for (int i = 0; i < s.length(); i++) {
            // 看 map 的 key 里面是否包含字符
            if (!map.containsKey(s.charAt(i))) {
                // 如果不包含字符的话，就把字符 put 进 map 中, value 设置为 1
                map.put(s.charAt(i), 1);
            } else {
                // 如果之前已经包含字符的话，获取到原来的 value 值，再自增 1
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        // 创建一个 StringBuilder
        StringBuilder res = new StringBuilder();
        // 定义一个 HashMap，将 map 放入进来
        Map<Character, Integer> tmp = new HashMap<>(map);
        // 遍历字符串 s
        for (int i = 0; i < s.length(); i++) {
            // 对 tmp 的 key 集合进行遍历
            for (Character c : tmp.keySet()) {
                tmp.put(c, tmp.get(c) - 1);
                if (tmp.get(c) == 0) {
                    for (int j = 0; j < map.get(c); j++) {
                        res.append(c);
                    }
                }
            }
        }
        return res.reverse().toString();
    }
}
