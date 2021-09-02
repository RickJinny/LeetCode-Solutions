package com.rickjinny.leetcode;

/**
 * 653、两数之和 IV - 输入BST
 * 给定一个二叉树搜索树 root 和 一个目标结果 k，如果 BST 中存在两个元素且他们的和等于
 * 给定的目标结果，则返回 true。
 *
 * 输入: root = [5, 3, 6, 2, 4, null, 7],  k = 9
 * 输出: true
 *
 * 输入: root = [5, 3, 6, 2, 4, null, 7],  k = 28
 * 输出: false
 *
 * 输入: root = [2, 1, 3],  k = 4
 * 输出: true
 *
 * 输入: root = [2, 1, 3],  k = 1
 * 输出: false
 *
 * 输入: root = [2, 1, 3],  k = 3
 * 输出: true
 *
 * 提示:
 * (1)、二叉树的节点个数的范围是: [1, 10^4]
 * (2)、-10^4 <= Node.val <= 10^4
 * (3)、root 为二叉搜索树
 * (4)、-10^5 <= k <= 10^5
 */
public class T0653_two_sum_iv_input_is_a_bs {

    public boolean findTarget(TreeNode root, int k) {
        
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
