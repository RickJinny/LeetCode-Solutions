package com.rickjinny.other;

import java.util.HashMap;
import java.util.Map;

/**
 * 05、给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 */
public class T05_FrequencySort {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        StringBuilder res = new StringBuilder();
        Map<Character, Integer> tmp = new HashMap<>(map);
        for (int i = 0; i < s.length(); i++) {
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
