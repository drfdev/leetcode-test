package dev.drf.leetcode.single.number;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumberProblem implements Problem {
    private static final int NOT_INITIALIZED = Integer.MIN_VALUE;

    public int singleNumber(int[] nums) {
        if (nums == null) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int size = nums.length;
        int numsSize = (size / 2) + 1;

        Bucket[] buckets = new Bucket[numsSize];

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            int bucketIndex = Math.abs(value % numsSize);
            if (buckets[bucketIndex] == null) {
                buckets[bucketIndex] = new Bucket();
            }
            buckets[bucketIndex].addOrRemove(value);
        }

        Arrays.sort(buckets, Comparator.nullsLast(Comparator.comparing(Bucket::getCounter)));
        return buckets[0].searchValue();
    }

    private static class Bucket {
        private Node node = new Node();

        public void addOrRemove(int value) {
            Node cursor = node;
            Node previous = null;
            while (cursor != null) {
                if (cursor.value == NOT_INITIALIZED) {
                    cursor.value = value;
                    break;
                } else if (cursor.value == value) {
                    if (previous != null) {
                        previous.next = cursor.next;
                    } else {
                        if (node.next != null) {
                            node = node.next;
                        } else {
                            node.value = NOT_INITIALIZED;
                        }
                    }
                    break;
                } else if (cursor.next == null) {
                    cursor.next = new Node();
                }
                previous = cursor;
                cursor = cursor.next;
            }
        }

        public int getCounter() {
            int current = node.value;
            return current != NOT_INITIALIZED
                    ? 0 : 1;
        }

        public int searchValue() {
            return node.value;
        }
    }

    private static class Node {
        private int value = NOT_INITIALIZED;
        private Node next;
    }

}
