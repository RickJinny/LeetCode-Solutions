package com.rickjinny.other;

import java.util.Arrays;
import java.util.List;

/**
 * 3、输入一个递增排序的数组和一个数字 X，在数组中查找两个数，
 *   使得他们的和正好是 X，如果有多对数字的和等于 X，输出两个数的乘积最小的。
 */
public class T03_FindNumbersWithSum {

    private static List<Integer> findNumbersWithSum(int[] arr, int sum) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i] + arr[j];
            if (temp == sum) {
                return Arrays.asList(arr[i], arr[j]);
            } else if (temp >= sum) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
}
