package com.rickjinny.leetcode;

/**
 * 160、相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 *
 * 示例1:
 * A:       4 -> 1  \
 *                    8 -> 4 -> 5
 * B:  5 -> 0 -> 1  /
 * 输入: intersectVal = 8,  listA = [4, 1, 8, 4, 5],  listA = [4, 1, 8, 4, 5],  listB = [5, 0, 1, 8, 4, 5], skipA = 2, skipB = 3
 * 输出: Reference of the node with value = 8
 * 输入解释: 相交节点的值为 8 (注意: 如果两个链表相交则不能为0)。从各自的表头开始算起，链表 A 为 [4, 1, 8, 4, 5], 链表 B 为 [5, 0, 1, 8, 4, 5]。
 * 在 A 中，相交节点前有 2 个节点; 在 B 中，相交节点前有 3 个节点。
 */
public class T0160_intersection_of_two_linked_lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return null;
    }

    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }
}
