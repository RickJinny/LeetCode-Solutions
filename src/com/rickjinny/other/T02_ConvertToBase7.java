package com.rickjinny.other;

/**
 * 2、给定一个整数，将其转化为 7 进制，并以字符串形式输出。如输入: 100->"202",注意: 输入范围是 [-1e7, 1e7]
 */
public class T02_ConvertToBase7 {

    private static String covertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        String result = "";
        // 如果 num 是负数, 直接将其取为正数，result 设置为 "-"
        if (num < 0) {
            // 将 result 赋值为 "-"
            result = "-";
            // 将 num 的负数，赋值给 num
            num = -num;
        }

        // 如果 num 不为 0 的话, 进行循环
        while (num != 0) {
            // 将 num 对 7 取模
            int temp = num % 7;
            // 将 num 对 7 取整
            num = num / 7;
            // 将 num 对 7 取模的数据，追加到 sb 中
            sb.append(temp);
        }
        // 将 sb 的值，进行倒叙取值，并且在最前面加上 result
        return sb.reverse().insert(0, result).toString();
    }

    public static void main(String[] args) {
        System.out.println(covertToBase7(-100));
    }
}
