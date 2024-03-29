package com.rickjinny.leetcode;

import java.util.PriorityQueue;

/**
 * 703、数据流中的第 k 大元素
 * 设计一个找到 数据流 中，第 k 大元素的类 (class)。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 * 请实现 KthLargest 类:
 * (1)、KthLargest(int k, int[] nums) 使用整数 k 和 整数流 nums 初始化对象。
 * (2)、int add(int val) 将 val 插入数据流 nums 后，返回当前数据流中第 k 大的元素。
 *
 * 示例:
 * 输入: ["KthLargest", "add", "add", "add", "add"]
 *      [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
 * 输出: [null, 4, 5, 5, 8, 8]
 *
 * 解释: KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
 *      kthLargest.add(3);  // return 4
 *      kthLargest.add(5);  // return 5
 *      kthLargest.add(10);  // return 5
 *      kthLargest.add(9);  // return 8
 *      kthLargest.add(4);  // return 8
 *
 * 提示: 1 <= k <= 10^4
 *      0 <= nums.length <= 10^4
 *      -10^4 <= nums[i] <= 10^4
 *      -10^4 <= val <= 10^4
 *      最多调用 add 方法 10^4 次
 *      题目数据保证，在查找第 k 大元素时, 数组中至少有 k 个元素
 */
public class T0703_kth_largest_element_in_a_stream {

    private PriorityQueue<Integer> priorityQueue;

    private int k;

    public T0703_kth_largest_element_in_a_stream(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        priorityQueue.offer(val);
        if (priorityQueue.size() > k) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }

}
