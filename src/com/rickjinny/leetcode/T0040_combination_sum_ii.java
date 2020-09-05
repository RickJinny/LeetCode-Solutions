package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 40、组合总和 II
 *
 */
public class T0040_combination_sum_ii {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<>();
        // 先排序
        Arrays.sort(candidates);
        backTrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backTrack(List<List<Integer>> list, ArrayList<Integer> cur,
                           int[] candidates, int target, int start) {
        if (target == 0) {
            list.add(new ArrayList<>(cur));
            return;
        }

        int length = candidates.length;
        for (int i = 0; i < length; i++) {
            if (target < candidates[i]) {
                continue;
            }

            if (i > start && candidates[i] == candidates[i - 1]) {
                // 去掉重复的
                continue;
            }
            cur.add(candidates[i]);
            backTrack(list, cur, candidates, target - candidates[i], i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
