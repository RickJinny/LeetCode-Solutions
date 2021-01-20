package com.rickjinny.leetcode;

/**
 * 226、翻转二叉树
 * 翻转一棵二叉树
 *
 * 示例:
 *
 * 输入:
 *        4
 *     /    \
 *    2     7
 *   / |   / |
 *  1  2  6  9
 *
 *
 * 输出:
 *        4
 *     /    \
 *    7     2
 *   / |   / |
 *  9  6  3  1
 *
 */
public class T0226_invert_binary_tree {

    public TreeNode invertTree(TreeNode root) {
        return null;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
