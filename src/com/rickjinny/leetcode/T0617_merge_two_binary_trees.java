package com.rickjinny.leetcode;

/**
 * 617、合并二叉树
 */
public class T0617_merge_two_binary_trees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return null;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

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

