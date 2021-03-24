package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 412、Fizz Buzz
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * (1)、如果 n 是 3 的倍数，输出 "Fizz"；
 * (2)、如果 n 是 5 的倍数，输出 "Buzz"；
 * (3)、如果 n 同时是 3 和 5 的倍数，输出 "FizzBuzz"
 */
public class T0412_fizz_buzz {

    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                ans.add("Fizz");
            } else if (divisibleBy5) {
                ans.add("Buzz");
            } else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}
