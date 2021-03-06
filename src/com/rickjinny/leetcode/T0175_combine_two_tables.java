package com.rickjinny.leetcode;

/**
 * 175、组合两个表
 *
 * 表1：Person
 * +-----------+----------+
 * |    列名    |   类型   |
 * +-----------+----------+
 * | PersonId  |    int   |
 * | FirstName |  varchar |
 * | LastName  |  varchar |
 * +-----------+----------+
 * PersonId 是上表主键
 *
 * 表2：Address
 * +-----------+----------+
 * |    列名    |   类型   |
 * +-----------+----------+
 * | AddressId |    int   |
 * | PersonId  |    int   |
 * | City      |  varchar |
 * | State     |  varchar |
 * +-----------+----------+
 * AddressId 是上表主键
 *
 * 编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息:
 * FirstName, LastName, City, State
 */
public class T0175_combine_two_tables {

    public static void main(String[] args) {
        System.out.println("select firstName, lastName, city, state from person as p left join address as a on p.personId = a.personId;");
    }
}
