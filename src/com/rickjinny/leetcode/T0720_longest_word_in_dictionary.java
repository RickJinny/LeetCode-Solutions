package com.rickjinny.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 720、词典中最长的单词
 * 给出一个字符串数组 words 组成的一本英语词典。从中找出最长的一个单词，该单词是由 words 词典中其他单词
 * 逐步添加一个字母组成。若其中有多个可行的答案，则返回答案中字母序最小的单词。
 * 若无答案，则返回空字符串。
 *
 * 示例1:
 * 输入: words = ["w", "wo", "wor", "world"]
 * 输出: "words"
 * 解释: 单词 "world" 可由 "w"、"wo"、"wor" 和 "worl" 添加一个字母组成。
 *
 * 示例2:
 * 输入: words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 * 输出: "apple"
 * 解释: "apply" 和 "apple" 都能由词典中的单词组成。但是 "apple" 的字典序小于 "apply"。
 *
 */
public class T0720_longest_word_in_dictionary {

    public String longestWord(String[] words) {
        String ans = "";
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }

        for (String word : words) {
            if (word.length() > ans.length() || word.length() == ans.length() && word.compareTo(ans) < 0) {
                boolean good = true;
                for (int k = 1; k < word.length(); ++k) {
                    if (!wordSet.contains(word.substring(0, k))) {
                        good = false;
                        break;
                    }
                }

                if (good) {
                    ans = word;
                }
            }
        }
        return ans;
    }
}
