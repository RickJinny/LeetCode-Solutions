package com.rickjinny.leetcode;

/**
 * 182、查找重复的电子邮箱
 * 编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。
 * 示例:
 * +------+-----------+
 * |  Id  |   Email   |
 * +------+-----------+
 * |  1   |  a@b.com  |
 * |  2   |  c@d.com  |
 * |  3   |  a@b.com  |
 * +------+-----------+
 *
 * 根据以上输入，你的查询应返回以下结果:
 * +---------+
 * | Email   |
 * +---------+
 * | a@b.com |
 * +---------+
 *
 * 说明：所有电子邮箱都是小写字母。
 */
public class T0182_duplicate_emails {

    public static void main(String[] args) {
        /**
         * 方法一: 使用 group by 和 临时表
         * 算法: 重复的电子邮箱存在多次。要计算每封电子邮件的存在次数，我们可以使用以下代码。
         */
        System.out.println("select Email, count(Email) as num from Person group by Email;");
        // 以此作为临时表，我们可以得到下面的解决方案
        System.out.println("select Email from (select Email, count(Email) as num from Person group by Email) as statistic where num > 1;");

        /**
         * 方法二: 使用 group by 和 having 条件
         * 向 group by 添加条件的一种更常用的方法是使用 having 子句，该子句更为简单高效。
         * 所有解决方案。
         */
        System.out.println("select Email from Person group by Email having count(Email) > 1;");
    }
}
