package com.rickjinny.leetcode;

/**
 * 112、路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，
 * 这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的结点。
 *
 * 示例: 给定如下二叉树，以及目标和 sum = 22。
 *          5
 *        /  \
 *       4    8
 *      /    / \
 *     11   13  4
 *    /  \       \
 *   7   2        1
 *
 * 返回true，因为存在目标和为 22 的根节点到叶子节点的路径：5 -> 4 -> 11 -> 2。
 */
public class T0112_path_sum {

    public boolean hasPathSum(TreeNode root, int sum) {
        return false;
    }

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
}

