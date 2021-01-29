package com.rickjinny.leetcode;

/**
 * 237、删除链表中的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点。
 * 现有一个链表 head = [4, 5, 1, 9], 它可以表示为: 4 -> 5 -> 1 -> 9
 *
 * 示例1:
 * 输入: head = [4, 5, 1, 9], node = 5
 * 输出: [4, 1, 9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9。
 *
 * 示例2:
 * 输入: head = [4, 5, 1, 9], node = 1
 * 输出: [4, 5, 9]
 * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9。
 *
 * 提示:
 * (1) 链表至少包含两个节点。
 * (2) 链表中所有节点的值都是唯一的。
 * (3) 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * (4) 不要从你的函数中返回任何结果。
 *
 */
public class T0237_delete_node_in_a_linked_list {

    /**
     * node 表示的是要删除的结点
     */
    public void deleteNode(ListNode node) {
        // 因为无法访问前一个结点，所以可以把要删除的结点的后一个节点的值前移
        node.val = node.next.val;
        // 然后删除掉后一个结点
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
