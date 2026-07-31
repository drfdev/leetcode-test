package dev.drf.leetcode.find.greatest.common.divisor.of.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 */
public class FindGreatestCommonDivisorOfArrayProblem implements Problem {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return gcd(min, max);
    }

    private int gcd(int min, int max) {
        if (min == max) {
            return min;
        }
        // https://en.wikipedia.org/wiki/Greatest_common_divisor
        while (min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }
        return max;
    }
}
