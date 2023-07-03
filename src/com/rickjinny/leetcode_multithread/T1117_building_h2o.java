package com.rickjinny.leetcode_multithread;

/**
 * 1117、H2O生成
 * 现在有两种线程，氧 Oxygen 和 氢 Hydrogen，你的目标是组织这两种线程来产生水分子。
 * 存在一个屏蔽 (barrier) 使得每个线程必须等候直到一个完整水分子能够被产生出来。
 * 氢和氧线程会被分别给予 releaseHydrogen 和 releaseOxygen 方法来允许他们突破屏障。
 * 这些线程应该三三成组突破屏障并能立即组合产生一个水分子。
 * 你必须保证产生一个水分子所需线程的结合必须发生在下一个水分子之前。
 *
 * 换句话说：如果一个氧线程到达屏障时没有氢线程到达，它必须等候直到两个氢线程达到。
 *         如果一个氢线程达到屏障时没有其它线程到达，它必须等候直到一个氧线程和另一个氢线程到达。
 * 书写满足这些限制条件的氢、氧线程同步代码。
 *
 * 示例1：
 *   输入：water = "HOH"
 *   输出："HHO"
 *   解释："HOH" 和 "OHH" 依然都是有效解。
 *
 * 示例2：
 *   输入：water = "OOHHHH"
 *   输出："HHOHHO"
 *   解释："HOHHHO"，"OHHHO"，"HHOHOH"，"HOHHOH"，"OHHHOH"，"HHOOHH"，"HOHOHH" 和 "OHHOHH" 依然都是有效解。
 *
 * 提示：
 * (1)、3*n == water.length
 * (2)、1 <= n <= 20
 * (3)、water[i] == 'O' or 'H'
 * (4)、输入字符串 water 中的 'H' 总数将会是 2*n
 * (5)、输入字符串 water 中的 'O' 总是将会是 n
 *
 */
public class T1117_building_h2o {

    

}
