package com.rickjinny.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 824、山羊拉丁文
 *
 * 示例1:
 * 输入: sentence = "I speak Goat Latin"
 * 输出: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 *
 * 示例2:
 * 输入: sentence = "The quick brown fox jumped over the lazy dog"
 * 输出: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 *
 * 提示:
 * （1）1 <= sentence.length <= 150
 * （2）sentence 由英文字母和空格组成
 * （3）sentence 不含前导或尾随空格
 * （4）sentence 中的所有单词由单个空格分隔
 *
 */
public class T0824_goat_latin {

    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<Character>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};

        int n = sentence.length();
        int i = 0, cnt = 1;
        StringBuffer buffer = new StringBuffer();
        while (i < n) {
            int j = i;
            while (j < n && sentence.charAt(j) != ' ') {
                ++j;
            }

            ++cnt;
            if (cnt != 2) {
                buffer.append(' ');
            }

            if (vowels.contains(sentence.charAt(i))) {
                buffer.append(sentence.substring(i, j));
            } else {
                buffer.append(sentence.substring(i + 1, j));
                buffer.append(sentence.charAt(i));
            }

            buffer.append('m');
            for (int k = 0; k < cnt; ++k) {
                buffer.append('a');
            }

            i = j + 1;
        }

        return buffer.toString();
    }
}
