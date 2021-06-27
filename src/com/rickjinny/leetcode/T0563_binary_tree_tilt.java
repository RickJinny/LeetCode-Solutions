package com.rickjinny.leetcode;

/**
 * 563、二叉树的坡度
 * 给定一个二叉树，计算 整个树 的坡度。
 * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值。如果没有左子树
 * 的话，左子树的节点之和为 0；没有右子树的话也是一样。空节点的坡度是 0。
 *
 * 整个树 的坡度就是其所有节点的坡度之和。
 *
 */
public class T0563_binary_tree_tilt {

    public int findTilt(TreeNode root) {
        return 0;
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
