package dev.drf.leetcode.count.complete.subarrays.in.an.array;

import java.util.HashMap;
import java.util.Map;

public class CountCompleteSubarraysInAnArrayProblem {
    public int countCompleteSubarrays(int[] nums) {
        final var distinctMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!distinctMap.containsKey(num)) {
                distinctMap.put(num, 1);
            }
        }

        final int distinctCount = distinctMap.size();
        final int elementsCount = nums.length;

        distinctMap.clear();
        int count = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        for (rightIndex = 0; rightIndex < elementsCount; rightIndex++) {
            increment(distinctMap, nums[rightIndex]);

            while (distinctMap.size() == distinctCount) {
                count += (elementsCount - rightIndex);
                decrement(distinctMap, nums[leftIndex]);
                leftIndex++;
            }
        }

        if (count == 0) {
            count = 1;
        }

        return count;
    }

    private void increment(Map<Integer, Integer> distinctMap,
                           int element) {
        if (distinctMap.containsKey(element)) {
            distinctMap.compute(element, (k, count) -> (count + 1));
        } else {
            distinctMap.put(element, 1);
        }
    }

    private void decrement(Map<Integer, Integer> distinctMap,
                           int element) {
        var count = distinctMap.get(element);
        if (count == 1) {
            distinctMap.remove(element);
        } else {
            distinctMap.put(element, (count - 1));
        }
    }
}
