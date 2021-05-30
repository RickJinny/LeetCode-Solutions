package com.rickjinny.leetcode;

/**
 * 543、二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。
 * 这条路径可能穿过也可能不穿过根结点。
 *
 * 示例:
 * 给定二叉树:
 *         1
 *        / |
 *       2  3
 *      / \
 *     4  5
 * 返回 3，它的长度是路径 [4, 2, 1, 3] 或者 [5, 2, 1, 3]
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 */
public class T0543_diameter_of_binary_tree {

    private int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);
        res = Math.max(l + r, res);
        return Math.max(l, r) + 1;
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

