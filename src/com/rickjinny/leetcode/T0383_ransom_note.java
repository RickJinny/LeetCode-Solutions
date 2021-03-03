package com.rickjinny.leetcode;

/**
 * 383、赎金信
 */
public class T0383_ransom_note {

    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder();
        int index;
        for (char c : ransomNote.toCharArray()) {
            index = sb.indexOf(String.valueOf(c));
            if (index >= 0) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return true;
    }
}
