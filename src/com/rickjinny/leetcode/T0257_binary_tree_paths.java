package com.rickjinny.leetcode;

import java.util.List;

/**
 * 257、二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * 说明: 叶子节点是没有子节点的节点。
 * 示例:
 * 输入:
 *      1
 *    /   |
 *   2    3
 *   |
 *    5
 *
 * 输出: ["1->2->5", "1->3"]
 * 解释: 所有根节点到叶子节点的路径为：1->2->5, 1->3
 */
public class T0257_binary_tree_paths {

    public List<String> binaryTreePaths(TreeNode root) {
        return null;
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
