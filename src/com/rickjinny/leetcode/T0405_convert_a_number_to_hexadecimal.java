package com.rickjinny.leetcode;

/**
 * 405、数字转换为十六进制
 */
public class T0405_convert_a_number_to_hexadecimal {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        // 获取 32 位二进制位
        int[] bits = new int[32];
        for (int i = 31; i >= 0; i--) {
            bits[i] = num & 0x1;
            num >>>= 1;
        }

        // 从左到右，每 4 位转成 1 位十六进制
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 28; i += 4) {
            int sum = 8 * bits[i] + 4 * bits[i + 1] + 2 * bits[i + 2] + 1 * bits[i + 3];
            if (sum <= 9) {
                sb.append((char) sum + '0');
            } else if (sum <= 15) {
                sb.append((char) (sum - 10 + 'a'));
            }
        }

        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
