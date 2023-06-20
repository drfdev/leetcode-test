package dev.drf.leetcode.sliding.window.maximum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/sliding-window-maximum/
 * Time Limit Exceeded
 */
@Deprecated
public class SlidingWindowMaximumProblem implements Problem {
    public int[] maxSlidingWindow(int[] nums, int k) {
        final int size = nums.length;
        final int resultSize = size - k + 1;

        int[] result = new int[resultSize];

        int index = 0;
        SlidingWindow sw = new SlidingWindow(k);

        while (index < resultSize) {
            sw.move(nums, index);
            result[index] = sw.max;
            index++;
        }

        return result;
    }

    private static class SlidingWindow {
        private final int size;
        private int max;
        private boolean initialized = false;

        public SlidingWindow(int size) {
            this.size = size;
        }

        public void init(int[] nums, int index) {
            this.max = nums[index];
            for (int i = index + 1; i < index + size; i++) {
                this.max = Math.max(max, nums[i]);
            }
        }

        public void move(int[] nums, int index) {
            if (!initialized) {
                init(nums, index);
                initialized = true;
            } else {
                if (nums[index - 1] != this.max) {
                    this.max = Math.max(this.max, nums[index + this.size - 1]);
                } else {
                    init(nums, index);
                }
            }
        }
    }
}
