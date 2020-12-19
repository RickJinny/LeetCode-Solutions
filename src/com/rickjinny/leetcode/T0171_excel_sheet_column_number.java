package com.rickjinny.leetcode;

/**
 * 171、Excel表列序号。
 * 给定一个 Excel 表格中的列名称，返回其相应的序列号。
 *
 * 例如:
 *      A -> 1
 *      B -> 2
 *      C -> 3
 *      ...
 *      Z -> 26
 *      AA -> 27
 *      AB -> 28
 *      ...
 *
 * 示例1:
 *   输入: "A"
 *   输出: 1
 *
 * 示例2:
 *   输入: "AB"
 *   输出: 28
 *
 * 示例3:
 *   输入: "ZY"
 *   输出: 701
 *
 */
public class T0171_excel_sheet_column_number {

    public static int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int res = 0;
        for (int i = 0; i < charArray.length; i++) {
            res = res * 26 + (charArray[i] - 'A' + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int aa = titleToNumber("AA");
        System.out.println(aa);
    }
}
