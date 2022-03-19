package com.rickjinny.leetcode;

import java.util.TreeSet;

/**
 * 804、唯一摩尔斯密码词
 */
public class T0804_unique_morse_code_words {

    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        TreeSet<String> treeSet = new TreeSet<>();
        for (String word : words) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                res.append(codes[word.charAt(i) - 'a']);
            }
            treeSet.add(res.toString());
        }
        return treeSet.size();
    }
    
}
