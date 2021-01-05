package com.rickjinny.leetcode;

/**
 * 196、删除重复的电子邮箱
 */
public class T0196_delete_duplicate_emails {

    public static void main(String[] args) {
        /**
         * 先查询，再删除
         * (1) 查询
         * select p1.* from Person p1, Person p2 where p1.Email = p2.Email and p1.Id > p2.Id;
         * (2) 删除
         * delete p1 from Person p1, Person p2 where p1.Email = p2.Email and p1.Id > p2.Id;
         */
    }
}
