package com.rickjinny.leetcode;

/**
 * 671、二叉树中的第二小的节点
 * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点
 * 有两个子节点的话，那么该节点的值等于两个子节点中较小的一个。
 * 更正式地说，root.val = min(root.left.val, root.right.val) 总成立。
 * 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1。
 *
 * 示例1:
 *        2
 *      /  |
 *     2   5
 *        / |
 *       5  7
 * 输入: root = [2, 2, 5, null, null, 5, 7]
 * 输出: 5
 * 解释: 最小的值是 2, 第二小的值是 5 。
 *
 * 示例2:
 *       2
 *     /  |
 *    2   2
 * 输入: root = [2, 2, 2]
 * 输出: -1
 * 解释: 最小的值是 2，但是不存在第二小的值。
 *
 * 提示:
 * (1)、树中节点数目在范围 [1, 25] 内。
 * (2)、1 <= Node.val <= 2^31 - 1
 * (3)、对于树中每个节点 root.val == min(root.left.val, root.right.val)
 *
 *
 */
public class T0671_second_minimum_node_in_a_binary_tree {

    public int findSecondMinimumValue(TreeNode root) {
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
