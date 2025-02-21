package dev.drf.leetcode.partition.array.according.to.given.pivot;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/partition-array-according-to-given-pivot/
 */
public class PartitionArrayAccordingToGivenPivotProblem implements Problem {
    public int[] pivotArray(int[] nums, int pivot) {
        int middleIndex = -1;
        int bigIndex = -1;

        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];

            if (num < pivot) {
                if (middleIndex > -1) {
                    System.arraycopy(nums, middleIndex,
                            nums, (middleIndex + 1),
                            (index - middleIndex));
                    nums[middleIndex] = num;
                    middleIndex++;
                    if (bigIndex > -1) {
                        bigIndex++;
                    }
                } else if (bigIndex > -1) {
                    System.arraycopy(nums, bigIndex,
                            nums, (bigIndex + 1),
                            (index - bigIndex));
                    nums[bigIndex] = num;
                    bigIndex++;
                }
            } else if (num == pivot) {
                if (bigIndex > -1) {
                    System.arraycopy(nums, bigIndex,
                            nums, (bigIndex + 1),
                            (index - bigIndex));
                    nums[bigIndex] = num;
                    if (middleIndex == -1) {
                        middleIndex = bigIndex;
                    }
                    bigIndex++;
                }
                if (middleIndex == -1) {
                    middleIndex = index;
                }
            } else {
                // num > pivot
                if (bigIndex == -1) {
                    bigIndex = index;
                }
            }
        }

        return nums;
    }
}
