package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

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

    private int base;

    private int count;

    private int maxCount;

    private List<Integer> answer = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null) {
            if (cur.left == null) {
                update(cur.val);
                cur = cur.right;
                continue;
            }

            pre = cur.left;
            while (pre.right != null && pre.right != cur) {
                pre = pre.right;
            }

            if (pre.right == null) {
                pre.right = cur;
                cur = cur.left;
            } else {
                pre.right = null;
                update(cur.val);
                cur = cur.right;
            }
        }

        int[] mode = new int[answer.size()];
        for (int i = 0; i < answer.size(); ++i) {
            mode[i] = answer.get(i);
        }

        return mode;
    }

    private void update(int val) {
        if (val == base) {
            ++count;
        } else {
            count = 1;
            base = val;
        }

        if (count == maxCount) {
            answer.add(base);
        }

        if (count > maxCount) {
            maxCount = count;
            answer.clear();
            answer.add(base);
        }
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
