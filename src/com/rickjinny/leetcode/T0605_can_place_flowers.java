package com.rickjinny.leetcode;

/**
 * 605、种花问题
 */
public class T0605_can_place_flowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return n == 0;
        }

        int countOfZero = 1;
        int canPlace = 0;
        for (int bed : flowerbed) {
            if (bed == 0) {
                countOfZero++;
            } else {
                canPlace += (countOfZero - 1) / 2;
                if (canPlace >= n) {
                    return true;
                }
                countOfZero = 0;
            }
        }

        countOfZero++;
        canPlace += (countOfZero - 1) / 2;
        return canPlace >= n;
    }
}
