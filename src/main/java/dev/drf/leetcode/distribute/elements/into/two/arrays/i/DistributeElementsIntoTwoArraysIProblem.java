package dev.drf.leetcode.distribute.elements.into.two.arrays.i;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
 */
public class DistributeElementsIntoTwoArraysIProblem implements Problem {
    public int[] resultArray(int[] nums) {
        final int n = nums.length;
        int[] result = new int[n];

        int startIndex2 = (n % 2 == 0)
                ? n / 2
                : (n - 1) / 2;
        int index1 = 0;
        int index2 = startIndex2;
        int size1 = 1;
        int size2 = 1;

        int last1 = nums[0];
        int last2 = nums[1];

        result[index1++] = last1;
        result[index2++] = last2;

        for (int i = 2; i < nums.length; i++) {
            int num = nums[i];
            if (last1 > last2) {
                int index = index1++;
                if (index == startIndex2) {
                    System.arraycopy(result, startIndex2, result, ++startIndex2, size2);
                    index2++;
                }
                result[index] = num;
                last1 = num;
                size1++;
            } else {
                int index = index2++;
                if (index == n) {
                    System.arraycopy(result, startIndex2, result, --startIndex2, size2);
                    index2 = (index - 1);
                    index = index2++;
                }
                result[index] = num;
                last2 = num;
                size2++;
            }
        }

        return result;
    }
}
