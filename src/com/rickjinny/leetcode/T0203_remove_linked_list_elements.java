package com.rickjinny.leetcode;

/**
 * 203、移除链表元素
 * 删除链表中等于给定值 val 的所有节点
 *
 * 示例:
 * 输入: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6, val = 6
 * 输出: 1 —> 2 -> 3 -> 4 -> 5
 */
public class T0203_remove_linked_list_elements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
