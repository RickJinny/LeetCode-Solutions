package com.rickjinny.leetcode;

/**
 * 181、超过经理收入的员工
 */
public class T0181_employees_earning_more_than_their_managers {

    public static void main(String[] args) {
        System.out.println("select a.Name as 'Employee' from Employee as a, Employee as b where a.ManagerId = b.Id and a.Salary > b.Salary;");
    }
}
