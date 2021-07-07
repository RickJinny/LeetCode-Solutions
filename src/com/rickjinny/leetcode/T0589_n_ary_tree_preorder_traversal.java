package com.rickjinny.leetcode;

import java.util.List;

/**
 * 589、N 叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的 前序遍历。
 * N 叉树在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔。
 */
public class T0589_n_ary_tree_preorder_traversal {

    public List<Integer> preOrder() {
        return null;
    }

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {

        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}
