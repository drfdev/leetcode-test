package dev.drf.leetcode.separate.the.digits.in.an.array;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/separate-the-digits-in-an-array/
 */
public class SeparateTheDigitsInAnArrayProblem implements Problem {
    public int[] separateDigits(int[] nums) {
        final int len = calculateLen(nums);
        final int[] res = new int[len];

        int index = len - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (num < 10) {
                res[index--] = num;
            } else {
                while (num > 0) {
                    res[index--] = num % 10;
                    num = num / 10;
                }
            }
        }

        return res;
    }

    private int calculateLen(int[] nums) {
        int len = 0;
        for (int num : nums) {
            // 1 <= nums[i] <= 10^5
            if (num > 99_999) {
                len += 6;
            } else if (num > 9_999) {
                len += 5;
            } else if (num > 999) {
                len += 4;
            } else if (num > 99) {
                len += 3;
            } else if (num > 9) {
                len += 2;
            } else {
                len++;
            }
        }
        return len;
    }
}
