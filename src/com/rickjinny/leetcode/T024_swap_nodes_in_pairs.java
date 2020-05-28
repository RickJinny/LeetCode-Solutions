package com.rickjinny.leetcode;

/**
 * 24、两两交换链表中的节点。
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例: 给定 1->2->3->4, 你应该返回 2->1->4->3
 */
public class T024_swap_nodes_in_pairs {

    public ListNode swapPairs(ListNode head) {
        // 输入校验
        if (head == null || head.next == null)
            return head;
        ListNode ans = head.next; // 新链表的起点
        ListNode currNode = head; // 当前节点，每次落在一对节点的前一个节点上
        ListNode lastNode = head; // 上一个节点，每次落在完成交换后的一对节点的后一个节点上。
        // 遍历 最后还会余下一个lastNode的next指向没有得到更正
        while (currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next.next;// 每次两步
            currNode.next.next = currNode;
            lastNode.next = currNode.next; // 在第一对中，这个操作无意义，head.next下轮中还会被改变。
            lastNode = currNode;
            currNode = nextNode;
        }
        lastNode.next = currNode;
        return ans;
    }

     public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
     }
}
