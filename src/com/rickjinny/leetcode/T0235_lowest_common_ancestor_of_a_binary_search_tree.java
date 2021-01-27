package com.rickjinny.leetcode;

/**
 * 235、二叉搜索树的最近公共祖先
 * 给定一个二叉搜索树，找到该树中两个指定节点的最近公共祖先。
 *
 * 示例1:
 * 输入: root = [6, 2, 8, 0, 4, 7, 9, null, null, 3, 5], p = 2, q= 8
 * 输出: 6
 * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 *
 * 示例2:
 * 输入: root = [6, 2, 8, 0, 4, 7, 9, null, null, 3, 5], p = 2, q = 4
 * 输出: 2
 * 解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。
 */
public class T0235_lowest_common_ancestor_of_a_binary_search_tree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while (true) {
            if (p.val < ancestor.val && q.val < ancestor.val) {
                ancestor = ancestor.left;
            } else if (p.val > ancestor.val && q.val > ancestor.val) {
                ancestor = ancestor.right;
            } else {
                break;
            }
        }
        return ancestor;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
