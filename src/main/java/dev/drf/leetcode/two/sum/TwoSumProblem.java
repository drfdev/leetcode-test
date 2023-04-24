package dev.drf.leetcode.two.sum;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSumProblem implements Problem {
    private static final int UNKNOWN_INDEX = -1;

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }
        if (nums.length == 2) {
            int v1 = nums[0];
            int v2 = nums[1];

            return target == (v1 + v2)
                    ? new int[]{0, 1}
                    : new int[]{-1, -1};
        }

        int size = nums.length;
        Bucket[] buckets = new Bucket[size];

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            int bucketIndex = Math.abs(value % size);
            if (buckets[bucketIndex] == null) {
                buckets[bucketIndex] = new Bucket();
            }

            var existedIndex = buckets[bucketIndex].getIndex(value);
            if (existedIndex != UNKNOWN_INDEX) {
                return new int[]{existedIndex, i};
            }

            var expectedValue = target - value;
            bucketIndex = Math.abs(expectedValue % size);
            if (buckets[bucketIndex] == null) {
                buckets[bucketIndex] = new Bucket();
            }
            buckets[bucketIndex].put(i, expectedValue);
        }

        return new int[]{-1, -1};
    }

    private static class Bucket {
        private Node node = new Node();

        public int getIndex(int value) {
            Node cursor = node;

            while (cursor != null) {
                if (cursor.index != UNKNOWN_INDEX && cursor.value == value) {
                    return cursor.index;
                }
                cursor = cursor.next;
            }

            return UNKNOWN_INDEX;
        }

        public void put(int index, int value) {
            Node cursor = node;

            while (cursor != null) {
                if (cursor.index == UNKNOWN_INDEX) {
                    cursor.value = value;
                    cursor.index = index;
                } else if (cursor.next == null) {
                    cursor.next = new Node();
                }

                cursor = cursor.next;
            }
        }
    }

    private static class Node {
        private int value;
        private int index = UNKNOWN_INDEX;
        private Node next;
    }
}
