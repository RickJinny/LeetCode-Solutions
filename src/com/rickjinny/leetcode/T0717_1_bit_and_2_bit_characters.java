package com.rickjinny.leetcode;

/**
 * 717、1比特与2比特字符
 * 有两种特殊字符。第一种字符可以用一比特 0 来表示。第二种字符可以用两比特 (10 或 11) 来表示。
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符，给定的字符串总是由 0 结束。
 *
 * 示例1:
 * 输入: bits = [1, 0, 0]
 * 输出: true
 * 解释: 唯一的编码方式是一个两比特字符 和 一个一比特字符。所以最后一个字符是一比特字符。
 *
 * 示例2:
 * 输入: bits = [1, 1, 1, 0]
 * 输出: False
 * 解释: 唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。
 *
 * 注意:
 *  1 <= len(bits) <= 1000
 *  bits[i] 总是 0 或者 1。
 *
 */
public class T0717_1_bit_and_2_bit_characters {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
