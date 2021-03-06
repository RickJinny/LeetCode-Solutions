package com.rickjinny.leetcode;

/**
 * 195、第十行
 * 给定一个文件文件 file.txt, 请只打印这个文件中的第十行。
 *
 * 示例:
 * 假设 file.txt 有如下内容:
 * Line 1
 * Line 2
 * Line 3
 * Line 4
 * Line 5
 * Line 6
 * Line 7
 * Line 8
 * Line 9
 * Line 10
 *
 * 你的脚本应当显示第十行：
 * Line 10
 *
 * 说明: (1) 如果文件少于十行，你应当输出什么？
 *      (2) 至少有三种不同的解法，请尝试尽可能多的方法来解题。
 *
 */
public class T0195_tenth_line {

    public static void main(String[] args) {
        /**
         * tail -n+10 file.txt | head -1
         * awk 'NR==10 {print($0)}' file.txt
         * sed -n '10p' file.txt
         */
    }
}
