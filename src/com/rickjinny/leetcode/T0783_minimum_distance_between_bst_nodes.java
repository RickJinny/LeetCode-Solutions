package com.rickjinny.leetcode;

/**
 * 783、二叉搜索树节点最小距离
 */
public class T0783_minimum_distance_between_bst_nodes {

    private TreeNode pre = null;

    private int res = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);

        if (pre != null) {
            res = Math.max(root.val - pre.val, res);
        }

        pre = root;
        dfs(root.right);
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
