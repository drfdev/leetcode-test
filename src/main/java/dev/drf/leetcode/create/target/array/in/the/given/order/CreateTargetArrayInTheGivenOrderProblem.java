package dev.drf.leetcode.create.target.array.in.the.given.order;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/create-target-array-in-the-given-order/
 */
public class CreateTargetArrayInTheGivenOrderProblem implements Problem {
    public int[] createTargetArray(int[] nums, int[] index) {
        final int size = index.length;
        if (size == 0) {
            return new int[] {};
        }

        int[] result = new int[size];
        int lastIndex = -1;

        for (int i = 0; i < size; i++) {
            final int currentIndex = index[i];
            final int currentValue = nums[i];

            if (currentIndex > lastIndex) {
                result[currentIndex] = currentValue;
                lastIndex = currentIndex;
            } else {
                System.arraycopy(result, currentIndex,
                        result, currentIndex + 1,
                        (lastIndex - currentIndex + 1));
                result[currentIndex] = currentValue;
                lastIndex++;
            }
        }

        return result;
    }
}
