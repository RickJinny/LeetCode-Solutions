package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 637、二叉树的层平均值
 * 给定一个非空二叉树，返回一个由每层节点平均值组成的数组。
 *
 * 示例1:
 *       输入:
 *              3
 *             / |
 *            9  20
 *               / |
 *              15 7
 *
 *       输出: [3, 14.5, 11]
 *       解释: 第 0 层的平均值是 3, 第 1 层是 14.5, 第 2 层是 11。因此返回 [3, 14.5, 11]
 *
 * 提示: 节点值的范围在 32 位有符号整数范围内。
 *
 */
public class T0637_average_of_levels_in_binary_tree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> counts = new ArrayList<>();
        List<Double> sums = new ArrayList<>();
        dfs(root, 0, counts, sums);
        List<Double> averages = new ArrayList<>();
        int size = sums.size();
        for (int i = 0; i < size; i++) {
            averages.add(sums.get(i) / counts.get(i));
        }
        return averages;
    }

    public void dfs(TreeNode root, int level, List<Integer> counts, List<Double> sums) {
        if (root == null) {
            return;
        }

        if (level < sums.size()) {
            sums.set(level, sums.get(level) + root.val);
            counts.set(level, counts.get(level) + 1);
        } else {
            sums.add(1.0 * root.val);
            counts.add(1);
        }

        dfs(root.left, level + 1, counts, sums);
        dfs(root.right, level + 1, counts, sums);
    }

    public static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode() {

        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
