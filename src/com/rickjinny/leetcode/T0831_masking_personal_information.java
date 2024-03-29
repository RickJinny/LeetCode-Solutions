package com.rickjinny.leetcode;

/**
 * 831、隐藏个人信息
 * 给你一条个人信息字符串 s，可能表示一个 邮箱地址，也可能表示一串 电话号码。返回按如下规则 隐藏 个人信息后的结果：
 *
 * 电子邮件地址：
 * 一个电子邮件地址由以下部分组成：
 * (1)、一个名字，由大小写英文字母组成，后面跟着。
 * (2)、一个 '@' 字符，后面跟着。
 * (3)、一个域名，由大小写英文字母和一个位于中间的 '.' 字符组成。'.'不会是域名的第一个或者最后一个字符。
 *
 * 要想隐藏电子邮件地址中的个人信息:
 * (1)、名字 和 域名 部分的大写英文字母应当转换成小写英文字母。
 * (2)、名字 中间的字母（即，除第一个和最后一个字母外）必须用 5 个 "*****" 替换。
 *
 * 电话号码：
 * 一个电话号码应当按下述格式组成：
 * (1)、电话号码可以由 10-13 位数字组成。
 * (2)、后 10 位构成 本地号码
 * (3)、前面剩下的 0-3 位，构成国家码
 * (4)、利用 {'+', '-', '(', ')', ' '} 这些 分割字符 按某种形式对上述数字进行分割
 *
 * 要想隐藏电话号码中的个人信息:
 * (1)、移除所有 分割字符
 * (2)、隐藏个人信息后的电话号码应该遵从这种格式：
 *     (a)、"***_***-XXXX" 如果国家代码为 0 位数字
 *     (b)、"+*_***_***-XXXX" 如果国家代码为 1 位数字
 *     (c)、"+**_***_***-XXXX" 如果国家代码为 2 位数字
 *     (d)、"+***_***_***-XXXX" 如果国家代码为 2 位数字
 * (3)、"XXXX" 是最后 4 位 本地号码
 *
 *
 * 示例1:
 * 输入：s = "LeetCode@LeetCode.com"
 * 输出："l*****e@leetcode.com"
 * 解释：s 是一个电子邮件地址。
 * 名字和域名都转换为小写，名字的中间用 5 个 * 替换。
 *
 * 示例2:
 * 输入：s = "AB@qq.com"
 * 输出："a*****b@qq.com"
 * 解释：s 是一个电子邮件地址。
 * 名字和域名都转换为小写，名字的中间用 5 个 * 替换。
 * 注意，尽管 "ab" 只有两个字符，但中间仍然必须有 5 个 * 。
 *
 * 示例3:
 * 输入：s = "1(234)567-890"
 * 输出："***-***-7890"
 * 解释：s 是一个电话号码。
 * 共计 10 位数字，所以本地号码为 10 位数字，国家代码为 0 位数字。
 * 因此，隐藏后的电话号码应该是 "***-***-7890" 。
 *
 * 示例4:
 * 输入：s = "86-(10)12345678"
 * 输出："+**-***-***-5678"
 * 解释：s 是一个电话号码。
 * 共计 12 位数字，所以本地号码为 10 位数字，国家代码为 2 位数字。
 * 因此，隐藏后的电话号码应该是 "+**-***-***-7890" 。
 *
 *
 *
 * 提示:
 * (1)、s 是一个 有效 的电子邮件或者电话号码。
 * (2)、如果 s 是一个电子邮件:
 *     (a)、8 <= s.length <= 40
 *     (b)、s 是由大小英文字母，恰好一个 '@' 字符，以及 '.' 字符组成。
 * (3)、如果 s 是一个电话号码:
 *     (a)、10 <= s.length <= 20
 *     (b)、s 是由数字、空格、字符 '('、 ')'、'-' 和 '+' 组成。
 *
 */
public class T0831_masking_personal_information {

    public String maskPII(String s) {
        int atIndex = s.indexOf("@");
        if (atIndex >= 0) {
            // 邮箱
            return (s.substring(0, 1) + "*****" + s.substring(atIndex - 1)).toLowerCase();
        } else {
            // 电话
            String digits = s.replaceAll("\\D+", "");
            String local = "***_***_" + digits.substring(digits.length() - 4);
            if (digits.length() == 10) {
                return local;
            }

            String ans = "+";
            for (int i = 0; i < digits.length() - 10; ++i) {
                ans += "*";
            }
            return ans + "-" + local;
        }
    }

}
