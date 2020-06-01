package com.rickjinny.leetcode;

import java.util.List;

/**
 * 25、 K 个一组翻转链表
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 示例:
 * 给你这个链表: 1 -> 2 -> 3 -> 4 -> 5
 * 当 k = 2 时，应当返回: 2 -> 1 -> 4 -> 3 -> 5
 * 当 k = 3 时，应当返回: 3 -> 2 -> 1 -> 4 -> 5
 *
 * 说明：你的算法只能使用常数的额外空间。
 *      你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 */
public class T0025_reverse_nodes_in_k_group {

    public ListNode reverseKGroup(ListNode head, int k) {
        



        return null;
    }

    /**
     * 反转链表
     */
    private ListNode reverse(ListNode head) {
        // pre 是指向前一个节点的指针, 初识头节点前面的 null
        ListNode preNode = null;
        // cur 是当前节点
        ListNode curNode = head;
        while (curNode != null) {
            // 记录下一个节点的指针
            ListNode nextNode = curNode.next;
            // 将指向下一个节点的指针反转指向前一个节点
            curNode.next = preNode;
            // 更新前一个节点（后移）
            preNode = curNode;
            // 后移当前节点
            curNode = nextNode;
        }
        // 最后 preNode 会移动到最后, 但此时由于链表反转 preNode 正好是反转后的头
        return preNode;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
