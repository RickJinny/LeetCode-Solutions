package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 39、组合总和
 */
public class T0039_combination_sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> cur,
                                        int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }
        // 相当于遍历 N 叉树的子节点
        for (int i = 0; i < candidates.length; i++) {
            // 如果当前节点大于 target，我们就不要选了
            if (target < candidates[i]) {
                continue;
            }
            // 由于在 Java 中 List 是引用传递，所以这里要重新创建一个
            List<Integer> list = new ArrayList<>(cur);
            list.add(candidates[i]);
            backTrack(result, list, candidates, target - candidates[i], i);
        }
    }
}
