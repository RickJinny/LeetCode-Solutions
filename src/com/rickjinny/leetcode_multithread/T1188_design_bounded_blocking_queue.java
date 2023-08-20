package com.rickjinny.leetcode_multithread;

/**
 * 1188、设计有限阻塞队列
 * 实现一个拥有如下方法的线程安全有限阻塞队列:
 * (1)、BoundedBlockingQueue(int capacity) 构造方法初始化队列，其中 capacity 代表队列长度上限。
 * (2)、void enqueue(int element) 在队首增加一个 element。如果队列满，调用线程被阻塞直到队列非满。
 * (3)、int dequeue() 返回队尾元素并从队列中将其删除。如果队列为空，调用线程被阻塞直到队列为空。
 * (4)、int size() 返回当前队列元素个数。
 * <p>
 * 你的实现将会被多线程同时访问进行测试。每一个线程要么是一个只调用 enqueue 方法的生产者线程，要么是一个
 * 只调用 dequeue 方法的消费者线程。size方法将会在每一个测试用例之后进行调用。
 * <p>
 * 请不要使用内置的有限阻塞队列实现。
 * <p>
 * 示例1：
 * 输入：
 * 1
 * 1
 * ["BoundedBlockingQueue", "enqueue", "dequeue", "dequeue", "enqueue", "enqueue", "enqueue", "enqueue", "dequeue"]
 * [[2], [1], [], [], [0], [2], [3], [4], []]
 * 输出: [1, 0, 2, 2]
 * 解释: 生产者线程数目 = 1
 * 消费者线程数目 = 1
 * <p>
 * BoundedBlockingQueue queue = new BoundedBlockingQueue(2);  // 使用 capacity = 2 初始化
 * queue.enqueue(1);   // 生产者线程将 1 插入队列
 * queue.dequeue();    // 消费者线程调用 dequeue 并返回 1
 * queue.dequeue();    // 由于队列为空，消费者线程被阻塞
 * queue.enqueue(0);   // 生产者线程将 0 插入队列，消费者线程被解除阻塞同时将 0 弹出队列并返回。
 * queue.enqueue(2);   // 生产者线程将 2 插入队列。
 * queue.enqueue(3);   // 生产者线程将 3 插入队列。
 * queue.enqueue(4);   // 生产者线程由于队列长度已达到上限 2 而被阻塞。
 * queue.dequeue();    // 消费者线程将 2 从队列弹出并返回。生产者线程解除阻塞同时将 4 插入队列。
 * queue.size();       // 队列中还有 2 个元素。size() 方法在每组测试用例最后调用。
 */
public class T1188_design_bounded_blocking_queue {
    

}
