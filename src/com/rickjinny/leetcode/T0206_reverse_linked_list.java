package com.rickjinny.leetcode;

/**
 * 206、反转链表
 * 反转一个单链表。
 *
 * 示例:
 * 输入: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
 * 输出: 5 -> 4 -> 3 -> 2 -> 1 -> NULL
 *
 * 进阶：你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 */
public class T0206_reverse_linked_list {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = curr;
            curr = next;
        }
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
