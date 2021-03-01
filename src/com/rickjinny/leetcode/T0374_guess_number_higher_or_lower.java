package com.rickjinny.leetcode;

/**
 * 374、猜数字大小
 * 猜数字游戏的规则如下：
 * (1)、每轮游戏，我都会从 1 到 n 随机选择一个数字。请你猜选出的是哪个数字。
 * (2)、如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况 (-1, 1 或 0)
 * (3)、-1: 我选出的数字比你猜的数字小 pick < num
 * (4)、1: 我选出的数字比你猜的数字大 pick > num
 * (5)、0: 我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 返回我选出的数字。
 *
 * 示例1:
 * 输入: n = 10, pick = 6
 * 输出: 6
 *
 * 示例2:
 * 输入: n = 1, pick = 1
 * 输出: 1
 *
 * 示例3:
 * 输入: n = 2, pick = 1
 * 输出: 1
 *
 * 示例4:
 * 输入: n = 2， pick = 2
 * 输出: 2
 *
 * 提示:
 * 1 <= n <= 2^31 - 1
 * 1 <= pick <= n
 *
 */
public class T0374_guess_number_higher_or_lower {

    public int guessNumber(int n) {
        for (int i = 1; i < n; i++) {
            
        }
        return n;
    }
}
