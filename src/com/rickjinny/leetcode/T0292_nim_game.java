package com.rickjinny.leetcode;

/**
 * 292、Nim 游戏
 * 你和你的朋友，两个人一起玩 Nim 游戏:
 * 桌子上有一堆石头。
 * 你们轮流进行自己的回合，你作为先手。
 * 每一回合，轮到的人拿掉 1~3 块石头。
 * 拿掉最后一块石头的人就是获胜者。
 * <p>
 * 假设你们每一步都是最优解。请编写一个函数，来判断你是否可以在给定石头数量为 n 的情况下赢得游戏。
 * 如果赢，返回 true; 否则，返回 false。
 * <p>
 * 示例1:
 * 输入: n = 4
 * 输出: false
 * 解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛。因为无论你拿走 1 块、2 块、还是 3 块石头，
 * 最后一块石头总是会被你的朋友拿走。
 * <p>
 * 示例2:
 * 输入: n = 1
 * 输出: true
 * <p>
 * 示例3:
 * 输入: n = 2
 * 输出: true
 * <p>
 * 提示:
 * 1 <= n <= 2^31 - 1
 */
public class T0292_nim_game {

    /**
     * 方法1：使用递归
     */
    public boolean canWinNum1(int n) {
        // 使用包装类型的布尔数组，可以用 null 这个状态，表示当前 n 的结果还没有被计算出来
        Boolean[] memo = new Boolean[n + 1];
        return dfs(n, memo);
    }

    /**
     * 方法2: 数学方法
     */
    public boolean canWinNum2(int n) {
        return (n % 4) != 0;
    }

    private boolean dfs(int n, Boolean[] memo) {
        if (n <= 3) {
            return true;
        }
        if (memo[n] != null) {
            return memo[n];
        }
        // 如果 3 种选择，只要有一种对方输掉，自己就可以赢
        if (!dfs(n - 1, memo) || !dfs(n - 2, memo) || !dfs(n - 3, memo)) {
            memo[n] = true;
            return true;
        }
        // 否则自己输
        memo[n] = false;
        return false;
    }


}
