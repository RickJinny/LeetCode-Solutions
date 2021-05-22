package com.rickjinny.leetcode;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * 521、最长特殊序列 I
 */
public class T0521_longest_uncommon_subsequence_i {

    public int findLUSLength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return 0;
    }
}
