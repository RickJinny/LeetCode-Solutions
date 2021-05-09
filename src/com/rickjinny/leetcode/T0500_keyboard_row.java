package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 500、键盘行
 * 给你一个字符串数组 words，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。
 *
 * 示例1:
 * 输入: words = ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 * 示例2:
 * 输入: words = ["omk"]
 * 输出: []
 *
 * 示例3:
 * 输入: words = ["adsdf", "sfd"]
 * 输出: ["adsdf", "sfd"]
 *
 * 提示:
 * 1 <= words.length <= 20
 * 1 <= words[i].length <= 100
 * words[i] 由英文字母（小写和大写字母）组成
 *
 */
public class T0500_keyboard_row {

    public String[] findWords(String[] words) {
        if (words == null) {
            return null;
        }

        List<String> ans = new ArrayList<>();
        // 字典行
        String[] lines = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        // 挨个单词匹配是否满足条件
        for (String word : words) {
            if (judge(word.toLowerCase(), lines)) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }

    private boolean judge(String word, String[] lines) {
        boolean ok = true;
        String find = null;

        // 先用 word 首字符，确定属于哪一行
        for (String line : lines) {
            if (line.indexOf(word.charAt(0)) > -1) {
                find = line;
                break;
            }
        }

        if (find == null) {
            ok = false;
            return ok;
        }

        // 判断 word 字符串所有字符是否都属于同一行
        for (int i = 0; i < word.length(); i++) {
            if (find.indexOf(word.charAt(i)) < 0) {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
