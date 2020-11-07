package com.rickjinny.leetcode;

/**
 * 101、对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如：二叉树 [1, 2, 2, 3, 4, 4, 3] 是对称的。
 */
public class T0101_symmetric_tree {

    public boolean isSymmetric(TreeNode root) {
        return false;
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
