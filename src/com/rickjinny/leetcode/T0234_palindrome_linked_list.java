package com.rickjinny.leetcode;

/**
 * 234、回文链表
 * 请判断一个链表是否为回文链表。
 *
 * 示例1:
 * 输入: 1 -> 2
 * 输出: false
 *
 * 示例2:
 * 输入: 1 -> 2 -> 2 -> 1
 * 输出: true
 *
 * 进阶：能否用 O(n) 时间复杂度和 O(1) 空间复杂度，解决此问题。
 */
public class T0234_palindrome_linked_list {

    public boolean isPalindrome(ListNode head) {
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
