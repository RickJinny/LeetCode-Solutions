package com.rickjinny.leetcode;

/**
 * 771、宝石与石头
 * 给你一个字符串 jewels 代表石头中宝石的类型，另有一个字符串 stones 代表你拥有的石头，
 * stones 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * 字母区分大小写，因此 'a' 和 'A' 是不同类型的石头。
 *
 * 示例1:
 * 输入: jewels = "aA", stones = "aAAbbbb"
 * 输出: 3
 *
 * 示例2:
 * 输入: jewels = "z", stones = "ZZ"
 * 输出: 0
 *
 * 提示:
 * (1)、1 <= jewels.length, stones.length <= 50
 * (2)、jewels 和 stones 仅由英文字母组成
 * (3)、jewels 中的所有字符都是 唯一的
 */
public class T0771_jewels_and_stones {

    public int numJewelsInStones(String jewels, String stones) {
        int jewelsCount = 0;
        int jewelsLength = jewels.length();
        int stonesLength = stones.length();
        for (int i = 0; i < stonesLength; i++) {
            char stone = stones.charAt(i);
            for (int j = 0; j < jewelsLength; j++) {
                char jewel = jewels.charAt(j);
                if (stone == jewel) {
                    jewelsCount++;
                    break;
                }
            }
        }
        return jewelsCount;
    }

}
