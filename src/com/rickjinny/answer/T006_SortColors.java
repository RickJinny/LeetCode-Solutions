package com.rickjinny.answer;

/**
 * 75、三路快排 partition 思路的应用 Sort Color
 */
public class T006_SortColors {

    public static void sortColors(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return;
        }

        int zero = 0;
        int two = len;
        int i = 0;
        while (i < two) {
            if (arr[i] == 0) {
                swap(arr, i, zero);
                zero++;
                i++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                two--;
                swap(arr, i, two);
            }
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
