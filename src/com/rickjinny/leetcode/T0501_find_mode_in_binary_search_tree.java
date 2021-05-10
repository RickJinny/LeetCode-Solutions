package com.rickjinny.leetcode;

/**
 * 501、二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）
 * 假定 BST 有如下定义:
 * （1）结点左子树中所含结点的值小于等于当前结点的值。
 * （2）结点右子树中所含结点的值大于等于当前结点的值。
 * （3）左子树和右子树都是二叉搜索树
 *
 * 例如: 给定 BST [1, null, 2, 2]
 *       1
 *        \
 *        2
 *       /
 *      2
 * 返回 [2]
 *
 * 提示: 如果众数超过 1 个，不需考虑输出顺序。
 * 进阶: 你可以不使用额外的空间吗? (假设由递归产生的隐式调用栈的开销不被计算在内)
 */
public class T0501_find_mode_in_binary_search_tree {

    public int[] findMode() {
        
    }


    public static class TreeNode {
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
