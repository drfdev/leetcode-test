package dev.drf.leetcode.count.triplets.that.can.form.two.arrays.of.equal.xor;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
 * Used solution:
 * https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/solutions/5228547/god-level-detailed-explanation-2-approaches/
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXorProblem implements Problem {
    public int countTriplets(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];

            for (int k = i + 1; k < arr.length; k++) {
                val = val ^ arr[k];

                if (val == 0) {
                    count += (k - i);
                }
            }
        }

        return count;
    }
}
