package com.rickjinny.leetcode;

/**
 * 520、检测大写字母
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * (1)、全部字母都是大写，比如："USA"。
 * (2)、单词中所有字母都不是大写，比如："leetcode"。
 * (3)、如果单词不只含有一个字母，只有首字母大写，比如："Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例1:
 * 输入: "USA"
 * 输出: True
 *
 * 示例2:
 * 输入: "FlaG"
 * 输出: False
 *
 * 注意: 输入是由大写和小写拉丁字母组成的非空单词。
 */
public class T0520_detect_capital {

    public boolean detectCapitalUse(String word) {
        int one = 0;
        for (int i = 0; i < word.length(); i++) {
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'z') {
                one++;
            }
        }
        // 首先用 charAt(i) 函数求出字符串中大写字母的个数
        if (one == 0) {
            // 如果 one = 0, 则全部是小写字母
            return true;
        } else if (one == word.length()) {
            // 如果 one = 字符串的长度, 则全部是大写字母
            return true;
        } else if ('A' <= word.charAt(0) && word.charAt(0) < 'z' && one == 1) {
            // 如果 charAt('0') 为大写字母，且 one = 1, 则表示只有一个大写字母，且在首位
            return true;
        } else {
            // 其他条件返回 false
            return false;
        }
    }
}
