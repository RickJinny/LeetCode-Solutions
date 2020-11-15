package com.rickjinny.leetcode;

/**
 * 110、平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 *    一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1。
 */
public class T0110_balanced_binary_tree {

    public boolean isBalanced(TreeNode root) {
        return false;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

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
