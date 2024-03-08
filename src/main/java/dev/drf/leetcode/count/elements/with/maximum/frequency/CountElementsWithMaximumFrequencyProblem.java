package dev.drf.leetcode.count.elements.with.maximum.frequency;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/count-elements-with-maximum-frequency/
 */
public class CountElementsWithMaximumFrequencyProblem implements Problem {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
        }

        int maxCount = -1;
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            var count = entry.getValue();
            if (count > maxCount) {
                sum = count;
                maxCount = count;
            } else if (count == maxCount) {
                sum = sum + count;
            }
        }

        return sum;
    }
}
