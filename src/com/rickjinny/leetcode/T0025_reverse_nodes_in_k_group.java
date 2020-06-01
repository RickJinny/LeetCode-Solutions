package com.rickjinny.leetcode;

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
        // 空想的 pre 节点(接在头节点之前)
        ListNode preNode = new ListNode(Integer.MIN_VALUE);
        preNode.next = head;
        // 用于记录头节点返回
        ListNode hairNode = preNode;

        // 初始化 tail, 代表每个小段链表的末尾
        ListNode tailNode = preNode;
        ListNode startNode;
        ListNode nextNode;
        //遍历链表
        while (tailNode.next != null) {
            // 移动 tailNode 到小段链表末尾
            for (int i = 0; i < k && tailNode != null; i++) {
                tailNode = tailNode.next;
            }

            if (tailNode == null) {
                break;
            }

            // 设置 nextNode
            nextNode = tailNode.next;
            // 设置 startNode 为起始
            startNode = preNode.next;
            // 断开链表
            tailNode.next = null;
            // 反转链表
            preNode.next = reverse(startNode);
            // 接上链表末尾, 此时 startNode 为反转后链表的末尾
            startNode.next = nextNode;
            // 移动指针寻找下一段链表
            preNode = startNode; // 此时 startNode 已经是当前逆序链表的末尾
            tailNode = preNode; // 移动末尾为 preNode 下一次继续根据 k 移动 tailNode
        }
        return hairNode.next;
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
