package dev.drf.leetcode.p4sum;

import dev.drf.leetcode.Problem;

import java.util.*;

/**
 * https://leetcode.com/problems/4sum/
 *
 * Time Limit Exceeded
 */
@Deprecated()
public class P4SumProblem implements Problem {
    private static final long UNKNOWN_VALUE = Long.MAX_VALUE;
    private static final long[] BUFFER = new long[4];

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return Collections.emptyList();
        }

        int size = nums.length;
        Bucket[] buckets = new Bucket[size];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int index = Math.abs(num % size);
            if (buckets[index] == null) {
                buckets[index] = new Bucket();
            }

            buckets[index].add(i, num);
        }

        Set<SkipValue> skipValues = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int index1 = 0; index1 < size; index1++) {
            for (int index2 = 0; index2 < size; index2++) {
                if (index1 != index2) {
                    for (int index3 = 0; index3 < size; index3++) {
                        if (index1 != index3 && index2 != index3) {
                            long value1 = nums[index1];
                            long value2 = nums[index2];
                            long value3 = nums[index3];

                            long sum = value1 + value2 + value3;
                            long expected = (target - sum);

                            SkipValue expectedValue = SkipValue.of(value1, value2, value3, expected);
                            if (skipValues.contains(expectedValue)) {
                                continue;
                            }

                            int index = (int) Math.abs(expected % size);

                            if (buckets[index] != null) {
                                Bucket buck = buckets[index];
                                Node node = buck.getByValue(expected);

                                if (node != null
                                        && node.hasAnyFreeIndex(index1, index2, index3)) {
                                    skipValues.add(expectedValue);

                                    List<Integer> vals = new ArrayList<>();
                                    vals.add((int) value1);
                                    vals.add((int) value2);
                                    vals.add((int) value3);
                                    vals.add((int) expected);
                                    result.add(vals);
                                }
                            }
                        }
                    }
                }
            }
        }


        return result;
    }

    private static class Bucket {
        private Node node = new Node();

        public void add(int index, int value) {
            var cursor = node;

            while (cursor != null) {
                if (cursor.value == UNKNOWN_VALUE) {
                    cursor.value = value;
                    cursor.index.add(index);
                    break;
                } else if (cursor.value == value) {
                    cursor.index.add(index);
                    break;
                } else if (cursor.next == null) {
                    cursor.next = new Node();
                }

                cursor = cursor.next;
            }
        }

        public Node getByValue(long value) {
            Node cursor = node;

            while (cursor != null) {
                if (cursor.value == value) {
                    return cursor;
                }
                cursor = cursor.next;
            }

            return null;
        }
    }

    private static class Node {
        private Node next = null;
        private long value = UNKNOWN_VALUE;
        private Set<Integer> index = new HashSet<>();

        public boolean hasAnyFreeIndex(int index1, int index2, int index3) {
            int found = 0;
            if (index.contains(index1)) {
                found ++;
            }
            if (index.contains(index2)) {
                found ++;
            }
            if (index.contains(index3)) {
                found ++;
            }

            return found < index.size();
        }
    }

    private static class SkipValue {
        private long value1;
        private long value2;
        private long value3;
        private long value4;

        public static SkipValue of(long value1, long value2, long value3, long value4) {
            BUFFER[0] = value1;
            BUFFER[1] = value2;
            BUFFER[2] = value3;
            BUFFER[3] = value4;

            Arrays.sort(BUFFER);

            SkipValue val = new SkipValue();

            val.value1 = BUFFER[0];
            val.value2 = BUFFER[1];
            val.value3 = BUFFER[2];
            val.value4 = BUFFER[3];

            return val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            SkipValue skipValue = (SkipValue) o;
            return value1 == skipValue.value1
                    && value2 == skipValue.value2
                    && value3 == skipValue.value3
                    && value4 == skipValue.value4;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value1, value2, value3, value4);
        }
    }
}
