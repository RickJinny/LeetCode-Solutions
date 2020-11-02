package com.rickjinny.leetcode;

/**
 * 83、删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例1：
 * 输入：1 -> 1 -> 2
 * 输出：1 -> 2
 *
 * 示例2：
 * 输入：1 -> 1 -> 2 -> 3 -> 3
 * 输出：1 -> 2 -> 3
 */
public class T0083_remove_duplicates_from_sorted_list {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                ListNode node = current.next;
                current.next = node.next;
                // 清除野指针
                node.next = null;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
