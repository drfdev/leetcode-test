package dev.drf.leetcode.minimum.number.of.operations.to.make.array.empty;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
 * Used solution:
 * https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/solutions/4501929/beats-99-63-users-c-java-python-javascript-explained
 */
public class MinimumNumberOfOperationsToMakeArrayEmptyProblem implements Problem {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int t = entry.getValue();

            if (t == 1) {
                return -1;
            }

            count += t / 3;
            if (t % 3 != 0) {
                count++;
            }
        }

        return count;
    }
}
