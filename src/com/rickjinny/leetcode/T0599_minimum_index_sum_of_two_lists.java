package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 599、两个列表的最小索引总和
 * 假设 Andy 和 Doris 想在晚餐时选择一家餐厅，并且他们都有一个表示最喜欢餐厅的列表，每个餐厅的名字用字符串表示。
 * 你需要帮助他们用 最少的索引和 找出他们共同喜爱的餐厅。如果答案不止一个，则输出所有答案并且不考虑顺序。你可以假设总是存在一个答案。
 *
 * 示例1:
 * 输入: ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 *      ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 * 输出: ["Shogun"]
 * 解释: 他们唯一共同喜爱的餐厅是 "Shogun"
 *
 * 示例2:
 * 输入: ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 *      ["KFC", "Shogun", "Burger King"]
 * 输出: ["Shogun"]
 * 解释: 他们共同喜爱且具有最小索引和的餐厅是 "Shogun", 它有最小的索引和 1 (0 + 1)。
 *
 * 提示:
 * 1、两个列表的长度范围都在 [1, 1000] 内。
 * 2、两个列表中的字符串的长度将在 [1, 30] 的范围内。
 * 3、下标从 0 开始，到列表的长度减 1。
 * 4、两个列表都没有重复的元素。
 */
public class T0599_minimum_index_sum_of_two_lists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    map.put(list1[i], i + j);
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= min) {
                if (entry.getValue() < min) {
                    list.clear();
                    min = entry.getValue();
                    list.add(entry.getKey());
                } else {
                    min = entry.getValue();
                    list.add(entry.getKey());
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
