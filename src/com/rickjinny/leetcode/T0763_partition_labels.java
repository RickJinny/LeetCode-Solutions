package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 763、划分字母区间
 * 字符串 s 由 小写字母 组成。我们要把这个字符串划分为 尽可能 多的片段，同一个字母最多出现在一个片段中。
 * 返回一个表示每个字符串片段的长度的列表。
 *
 * 示例:
 * 输入: S = "ababcbacadefegdehijhklij"
 * 输出: [9, 7, 8]
 * 解释: 划分结果为 "ababcbaca", "defegde", "hijhklij"。
 *      每个字母最多出现一个片段中。
 *      像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。
 *
 * 提示:
 * (1)、S 的长度在 [1, 500] 之间。
 * (2)、S 只包含小写字母 'a' 到 'z'。
 */
public class T0763_partition_labels {

    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> partition = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }

}
