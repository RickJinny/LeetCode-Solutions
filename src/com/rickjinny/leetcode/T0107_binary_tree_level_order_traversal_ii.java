package com.rickjinny.leetcode;

import java.util.List;

/**
 * 107、二叉树的层次遍历(二)
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。（即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）。
 *
 * 例如：给定二叉树 [3, 9, 20, null, null, 15, 7]
 *     3
 *    /  \
 *   9   20
 *      /  \
 *     15  7
 *
 * 返回其自底向上的层次遍历为:
 * [
 *   [15, 7],
 *   [9, 20],
 *   [3]
 * ]
 */
public class T0107_binary_tree_level_order_traversal_ii {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return null;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
