package dev.drf.leetcode.arithmetic.subarrays;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/arithmetic-subarrays/
 * Used solution:
 * https://leetcode.com/problems/arithmetic-subarrays/solutions/4318821/c-java-python-javascript-2-approaches-explained/
 */
public class ArithmeticSubarraysProblem implements Problem {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int arrSize = r[i] - l[i] + 1;
            int[] arr = new int[arrSize];

            for (int j = 0; j < arr.length; j++) {
                int index = l[i] + j;
                arr[j] = nums[index];
            }

            result.add(check(arr));
        }

        return result;
    }

    private Boolean check(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }
}
