package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> values = new ArrayList<>();
        // 将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }
        // 使用双指针判断是否是回文
        int front = 0;
        int back = values.size() - 1;
        while (front < back) {
            if (!values.get(front).equals(values.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
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
