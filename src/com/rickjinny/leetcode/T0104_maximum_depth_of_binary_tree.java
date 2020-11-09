package com.rickjinny.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104、二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明：叶子节点是指没有子节点的节点。
 * 示例：给定二叉树 [3, 9, 20, null, null, 15, 7]
 *       3
 *     /  |
 *    9   20
 *       /  |
 *      15  7
 * 返回它的最大深度为3。
 */
public class T0104_maximum_depth_of_binary_tree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}

