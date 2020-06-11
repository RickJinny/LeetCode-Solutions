package com.rickjinny.other;

/**
 * 判断一个数是否对称, 如 121、12321, 注意不能将数字转换为字符串比较
 */
public class T01_NumReverse {

    private static boolean isReverse(int i) {
        // 如果 i 是负值，直接返回 false
        if (i < 0) {
            return false;
        }
        // 将 i 存入到 cur 中
        int cur = i;
        // 定义一个 int 类型的 result 变量
        int result = 0;
        // 如果 i 不为 0 , 进行循环
        while (i != 0) {
            // 从右到做左，取出数字
            int temp = i % 10;
            // 重新倒着拼装数据
            result = result * 10 + temp;
            // 依次从右到左，去掉对应的数字
            i = i / 10;
        }
        // 如果新取出的数字组装和原来的数组相等的话，则说明该数是对称的
        return cur == result;
    }


    public static void main(String[] args) {
        System.out.println(isReverse(1232));
    }
}
