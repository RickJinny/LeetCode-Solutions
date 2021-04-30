package com.rickjinny.leetcode;

/**
 * 482、密钥格式化
 */
public class T0482_license_key_formatting {

    public String licenseKeyFormatting(String s, int k) {
        // 删除破折号，并转大写
        s = s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
            cnt++;
            // 如果满了 K 个字符并且 i 不是 0 时，加上破折号
            if (cnt % k == 0 && i != 0) {
                sb.append("-");
            }
        }
        // 因为是倒序遍历，所以最后需要翻转下字符串
        return sb.reverse().toString();
    }
}
