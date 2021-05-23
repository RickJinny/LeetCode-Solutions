package com.rickjinny.leetcode;

/**
 * 530、二叉搜索树的最小绝对差
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 *
 * 示例:
 * 输入:
 *       1
 *        \
 *        3
 *       /
 *      2
 *
 * 输出: 1
 *
 * 解释: 最小绝对差为 1, 其中 2 和 1 的差的绝对值为 1 (或者 2 和 3)
 *
 * 提示: 树中至少有 2 个节点。
 *
 */
public class T0530_minimum_absolute_difference_in_bst {

    private int pre;

    private int ans;

    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }

    private static class TreeNode {
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
