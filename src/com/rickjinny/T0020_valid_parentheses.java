package com.rickjinny;

import java.util.Stack;

/**
 * 20、有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[]}"
 * 输出: true
 *
 */
public class T0020_valid_parentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char [] arr = s.toCharArray();
        for (int i =0; i < arr.length; i++) {
            //如果是开放括号就直接压栈
            if ( arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            }else{
                //特判
                if (stack.isEmpty()) {
                    return false;
                }
                //获取当前栈顶的元素
                char topChar = stack.peek();
                //判断是否为匹配的闭合括号，如果都不是，闭合括号压栈
                if (arr[i] == ')' && topChar == '(') {
                    stack.pop();
                } else if ( arr[i] == '}' && topChar == '{'){
                    stack.pop();
                } else if ( arr[i] == ']' && topChar == '['){
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }
        }
        //如果栈为空，表示所有括号都匹配成功，返回true，否则返回false
        return stack.isEmpty();
    }
}
