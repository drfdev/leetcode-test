package dev.drf.leetcode.p3sum;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum/
 */
public class P3SumProblem implements Problem {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);
        final int size = nums.length;

        for (int i = 0; i < size; i++) {
            int number = nums[i];
            if (number > 0) {
                break;
            }

            int target = 0 - number;

            int leftIndex = 0;
            int rightIndex = size - 1;

            while (leftIndex < rightIndex) {
                if (i == leftIndex) {
                    leftIndex++;
                    continue;
                }
                if (i == rightIndex) {
                    rightIndex--;
                    continue;
                }

                int left = nums[leftIndex];
                int right = nums[rightIndex];

                int value = left + right;

                if (value == target) {
                    List<Integer> targetValues = new ArrayList<>();

                    targetValues.add(number);
                    targetValues.add(left);
                    targetValues.add(right);
                    targetValues.sort(Integer::compareTo);

                    result.add(targetValues);
//                    break;
                }
                if (value < target) {
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }

        }

        return new ArrayList<>(result);
    }

}
