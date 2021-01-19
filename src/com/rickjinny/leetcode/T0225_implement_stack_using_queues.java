package com.rickjinny.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225、用队列实现栈
 * 使用队列实现栈的下列操作:
 * (1) push(x): 元素 x 入栈
 * (2) pop(): 移除栈顶元素
 * (3) top(): 获取栈顶元素
 * (4) empty(): 返回栈是否为空
 *
 * 注意:
 * (1)、你只能使用队列的基本操作, 也就是 push to back, peek / pop from front, size 和 is empty 这些
 * 操作是合法的。
 * (2)、你所使用的语言也许不支持队列。你可以使用 list 或者 queue（双端队列）来模拟一个队列，只要是标准的队列操作即可。
 * (3)、你可以假设所有操作都是有效的(例如: 对一个空的栈不会调用 pop 或者 top 操作)。
 *
 */
public class T0225_implement_stack_using_queues {


    private static class MyStack {

        // 初始化队列
        Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        /**
         * 模拟入栈操作
         */
        public void push(int x) {
            queue.offer(x);
            // 将之前的全部都出队，然后再入队
            for (int i = 0; i < queue.size(); i++) {
                queue.offer(queue.poll());
            }
        }

        /**
         * 模拟出栈
         */
        public int pop() {
            return queue.poll();
        }

        /**
         * 返回栈顶元素
         */
        public int top() {
            return queue.peek();
        }

        /**
         * 判断是否为空
         */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}

