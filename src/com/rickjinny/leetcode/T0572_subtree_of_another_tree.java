package com.rickjinny.leetcode;

/**
 * 572、另一个树的子树
 * 给定两个非空二叉树 s 和 t, 检验 s 中是否包含和 t 具有相同结构和节点值的子树。
 * s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s也可以看做它自身的一棵子树。
 */
public class T0572_subtree_of_another_tree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return false;
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
