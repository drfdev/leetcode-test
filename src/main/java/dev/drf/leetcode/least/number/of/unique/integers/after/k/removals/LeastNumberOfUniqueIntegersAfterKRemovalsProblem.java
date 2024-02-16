package dev.drf.leetcode.least.number.of.unique.integers.after.k.removals;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/
 */
public class LeastNumberOfUniqueIntegersAfterKRemovalsProblem implements Problem {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        final int length = arr.length;
        List<int[]> map = new ArrayList<>(length);

        Arrays.sort(arr);

        int[] pr = {arr[0], 0};
        map.add(pr);
        int index = 0;

        for (int val : arr) {
            if (val == pr[0]) {
                pr[1]++;
            } else {
                index++;
                pr = new int[]{val, 1};
                map.add(pr);
            }
        }

        final int size = (index + 1);
        map.sort((o1, o2) -> Integer.compare(o1[1], o2[1]));

        int removed = 0;
        index = 0;
        while (k > 0) {
            int[] pair = map.get(index++);
            int count = pair[1];
            k = k - count;
            if (k >= 0) {
                removed++;
            }
        }

        return ( size - removed );
    }
}
