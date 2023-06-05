package dev.drf.leetcode.koko.eating.bananas;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/koko-eating-bananas/
 */
public class KokoEatingBananasProblem implements Problem {
    public int minEatingSpeed(int[] piles, int h) {
        final int size = piles.length;
        Arrays.sort(piles);

        if (size > h) {
            throw new IllegalArgumentException();
        }
        if (size == h) {
            return piles[size - 1];
        }

        int left = 1;
        int right = piles[size - 1];

        while (left <= right) {
            int bananas = (left + right) / 2;
            long hours = timeToEat(piles, bananas);
            if (hours <= h) {
                right = bananas - 1;
            } else {
                left = bananas + 1;
            }
        }

        return left;
    }

    private long timeToEat(int[] piles, int bananas) {
        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            int value = piles[i];
            boolean addOne = value % bananas > 0;
            hours = hours + (value / bananas);
            if (addOne) {
                hours++;
            }
        }
        return hours;
    }
}
