package com.rickjinny.leetcode;

/**
 * 100、相同的树
 * 给定两个二叉树，编写一个函数来检验他们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为他们是相同的。
 */
public class T0100_same_tree {

    public boolean isSameTree() {
        
    }

    public class TreeNode {
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
