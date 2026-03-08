package dev.drf.leetcode.egg.drop.with_2.eggs.and.n.floors;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/egg-drop-with-2-eggs-and-n-floors/
 * Used solution:
 * https://www.youtube.com/watch?v=uBhSIKLlvdk
 */
public class EggDropWith2EggsAndNFloorsProblem implements Problem {
    public int twoEggDrop(int n) {
        // Balancing linear drops: x(x + 1) = 2 * n
//        final double a = 1;
//        final double b = 1;
        final double c = n * 2;
        final double D = 1 + 4 * c;
        final double sqrtD = Math.sqrt(D);
        final double x = (sqrtD - 1) / 2;
        return (int) Math.ceil(x);
    }
}
