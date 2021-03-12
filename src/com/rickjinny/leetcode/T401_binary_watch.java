package com.rickjinny.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 401、二进制手表
 * 二进制手表顶部有 4 个 LED 代表小时 (0-11), 底部的 6 个 LED 代表 分钟 (0-59)
 * 每个 LED 代表一个 0 或 1，最低位在右侧。
 *
 * 示例:
 * 输入: n = 1
 * 返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 */
public class T401_binary_watch {

    int[] hours = new int[]{1, 2, 4, 8, 0, 0, 0, 0, 0, 0};
    int[] minutes = new int[]{0, 0, 0, 0, 1, 2, 4, 8, 16, 32};
    List<String> res = new ArrayList<>();

    public List<String> readBinaryWatch(int num) {
        backTrack(num, 0, 0, 0);
        return res;
    }

    public void backTrack(int num, int index, int hour, int minute) {
        if (hour > 11 || minute > 59) {
            return;
        }
        if (num == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(hour).append(":");
            if (minute < 10) {
                sb.append('0');
            }
            sb.append(minute);
            res.add(sb.toString());
            return;
        }
        for (int i = index; i < 10; i++) {
            backTrack(num - 1, i + 1, hour + hours[i], minute + minutes[i]);
        }
    }
}
