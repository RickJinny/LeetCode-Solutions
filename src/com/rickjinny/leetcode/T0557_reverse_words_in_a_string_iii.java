package com.rickjinny.leetcode;

/**
 * 557、反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例:
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteel tsetnoc"
 *
 * 提示: 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class T0557_reverse_words_in_a_string_iii {

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            sb.append(new StringBuffer(strs[i])).reverse().toString();
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
