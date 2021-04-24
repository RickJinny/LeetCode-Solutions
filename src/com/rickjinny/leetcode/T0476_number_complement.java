package com.rickjinny.leetcode;

/**
 * 476、数字的补数
 * 给你一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 *
 * 示例1:
 * 输入: num = 5
 * 输出: 2
 * 解释: 5 的二进制表示为 101 (没有前导零位)，其补数为 010。所以你需要输出 2。
 *
 * 示例2:
 * 输入: num = 1
 * 输出: 0
 * 解释: 1 的二进制表示为 1 (没有前导零位)，其补数为 0。所以你需要输出 0。
 *
 * 提示:
 * (1) 给定的整数 num 保证在 32 位带符号整数的范围内。
 * (2) num >= 1
 * (3) 你可以假定二进制数不包含前导零位。
 */
public class T0476_number_complement {

    public int findComplement(int num) {
        String complementStr = "";
        String binaryStr = Integer.toBinaryString(num);
        for (int i = 0; i < binaryStr.length(); i++) {
            complementStr += binaryStr.charAt(i) ^ '1';
        }
        return Integer.parseInt(complementStr, 2);
    }
}
