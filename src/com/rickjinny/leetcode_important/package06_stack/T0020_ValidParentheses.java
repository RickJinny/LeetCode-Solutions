package com.rickjinny.leetcode_important.package06_stack;

import java.util.Stack;

/**
 * LeetCode20、LeetCode上第 20 题（Valid Parentheses）
 * <p>
 * 给定一个字符串，只包含（，[，{，），]，}，判定字符串中的括号匹配是否合法。
 * - 如："( )"，"( )[ ]{ }"是合法的。
 * - 如："( ]"，"( [ ) ]" 是非法的。
 */
public class T0020_ValidParentheses {

    private boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char c = stack.peek();
                stack.pop();
                char match;
                if (array[i] == ')') {
                    match = '(';
                } else if (array[i] == ']') {
                    match = '[';
                } else {
                    match = '{';
                }

                if (c != match) {
                    return false;
                }
            }
        }
        return stack.size() != 0;
    }
}
