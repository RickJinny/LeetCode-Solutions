package com.rickjinny;

import java.util.ArrayList;
import java.util.List;

/**
 * 22、括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * 示例：
 * 输入: n = 3
 * 输出: [
 *          "((()))",
 *          "(()())",
 *          "(())()",
 *          "()(())",
 *          "()()()"
 *      ]
 */
public class T0022_generate_parentheses {

    public static List<String> generateParenthesis(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        // 这里 dp 数组我们把它变成列表的样子, 方便调用
        List<List<String>> dp = new ArrayList<>(n);
        List<String> dp0 = new ArrayList<>();
        dp0.add("");
        dp.add(dp0);

        for (int i = 1; i < n; i++) {
            List<String> cur = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = dp.get(j);
                List<String> str2 = dp.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        // 枚举右括号的位置
                        cur.add("(" + s1 + ")" + s2);
                    }
                }
            }
            dp.add(cur);
        }
        return dp.get(n);
    }
}
